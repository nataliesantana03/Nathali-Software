public class DocumetUrgente extends Envio {
    
    public DocumetUrgente(double peso, double dimensiones){
        super(peso,dimensiones);
    }

    public double calcularenvio(){
        return peso *10 + dimensiones + 3;
    }

    public String toString(){
        return "Document urgente";
    }
}
