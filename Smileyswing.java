import javax.swing.*;
import java.awt.*;

public class SmileySwing extends JPanel implements Runnable {
    private boolean isGreen = true;

    public SmileySwing() {
        Thread t = new Thread(this);
        t.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Hello World", 20, 20);

        if (isGreen) {
            g.setColor(Color.GREEN);
        } else {
            g.setColor(Color.YELLOW);
        }

        // Face
        g.fillOval(80, 70, 150, 150);

        // Eyes
        g.setColor(Color.BLACK);
        g.fillOval(120, 120, 15, 15);
        g.fillOval(170, 120, 15, 15);

        // Smile
        g.drawArc(130, 180, 50, 20, 180, 180);
    }

    public void run() {
        try {
            while (true) {
                isGreen = !isGreen;
                repaint();
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Smiley Face");
        SmileySwing smiley = new SmileySwing();
        frame.add(smiley);
        frame.setSize(800, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

