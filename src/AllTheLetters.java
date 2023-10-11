import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class AllTheLetters extends JComponent {
    private int width;
    private int height;

    public AllTheLetters(int w, int h) {
        width = w;
        height = h;
    }

    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Rectangle2D.Double sky = new Rectangle2D.Double(0, 0, width, height);
        g2d.setColor(new Color(100, 149, 237));
        g2d.fill(sky);
        g2d.setStroke(new BasicStroke(10));
        g2d.setColor(new Color(255, 0, 255));
        g2d.drawArc(50, 200, 75, 100, 90, 180);
        g2d.setStroke(new BasicStroke(10));
        g2d.setColor(new Color(255, 0, 255));
        g2d.drawArc(50, 300, 75, 100, 270, 180);
        Line2D.Double LineI1 = new Line2D.Double(200, 400, 200, 200);
        g2d.setStroke(new BasicStroke(10));
        g2d.setColor(new Color(125, 125, 0));
        g2d.draw(LineI1);
        Line2D.Double LineI2 = new Line2D.Double(150, 200, 250, 200);
        g2d.setStroke(new BasicStroke(10));
        g2d.setColor(new Color(125, 125, 0));
        g2d.draw(LineI2);
        Line2D.Double LineI3 = new Line2D.Double(150,400,250,400);
        g2d.setStroke(new BasicStroke(10));
        g2d.setColor(new Color(125, 125, 0));
        g2d.draw(LineI3);
        Line2D.Double D1 = new Line2D.Double(300, 400, 300, 200);
        g2d.setStroke(new BasicStroke(10));
        g2d.setColor(new Color(0,125,125));
        g2d.draw(D1);
        g2d.setStroke(new BasicStroke(10));
        g2d.setColor(new Color(0,125,125));
        g2d.drawArc(200, 200, 200, 200, 270, 180);
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
        Line2D.Double R1 = new Line2D.Double(750, 400, 750, 200);
        g2d.setStroke(new BasicStroke(10));
        g2d.setColor(new Color(0,0,0));
        g2d.draw(R1);
        g2d.setStroke(new BasicStroke(10));
        g2d.setColor(new Color(0,0,0));
        g2d.drawArc(675, 200, 150, 100, 270, 180);
        Line2D.Double R2 = new Line2D.Double(750, 300, 850, 400);
        g2d.setStroke(new BasicStroke(10));
        g2d.setColor(new Color(0,0,0));
        g2d.draw(R2);
        Line2D.Double T1 = new Line2D.Double(925, 400, 925, 200);
        g2d.setStroke(new BasicStroke(10));
        g2d.setColor(new Color(0,0,255));
        g2d.draw(T1);
        Line2D.Double T2 = new Line2D.Double(875, 200, 975, 200);
        g2d.setStroke(new BasicStroke(10));
        g2d.setColor(new Color(0,0,255));
        g2d.draw(T2);
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

