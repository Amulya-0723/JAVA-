import javax.swing.*;
import java.awt.*;

public class CarAnimationSwing extends JPanel implements Runnable {
    int x = 0;

    public CarAnimationSwing() {
        Thread t = new Thread(this);
        t.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Clear background
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());

        // Car body
        g.setColor(Color.RED);
        g.fillRect(x + 50, 100, 200, 50);     // base
        g.fillRect(x + 75, 75, 150, 50);      // top

        // Windows
        g.setColor(Color.CYAN);
        g.fillRect(x + 110, 80, 30, 30);
        g.fillRect(x + 160, 80, 30, 30);

        // Wheels
        g.setColor(Color.BLACK);
        g.fillOval(x + 75, 140, 50, 50);
        g.fillOval(x + 175, 140, 50, 50);
    }

    public void run() {
        try {
            for (int i = 0; i < 70; i++) {
                x = i * 10;
                repaint();
                Thread.sleep(100);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Car Animation");
        CarAnimationSwing panel = new CarAnimationSwing();
        frame.add(panel);
        frame.setSize(800, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
