
package sistemaMsgCommand;
//comando concreto
public class ComandoEnviar implements Comando{
    private Mensagem mensagem;
    private String mensagemTexto;

    public ComandoEnviar(Mensagem mensagem, String mensagemTexto) {
        this.mensagem = mensagem;
        this.mensagemTexto = mensagemTexto;
    }
    
    

    @Override
    public void executar() {
        mensagem.enviar(mensagemTexto);
    }

    @Override
    public void desfazer() {
        mensagem.cancelar(mensagemTexto);
    }
    
}
