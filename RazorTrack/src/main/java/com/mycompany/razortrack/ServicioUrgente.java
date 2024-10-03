package com.mycompany.razortrack;

public class ServicioUrgente extends Servicio {
    private String motivo;


    public ServicioUrgente(String nombre, int duracion, double precio, String motivo) {
        super(nombre, duracion, precio);
        this.motivo = motivo;
    }


    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    // Código para ofrecer servicio
}

