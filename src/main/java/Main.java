import java.util.Date;

public class Main {
    public static void main(String[] args) {
        GestorAcademico gestorAcademico = GestorAcademico.getInstanciaGestorAcademico();
        Estudiante estudiante1 = new Estudiante(12351,"Kenneth", "Velasquez",new Date(2005,3,16),18,"Masculino","Graduado");
        Estudiante estudiante2 = new Estudiante(123512,"Bryan", "Rodriguez",new Date(2005,12,22),18,"Masculino","Matriculado");
        Curso curso1 = new Curso("Matematica","Es una materia muy interesante",150,"v1");
        Curso curso2 = new Curso("Lenguaje","Es una materia que te traera conociemientos",100,"v2");
        gestorAcademico.matricularEstudiante(estudiante1);
        gestorAcademico.matricularEstudiante(estudiante2);
        gestorAcademico.agregarCurso(curso1);
        gestorAcademico.agregarCurso(curso2);
    }
}
