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
	public Complex suma(Complex num) {
            double a=this.a+num.getA();
            double b=this.b+num.getB();
            Complex res = new Complex(a,b);
            return res;
	}
	public Complex resta(Complex num) {
            double a=this.a-num.getA();
            double b=this.b-num.getB();
            
            Complex res = new Complex(a,b);
            return res;
	}
	public Complex producto(Complex num) {
            double a=(this.a*num.getA()-this.b*num.getB());
            double b=(this.a*num.getB()+this.b*num.getA());
            Complex res = new Complex(a,b);
            return res;
	}
	public Complex division(Complex num) {
            
            double a=(this.a*num.getA()+this.b*num.getB())/Math.pow(num.modulo(),2);
            double b=(this.b*num.getA()-this.a*num.getB())/Math.pow(num.modulo(),2);
            Complex res = new Complex(a,b);
            return res;
	}
	public double modulo() {
            double res = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
            return res;
	}
        public Complex conjugado(){
            double b=-1*this.b;
            Complex res = new Complex(a,b);
            return res;
        }
        public double fase(){
            return Math.atan(b/a);
        }
        public Complex inverso(){
            Complex res = new Complex(-a,-b);
            return res;
        }
        public Polar polar(Complex num){
            double r=num.modulo();
            double ang=num.fase();
            double a=r*Math.cos(ang);
            double b=r*Math.sin(ang);
            Polar res = new Polar(a,b);
            return res;
        }

}
