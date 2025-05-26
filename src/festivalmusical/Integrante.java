package festivalmusical;

import java.util.Date;

public class Integrante {
    private String nombreIntegrante;
    private String instrumento;
    private Date fechaNacimiento;

    public Integrante(String nombreIntegrante, String instrumento, Date fechaNacimiento) {
        this.nombreIntegrante = nombreIntegrante;
        this.instrumento = instrumento;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombreIntegrante() {
        return nombreIntegrante;
    }

    public void setNombreIntegrante(String nombreIntegrante) {
        this.nombreIntegrante = nombreIntegrante;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
