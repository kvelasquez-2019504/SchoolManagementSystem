import java.util.Date;

public class Main {
    public static void main(String[] args) {
        GestorAcademico gestorAcademico = GestorAcademico.getInstanciaGestorAcademico();
        Estudiante estudiante1 = new Estudiante(12351,"Kenneth", "Velasquez",new Date(2005,3,16),18,"Masculino","Graduado");
        Estudiante estudiante2 = new Estudiante(12352,"Bryan", "Rodriguez",new Date(2005,12,22),18,"Masculino","Matriculado");
        Curso curso1 = new Curso("Matematica","Es una materia muy interesante",150,"v1");
        Curso curso2 = new Curso("Lenguaje","Es una materia que te traera conocimientos",100,"v2");
        gestorAcademico.matricularEstudiante(estudiante1);
        gestorAcademico.matricularEstudiante(estudiante2);
        gestorAcademico.agregarCurso(curso1);
        gestorAcademico.agregarCurso(curso2);
        gestorAcademico.inscribirEstudianteCurso(estudiante1,1);
        gestorAcademico.inscribirEstudianteCurso(estudiante2,2);
        gestorAcademico.desinscribirEstudianteCurso(1,1);
        gestorAcademico.desinscribirEstudianteCurso(2,1);
    }
}
