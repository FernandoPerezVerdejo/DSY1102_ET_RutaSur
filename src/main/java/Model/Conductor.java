package Model;

public class Conductor {
    private  int rut;
    private String dv;
    private String nombre;
    private String apellido;
    private int telefono;

    public Conductor(int rut, int telefono, String apellido, String nombre, String dv) throws IllegalAccessException {

        if (String.valueOf(rut).length()!=8){
            throw new IllegalAccessException("El RUT debe terner 8 digitos(sin puntos, ni guion)");
        }
        if (dv==null||dv.trim().length()!=1){
            throw new IllegalAccessException("El digito verificador debe de ser de 1 caracter");
        }
        if (nombre==null|| nombre.isBlank()||nombre.length()>20){
            throw new IllegalAccessException("El nombre es obligatorio.");
        }
        if (apellido==null||apellido.isBlank()||apellido.length()>20){
            throw new IllegalAccessException("El apellido es obligatorio.");
        }
        if (String.valueOf(telefono).length()!=9){
            throw new IllegalAccessException("El telefono de contacto debe tener 9 digitos,");
        }
        this.rut = rut;
        this.telefono = telefono;
        this.apellido = apellido;
        this.nombre = nombre;
        this.dv = dv;
    }

    public int getRut(){
        return rut;
    }
    public String getDv(){
        return dv;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }

    public int getTelefono() {
        return telefono;
    }
}
