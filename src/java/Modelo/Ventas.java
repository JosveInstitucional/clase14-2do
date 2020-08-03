/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author USER
 */
public class Ventas {
    private int idventas;
    private String nombre;
    private double ganancias;
    private String vendedor;
    private double capital;

    /**
     * @return the idventas
     */
    public int getIdventas() {
        return idventas;
    }

    /**
     * @param idventas the idventas to set
     */
    public void setIdventas(int idventas) {
        this.idventas = idventas;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the ganancias
     */
    public double getGanancias() {
        return ganancias;
    }

    /**
     * @param ganancias the ganancias to set
     */
    public void setGanancias(double ganancias) {
        this.ganancias = ganancias;
    }

    /**
     * @return the vendedor
     */
    public String getVendedor() {
        return vendedor;
    }

    /**
     * @param vendedor the vendedor to set
     */
    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    /**
     * @return the capital
     */
    public double getCapital() {
        return capital;
    }

    /**
     * @param capital the capital to set
     */
    public void setCapital(double capital) {
        this.capital = capital;
    }
}


