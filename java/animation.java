import javax.swing.*;
import java.awt.*;

public class Animation extends JPanel {

    private int screen = 1;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 30));

        if (screen == 1) {
            g.setColor(Color.YELLOW);
            g.drawString("MCA STUDENTS", 100, 300);
            g.drawString("PRESENTS", 150, 350);
        } else {
            g.setColor(Color.WHITE);
            g.drawString("PHOTOGRAPHY CLUB 2.5", 100, 300);
            g.drawString("MCA 2024-26", 150, 350);
        }
    }

    public void startAnimation() {
        try {
            Thread.sleep(5000); // Wait 5 seconds
            screen = 2;
            repaint();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Animation");
        Animation panel = new Animation();
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        panel.startAnimation();  
    }
}

