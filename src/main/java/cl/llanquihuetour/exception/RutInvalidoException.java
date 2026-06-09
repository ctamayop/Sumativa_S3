package cl.llanquihuetour.exception;

    /**
     * Excepción personalizada para indicar que un RUT no cumple el formato
     */
    public class RutInvalidoException extends Exception {

        public RutInvalidoException(String mensaje) {

            super(mensaje);
        }

}
