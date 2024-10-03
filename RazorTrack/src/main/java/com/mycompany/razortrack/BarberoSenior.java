package com.mycompany.razortrack;

import java.util.List;

public class BarberoSenior extends Barbero {
    private int añosExperiencia;


    public BarberoSenior(String nombre, String especialidad, List<String> disponibilidad, List<Cita> citas, int añosExperiencia) {
        super(nombre, especialidad, disponibilidad, citas);
        this.añosExperiencia = añosExperiencia;
    }


    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }


    public void atenderCliente() {
        // código para atender al cliente
    }
}

