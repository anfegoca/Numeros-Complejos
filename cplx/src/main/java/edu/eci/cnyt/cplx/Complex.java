/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cnyt.cplx;

/**
 *
 * @author 2137885
 */
public class Complex {
	private double a;
	private double b;
	
	public Complex (double a,double b) {
            this.a=a;
            this.b=b;
	}
        public double getA(){
            return a;
        }
        public double getB(){
            return b;
        }
        @Override
        public boolean equals(Object obj){
            boolean res=false;
            if(a==((Complex)obj).getA() && b==((Complex)obj).getB()){
                res=true;
            }
            return res;
        }
	public Complex suma(Complex num1, Complex num2) {
            double a=num1.getA()+num2.getA();
            double b=num1.getB()+num2.getB();
            Complex res = new Complex(a,b);
            return res;
	}
	public Complex resta(Complex num1, Complex num2) {
            double a=num1.getA()-num2.getA();
            double b=num1.getB()-num2.getB();
            
            Complex res = new Complex(a,b);
            return res;
	}
	public Complex producto(Complex num1, Complex num2) {
            double a=(num1.getA()*num2.getA()-num1.getB()*num2.getB());
            double b=(num1.getA()*num2.getB()+num1.getB()*num2.getA());
            Complex res = new Complex(a,b);
            return res;
	}
	public Complex division(Complex num1, Complex num2) {
            
            double a=(num1.getA()*num2.getA()+num1.getB()*num2.getB())/Math.pow(modulo(num2),2);
            double b=(num1.getB()*num2.getA()-num1.getA()*num2.getB())/Math.pow(modulo(num2),2);
            Complex res = new Complex(a,b);
            return res;
	}
	public double modulo(Complex num) {
            double res = Math.sqrt(Math.pow(num.getA(), 2)+Math.pow(num.getB(), 2));
            return res;
	}
        public Complex conjugado(Complex num){
            double a=num.getA();
            double b=-1*num.getB();
            Complex res = new Complex(a,b);
            return res;
        }
        public double fase(Complex num){
            return Math.atan(num.getB()/num.getA());
        }
        
        public Polar polar(Complex num){
            double r=modulo(num);
            double ang=fase(num);
            double a=r*Math.cos(ang);
            double b=r*Math.sin(ang);
            Polar res = new Polar(a,b);
            return res;
        }

}
