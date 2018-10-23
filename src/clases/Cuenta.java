/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author deivi
 */
public class Cuenta {
    
    //<editor-fold defaultstate="collapsed" desc="ATRIBUTOS">
    private String titulo;
    private double saldo;
//</editor-fold>
    
    
    //<editor-fold defaultstate="collapsed" desc="CONSTRUCTORES">
    public Cuenta (){
        
    }
    
    public Cuenta(String titu){
        this.titulo = titu;
        this.saldo = 0;
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="METODOS GETTER Y SETTER">
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
        this.saldo = 0;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
//</editor-fold>
    
    public void mostrarDatosCuenta(){
        System.out.println("Cuenta nro: " + this.titulo + "\n" + "Saldo:" + this.saldo );
    }
    
    public void ingresarSaldo(double saldo){
        this.saldo += saldo;    
    }
    
    public void retirarSaldo(double saldo){
        this.saldo -= saldo;
    }
    
}
