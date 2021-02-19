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
public class Cajero {
    
    private Persona persona;
    private Boolean Estado;
    private Double Horarios;

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Boolean getEstado() {
        return Estado;
    }

    public void setEstado(Boolean Estado) {
        this.Estado = Estado;
    }

    public Double getHorarios() {
        return Horarios;
    }

    public void setHorarios(Double Horarios) {
        this.Horarios = Horarios;
    }
    
}

