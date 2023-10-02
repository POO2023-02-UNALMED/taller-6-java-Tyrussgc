 package vehiculos;                                                                                     
                                                                                                        
 public class Camion extends Vehiculo {                                                                 
     int ejes;                                                                                          
     static int cantidadCamiones;                                                                       
                                                                                                        
     public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
         super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);                                  
         this.placa = placa;                                                                            
         this.nombre = nombre;                                                                          
         this.precio = precio;                                                                          
         this.peso = peso;                                                                              
         this.fabricante = fabricante;                                                                  
         this.ejes = ejes;                                                                              
         cantidadCamiones++;                                                                            
                                                                                                        
     }                                                                                                  
                                                                                                        
     public static int getCantidadCamiones() {                                                          
         return cantidadCamiones;                                                                       
     }                                                                                                  
                                                                                                        
     public int getEjes() {                                                                             
         return ejes;                                                                                   
     }                                                                                                  
 }                                                                                                      