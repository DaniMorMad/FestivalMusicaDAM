package festivalmusical;

public class Escenario {
    private int idEscenario;
    private String nombreEscenario;
    private int capacidadMax;

    public Escenario(int idEscenario, String nombreEscenario, int capacidadMax) {
        this.idEscenario = idEscenario;
        this.nombreEscenario = nombreEscenario;
        this.capacidadMax = capacidadMax;
    }

    public int getIdEscenario() {
        return idEscenario;
    }

    public String getNombreEscenario() {
        return nombreEscenario;
    }

    public void setNombreEscenario(String nombreEscenario) {
        this.nombreEscenario = nombreEscenario;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }
}
