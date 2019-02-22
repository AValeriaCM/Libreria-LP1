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
public class Inventario {
    
    private String cantidadLibros;
    private String masCaro;
    private String menosCaro;
    private Object factura;
    /**
     * 
     * @param cantidadLibros
     * @param masCaro
     * @param menosCaro
     * @param factura 
     */
    public Inventario(String cantidadLibros, String masCaro, String menosCaro, Object factura) {
        this.cantidadLibros = cantidadLibros;
        this.masCaro = masCaro;
        this.menosCaro = menosCaro;
        this.factura = factura;
    }
    
    /**
     * Metodo que indica cuantas unidades hay en la tienda
     */
    public void cuantosHay(){
        
    }
    /**
     * Metodo que notifica cuando quedan 10 o menos unidades 
     */
    public void quedanDiez(){
        
    }
    /**
     * Metodo que indica cual es la unidad más cara y menos cara
     */
    public void precios(){
        
    }
    /**
     * Metodo que indica cual es la unidad más vendida y menos vendida
     */
    public void vendidos(){
        
    }
    /**
     * Metodo que elimina libro cuando ya no hay unidades
     */
    public void eliminarLibro(){
        
    }
    
}
