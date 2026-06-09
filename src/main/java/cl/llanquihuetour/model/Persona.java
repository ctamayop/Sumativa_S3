package cl.llanquihuetour.model;

public class Persona {

    private Rut rut;
    private String nombre;
    private String apellido;
    private int edad;
    private String telefono;
    private String correo;
    private Direccion direccion;

    public Persona(Rut rut, String nombre, String apellido, int edad, String telefono, String correo, Direccion direccion) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
    }

    public Rut getRut() {
        return rut;
    }

    public void setRut(Rut rut) {

        this.rut = rut;
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

    public int getEdad() {

        return edad;
    }

    public void setEdad(int edad) {

        this.edad = edad;
    }

    public String getTelefono() {

        return telefono;
    }

    public void setTelefono(String telefono) {

        this.telefono = telefono;
    }

    public String getCorreo() {

        return correo;
    }

    public void setCorreo(String correo) {

        this.correo = correo;
    }

    public Direccion getDireccion() {

        return direccion;
    }

    public void setDireccion(Direccion direccion) {

        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return  "Datos personales" +
                "\n-----------------" +
                "\nRut: " + rut +
                "\nNombre: " + nombre +
                "\nApellido: " + apellido +
                "\nEdad: " + edad +
                "\nTelefono: " + telefono +
                "\nCorreo: " + correo +
                "\n\nDireccion" +
                "\n-----------" +
                direccion
                ;
    }
}
