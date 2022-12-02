import javax.swing.*;

public class Botao extends JFrame {
    JButton jb = new JButton("Converter");

    public Botao() {
        setLayout(null);
        jb.setBounds(100, 300, 100, 60);
        add(jb);

        setTitle("Titulo da janela");
        setSize(700,600);

    }
}
