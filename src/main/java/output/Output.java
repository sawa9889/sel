package output;

import javax.swing.*;
import java.awt.*;

public class Output extends JFrame {
    private JList list = new JList();
    Output(){
        super("посты");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JTextField field=new JTextField();
        JButton button1=new JButton(">");
        JButton button2=new JButton("<");
        JButton button3=new JButton("Open");

        Box box1=Box.createHorizontalBox();
        box1.add(field);
        box1.add(button1);
        box1.add(button2);
        box1.add(button3);

        Box box2=Box.createHorizontalBox();
        box2.add(list);

        Box box=Box.createVerticalBox();
        box.add(box1);
        box.add(box2);

        panel.setLayout(null);
        panel.add(box);
        this.add(panel);
        list.setEnabled(false);
        this.setVisible(true);

    }

    void add(String str){
        list.add(str,list);
    }
}
