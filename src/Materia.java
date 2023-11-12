import java.util.List;

public class Materia {
    private int id;
    private String nombre;
    private List<Materia> correlativas;

    public Materia(int id, String nombre, List<Materia> correlativas) {
        this.id = id;
        this.nombre = nombre;
        this.correlativas = correlativas;
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

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public void setCorrelativas(List<Materia> correlativas) {
        this.correlativas = correlativas;
    }

}
