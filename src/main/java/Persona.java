import java.math.BigInteger;
import java.util.Date;

public class Persona {
    private final int cui; //Código Único de Identificacion de la persona
    private String nombre;
    private String apellido;
    private Date fechaDeNacimiento;
    private String genero;
    private int edad;

    public Persona(int cui, String nombre, String apellido, Date fechaDeNacimiento
            ,String genero,int edad){
        this.cui = cui;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.genero = genero;
        this.edad = edad;
    }

    private Persona(){
        this.cui = 0;
    }

    public int getCui() {
        return cui;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void mostrarDatosPersona(){
        System.out.println("CUI: " + cui);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Fecha de nacimiento: " + fechaDeNacimiento);
        System.out.println("Genero: " + genero);
        System.out.println("Edad: " + edad);
    }
}
