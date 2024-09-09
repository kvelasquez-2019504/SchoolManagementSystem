import java.util.ArrayList;
import java.util.HashMap;

public class GestorAcademico implements ServiciosAcademicosI{
    public static GestorAcademico instanciaGestorAcademico;
    private static ArrayList<Estudiante> listaEstudiante;
    private static ArrayList <Curso> listaCurso;
    private static HashMap <Integer,Integer> listaRegistro;

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
    public static HashMap <Integer,Integer> getListaRegistro() {
        return listaRegistro;
    }

    @Override
    public void matricularEstudiante(Estudiante estudiante) {
        try{
            Excepciones error = new Excepciones();
            error.estudianteYaMatriculado(estudiante);
            estudiante.setIdEstudiante(getListaEstudiante().size()+1);
            listaEstudiante.add(estudiante);
            System.out.println("Se ha matriculado el estudiante exitosamente");
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
            System.out.println("Se ha creado el curso exitosamente");
            curso.mostrarDatosCurso();
        }catch (Excepciones e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void inscribirEstudianteCurso(Estudiante estudiante, int idCurso){
        try{
            Excepciones error = new Excepciones();
            error.estudianteNoMatriculado(estudiante);
            error.estudianteYaTieneCurso(estudiante, idCurso);
            getListaRegistro().put(estudiante.getIdEstudiante(), idCurso);
        }catch (Excepciones | EstudianteYaInscritoException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void desinscribirEstudianteCurso(int idEstudiante, int idCurso) {

    }
}
