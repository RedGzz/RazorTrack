package com.mycompany.razortrack;

import java.util.List;

public class Cliente {
    private String nombre;
    private String telefono;
    private String email;
    private List<Cita> citas;



    public Cliente(String nombre, String telefono, String email, List<Cita> citas) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.citas = citas;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Cita> getCitas() {
        return citas;
    }

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }


    public void reservarCita(Cita cita) {
        citas.add(cita);
    }

    public void cancelarCita(Cita cita) {
        citas.remove(cita);
    }

    public void verHistorialCita() {
        for (Cita cita : citas) {
            System.out.println(cita);
        }
    }

    public void dejarFeedback() {
        // Implementación del feedback
    }
}

