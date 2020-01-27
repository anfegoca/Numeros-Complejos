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
    public boolean equals(Object obj){
        Matriz mat = (Matriz)obj;
        boolean res = true;
        if(mat.getN()!=n || mat.getM()!=m){
            res=false;
        }else{
            Complex[][] aux= mat.getNumeros();
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(!(aux[i][j].equals(numeros[i][j]))){
                        res=false;
                        break;
                    }
                }
        }
        }
        return res;
    }
    
    
    public Matriz suma(Matriz mat){
        Matriz res=null;
        if(mat.getN()!=n || mat.getM()!=m){
            new ExcepcionDim(ExcepcionDim.mensajeDimMat);
        }else{
            Complex[][] aux2 = new Complex[n][m];
            Complex[][] aux= mat.getNumeros();
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    aux2[i][j]=aux[i][j].suma(numeros[i][j]);
                }
            }
            res = new Matriz(aux2);
        }
        return res;
    }
    public Matriz inversa(){
        Complex[][] aux = new Complex[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                aux[i][j]=numeros[i][j].inverso();    
            }
        }
        Matriz res = new Matriz(aux);
        return res;
    }
    public Matriz productoEsca(Complex esc){
        Complex[][] aux = new Complex[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                aux[i][j]=numeros[i][j].producto(esc);
            }
        }
        Matriz res = new Matriz(aux);
        return res;
    }
    public Matriz transpuesta(){
        Complex[][] aux = new Complex[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                aux[i][j]=numeros[j][i];    
            }
        }
        Matriz res = new Matriz(aux);
        return res;
    }
    public Matriz conjugada(){
        Complex[][] aux = new Complex[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                aux[i][j]=numeros[i][j].conjugado();    
            }
        }
        Matriz res = new Matriz(aux);
        return res;
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
