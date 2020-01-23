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
        boolean res = true;
        Vector vec = (Vector)obj;
        if (dim != vec.getDim()){
            res = false;
        }else{
            Complex[] aux = vec.getNumeros();
            for(int i=0;i<dim;i++){
                if(!(aux[i].equals(numeros[i]))){
                    res = false;
                    break;
                }
            }
        }
        return res;
    }
    
    /**
     * Suma de vectores complejos
     * @param vector vector de complejos a sumar
     * @return vector de complejos con el resultado de la suma
     */
    public Vector suma(Vector vec){
        Complex[] aux = vec.getNumeros();
        if (dim != vec.getDim()) {
            new ExcepcionDim(ExcepcionDim.mensajeDim);
        }
        else{
            for (int i=0;i<dim;i++){
                aux[i]=numeros[i].suma(aux[i]);   
            }
        }
        Vector res = new Vector(aux);
        return res;
    }
    /**
     * Devuelve un vector inverso
     * @return vector inverso
     */
    public Vector inversa(){
        Complex[] aux = new Complex[dim];
        for (int i=0;i<dim;i++){
            aux[i]=numeros[i].inverso();
        }
        Vector res = new Vector(aux);
        return res;
    }
    /**
     * Devuelve la dimension del vector
     * @return int que representa la dimension del vector
     */
    public int getDim(){
        return dim;
    }
    /**
     * Devuelve los numeros que conforman el arreglo
     * @return array de Complex con los numeros que conforman el vector
     */
    public Complex[] getNumeros(){
        return numeros;
    }
    
}
