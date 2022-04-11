package t14;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class demo13 {
    public static void main(String[] args){
        Frame frame=new Frame("test");

        FileDialog f1=new FileDialog(frame,"选择要打开的文件",FileDialog.LOAD);
        FileDialog f2=new FileDialog(frame,"选择要保存的路径",FileDialog.SAVE);

        Button b1 = new Button("打开文件");
        Button b2 = new Button("保存文件");

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.setVisible(true);
                String directory = f1.getDirectory();
                String file = f1.getFile();
                System.out.println("打开路径为"+directory);
                System.out.println("打开名称为"+file);
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f2.setVisible(true);
                String directory = f2.getDirectory();
                String file = f2.getFile();
                System.out.println("保存路径为"+directory);
                System.out.println("保存名称为"+file);
            }
        });
        frame.add(b1,BorderLayout.NORTH);
        frame.add(b2);

        frame.pack();
        frame.setVisible(true);
    }
}
