
package sistemaMsgCommand;


public class AppMensagem {
    public static void main(String[] args) {
        //cria mensagem (receiver)
        Mensagem mensagem = new Mensagem();
        //cria o controle da mensagem (invoker)
        ControleMensagem controle = new ControleMensagem();
        //cria o comando concreto envio de msg
        Comando enviaMsg = new ComandoEnviar(mensagem, "mensagem de teste");
        controle.setComando(enviaMsg);
        //envia a msg (execute)
        controle.executarComando();
        
        //cria o comando concreto cancelar a msg
        Comando cancelaMsg = new ComandoCancelar(mensagem, "mensagem de teste");
        controle.setComando(cancelaMsg);
        //cancela o envio da msg (execute)
        controle.executarComando();
        
        //desfazendo o cancelamento da msg  (undo)
        controle.desfazerComando(); //vai reenviar a msg dai
    }
    
}
