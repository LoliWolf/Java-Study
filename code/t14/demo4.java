package t14;

import java.awt.*;

public class demo4 {
    public static void main(String[] args) {
        Frame frame=new Frame("testFlowLayoout");
//        frame.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));
        frame.setLayout(new FlowLayout(FlowLayout.TRAILING,20,20));
        for(int i=0;i<100;i++){
            frame.add(new Button("test"+i));
        }
        frame.pack();
        frame.setBounds(0,0,1920,1080);



        frame.setVisible((true));
    }
}
