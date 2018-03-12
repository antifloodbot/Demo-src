import javax.swing.*;
import java.awt.event.*;

class Party {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setSize(500, 350);
        f.setLocationRelativeTo(null);
        JLabel l = new JLabel("Party in da haus");
        JButton b = new JButton("Accept");
        JButton c = new JButton("Decline");
        JPanel p = new JPanel();
        p.add(b);
        p.add(c);
        p.add(l);
        //JPanel p = new
        f.add(p);
        f.setVisible(true);
    }
}
