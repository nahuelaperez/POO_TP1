package ar.edu.unlu.poo.tareas;

import java.time.LocalDate;

public class EjecutableTareas {

    public static void main(String[] args) {
            Tarea tarea1 = new Tarea("Ir al supermercado mañana", "Media", false, LocalDate.now());
            Tarea tarea2 = new Tarea("Consultar repuesto del auto","Alta",true,LocalDate.now().minusDays(1));
            Tarea tarea3 = new Tarea("Ir al cine a ver la nueva película de Marvel","Baja",false,LocalDate.now().minusDays(1));

        System.out.println("Tarea 1: " + tarea1.mostrar());
        System.out.println("Tarea 2: " + tarea2.mostrar());
        System.out.println("Tarea 3: " + tarea3.mostrar());

    }
}
