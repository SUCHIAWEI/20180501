import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame2 extends JFrame {
        private JLabel lb = new JLabel("華氏:");
        private JLabel lb2 = new JLabel("攝氏:");
        private JLabel lb3 = new JLabel("");
        private JButton jbtnAdd = new JButton("轉換");
        private JButton exit = new JButton("Exit");
        private JTextField jtf = new JTextField("");
        private int x =0;

    public Frame2() {
            frame2();
        }

        private void frame2() {
            this.setLocation(800,600);
            this.setSize(500,1000);
            this.setLayout(null);
            this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            this.setVisible(true);
            lb.setBounds(100,50,50,50);
            jtf.setBounds(150,50,100,50);
            jbtnAdd.setBounds(250,50,100,50);
            lb2.setBounds(360,50,50,50);
            lb3.setBounds(410,50,100,50);
            exit.setBounds(200,160,100,100);
            jbtnAdd.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    x=(Integer.parseInt(jtf.getText()) - 32) * 5/9;
                    lb3.setText(Integer.toString(x));
                }
            });
            exit.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });

            this.add(lb);
            this.add(lb2);
            this.add(lb3);
            this.add(jbtnAdd);
            this.add(exit);
            this.add(jtf);


        }
    }
