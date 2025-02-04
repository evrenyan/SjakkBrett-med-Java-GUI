import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

abstract class Rute extends JLabel {
    void initGUI() {
        setPreferredSize(new Dimension(50, 50));
        setOpaque(true);
    }
}
class HvitRute extends Rute {
    @Override
    void initGUI() {
        super.initGUI();
        setBackground(Color.white);
    }
}
class SortRute extends Rute {
    @Override
    void initGUI() {
        super.initGUI();
        setBackground(Color.BLACK);
    }
}
class SjakkBrett {
    public static void main(String[] arg) {
        JFrame vindu = new JFrame("sjakkbrett");
        vindu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        vindu.add(panel);

        panel.setLayout(new GridLayout(8,8));
        for (int rx = 8;  rx >= 1; rx--) {
            for (int kx = 1; kx <= 8; kx++) {
                Rute r;
                if ((rx + kx)%2 == 1) r = new HvitRute();
                else r = new SortRute();
                r.initGUI();
                panel.add(r);
            }
        }
        vindu.pack();
        vindu.setVisible(true);
    }
}