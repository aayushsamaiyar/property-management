package com.mycompany.propertymanagement.controller;

public class calculatorMain {
    public  static void main(String args[]){
        CalculatorController cc = new CalculatorController();
        Double result  = cc.add(3.5,4.0);
        System.out.println(result);

    }
}
