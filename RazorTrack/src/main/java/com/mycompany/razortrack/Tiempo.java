
package com.mycompany.razortrack;

import java.time.LocalTime;

public class Tiempo {
    private LocalTime tiempo;

    public Tiempo(LocalTime tiempo) {
        this.tiempo = tiempo;
    }

    public LocalTime getTiempo() {
        return tiempo;
    }

    public void setTiempo(LocalTime tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return tiempo.toString();
    }
}

