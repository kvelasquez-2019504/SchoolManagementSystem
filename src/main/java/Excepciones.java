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
        int limite=0;
        for(Estudiante buscarEstudiante: gestorAcademico.getListaEstudiante()){
            if(estudiante.getCui() == buscarEstudiante.getCui()){
                break;
            }else {
                limite++;
                if(limite == gestorAcademico.getListaEstudiante().size()){
                    throw new Excepciones("El estudiante no esta matriculado");
                }
            }
        }
    }
    public void estudianteNoMatriculado (int idEstudiante) throws Excepciones {
        GestorAcademico gestorAcademico = GestorAcademico.getInstanciaGestorAcademico();
        int limite=0;
        for(Estudiante buscarEstudiante: gestorAcademico.getListaEstudiante()){
            if(idEstudiante == buscarEstudiante.getIdEstudiante()){
                break;
            }else {
                limite++;
                if(limite == gestorAcademico.getListaEstudiante().size()){
                    throw new Excepciones("El estudiante no esta matriculado");
                }
            }
        }
    }

    public void cursoNoCreado (int idCurso) throws Excepciones {
        GestorAcademico gestorAcademico = GestorAcademico.getInstanciaGestorAcademico();
        int limite=0;
        for(Curso buscarCurso: gestorAcademico.getListaCurso()){
            if(idCurso == buscarCurso.getIdCurso()){
                break;
            }else {
                limite++;
                if(limite == gestorAcademico.getListaCurso().size()){
                    throw new Excepciones("El curso no esta creado");
                }
            }
        }
    }

    public void estudianteYaTieneCurso(Estudiante estudiante, Curso curso) throws EstudianteYaInscritoException {
        GestorAcademico gestorAcademico = GestorAcademico.getInstanciaGestorAcademico();
        Curso buscarCurso = gestorAcademico.getListaRegistro().get(curso.getNombreCurso());
       if(buscarCurso !=null){
            throw new EstudianteYaInscritoException("El estudiante ya esta inscrito al curso");
        }
    }

    public void estudianteNoTieneCurso(Estudiante estudiante, int idCurso) throws EstudianteNoInscritoEnCursoException {
        GestorAcademico gestorAcademico = GestorAcademico.getInstanciaGestorAcademico();
        Curso buscarCurso = gestorAcademico.getListaRegistro().get(estudiante);
        if (buscarCurso==null || idCurso != buscarCurso.getIdCurso()) {
            throw new EstudianteNoInscritoEnCursoException("El estudiante "+estudiante.getNombre() +" no esta inscrito al curso " + idCurso);
        }
    }
}
