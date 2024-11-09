
public class DesligarTVCommand extends Command {
	private TV tv;

    public DesligarTVCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public boolean execute() {
        // Verifica se a TV já está desligada
        if (!tv.isLigada()) {
            System.out.println("A TV já está desligada.");
            return false;  // Não fez nada, porque já estava desligada
        } else {
            tv.desligar();
            return true;  // Operação bem-sucedida
        }
    }
}
