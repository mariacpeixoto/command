
public class DesligarTVCommand extends Command {
	private TV tv;

    public DesligarTVCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public boolean execute() {
        // Verifica se a TV j� est� desligada
        if (!tv.isLigada()) {
            System.out.println("A TV j� est� desligada.");
            return false;  // N�o fez nada, porque j� estava desligada
        } else {
            tv.desligar();
            return true;  // Opera��o bem-sucedida
        }
    }
}
