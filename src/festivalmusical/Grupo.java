package festivalmusical;

import java.util.ArrayList;

public class Grupo {
    private String nombreGrupo;
    private String genero;
    private String paisOrigen;
    private ArrayList<Integrante> integrantes;

    public Grupo(String nombreGrupo, String genero, String paisOrigen, ArrayList<Integrante> integrantes) {
        this.nombreGrupo = nombreGrupo;
        this.genero = genero;
        this.paisOrigen = paisOrigen;
        this.integrantes = integrantes;
    }

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public ArrayList<Integrante> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(ArrayList<Integrante> integrantes) {
        this.integrantes = integrantes;
    }
}
