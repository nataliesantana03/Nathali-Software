import java.util.Scanner;

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
        System.out.println("Bienvenido, aqui podras encontrar informacion sobre el costo del envio que vas a realizar.");

        Scanner scanner = new Scanner(System.in);

        System.out.print("¿El paquete es frágil? elige si es (true/false): ");
        boolean isFragil = scanner.nextBoolean();

        Envio envio;
        if (isFragil) {
            envio = new Fragil(0.0, 0.0); 
        } else {
            // aqui se puede saber si el tipo de envío es frágil o no
            System.out.print("¿Qué tipo de envío desea? (1 - Documento Urgente, 2 - Paquete Estándar): ");
            int tipoEnvio = scanner.nextInt();

      
            switch (tipoEnvio) {
                case 1:
                    envio = new DocumetUrgente(0.0, 0.0);
                    break;
                case 2:
                    envio = new PaqueteEstandar(0.0, 0.0);
                    break;
                default:
                    System.out.println("Opción no válida, se utilizará el envío estándar por defecto.");
                    envio = new PaqueteEstandar(0.0, 0.0);
                    break;
            }
        }

        // calcula el costo del envio
        double costoEnvio = envio.calcularenvio();

        // imprime el resultado del envio que realizo el cliente
        System.out.println("\n--- EL RESULTADO DE SU ENVIO ES ---");
        System.out.println("El costo del envío es: $" + costoEnvio);
        System.out.println("Tipo de envío: " + envio);

    
        scanner.close();
    }
}

