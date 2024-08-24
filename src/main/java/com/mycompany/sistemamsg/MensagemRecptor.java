
package com.mycompany.sistemamsg;


public class MensagemRecptor {
    
    private String mensagem = "Ola voce foi selecionado para vaga de emprego";
    private boolean cancelar = false;

    public MensagemRecptor() {
        this.mensagem = mensagem;
        
    }

    
    public void enviarMensagem(){
        
        if (!cancelar){
            cancelar = true;
            System.out.println("Mensagem enviada:" + mensagem);
        }else {
            System.out.println("A mensagem ja enviada!");
        }
    }
    
    public void cancelarMensagem(){
        if(cancelar){
            cancelar = false;
            System.out.println("mensagem cancelada:" + mensagem);
            
        }else {
            System.out.println("a mensagem já foi cancelada");
        }
        
        
    }
    
    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public boolean isCancelar() {
        return cancelar;
    }

    public void setCancelar(boolean cancelar) {
        this.cancelar = cancelar;
    }
    
    
}
