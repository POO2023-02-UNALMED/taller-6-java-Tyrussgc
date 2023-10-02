package vehiculos;

public class Pais {
    String nombre;
    int vehiculosVendidos = 0;
    public Pais(String nombre){
        this.nombre = nombre;

    }

    public String getNombre() {
        return nombre;
    }
    public static Pais paisMasVendedor(){
        int contador = 0;
        Pais paismas = null;
        for (Pais pais:Vehiculo.cantidadporPais) {
            if (contador < pais.vehiculosVendidos) {
                contador = pais.vehiculosVendidos;
                paismas = pais;

            }
        }
        return paismas;
    }

    public int getVehiculosVendidos() {
        return vehiculosVendidos;
    }
}