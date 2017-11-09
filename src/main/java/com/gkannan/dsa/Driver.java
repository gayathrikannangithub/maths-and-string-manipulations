package com.gkannan.dsa;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a double number: ");
        double number = scanner.nextDouble();

        System.out.print("Enter the decimal precision for the square root: ");
        int precision = scanner.nextInt();

        SquareRoot sqrt = new SquareRoot(precision);
        double value = 0;
        try {
            value = sqrt.performSquareRoot(number);
        } catch (Exception e) {
            e.printStackTrace();
        }


        if (value ==-1){
            System.out.println("Computation Error");
        }else if(value ==-2){
            System.out.println("Number cannot be negative");
        } else if(value ==-3){
        System.out.println("precision cannot be more than 10");
        }else{
            System.out.println("The Square Root of "+number+" is "+value);
        }
    }
}
