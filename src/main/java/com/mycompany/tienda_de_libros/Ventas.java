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
public class Ventas {
    
    private String venta;
    private String nombreLibro;
    private Object cliente;
    private String codigoVenta;

    /**
     * 
     * @param venta
     * @param nombreLibro
     * @param cliente
     * @param codigoVenta 
     */
    
    public Ventas(String venta, String nombreLibro, Object cliente, String codigoVenta) {
        this.venta = venta;
        this.nombreLibro = nombreLibro;
        this.cliente = cliente;
        this.codigoVenta = codigoVenta;
    }
    
       
    
    /**
     * Metodo que vende libro a cliente
     */
    public void venderLibro(){
        
    }
    
    /**
     * Metodo que imprime la factura, y envía datos exactos para futuras operaciones
     */
    public void enviarFactura(){
        
    }
    
    
    
}
