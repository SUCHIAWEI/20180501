import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClassFrame2 extends JFrame {
    private JButton jbtnAdd = new JButton("ADD");
    private JButton jbtnAdd2 = new JButton("SUB");
    private JButton exit = new JButton("Exit");
    private int count=0;


    public ClassFrame2 () {
        Cframe2();
    }

    private void Cframe2(){
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
        jbtnAdd.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    count++;
                    ClassFrame2.this.setTitle(Integer.toString(count));
                }

        });
        jbtnAdd2.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   count--;
                   ClassFrame2.this.setTitle(Integer.toString(count));
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
        this.add(exit);
        }
    }
