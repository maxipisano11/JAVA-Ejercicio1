import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Inscripcion {
    private String id;
    private Alumno alumno;
    private Materia materia;

    public Inscripcion(String id, Alumno alumno, Materia materia) {
        this.id = id;
        this.alumno = alumno;
        this.materia = materia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public boolean aprobada(){
        Set<Materia> materiasAprobadas = alumno.getMateriasAprobadas();
        List<Materia> correlativas = materia.getCorrelativas();
        return materiasAprobadas.containsAll(correlativas);
    }

    @Override
    public String toString() {
        return "Inscripcion {" +
                "Id=" + id +
                ", Alumno con id=" + alumno.getId() +
                ", Materia= " + materia.getNombre() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Inscripcion that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getAlumno(), that.getAlumno()) && Objects.equals(getMateria(), that.getMateria());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getAlumno(), getMateria());
    }
}
