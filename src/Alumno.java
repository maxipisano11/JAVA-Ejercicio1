import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Alumno {
    private int id;
    private String nombre;
    private Set<Materia> materiasAprobadas;
    private Set<Inscripcion> inscripciones;

    public Alumno() {
        this.materiasAprobadas = new HashSet<>();
        this.inscripciones = new HashSet<>();
    }
    public Alumno(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.materiasAprobadas = new HashSet<>();
        this.inscripciones = new HashSet<>();
    }

    public Alumno(int id, String nombre, Set<Materia> materiasAprobadas, Set<Inscripcion> inscripciones) {
        this.id = id;
        this.nombre = nombre;
        this.materiasAprobadas = materiasAprobadas;
        this.inscripciones = inscripciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(Set<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    public Set<Inscripcion> getInscripciones() {
        return inscripciones;
    }

    public void setInscripciones(Set<Inscripcion> inscripciones) {
        this.inscripciones = inscripciones;
    }

    public void inscribirseAMateria(Materia materia){
        String idInscripcion = String.valueOf(id) + materia.getId();
        Inscripcion nuevaInscripcion =  new Inscripcion(idInscripcion, this, materia);
        if (nuevaInscripcion.aprobada()){
            inscripciones.add(nuevaInscripcion);
        }else {
            System.out.println("No se puede inscribir a " + materia.getNombre());
        }
    }

    public void aprobarMateria(Materia materia){
        this.materiasAprobadas.add(materia);
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "El Alumno con id=" + id +
                ", llamado " + nombre +
                ", tiene " + materiasAprobadas.size() +
                " materias aprobadas y se inscribió a " + inscripciones.size() +
                " materias }";
    }
}
