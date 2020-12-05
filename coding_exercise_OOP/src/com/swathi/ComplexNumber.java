package com.swathi;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
    public void add(double real2, double imaginary2){
        this.real = real+real2;
        this.imaginary = imaginary+imaginary2;
        System.out.println(this);
    }
    public void add(ComplexNumber complexNumber){
        this.real = real+(complexNumber.getReal());
        this.imaginary= imaginary+(complexNumber.getImaginary());
        System.out.println(this);
    }
    public void subtract(double real2,double imaginary2){
        this.real = real-real2;
        this.imaginary = imaginary-imaginary2;
        System.out.println(this);
    }
    public void subtract(ComplexNumber complexNumber){
        this.real=  real-(complexNumber.getReal());
        this.imaginary =imaginary-(complexNumber.getImaginary());
        System.out.println(this);
    }

}
