package t14;

import java.awt.*;

public class demo6 {
    public static void main(String[] args) {
        Frame frame =new Frame("计算器");
        Panel panel1=new Panel();
        panel1.add(new TextField(30));
        frame.add(panel1,BorderLayout.NORTH);
        Panel panel2=new Panel();
        panel2.setLayout(new GridLayout(3,5,4,4));
        for(int i=0;i<10;i++)
            panel2.add(new Button(i+""));
        panel2.add(new Button("+"));
        panel2.add(new Button("-"));
        panel2.add(new Button("*"));
        panel2.add(new Button("/"));
        panel2.add(new Button("."));
        frame.add(panel2);

        frame.pack();
        frame.setVisible(true);
    }
}
