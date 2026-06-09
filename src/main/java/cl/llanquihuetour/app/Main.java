package cl.llanquihuetour.app;

import cl.llanquihuetour.exception.RutInvalidoException;
import cl.llanquihuetour.model.Rut;
import cl.llanquihuetour.model.Direccion;
import cl.llanquihuetour.model.Colaborador;
import cl.llanquihuetour.model.Cliente;

public class Main {
    public static void main(String[] args) {

        try {

            //Cliente 1
            Direccion direccionCliente1 = new Direccion(
                    "Arrecife",
                    1744,
                    "Paine"
            );

            Rut rutCliente1 = new Rut("12333444-K");

            Cliente cliente1 = new Cliente(
                    rutCliente1,
                    "Constanza",
                    "Tamayo",
                    32,
                    "99998888",
                    "cliente@correo.com",
                    direccionCliente1,
                    "Tour gastronómico"
            );

            //Cliente 2
            Direccion direccionCliente2 = new Direccion(
                    "Las Acacias",
                    1035,
                    "Santiago"
            );

            Rut rutCliente2 = new Rut("15888666-8");

            Cliente cliente2 = new Cliente(
                    rutCliente2,
                    "Alex",
                    "Ancapi",
                    28,
                    "33366699",
                    "cliente2@correo.com",
                    direccionCliente2,
                    "Salidas rafting"
            );

            //Colaborador
            Direccion direccionColaborador = new Direccion(
                    "Camino ensenada",
                    875,
                    "Puerto Montt"
            );

            Rut rutColaborador = new Rut("19666888-0");

            Colaborador colaborador = new Colaborador(
                    rutColaborador,
                    "Ricardo",
                    "Henriquez",
                    30,
                    "77788899",
                    "guia@llanquihuetour.cl",
                    direccionColaborador,
                    "Guia turistico"
            );

            System.out.println("=== Cliente 1 ===\n");
            System.out.println(cliente1);

            System.out.println("\n------------------------------------");

            System.out.println("=== Cliente 2 ===\n");
            System.out.println(cliente2);

            System.out.println("\n------------------------------------");

            System.out.println("=== Colaborador ===\n");
            System.out.println(colaborador);


        }

        catch (RutInvalidoException e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
