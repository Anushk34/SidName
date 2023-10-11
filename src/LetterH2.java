import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class LetterH2 extends JComponent {
    private int width;
    private int height;

    public LetterH2(int w, int h) {
        width = w;
        height = h;
    }

    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Line2D.Double h_four_Line = new Line2D.Double(1000, 400, 1000, 200);
        g2d.setStroke(new BasicStroke(10));
        g2d.setColor(new Color(125,125,125));
        g2d.draw(h_four_Line);
        Line2D.Double h_five_Line = new Line2D.Double(1100, 400, 1100, 200);
        g2d.setStroke(new BasicStroke(10));
        g2d.setColor(new Color(125,125,125));
        g2d.draw(h_five_Line);
        Line2D.Double h_six_Line = new Line2D.Double(1000, 300, 1100, 300);
        g2d.setStroke(new BasicStroke(10));
        g2d.setColor(new Color(125,125,125));
        g2d.draw(h_six_Line);
    }
}