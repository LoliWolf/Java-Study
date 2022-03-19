package t14;

import javax.swing.*;
import java.awt.*;

public class demo8 {
    public static void main(String[] args) {
        Frame frame=new Frame();
        BoxLayout boxLayout=new BoxLayout(frame,BoxLayout.X_AXIS);
        frame.setLayout(boxLayout);
        frame.add(new Button("按钮1"));
        frame.add(new Button("按钮2"));



        frame.pack();
        frame.setVisible(true);
    }
}
