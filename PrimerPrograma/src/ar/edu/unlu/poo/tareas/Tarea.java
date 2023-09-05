package ar.edu.unlu.poo.tareas;

import ar.edu.unlu.poo.lista.NodoDoble;

import java.time.LocalDate;

public class Tarea {

    private String descripcion;

    private String prioridad;

    private Boolean estado;

    private LocalDate fecha;


    public void setDescripcion(String descripcion) {
        this.descripcion = prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public Boolean getEstado() {
        return estado;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Boolean vecimiento() {
        if (!estado && LocalDate.EPOCH.isAfter(fecha)) {
            return true;
        }
        return false;
    }

    public Boolean completa() {
        return estado;
    }

    public Tarea(String descripcion, String prioridad, Boolean estado, LocalDate fecha) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.estado = estado;
        this.fecha = fecha;
    }

    public String mostrar() {
        String aux = descripcion + "\n" + prioridad + "\n" + estado + "\n" + fecha + "\n";
        if (vecimiento()) {
            return "(Vencida)" + aux;
        } else {
            return aux;
        }
    }

}