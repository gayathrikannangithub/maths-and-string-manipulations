package com.gkannan.dsa;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * This SquareRoot Utility class calculates the Square root of a decimal with the specified precision using
 * Binary search concept & recursion
 */

public class SquareRoot {

    private BigDecimal precisionDecimal;
    private int precision;

    SquareRoot (int p){
        precision = p;
        precisionDecimal = BigDecimal.valueOf(1,p);
    }
    public double performSquareRoot(final double num) throws Exception {
        if(precision>10){
            return SquareRootErrorTypes.WRONG_PRECISION.getValue();
        }

        int i=1;
        if(num<0){
            return SquareRootErrorTypes.NEGATIVE_INTEGER.getValue();
        }
        while(i*i<num){
            i++;
        }
        return getSqRoot(i-1, i, num);
    }

    private double getSqRoot(double start, double end, Double num) {

        double mid = (start+end)/2;
        final BigDecimal number = BigDecimal.valueOf(num);
        final BigDecimal prod = BigDecimal.valueOf(mid * mid);
        final Integer prodInteger = prod.intValue();

        if(prod.compareTo(number)>0 &&
                precisionDecimal.compareTo(prod.subtract(number))>0){
            return new BigDecimal(mid).setScale(precision, RoundingMode.HALF_EVEN).doubleValue();
        }

        if(start<end){
            if(mid*mid<num){
                return getSqRoot(mid, end, num);
            }else if(mid*mid>num){
                return getSqRoot(start, mid, num);
            }else{
                return mid;
            }
        }else {
            return SquareRootErrorTypes.COMPUTATION_ERROR.getValue();
        }

    }
}
