
package com.mycompany.sistemamsg;

public class MensagemApp {

    
    public static void main(String[] args) {
        
       MensagemRecptor mensagem = new MensagemRecptor();
       mensagem.enviarMensagem();
       mensagem.enviarMensagem();
       
       mensagem.cancelarMensagem();
       mensagem.cancelarMensagem();
       
       
      
    }
    
}
