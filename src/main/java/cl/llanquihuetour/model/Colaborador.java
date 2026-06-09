package cl.llanquihuetour.model;

public class Colaborador extends Persona {

    private String cargo;

    public Colaborador(Rut rut, String nombre, String apellido, int edad, String telefono, String correo, Direccion direccion, String cargo) {
        super(rut, nombre, apellido, edad, telefono, correo, direccion);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n\nCargo: " + cargo
                ;
    }

}
