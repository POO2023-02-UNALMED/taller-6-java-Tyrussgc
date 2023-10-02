package vehiculos;

import java.util.ArrayList;

public class Fabricante {
    String nombre;
    Pais pais;
    int vehiculosVendidos = 0;

    public Fabricante(String nombre,Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public Pais getPais() {
        return pais;
    }
    public static Fabricante fabricaMayorVentas(){
        int contador = 0;
        Fabricante fabricantemas = null;
        for (Fabricante fabricante:Vehiculo.cantidadporFabricante) {
            if (contador < fabricante.vehiculosVendidos) {
                contador = fabricante.vehiculosVendidos;
                fabricantemas = fabricante;

            }
        }
        return fabricantemas;
    }
}