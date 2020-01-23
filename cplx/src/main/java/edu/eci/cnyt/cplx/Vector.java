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
public class Vector {
    private Complex[] numeros;
    private int dim;
    
    public Vector(Complex[] numeros){
        this.numeros=numeros;
        dim=numeros.length;
    }
    
    @Override
    public boolean equals(Object obj){
        boolean res = false;
        if (dim == ((Vector)obj).getDim()){
            for(int i=0;i<dim;i++){
                
            }
        }
    }
    
    /**
     * Suma de vectores complejos
     * @param vector vector de complejos a sumar
     * @return vector de complejos con el resultado de la suma
     */
    public Complex[] suma(Complex[] vector){
        Complex[] res = new Complex[dim];
        if (dim != vector.length) {
            new ExcepcionDim(ExcepcionDim.mensajeDim);
        }
        else{
            
            for (int i=0;i<res.length;i++){
                res[i]=numeros[i].suma(vector[i]);
            }
        }
        return res;
    }
    public Complex[] inversa(){
        Complex[] res = new Complex[dim];
        for (int i=0;i<res.length;i++){
            res[i]=numeros[i].inverso();
        }
        return res;
    }
    public int getDim(){
        return dim;
    }
    
}
