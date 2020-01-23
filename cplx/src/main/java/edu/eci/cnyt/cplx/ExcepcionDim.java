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
public class ExcepcionDim extends Exception{
    public static String mensajeDim= "LOS VECTORES DEBEN SER DE LA MISMA DIMENSIÓN";
    
    public ExcepcionDim (String mensaje){
        super(mensaje);
    }
}
