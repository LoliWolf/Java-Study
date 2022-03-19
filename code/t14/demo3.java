package t14;

import java.awt.*;

public class demo3 {
    public static void main(String[] args) {
        Frame frame = new Frame("ScrollPane演示");
        ScrollPane sp=new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);

        sp.add(new TextField("testField"));
        sp.add(new Button("testButton"));
        frame.add(sp);
        frame.setBounds(0,0,300,100);
        frame.setVisible(true);


    }
}
