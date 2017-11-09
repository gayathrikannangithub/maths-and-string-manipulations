package com.gkannan.dsa;

public enum SquareRootErrorTypes {
    COMPUTATION_ERROR(-1),
    NEGATIVE_INTEGER(-2),
    WRONG_PRECISION(-3);

    private double value;
    SquareRootErrorTypes(double pValue){
        this.value = pValue;
    }

    public double getValue() {
        return value;
    }





}
