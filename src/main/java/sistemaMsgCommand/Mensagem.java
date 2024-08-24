
package sistemaMsgCommand;
//Receiver (receptor que realiza a ação real d enviar e cancelar a msg)
public class Mensagem {

    public Mensagem() {
        
    }
    
    public void enviar(String mensagem){
        System.out.println("Mensagem enviada: " + mensagem);
    }
    public void cancelar(String mensagem){
        System.out.println("Envio da mensagem cancelado: "+ mensagem);   
    }
}
