import java.awt.*;
import java.awt.font.GlyphVector;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.RenderableImage;
import java.text.AttributedCharacterIterator;
import java.util.Map;
import javax.swing.*;

public class LetterD extends JComponent {
    private int width;
    private int height;

    public LetterD(int w, int h) {
        width = w;
        height = h;
    }

    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Line2D.Double D1 = new Line2D.Double(300, 400, 300, 200);
        g2d.setStroke(new BasicStroke(10));
        g2d.setColor(new Color(0,125,125));
        g2d.draw(D1);
        g2d.setStroke(new BasicStroke(10));
        g2d.setColor(new Color(0,125,125));
        g2d.drawArc(200, 200, 200, 200, 270, 180);



    }
}

