package com.estudiante;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {



        Tarea tarea1 = new Tarea(1L, "Comprar alimentos", "Comprar productos para la semana", "ALTA", false);
        Tarea tarea2 = new Tarea(2L, "Realizar ejercicios", "Hacer 30 minutos de cardio", "MEDIA", true);
        Tarea tarea3 = new Tarea(3L, "Estudiar Programación II", "Repasar Maven y REST", "ALTA", false);


        ArrayList<Tarea> listaDeTareas = new ArrayList<>();
        listaDeTareas.add(tarea1);
        listaDeTareas.add(tarea2);
        listaDeTareas.add(tarea3);



        int contadorPendientes = 0;
        int contadorCompletadas = 0;



        System.out.println("===== LISTADO DE TAREAS =====");
        System.out.println();



        for (int i = 0; i < listaDeTareas.size(); i++) {
            Tarea t = listaDeTareas.get(i);


            t.mostrarInformacion();



            if (t.isCompletada()) {
                contadorCompletadas = contadorCompletadas + 1;
            } else {
                contadorPendientes = contadorPendientes + 1;
            }
        }



        System.out.println();
        System.out.println("Tareas pendientes: " + contadorPendientes);
        System.out.println("Tareas completadas: " + contadorCompletadas);
    }
}