package t14;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class demo10 {
    public static void main(String[] args) {
        Frame frame=new Frame();
        Box hBox= Box.createHorizontalBox();
        Box vBox= Box.createVerticalBox();
        hBox.add(new Button("水平按钮1"));
        hBox.add(Box.createHorizontalGlue());
        hBox.add(new Button("水平 按钮2"));
        hBox.add(Box.createHorizontalStrut(30));
        hBox.add(new Button("水平按钮3"));
        vBox.add(new Button("垂直按钮1"));
        vBox.add(Box.createVerticalGlue());
        vBox.add(new Button("垂直按钮2"));
        vBox.add(Box.createVerticalStrut(30));
        vBox.add(new Button("垂直按钮3"));
        frame.add(hBox,BorderLayout.NORTH);
        frame.add(vBox);
        frame.pack();
        frame.setVisible(true);

    }
}
