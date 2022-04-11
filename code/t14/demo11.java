package t14;


import javax.swing.*;
import java.awt.*;

public class demo11 {
    Frame frame=new Frame("test");

    TextArea ta=new TextArea(5,20);

    Choice colorChooser = new Choice();

    CheckboxGroup cbg=new CheckboxGroup();
    Checkbox male=new Checkbox("男",cbg,false);
    Checkbox female=new Checkbox("女",cbg,false);
    Checkbox ismarried=new Checkbox("是否已婚？");

    TextField tf=new TextField(50);

    Button ok=new Button("确认");

    List list=new List(6,true);
    public void init(){
        Box bBox = Box.createHorizontalBox();
        bBox.add(tf);
        bBox.add(ok);
        frame.add(bBox,BorderLayout.SOUTH);

        colorChooser.add("红色");
        colorChooser.add("蓝色");
        colorChooser.add("绿色");
        Box cBox=Box.createHorizontalBox();
        cBox.add(colorChooser);
        cBox.add(male);
        cBox.add(female);
        cBox.add(ismarried);

        Box topLeft=Box.createVerticalBox();
        topLeft.add(ta);
        topLeft.add(cBox);

        list.add("红色");
        list.add("蓝色");
        list.add("绿色");
        Box top=Box.createHorizontalBox();
        top.add(topLeft);
        top.add(list);

        frame.add(top);
        frame.pack();
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        new demo11().init();

    }
}
