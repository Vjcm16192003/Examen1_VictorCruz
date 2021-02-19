/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_victorcruz;

/**
 *
 * @author Victor Jafet Cruz
 */
public class Libros {
    private String autor,titulo,genero,editorial,idioma,estado,nom_pres;
    private int a_crea,a_ingrese,ISBN,n_cuentaPres;

    public Libros(String autor, String titulo, String genero, String editorial, String idioma, String estado, String nom_pres, int a_crea, int a_ingrese, int ISBN, int n_cuentaPres) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.editorial = editorial;
        this.idioma = idioma;
        this.estado = estado;
        this.nom_pres = nom_pres;
        this.a_crea = a_crea;
        this.a_ingrese = a_ingrese;
        this.ISBN = ISBN;
        this.n_cuentaPres = n_cuentaPres;
    }

    public Libros() {
    }

   

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getA_crea() {
        return a_crea;
    }

    public void setA_crea(int a_crea) {
        this.a_crea = a_crea;
    }

    public int getA_ingrese() {
        return a_ingrese;
    }

    public void setA_ingrese(int a_ingrese) {
        this.a_ingrese = a_ingrese;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getNom_pres() {
        return nom_pres;
    }

    public void setNom_pres(String nom_pres) {
        this.nom_pres = nom_pres;
    }

    public int getN_cuentaPres() {
        return n_cuentaPres;
    }

    public void setN_cuentaPres(int n_cuentaPres) {
        this.n_cuentaPres = n_cuentaPres;
    }

    @Override
    public String toString() {
        return   nom_pres + n_cuentaPres;
    }
    
    
    
}
