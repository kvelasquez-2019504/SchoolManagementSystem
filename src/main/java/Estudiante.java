import java.util.Date;
import java.math.BigInteger;
public class Estudiante extends Persona {
    private int idEstudiante;
    private String estado;

    public Estudiante(int cui,int idEstudiante, String nombre, String apellido, Date fechaDeNacimiento
            ,int edad, String genero, String estado) {
        super(cui,nombre,apellido,fechaDeNacimiento,genero,edad);
        this.estado = estado;
        this.idEstudiante=idEstudiante;
    }

    public Estudiante(int cui, String nombre, String apellido, Date fechaDeNacimiento
            ,int edad, String genero, String estado) {
        super(cui, nombre, apellido, fechaDeNacimiento, genero, edad);
        this.estado = estado;
    }

    public int getIdEstudiante() {
        return this.idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void mostrarDatosEstudiante(){
        this.mostrarDatosPersona();
        System.out.println("ID Estudiante: "+this.idEstudiante);
        System.out.println("Estado: " + estado);
    }
}
