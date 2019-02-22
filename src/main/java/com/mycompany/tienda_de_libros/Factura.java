/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tienda_de_libros;

/**
 *
 * @author Valeria Castañeda
 */
public class Factura {
    
    private String fechaVenta;
    private Object cliente;
    //private String totalLibros;
    private Object ventas;
    private String totalVenta;
    private String codigoVenta;

    /**
     * 
     * @param fechaVenta
     * @param cliente
     * @param totalLibros
     * @param totalVenta 
     */
    
    public Factura(String fechaVenta, Object cliente, String totalLibros, String totalVenta) {
        this.fechaVenta = fechaVenta;
        this.cliente = cliente;
        //this.totalLibros = totalLibros;
        this.totalVenta = totalVenta;
    }
     /**
      * Metodo que realiza la factura, y separa datos necesitados en otras clases
      */
    public void hacerFactura(){
        
    }
    
    /**
     * 
     * @return 
     */
    public String getFechaVenta() {
        return fechaVenta;
    }
    /**
     * 
     * @param fechaVenta 
     */
    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
    /**
     * 
     * @return 
     */
    public Object getCliente() {
        return cliente;
    }
    /**
     * 
     * @param cliente 
     */
    public void setCliente(Object cliente) {
        this.cliente = cliente;
    }
    /**
     * 
     * @return 
     */
    public String getTotalVenta() {
        return totalVenta;
    }
    /**
     * 
     * @param totalVenta 
     */
    public void setTotalVenta(String totalVenta) {
        this.totalVenta = totalVenta;
    }
    /**
     * 
     * @return 
     */
    public String getCodigoVenta() {
        return codigoVenta;
    }
    /**
     * 
     * @param codigoVenta 
     */
    public void setCodigoVenta(String codigoVenta) {
        this.codigoVenta = codigoVenta;
    }
    
    
    
    
}
