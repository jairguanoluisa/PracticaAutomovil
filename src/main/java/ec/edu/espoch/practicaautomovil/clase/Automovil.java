package ec.edu.espoch.practicaautomovil.clase;

import ec.edu.espoch.practicaautomovil.enumeracion.Color;
import ec.edu.espoch.practicaautomovil.enumeracion.TipoAutomovil;
import ec.edu.espoch.practicaautomovil.enumeracion.TipoCombustible;

public class Automovil {
    private String marca;
    private String modelo;
    private String motor;
    private TipoCombustible tipoCombustible;
    private TipoAutomovil tipoAutomovil;
    private int numeroPuertas;
    private int cantidadAsientos;
    private int velocidadMaxima;
    private Color color;
    private int velocidadActual;
    
    //CONSTRUCTOR
    public Automovil(String marca, String modelo, String motor, TipoCombustible tipoCombustible, TipoAutomovil tipoAutomovil, int numeroPuertas, int cantidadAsientos, int velocidadMaxima, Color color, int velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        this.velocidadActual = velocidadActual;
    }
    
    //SETTER Y GETTER
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public TipoAutomovil getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(TipoAutomovil tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    
    //METODOS
    public boolean acelerar(int velocidad) {
        // 1. Verificar la regla de la velocidad máxima.
        if (velocidadActual + velocidad <= velocidadMaxima) {
            // 2. Modificar el atributo de instancia (implícitamente se refiere a this.velocidadActual).
            velocidadActual += velocidad;
            return true;
        } else {
            System.out.println("❌ Advertencia: No se puede acelerar mas alla de la velocidad maxima (" + velocidadMaxima + " km/h).");
            return false;
        }
    }
    
    public boolean desacelerar(int velocidad) {
        // 1. Verificar la regla de la velocidad negativa.
        if (velocidadActual - velocidad >= 0) {
            // 2. Modificar el atributo de instancia.
            velocidadActual -= velocidad;
            return true;
        } else {
            System.out.println("⚠️ Advertencia: No es posible desacelerar a una velocidad negativa.");
            return false;
        }
    }
    
    public void frenar() {
        // 3. Asignación simple.
        velocidadActual = 0;
    }
    
    public double calcularTiempoEstimado(double distancia) {
        // 4. Regla: Evitar división por cero.
        if (velocidadActual > 0) {
            // Lógica: Tiempo = Distancia / Velocidad
            return distancia / velocidadActual;
        } else {
            System.out.println("No se puede calcular el tiempo estimado. El vehiculo esta detenido.");
            return Double.POSITIVE_INFINITY;
        }
    }
        
    public void mostrarValores(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Tipo de combustible: " + tipoCombustible);
        System.out.println("Tipo de Automovil: " + tipoAutomovil);
        System.out.println("Numero de puertas: " + numeroPuertas);
        System.out.println("Cantidad de asientos: " + cantidadAsientos);
        System.out.println("Velocidad Maxima " + velocidadMaxima);
        System.out.println("Color: " + color);
        System.out.println("Velocidad Actual: " + velocidadActual);        
    }
    
}
