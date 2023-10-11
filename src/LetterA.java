import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class LetterA extends JComponent {
    private int width;
    private int height;

    public LetterA(int w, int h) {
        width = w;
        height = h;
    }
    protected void paintComponent(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;
        Line2D.Double firstALine = new Line2D.Double(600, 400, 650, 200);
        g2d.setStroke(new BasicStroke(10));
        g2d.setColor(new Color(255,0,0));
        g2d.draw(firstALine);
        Line2D.Double secondALine = new Line2D.Double(650,200, 700, 400);
        g2d.setStroke(new BasicStroke(10));
        g2d.setColor(new Color(255,0,0));
        g2d.draw(secondALine);
        Line2D.Double thirdALine = new Line2D.Double(625, 300, 675, 300);
        g2d.setStroke(new BasicStroke(10));
        g2d.setColor(new Color(255,0,0));
        g2d.draw(thirdALine);

    }
}