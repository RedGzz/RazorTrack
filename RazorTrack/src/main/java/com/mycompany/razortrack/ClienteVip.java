package com.mycompany.razortrack;

import java.util.List;

public class ClienteVip extends Cliente {
    private String nivel;


    public ClienteVip(String nombre, String telefono, String email, List<Cita> citas, String nivel) {
        super(nombre, telefono, email, citas);
        this.nivel = nivel;
    }


    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    // Código de beneficios cliente VIP
}


