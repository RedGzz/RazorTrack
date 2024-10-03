package com.mycompany.razortrack;

public class Notificacion {
    private String mensaje;
    private Cliente destinatario;


    public Notificacion(String mensaje, Cliente destinatario) {
        this.mensaje = mensaje;
        this.destinatario = destinatario;
    }


    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Cliente getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Cliente destinatario) {
        this.destinatario = destinatario;
    }


    public void enviarNotificacion() {
        // Código para enviar la notificación
    }
}

