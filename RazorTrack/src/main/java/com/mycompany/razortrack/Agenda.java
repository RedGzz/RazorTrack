package com.mycompany.razortrack;

import java.util.List;

public class Agenda {
    private List<Cita> citas;


    public Agenda(List<Cita> citas) {
        this.citas = citas;
    }


    public List<Cita> getCitas() {
        return citas;
    }

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }


    public void agregarCita(Cita cita) {
        citas.add(cita);
    }

    public void obtenerHistorial() {
        for (Cita cita : citas) {
            System.out.println(cita);
        }
    }
}


