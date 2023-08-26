package edu.ejercicios;

import edu.ejercicios.pkgAlumnos.Alumno;
import edu.ejercicios.pkgAlumnos.CursoAsignado;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CursoAsignado>cat_cursos = new ArrayList<>();
        cat_cursos.add(new CursoAsignado(101, "Programacion",500));
        cat_cursos.add(new CursoAsignado(105, "Derecho",1));
        cat_cursos.add(new CursoAsignado(110, "Estadistica",450));
        cat_cursos.add(new CursoAsignado(120, "Electronica",400));


        Alumno al1 = new Alumno("2023015", "Andrea", "55555", "5 calle 8-36 zona 1");
        al1.agregarCursoAsignado(cat_cursos.get(1));
        al1.agregarCursoAsignado(cat_cursos.get(2));
        al1.mostrarInformacion();
        System.out.println("Monto a pagar: "+ al1.calcularMonto());

        Alumno al2 = new Alumno("2020055", "Monica", "1111", "8-36 zona 10");
        al2.agregarCursoAsignado(cat_cursos.get(0));
        al2.agregarCursoAsignado(cat_cursos.get(3));
        al2.agregarCursoAsignado(cat_cursos.get(1));
        al2.mostrarInformacion();
        System.out.println("Monto a pagar: "+ al2.calcularMonto());

        Alumno al3 = new Alumno("20226550", "Luis", "4444", "8-36 zona 12");
        al3.agregarCursoAsignado(cat_cursos.get(0));
        al3.agregarCursoAsignado(cat_cursos.get(1));
        al3.agregarCursoAsignado(cat_cursos.get(2));
        al3.mostrarInformacion();
        System.out.println("Monto a pagar: "+ al3.calcularMonto());

        Alumno al4 = new Alumno("2020554", "David", "33333", "8-36 zona 12");
        al4.agregarCursoAsignado(cat_cursos.get(0));
        al4.agregarCursoAsignado(cat_cursos.get(2));
        al4.agregarCursoAsignado(cat_cursos.get(3));
        al4.mostrarInformacion();
        System.out.println("Monto a pagar: "+ al4.calcularMonto());

        System.out.println((al1.calcularMonto()+al2.calcularMonto()+al3.calcularMonto()+al4.calcularMonto()));

    }
}