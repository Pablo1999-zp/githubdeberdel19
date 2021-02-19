/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

/**
 *
 * @author User
 */
public class Cliente {
    
    private Persona persona;
    private Integer CodigodeCompra;
    private String pelicula;
    private Integer NdeSala;

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Integer getCodigodeCompra() {
        return CodigodeCompra;
    }

    public void setCodigodeCompra(Integer CodigodeCompra) {
        this.CodigodeCompra = CodigodeCompra;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public Integer getNdeSala() {
        return NdeSala;
    }

    public void setNdeSala(Integer NdeSala) {
        this.NdeSala = NdeSala;
    }
    
    
}
