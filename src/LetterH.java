import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class LetterH extends JComponent {
    private int width;
    private int height;

    public LetterH(int w, int h) {
        width = w;
        height = h;
    }

    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Line2D.Double h_one_Line = new Line2D.Double(450, 400, 450, 200);
        g2d.setStroke(new BasicStroke(10));
        g2d.setColor(new Color(0,255,255));
        g2d.draw(h_one_Line);
        Line2D.Double h_two_Line = new Line2D.Double(550, 400, 550, 200);
        g2d.setStroke(new BasicStroke(10));
        g2d.setColor(new Color(0,255,255));
        g2d.draw(h_two_Line);
        Line2D.Double h_three_Line = new Line2D.Double(450, 300, 550, 300);
        g2d.setStroke(new BasicStroke(10));
        g2d.setColor(new Color(0,255,255));
        g2d.draw(h_three_Line);
    }
}
