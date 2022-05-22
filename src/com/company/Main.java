package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        GryffindorStudents harry = new GryffindorStudents("Harry Potter", 80, 12,75, 87,97);
        GryffindorStudents hermione = new GryffindorStudents("Hermione Granger ",  78, 8, 96, 54, 77);
        GryffindorStudents ron=   new GryffindorStudents("Ron Weasley ",  64, 5, 62, 53, 71);
        SlytherinStudents draco= new SlytherinStudents("Draco Malfoy ",75,9, 69, 84, 55,76,88 );
        SlytherinStudents graham=  new SlytherinStudents("Graham Montagu ",  54,3, 75, 52, 43,66,75);
        SlytherinStudents gregory=  new SlytherinStudents("Gregory Goyle ", 64,9, 64, 42, 68,55, 76);
        RavenclawStudents zhou=  new RavenclawStudents( "Zhou Chang ",  48, 5, 87,76, 76, 66 );
        RavenclawStudents padme=  new RavenclawStudents( "Padme Patil ",  68, 10, 77,56, 86,75 );
        RavenclawStudents marcus=  new RavenclawStudents( "Marcus Belby ", 56, 7, 45,61, 84, 86 );
        HufflepuffStudents cedric=  new HufflepuffStudents("Cedric Diggory ",   86, 11, 84, 64, 53);
        HufflepuffStudents zechariah= new HufflepuffStudents("Zechariah Smith ",  46, 7, 81, 74, 37);
        HufflepuffStudents justin =  new HufflepuffStudents("Justin Finch-Fletchly ",  69, 9, 60, 77, 54);
        System.out.println(harry);
        System.out.println(hermione);
        System.out.println(draco);
        System.out.println(graham);
        System.out.println(zhou);
        System.out.println(cedric);

        harry.compareHogwarts(draco);
        harry.compareGryffindor(hermione);
    }

}
