package vehiculos;

public class Camioneta extends Vehiculo {
    boolean volco;
    static int cantidadCamionetas;

    public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
        super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
        this.puertas = puertas;
        this.placa = placa;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.fabricante = fabricante;
        this.volco = volco;
        cantidadCamionetas++;
    }

    public static int getCantidadCamionetas() {
        return cantidadCamionetas;
    }

    public boolean isVolco() {
        return volco;
    }
}