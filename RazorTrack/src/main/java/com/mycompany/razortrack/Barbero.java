package com.mycompany.razortrack;

import java.util.List;

public class Barbero {
    private String nombre;
    private String especialidad;
    private List<String> disponibilidad;
    private List<Cita> citas;

   
    public Barbero(String nombre, String especialidad, List<String> disponibilidad, List<Cita> citas) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.disponibilidad = disponibilidad;
        this.citas = citas;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<String> getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(List<String> disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public List<Cita> getCitas() {
        return citas;
    }

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }

    
    public void ofrecerServicio() {
        // código para la oferta de servicio
    }

    public void actualizarDisponibilidad() {
        // código para actualizar estado barbero
    }

    public void gestionarCita(Cita cita) {
        citas.add(cita);
    }
}

