
package vehiculo;

/**
 * 
 * @author Marcos Mateo campano
 * @since 28-04-2024
 * @version 1.0
 */

public class Main {
/**
 * 
 * @param args 
 */
      public static void main(String[] args) {
        VehiculoMMC2324 miVehiculoXXX2223;
        int stockActual;
        
        miVehiculoXXX2223 = new VehiculoMMC2324("Seat",18000,100);
        operativoVehiculosMMC2324(miVehiculoXXX2223, 50); 
        stockActual = miVehiculoXXX2223.obtenerStock();
        System.out.println("El stock actual es "+ stockActual );
    }
/**
 * 
 * @param miVehiculoXXX2223
 * @param cantidad 
 */
    static void operativoVehiculosMMC2324(VehiculoMMC2324 miVehiculoXXX2223, Integer cantidad) {
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoXXX2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoXXX2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
    }

}
    
