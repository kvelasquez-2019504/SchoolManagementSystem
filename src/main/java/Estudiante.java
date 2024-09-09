import java.util.Date;

public class Estudiante {
    private static int idEstudiante;
    private String nombre;
    private String apellido;
    private Date fechaDeNacimiento;
    private int edad;
    private String estado;

    public Estudiante( String nombre, String apellido, Date fechaDeNacimiento
            ,int edad, String estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.edad = edad;
        this.estado = estado;
        this.idEstudiante++;
    }

    private Estudiante() {
    }

    public static int getIdEstudiante() {
        return idEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void mostrarDatosEstudiante(){
        System.out.println("ID Estudiante: "+idEstudiante);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Fecha de nacimiento: " + fechaDeNacimiento);
        System.out.println("Edad: " + edad);
        System.out.println("Estado: " + estado);
    }
}
