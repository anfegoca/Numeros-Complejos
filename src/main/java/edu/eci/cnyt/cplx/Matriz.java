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
        m=numeros.length;
        n=numeros[0].length;
    }
    public boolean equals(Object obj){
        Matriz mat = (Matriz)obj;
        boolean res = true;
        if(mat.getN()!=n || mat.getM()!=m){
            res=false;
        }else{
            Complex[][] aux= mat.getNumeros();
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
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
    public Matriz identidad(int n){
        Complex [][] aux = new Complex[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n;j++){
                if(i==j){
                    aux[i][j]=new Complex(1,0);
                }
                else{
                    aux[i][j]=new Complex(0,0);
                }
            }
            
        }
        Matriz res = new Matriz(aux);
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
    public Matriz adjunta(){
        Matriz res = this.transpuesta();
        res = res.conjugada();
        return res;
    }
    public Matriz producto(Matriz mat){
        Matriz res=null;
        if(mat.getM()!=n){
            new ExcepcionDim(ExcepcionDim.mensajeDimMatPro);
        }else{
            Complex[][] aux = new Complex [m][mat.getN()];
            Complex[][] aux2 = mat.getNumeros();
            for(int i=0; i<m;i++){
                for(int j=0; j<mat.getN(); j++){
                    Complex suma=new Complex(0,0);
                    for(int k=0;k<n;k++){
                        suma=suma.suma(numeros[i][k].producto(aux2[k][j]));
                    }
                    aux[i][j]=suma;
                }   
            }
            res=new Matriz(aux);
        }
        return res;
        
    }
    public Vector accionMatrizVector(Vector v){
        Complex[][] mat = {v.getNumeros()};
        Matriz aux = new Matriz(mat);
        aux = aux.transpuesta();
        Matriz res = this.producto(aux);
        Vector ans = new Vector(res.transpuesta().getNumeros()[0]);
        return ans;
    }
    public boolean esUnitaria(){
        boolean res = false;
        Matriz adj = this.adjunta();
        if(this.producto(adj).equals(identidad(m)) && this.producto(adj).equals(adj.producto(this))){
            res = true;
        }
        return res;
    }
    public boolean hermitian(){
        boolean res = false;
        Matriz adj = this.adjunta();
        if(adj.equals(this)){
            res = true;
        }
        return res;
    }
    public Matriz productoTensor(Matriz mat){
        Complex[][] aux = mat.getNumeros();
        Complex[][] r = new Complex[m * mat.getM()][n * mat.getN()];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < mat.getM(); k++) {
                    for (int l = 0; l < mat.getN(); l++) {
                        r[i * mat.getM() + k][j * mat.getN() + l] = numeros[i][j].producto(aux[k][l]);
                    }

                }
            }

        }
        return new Matriz(r);
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
