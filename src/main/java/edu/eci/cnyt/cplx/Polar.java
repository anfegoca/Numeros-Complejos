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
public class Polar {
    private double a;
    private double b;
	
    public Polar (double a,double b) {
        this.a=a;
        this.b=b;
    }
    @Override
    public boolean equals(Object obj){
        boolean res=false;
        if(a==((Polar)obj).getA() && b==((Polar)obj).getB()){
            res=true;
        }
        return res;
    }
    public double getA(){
            return a;
        }
        public double getB(){
            return b;
        }
}
