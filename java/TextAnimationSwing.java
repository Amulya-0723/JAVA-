import javax.swing.*;
import java.awt.*;

public class TextAnimationSwing extends JPanel implements Runnable {
    int x = 0;

    public TextAnimationSwing() {
        Thread t = new Thread(this);
        t.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());

        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 41));
        g.drawString("MCA 2024-2027", 250, 150);

        g.setColor(Color.YELLOW);
        g.setFont(new Font("Arial", Font.BOLD, 24));
        g.drawString("JAVA APPLICATION DEVELOPMENT", x, 200);
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
        JFrame frame = new JFrame("Text Animation");
        TextAnimationSwing panel = new TextAnimationSwing();
        frame.add(panel);
        frame.setSize(800, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
