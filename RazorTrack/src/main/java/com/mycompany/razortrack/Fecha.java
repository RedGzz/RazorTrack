
package com.mycompany.razortrack;

import java.time.LocalDate;

public class Fecha {
    private LocalDate fecha;

    public Fecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return fecha.toString();
    }
}


