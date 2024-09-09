import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.HashMap;

public class GestorAcademico implements ServiciosAcademicosI{
    public static GestorAcademico instanciaGestorAcademico;
    private static ArrayList<Estudiante> listaEstudiante;
    private static ArrayList <Curso> listaCurso;
    private static HashMap <Estudiante,Curso> listaRegistro;

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

    public static GestorAcademico getInstanciaGestorAcademico(){
        if(instanciaGestorAcademico == null) {
            instanciaGestorAcademico = new GestorAcademico();
        }
        return instanciaGestorAcademico;
    }
    public static ArrayList<Estudiante> getListaEstudiante() {
        return listaEstudiante;
    }
    public static ArrayList<Curso> getListaCurso() {
        return listaCurso;
    }
    public static HashMap <Estudiante,Curso> getListaRegistro() {
        return listaRegistro;
    }

    public int buscarCurso(int idCurso){
        int index=-1;
        for(Curso buscarCurso:getListaCurso()) {
            if (buscarCurso.getIdCurso() == idCurso) {
                index=getListaCurso().indexOf(buscarCurso);
            }
        }
        return index;
    }

    public int buscarEstudiante(int idEstudiante){
        int index=-1;
        for(Estudiante buscarEstudiante:getListaEstudiante()) {
            if (buscarEstudiante.getIdEstudiante() == idEstudiante) {
                index=getListaEstudiante().indexOf(buscarEstudiante);
            }
        }
        return index;
    }

    @Override
    public void matricularEstudiante(Estudiante estudiante) {
        try{
            Excepciones error = new Excepciones();
            error.estudianteYaMatriculado(estudiante);
            estudiante.setIdEstudiante(getListaEstudiante().size()+1);
            listaEstudiante.add(estudiante);
            System.out.println("--Se ha matriculado el estudiante exitosamente--");
            estudiante.mostrarDatosEstudiante();
        }catch (Excepciones e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void agregarCurso(Curso curso) {
        try{
            Excepciones error = new Excepciones();
            error.cursoYaCreado(curso);
            curso.setIdCurso(getListaCurso().size()+1);
            listaCurso.add(curso);
            System.out.println("--Se ha creado el curso exitosamente--");
            curso.mostrarDatosCurso();
        }catch (Excepciones e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void inscribirEstudianteCurso(Estudiante estudiante, int idCurso){
        try{
            Excepciones error = new Excepciones();
            error.cursoNoCreado(idCurso);
            error.estudianteNoMatriculado(estudiante);
            Curso curso = getListaCurso().get(this.buscarCurso(idCurso));
            error.estudianteYaTieneCurso(estudiante, curso);
            getListaRegistro().put(estudiante, curso);
            System.out.println("|-Se ha matriculado el estudiante "+estudiante.getIdEstudiante()
                    +" al curso " + curso.getIdCurso()+"-|");
        }catch (Excepciones | EstudianteYaInscritoException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void desinscribirEstudianteCurso(int idEstudiante, int idCurso) {
        try{
            Excepciones error = new Excepciones();
            error.cursoNoCreado(idCurso);
            error.estudianteNoMatriculado(idEstudiante);
            Estudiante estudiante = getListaEstudiante().get(this.buscarEstudiante(idEstudiante));
            Curso curso = getListaCurso().get(this.buscarCurso(idCurso));
            error.estudianteNoTieneCurso(estudiante, curso.getIdCurso());
            getListaRegistro().remove(idEstudiante, idCurso);
            System.out.println("|-Se ha retirado el estudiante "+estudiante.getIdEstudiante()
                    +" del curso " + curso.getIdCurso()+"-|");
        }catch (Excepciones | EstudianteNoInscritoEnCursoException e){
            System.out.println(e.getMessage());
        }
    }
}
