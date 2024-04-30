//Polimorfismo

public class Envio{

    public double peso;
    public double dimensiones;

    public Envio (double peso, double dimensiones){
        this.peso=peso;
        this.dimensiones=dimensiones;

    }

    public double calcularenvio(){
        return 0.0;
    }
    public String toString(){
        return "Envio";
    }


}
