
package sistemaMsgCommand;
//Comando concreto cancelar
public class ComandoCancelar  implements Comando{
    private Mensagem mensagem;
    private String mensagemTexto;

    public ComandoCancelar(Mensagem mensagem, String mensagemTexto) {
        this.mensagem = mensagem;
        this.mensagemTexto = mensagemTexto;
    }
    
    @Override
    public void executar() {
        mensagem.cancelar(mensagemTexto);
    }

    @Override
    public void desfazer() {
        mensagem.enviar(mensagemTexto);
    }   
}
