package t14;

import javax.smartcardio.ATR;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class demo7 {
    public static void main(String[] args) {
        Frame frame =new Frame();
        Panel p=new Panel();
        String[] name={"第一张","第二张","第三张","第四张","第五张"};
        CardLayout cardlayout = new CardLayout();
        p.setLayout(cardlayout);
        Panel p2=new Panel();
        for(int i=0;i<5;i++){
            p.add(name[i],new Button(name[i]));
        }
        Button b1=new Button("上一张");
        Button b2=new Button("下一张");
        Button b3=new Button("第一张");
        Button b4=new Button("最后一张");
        Button b5=new Button("第三张");
        ActionListener listner= new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String actionCommand = e.getActionCommand();
                switch(actionCommand){
                    case "上一张":
                        cardlayout.previous(p);
                        break;
                    case "下一张":
                        cardlayout.next(p);
                        break;
                    case "第一张":
                        cardlayout.first(p);
                        break;
                    case "最后一张":
                        cardlayout.last(p);
                        break;
                    case "第三张":
                        cardlayout.show(p,"第三张");
                        break;
                }
            }
        };
        b1.addActionListener(listner);
        b2.addActionListener(listner);
        b3.addActionListener(listner);
        b4.addActionListener(listner);
        b5.addActionListener(listner);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        frame.add(p);
        frame.add(p2,BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
    }
}
