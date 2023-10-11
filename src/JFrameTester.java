import javax.swing.*;
public class JFrameTester extends JComponent {
    public static void main(String[] args) {
        int w = 1300;
        int h = 800;
        JFrame f = new JFrame();
        LetterS s = new LetterS(w, h);
        LetterI i = new LetterI(w, h);
        LetterD d = new LetterD(w,h);
        LetterH h_1 = new LetterH(w,h);
        LetterA a = new LetterA(w, h);
        LetterR r = new LetterR(w, h);
        LetterT t = new LetterT(w, h);
        LetterH2 h_2 = new LetterH2(w, h);
        AllTheLetters ALT = new AllTheLetters(w, h);
        f.setSize(w, h);
        f.setTitle("Drawing in Java");
        f.add(s);
        f.add(i);
        f.add(d);
        f.add(h_1);
        f.add(a);
        f.add(r);
        f.add(t);
        f.add(h_2);
        f.add(ALT);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

