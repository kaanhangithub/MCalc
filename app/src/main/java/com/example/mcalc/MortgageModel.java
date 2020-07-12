package com.example.mcalc;

public class MortgageModel {
    private double principle;
    private double interest;
    private int amortization;

    public MortgageModel(String p, String a, String i){
        this.principle=Double.parseDouble(p);
        this.interest=Double.parseDouble(i);
        this.amortization=Integer.parseInt(a);



    }
    public String computePayment(){
        double r=this.interest/1200;
        int n=this.amortization*12*(-1);
        double index = (r*this.principle)/(1-Math.pow((1+r),n));
        String result = "$" + String.format("%,.2f",index);
        return result;


    }
}
