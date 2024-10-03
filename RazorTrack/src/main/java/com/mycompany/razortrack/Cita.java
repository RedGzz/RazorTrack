package com.mycompany.razortrack;

public class Cita {
    private Fecha fecha;
    private Tiempo hora;
    private Cliente cliente;
    private Barbero barbero;
    private Servicio servicio;


    public Cita(Fecha fecha, Tiempo hora, Cliente cliente, Barbero barbero, Servicio servicio) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.barbero = barbero;
        this.servicio = servicio;
    }

   
    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Tiempo getHora() {
        return hora;
    }

    public void setHora(Tiempo hora) {
        this.hora = hora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Barbero getBarbero() {
        return barbero;
    }

    public void setBarbero(Barbero barbero) {
        this.barbero = barbero;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }


    public void confirmarCita() {
        // código para confirmar
    }

    public void modificarCita() {
        // código para modificar
    }

    public void cancelarCita() {
        // código para cancelar
    }

    public void crearCita() {
        // código para crear
    }
}
