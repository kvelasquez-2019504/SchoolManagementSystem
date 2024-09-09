import java.security.PublicKey;

public class Curso {
    private static int idCurso;
    private String nombreCurso;
    private String descripcion;
    private double numeroCreditos;
    private String version;

    private Curso(){}

    public Curso(String nombreCurso, String descripcion,
                 double numeroCreditos, String version) {
        this.nombreCurso = nombreCurso;
        this.descripcion = descripcion;
        this.numeroCreditos = numeroCreditos;
        this.version = version;
        this.idCurso++;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getNumeroCreditos() {
        return numeroCreditos;
    }

    public void setNumeroCreditos(double numeroCreditos) {
        this.numeroCreditos = numeroCreditos;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void mostrarDatosCurso(){
        System.out.println("ID Curso: " + idCurso);
        System.out.println("Nombre Curso: " + nombreCurso);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Numero de Creditos : " + numeroCreditos);
        System.out.println("Version: " + version);
    }
}
