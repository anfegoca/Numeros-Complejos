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
	
    /**
     *
     * @param a parte real del numero
     * @param b parte compleja del numero
     */
    public Complex (double a,double b) {
            this.a=a;
            this.b=b;
	}
        /**
         * 
         * @return parte real del numero 
         */
        public double getA(){
            return a;
        }
        /**
         * 
         * @return parte compleja del numero 
         */
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
        /**
         * Realiza la suma de dos numeros complejos
         * @param num numero de tipo Complex con el cual se va a sumar
         * @return respuesta de tipo Complex
         */
	public Complex suma(Complex num) {
            double a=this.a+num.getA();
            double b=this.b+num.getB();
            Complex res = new Complex(a,b);
            return res;
	}
        /**
         * Realiza la resta de dos numeros complejos
         * @param num numero de tipo Complex con el cual se va a restar
         * @return respuesta de tipo Complex
         */
	public Complex resta(Complex num) {
            double a=this.a-num.getA();
            double b=this.b-num.getB();
            
            Complex res = new Complex(a,b);
            return res;
	}
        /**
         * Realiza el producto de dos numeros complejos
         * @param num numero de tipo Complex con el cual se va a multiplicar
         * @return respuesta de tipo Complex
         */
	public Complex producto(Complex num) {
            double a=(this.a*num.getA()-this.b*num.getB());
            double b=(this.a*num.getB()+this.b*num.getA());
            Complex res = new Complex(a,b);
            return res;
	}
        /**
         * Realiza la division de dos numeros complejos
         * @param num numero de tipo Complex con el cual se va a dividir
         * @return respuesta de tipo Complex
         */
	public Complex division(Complex num) {
            
            double a=(this.a*num.getA()+this.b*num.getB())/Math.pow(num.modulo(),2);
            double b=(this.b*num.getA()-this.a*num.getB())/Math.pow(num.modulo(),2);
            Complex res = new Complex(a,b);
            return res;
	}
        /**
         * Realiza el modulo del numero complejo
         * @return modulo tipo double
         */
	public double modulo() {
            double res = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
            return res;
	}
        /**
         * Realiza el conjugado del numero
         * @return numero de tipo complex despues de realizar el conjugado
         */
        public Complex conjugado(){
            double b=-1*this.b;
            Complex res = new Complex(a,b);
            return res;
        }
        /**
         * Realiza la fase del numero complejo
         * @return fase del numero de tipo double
         */
        public double fase(){
            return Math.atan2(b,a);
        }
        /**
         * Realiza el inverso del numero
         * @return inverso del numero de tipo Complex
         */
        public Complex inverso(){
            Complex res = new Complex(-a,-b);
            return res;
        }
        /**
         * Convierte a Polar el numero complejo
         * @return numero de tipo Polar
         */
        public Polar polar(){
            double r=this.modulo();
            double ang=this.fase();
            //System.out.println("Fase"+ang);
            Polar res = new Polar(r,ang);
            return res;
        }

}
