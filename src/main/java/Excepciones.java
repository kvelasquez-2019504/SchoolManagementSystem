import java.util.HashMap;

class EstudianteYaInscritoException extends Exception {
    public EstudianteYaInscritoException(String mensaje) {
        super(mensaje);
    }
}

class EstudianteNoInscritoEnCursoException extends Exception {
    public EstudianteNoInscritoEnCursoException(String mensaje) {
        super(mensaje);
    }
}

public class Excepciones extends Exception {
    public Excepciones() {
        super();
    }

    public Excepciones(String mensaje) {
        super(mensaje);
    }

    public void estudianteYaMatriculado (Estudiante estudiante) throws Excepciones {
        GestorAcademico gestorAcademico = GestorAcademico.getInstanciaGestorAcademico();
        for(Estudiante buscarEstudiante : gestorAcademico.getListaEstudiante()){
            if(buscarEstudiante.getCui() == estudiante.getCui()){
                throw new Excepciones("Estudiante ya matriculado");
            }
        }
    }

    public void cursoYaCreado (Curso curso) throws Excepciones {
        GestorAcademico gestorAcademico = GestorAcademico.getInstanciaGestorAcademico();
        for(Curso buscarCurso : gestorAcademico.getListaCurso()){
            if(buscarCurso.getNombreCurso().equals(curso.getNombreCurso())){
                throw new Excepciones("Curso ya creado");
            }
        }
    }

    public void estudianteNoMatriculado (Estudiante estudiante) throws Excepciones {
        GestorAcademico gestorAcademico = GestorAcademico.getInstanciaGestorAcademico();
        if(!gestorAcademico.getListaEstudiante().contains(estudiante)){
            throw new Excepciones("Estudiante no matriculado");
        }
    }

    public void estudianteYaTieneCurso(Estudiante estudiante, int idCurso) throws EstudianteYaInscritoException {
        GestorAcademico gestorAcademico = GestorAcademico.getInstanciaGestorAcademico();
        Integer buscarCurso = gestorAcademico.getListaRegistro().get(Integer.valueOf(estudiante.getIdEstudiante()));
        if(buscarCurso == idCurso){
            throw new EstudianteYaInscritoException("El estudiante ya esta inscrito al curso");
        }
    }
}
