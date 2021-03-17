package ar.com.xeven;

public class Main {

    public static void main(String[] args) {

        Cliente c = new Cliente("Riesgoso");

        c.pedirPrestamo(50.00);
        System.out.println("Deuda: "+c.consultarDeuda());
        c.realizarPago(10.00);
        System.out.println("Ahora debe: "+c.consultarDeuda());
        System.out.println("Y su categoria es: "+c.getCategoria());
        System.out.println("Monto prestado originalmente: "+c.getMontoPrestado());
        System.out.println(" ");
        //realizar un pago por el total de la deuda
        c.realizarPago(c.consultarDeuda());
        System.out.println("La categoria es: "+c.getCategoria());


    }
}
