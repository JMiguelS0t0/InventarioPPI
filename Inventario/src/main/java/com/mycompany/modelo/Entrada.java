package com.mycompany.modelo;

import java.util.Date;

public class Entrada {

    private int Factura;
    private Date Fecha;
    private int Cantidad;
    private String Articulo;

    public Entrada( Date Fecha, int Cantidad, String Articulo,int Factura) {
        this.Factura = Factura;
        this.Fecha = Fecha;
        this.Cantidad = Cantidad;
        this.Articulo = Articulo;
    }
    public Entrada(){
    
    
    };
    public int getFactura() {
        return Factura;
    }

    public void setFactura(int Factura) {
        this.Factura = Factura;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getArticulo() {
        return Articulo;
    }

    public void setArticulo(String Articulo) {
        this.Articulo = Articulo;
    }
}
