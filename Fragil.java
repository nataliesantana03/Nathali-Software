public class Fragil extends Envio{

    public boolean isFragil;
    public Fragil (double peso, double dimensiones){
        super (peso,dimensiones);
        this.isFragil = isFragil;
    }

    public double calcularenvio(){
        double costoBase = peso * 8 + dimensiones * 4;
        if(isFragil){
            costoBase += 20;
        }
        return costoBase;
    }

    public String toString(){
        return "Articulo fragil";
    }

    public static void main(String [] args){
        Envio envio1 = new DocumetUrgente (2.5, 30.0);
        Envio envio2 = new Fragil (5.0, 40.0);
        Envio envio3 = new PaqueteEstandar (0.5, 20.0);

        double costoEnvio1 = envio1.calcularenvio();
        double costoEnvio2 = envio2.calcularenvio();
        double costoEnvio3 = envio3.calcularenvio();

        System.out.println("El costo del envio 1: $" + costoEnvio1 + " - tipo:" + envio1);
        System.out.println("El costo del envio 2: $" + costoEnvio2 + " - tipo:" + envio2);
        System.out.println("El costo del envio 3: $" + costoEnvio3 + " - tipo:" + envio3);


    }
}


