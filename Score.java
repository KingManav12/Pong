import java.awt.*;

public class Score extends Rectangle {

    static int GAME_WIDTH;
    static int GAME_HEIGHT;
    int player1;
    int player2;

    Score(int GAME_WIDTH, int GAME_HEIGHT) {
        Score.GAME_WIDTH = GAME_WIDTH;
        Score.GAME_HEIGHT = GAME_HEIGHT;
    }

    public void draw(Graphics g) {
        g.setColor(Color.white);
        Font font = new Font("Comic Sans MS", Font.PLAIN, 60); // Correcting font initialization
        g.setFont(font);
        g.drawLine(GAME_WIDTH / 2, 0, GAME_WIDTH/2, GAME_HEIGHT);

        g.drawString(String.valueOf(player1),(GAME_WIDTH/2) - 100,50);
        g.drawString(String.valueOf(player2),(GAME_WIDTH/2) + 75,50);


    }
}
