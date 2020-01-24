/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cnyt.cplx;

/**
 *
 * @author andres.gonzalez-ca
 */
public class Matriz {
    private Complex[][] numeros;
    private int n;
    private int m;
    
    public Matriz(Complex[][] numeros){
        this.numeros=numeros;
        n=numeros.length;
        m=numeros[0].length;
    }
    
    public Matriz suma(Matriz mat){
        if(mat.getN()!=n || mat.getM()!=m){
            new ExcepcionDim(ExcepcionDim.mensajeDimMat);
        }else{
            Complex[][] aux= mat.getNumeros();
            
        }
    }
    public int getN(){
        return n;  
    }
    public int getM(){
        return m;  
    }
    public Complex[][] getNumeros(){
        return numeros;  
    }
}
