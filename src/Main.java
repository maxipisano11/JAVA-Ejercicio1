import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Materia aed = new Materia(1, "Algoritmos y Estructuras de Datos", new ArrayList<>());
        Materia paradigmas = new Materia(2, "Paradigmas de Programación", List.of(aed));
        Materia diseño = new Materia(3, "Diseño de Sistemas", List.of(paradigmas));

        //Se crea el alumno
        Alumno alumno1 = new Alumno(1, "Maxi");

        //Intento de inscribirse sin tener materias aprobadas
        alumno1.inscribirseAMateria(paradigmas);

        //Se aprueba primer correlativa
        alumno1.aprobarMateria(aed);

        //Se inscribe a materia
        alumno1.inscribirseAMateria(paradigmas);
        System.out.println(alumno1);

        //Intento de inscribirse a materia sin tener la correlativa
        alumno1.inscribirseAMateria(diseño);

        //Intento de inscripción 2 veces a la misma materia
        alumno1.inscribirseAMateria(paradigmas);
        System.out.println(alumno1);
        System.out.println(alumno1.getInscripciones());
    }
}