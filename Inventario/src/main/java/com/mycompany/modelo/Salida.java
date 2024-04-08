package com.mycompany.modelo;

import java.util.Date;

public class Salida {

    private int Factura;
    private Date Fecha;
    private int Cantidad;
    private String Articulo;
    private String TelefonoC;

    public Salida( Date Fecha, int Cantidad, String Articulo, String TelefonoC,int Factura) {
        this.Factura = Factura;
        this.Fecha = Fecha;
        this.Cantidad = Cantidad;
        this.Articulo = Articulo;
        this.TelefonoC = TelefonoC;
    }
   public Salida() {
        
    }
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

    public String getTelefonoC() {
        return TelefonoC;
    }

    public void setTelefonoC(String TelefonoC) {
        this.TelefonoC = TelefonoC;
    }

}
