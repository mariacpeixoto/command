
public class TV {
	private boolean ligada;

    public void ligar() {
        ligada = true;
        System.out.println("TV ligada!");
    }

    public void desligar() {
        ligada = false;
        System.out.println("TV desligada!");
    }

    public boolean isLigada() {
        return ligada;
    }
}
