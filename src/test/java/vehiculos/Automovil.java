package vehiculos;


public class Automovil extends Vehiculo {
    int puestos;
    public static int cantidadAutos;


    public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
        super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
        this.placa = placa;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.fabricante = fabricante;
        this.puestos = puestos;
        cantidadAutos++;
    }

    public int getPuestos() {
        return puestos;
    }
}