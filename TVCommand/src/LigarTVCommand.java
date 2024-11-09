
public class LigarTVCommand extends Command {
	private TV tv;

    public LigarTVCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public boolean execute() {
        // Verifica se a TV já está ligada
        if (tv.isLigada()) {
            System.out.println("A TV já está ligada.");
            return false;  // Não fez nada, porque já estava ligada
        } else {
            tv.ligar();
            return true;  // Operação bem-sucedida
        }
    }
}
