package ec.edu.espoch.practicaautomovil;
import ec.edu.espoch.practicaautomovil.clase.Automovil;
import ec.edu.espoch.practicaautomovil.enumeracion.Color;
import ec.edu.espoch.practicaautomovil.enumeracion.TipoAutomovil;
import ec.edu.espoch.practicaautomovil.enumeracion.TipoCombustible;

public class PracticaAutomovil {

    public static void main(String[] args) {
        Automovil miAuto = new Automovil("TOYOTA","2023","2.0",TipoCombustible.GASOLINA,TipoAutomovil.COMPACTO,4,5,200,Color.ROJO,0);
        
        miAuto.mostrarValores();
        System.out.println("");
        
        System.out.println("Acelerando");
        miAuto.acelerar(100);
        System.out.println("Velocidad actual: " + miAuto.getVelocidadActual() + " km/h");
        System.out.println("");
        
        System.out.println("Acelerando");
        miAuto.acelerar(20);
        System.out.println("Velocidad actual: " + miAuto.getVelocidadActual() + " km/h");
        System.out.println("");
        
        System.out.println("Desacelerando");
        miAuto.desacelerar(50);
        System.out.println("Velocidad actual: " + miAuto.getVelocidadActual() + " km/h");
        System.out.println("");
        
        System.out.println("TIEMPO (Prueba)");
        double tiempoCalculado = miAuto.calcularTiempoEstimado(350.0);
        if (tiempoCalculado != Double.POSITIVE_INFINITY) {
            System.out.println("El tiempo estimado es: " + tiempoCalculado + " horas");
        
        System.out.println("Frenando");
        miAuto.frenar();
        System.out.println("Velocidad actual: " + miAuto.getVelocidadActual() + " km/h");
        System.out.println("");
        }
    }
}
