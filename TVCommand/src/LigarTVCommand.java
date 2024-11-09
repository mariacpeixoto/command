
public class LigarTVCommand extends Command {
	private TV tv;

    public LigarTVCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public boolean execute() {
        // Verifica se a TV j� est� ligada
        if (tv.isLigada()) {
            System.out.println("A TV j� est� ligada.");
            return false;  // N�o fez nada, porque j� estava ligada
        } else {
            tv.ligar();
            return true;  // Opera��o bem-sucedida
        }
    }
}
