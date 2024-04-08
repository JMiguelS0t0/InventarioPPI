package com.mycompany.modelo;

public class Articulo {

    private int ID;
    private String Nombre;
    private String Descripcion;
    private float Valor;
    private String Categoria;
    private int Cantidad;

    public Articulo(String Nombre, String Descripcion, float Valor, String Categoria, int Cantidad,int ID) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Valor = Valor;
        this.Categoria = Categoria;
        this.Cantidad = Cantidad;
    }

    public Articulo() {
        
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public float getValor() {
        return Valor;
    }

    public void setValor(float Valor) {
        this.Valor = Valor;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

}
