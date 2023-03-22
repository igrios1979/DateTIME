package org.ignacio.rios.dateTime;

import java.time.LocalDate;
import java.time.Month;

public class EjemploDateTime {

    public static void main(String[] args) {


        LocalDate fecha_actual = LocalDate.now();
        System.out.println("LocalDate.now() ->>  " + fecha_actual);

        fecha_actual = LocalDate.of(2023,01,22);

        System.out.println("LocalDate.of ->> " + fecha_actual);

        fecha_actual = LocalDate.of(2023, Month.OCTOBER,4);

        System.out.println("LocalDate.of con Month enum ->> " + fecha_actual);

        fecha_actual = LocalDate.parse("2020-02-01");

        System.out.println(" LocalDate.parse  ->> " + fecha_actual);



    }
}
