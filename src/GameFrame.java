import javax.swing.*;

public class GameFrame extends JFrame {
    // constructor
    GameFrame() {

        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack(); // will take Jframe and fit it around any components added
        this.setVisible(true);
        this.setLocationRelativeTo(null); // makes window appear in middle of screen

    }
}