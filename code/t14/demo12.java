package t14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class demo12 {
    public static void main(String[] args) {
        Frame frame=new Frame("Dialog");

        Dialog dialog1=new Dialog(frame,"非模式对话框",false);
        Dialog dialog2=new Dialog(frame,"模式对话框",true);
        dialog1.setBounds(20,30,300,200);
        dialog2.setBounds(20,30,300,200);
        Button falsed = new Button("打开非模式对话框");
        Button trued = new Button("打开模式对话框");
        falsed.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog1.setVisible(true);
            }
        });
        trued.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog2.setVisible(true);
            }
        });
        Box vBox = Box.createVerticalBox();
        vBox.add(new TextField(20));
        vBox.add(new Button("确认"));
        dialog1.add(vBox);

        frame.add(falsed,BorderLayout.NORTH);
        frame.add(trued);
        frame.pack();
        frame.setVisible(true);
    }
}
