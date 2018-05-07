import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClassFrame extends JFrame{

    private JButton jbtnAdd = new JButton("<--");
    private JButton jbtnAdd2 = new JButton("-->");
    private JButton exit = new JButton("Exit");
    private JTextField jtf = new JTextField("10");
    private int x =0 ;
    private JLabel lb = new JLabel("Q__Q");

    public ClassFrame () {
        Cframe();
    }

    private void Cframe(){
        this.setLocation(800,600);
        this.setSize(500,1000);
        this.setLayout(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.setVisible(true);
        jbtnAdd.setLocation(0,200);
        jbtnAdd.setSize(100,100);
        jbtnAdd2.setLocation(200,200);
        jbtnAdd2.setSize(100,100);
        exit.setBounds(100,200,100,100);
        lb.setBounds(x,50,200,200);
        jbtnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x-=10;
                switch (x%40){
                    case 0:
                        lb.setText(">_<");
                        break;
                    case 10:
                        lb.setText("QAQ");
                        break;
                    case 20:
                        lb.setText("^_^");
                        break;
                    case 30:
                        lb.setText("XD");
                        break;
                }
                lb.setBounds(x,50,200,200);

            }
        });

        jbtnAdd2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x+=10;
                lb.setBounds(x,50,200,200);

                switch (x%40){
                    case 0:
                        lb.setText(">_<");
                        break;
                    case 10:
                        lb.setText("QAQ");
                        break;
                    case 20:
                        lb.setText("^_^");
                        break;
                    case 30:
                        lb.setText("XD");
                        break;
                }

            }
        });

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });



        this.add(jbtnAdd);
        this.add(jbtnAdd2);
        this.add(lb);
        this.add(exit);







    }
}