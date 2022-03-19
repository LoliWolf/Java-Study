package t14;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.concurrent.ThreadPoolExecutor;

public class demo9 {
    public static void main(String[] args) {
        Frame frame=new Frame();
        Box hBox= Box.createHorizontalBox();
        hBox.add(new Button("水平1"));
        hBox.add(new Button("水平2"));
        Box vBox=Box.createVerticalBox();
        vBox.add(new Button("垂直1"));
        vBox.add(new Button("垂直2"));
        frame.add(hBox,BorderLayout.NORTH);
        frame.add(vBox);
        frame.pack();
        frame.setVisible(true);
    }
}
