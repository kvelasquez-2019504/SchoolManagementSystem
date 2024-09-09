import java.util.ArrayList;
import java.util.HashMap;

public class GestorAcademico {
    public GestorAcademico instanciaGestorAcademico;
    private ArrayList<Estudiante> listaEstudiante;
    private ArrayList <Curso> listaCurso;
    private HashMap <Integer,Integer> listaRegistro;

    private GestorAcademico() {
        if(listaCurso == null) {
            listaCurso = new ArrayList();
        }
        if(listaEstudiante == null) {
            listaEstudiante = new ArrayList();
        }
        if(listaRegistro == null) {
            listaRegistro = new HashMap();
        }
    }

    public GestorAcademico getInstanciaGestorAcademico(){
        if(instanciaGestorAcademico == null) {
            instanciaGestorAcademico = new GestorAcademico();
        }
        return instanciaGestorAcademico;
    }
    public ArrayList<Estudiante> getListaEstudiante() {
        return listaEstudiante;
    }
    public ArrayList<Curso> getListaCurso() {
        return listaCurso;
    }
    public HashMap getListaRegistro() {
        return listaRegistro;
    }
}
