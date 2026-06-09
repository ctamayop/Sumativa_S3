package cl.llanquihuetour.model;

public class Cliente extends Persona {

    private String destinoFavorito;

    public Cliente(Rut rut, String nombre, String apellido, int edad, String telefono, String correo, Direccion direccion, String destinoFavorito) {
        super(rut, nombre, apellido, edad, telefono, correo, direccion);
        this.destinoFavorito = destinoFavorito;
    }

    public String getDestinoFavorito() {
        return destinoFavorito;
    }

    public void setDestinoFavorito(String destinoFavorito) {
        this.destinoFavorito = destinoFavorito;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n\nDestino favorito: " + destinoFavorito
                ;
    }
}
