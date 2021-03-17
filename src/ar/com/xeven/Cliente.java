package ar.com.xeven;

public class Cliente {
    //atributos
    private String categoria;
    private Double montoPrestado;
    private Double montoDevuelto;

    //constructor
    public Cliente(String categoria){
        this.categoria = categoria;
        montoPrestado = 0.0;
        montoDevuelto = 0.0;
    }

    //getters y setters
    //categoria
    public String getCategoria(){
        return  categoria;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    //montoPrestado
    public Double getMontoPrestado(){
        return montoPrestado;
    }

    //montoDevuelto
    public Double getMontoDevuelto(){
        return montoDevuelto;
    }

    //solicitud de prestamo
    public void pedirPrestamo(Double monto){
        if ((monto<=100 && categoria.equals("Riesgoso")) ||
                (monto<=200 && categoria.equals("Nuevo")) ||
                (monto<=500 && categoria.equals("Confiable")))
            montoPrestado = monto;

    }

    //realizar el pago de la deuda
    public void  realizarPago(Double monto){
        montoDevuelto += monto;
        if (montoDevuelto >= monto)
            categoria = "Confiable";
    }

    //consulta de la deuda
    public double consultarDeuda(){
        return montoPrestado - montoDevuelto;
    }

}
