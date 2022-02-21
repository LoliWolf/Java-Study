package t14;
import java.awt.*;
public class demo2 {
    public static void main(String[] args) {
        Frame frame =new Frame("Panel");
        Panel p=new Panel();
        p.add(new TextField("测试文本-----"));
        p.add(new Button("测试按钮-----"));
        frame.add(p);
        frame.setBackground(Color.green);
        frame.setBounds(0,0,1920,1080);
        frame.setVisible(true);
    }
}
