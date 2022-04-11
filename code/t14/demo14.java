package t14;

import javax.xml.soap.Text;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class demo14 {
    Frame frame=new Frame("test");
    TextField tf=new TextField(30);
    Button ok=new Button("确定");
    public void init(){
//        myListener myListener=new myListener();

//        ok.addActionListener(myListener);
        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("Helloworld");
            }
        });
        frame.add(tf,BorderLayout.NORTH);
        frame.add(ok);
        frame.pack();
        frame.setVisible(true);
    }

//    private class myListener implements ActionListener{
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            tf.setText("Helloworld");
//        }
//    }

    public static void main(String[] args) {
new demo14().init();







    }
}
