/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_victorcruz;

import java.util.ArrayList;

/**
 *
 * @author Victor Jafet Cruz
 */
public class Usuario {
    private int codigo,edad;
    private String pri_nom,prim_appe;
    private String Tipo_user;
    private ArrayList <Libros> L_prest;

    public Usuario(int codigo, int edad, String pri_nom, String prim_appe, ArrayList<Libros> L_prest) {
        this.codigo = codigo;
        this.edad = edad;
        this.pri_nom = pri_nom;
        this.prim_appe = prim_appe;
        this.setL_prest(L_prest);
    }

    public Usuario(int codigo, int edad, String pri_nom, String prim_appe, String Tipo_user) {
        this.codigo = codigo;
        this.edad = edad;
        this.pri_nom = pri_nom;
        this.prim_appe = prim_appe;
        this.Tipo_user = Tipo_user;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPri_nom() {
        return pri_nom;
    }

    public void setPri_nom(String pri_nom) {
        this.pri_nom = pri_nom;
    }

    public String getPrim_appe() {
        return prim_appe;
    }

    public void setPrim_appe(String prim_appe) {
        this.prim_appe = prim_appe;
    }

    public String getTipo_user() {
        return Tipo_user;
    }

    public void setTipo_user(String Tipo_user) {
        this.Tipo_user = Tipo_user;
    }

   
    
    
    public ArrayList<Libros> getL_prest() {
        return L_prest;
    }

    public void setL_prest(ArrayList<Libros> L_prest) {
        if (L_prest.size()< 5){
             this.L_prest = L_prest;
        }
    }

    @Override
    public String toString() {
        return "Usuario" + "codigo=" + codigo + ", edad=" + edad + ", pri_nom=" + pri_nom + ", prim_appe=" + prim_appe + ", L_prest=" + L_prest + '}';
    }

    
    
    
}
