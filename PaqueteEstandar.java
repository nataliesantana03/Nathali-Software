public class PaqueteEstandar extends Envio {

    public PaqueteEstandar(double peso, double dimensiones){
        super(peso, dimensiones);
    }

    public double calcularenvio(){
        return peso * 5 + dimensiones * 2;
    }

    public String toString(){
        return "Articulo estandar";
    }

}