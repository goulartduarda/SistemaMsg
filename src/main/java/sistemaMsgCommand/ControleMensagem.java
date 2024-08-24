
package sistemaMsgCommand;
//Invoker (invocador que recebe os comandos e executa ou desfazer uma ação)
public class ControleMensagem {
    private Comando comando;

    public void setComando(Comando comando) {
        this.comando = comando;
    }
    public void executarComando(){
        if(comando != null){
            comando.executar();
        }
    }
    public void desfazerComando(){
        if(comando !=null){
            comando.desfazer();
        }
    }
}
