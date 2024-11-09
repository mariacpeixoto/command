import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControleRemotoFrame extends JFrame {
	private Command comando;

    public ControleRemotoFrame() {
        // Configura��es do JFrame
        setTitle("Controle Remoto");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
    }

    public void init() {
        // Criando a TV
        TV tv = new TV();

        // Criando os comandos
        Command ligarTV = new LigarTVCommand(tv);
        Command desligarTV = new DesligarTVCommand(tv);

        // Criando bot�es
        JButton botaoLigar = new JButton("Ligar TV");
        JButton botaoDesligar = new JButton("Desligar TV");

        // A��o do bot�o Ligar TV
        botaoLigar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setComando(ligarTV); // Define o comando
                boolean sucesso = pressionarBotao();  // Executa o comando e verifica o sucesso
                if (!sucesso) {
                    System.out.println("N�o foi poss�vel ligar a TV.");
                }
            }
        });

        // A��o do bot�o Desligar TV
        botaoDesligar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setComando(desligarTV); // Define o comando
                boolean sucesso = pressionarBotao();  // Executa o comando e verifica o sucesso
                if (!sucesso) {
                    System.out.println("N�o foi poss�vel desligar a TV.");
                }
            }
        });

        // Adicionando os bot�es ao JFrame
        add(botaoLigar);
        add(botaoDesligar);

        // Exibindo o JFrame
        setVisible(true);
    }

    public void setComando(Command comando) {
        this.comando = comando;
    }

    public boolean pressionarBotao() {
        if (comando != null) {
            return comando.execute();  // Retorna o resultado da execu��o
        }
        return false;
    }
}
