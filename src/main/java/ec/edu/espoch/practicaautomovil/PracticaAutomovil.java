package ec.edu.espoch.practicaautomovil;

import ec.edu.espoch.practicaautomovil.clase.Automovil;
import ec.edu.espoch.practicaautomovil.enumeracion.Color;
import ec.edu.espoch.practicaautomovil.enumeracion.TipoAutomovil;
import ec.edu.espoch.practicaautomovil.enumeracion.TipoCombustible;

public class PracticaAutomovil {

    public static void main(String[] args) {
        Automovil miAuto = new Automovil("TOYOTA","2023","2.0",TipoCombustible.GASOLINA,TipoAutomovil.COMPACTO,4,5,200,Color.ROJO,0);
        
        miAuto.acelerar(100);
        System.out.println("Velocidad actual: " + miAuto.getVelocidadActual() + " km/h");
        
        miAuto.acelerar(20);
        System.out.println("Velocidad actual: " + miAuto.getVelocidadActual() + " km/h");
        
        miAuto.desacelerar(50);
        System.out.println("Velocidad actual: " + miAuto.getVelocidadActual() + " km/h");
        
        miAuto.frenar();
        System.out.println("Velocidad actual: " + miAuto.getVelocidadActual() + " km/h");
    }
}
