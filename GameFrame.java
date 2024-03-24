import java.awt.*;
import javax.swing.*;
public class GameFrame extends JFrame {
    GameFrame()
    {
        this.add(new GamePanel());
        this.setTitle("Pong");
        this.setBackground(Color.black);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
