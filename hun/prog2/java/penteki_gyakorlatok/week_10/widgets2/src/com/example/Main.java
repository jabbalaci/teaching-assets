package com.example;

public class Main
{
    public static void main(String[] args)
    {
//        UIWidget widget = new UIWidget();
//        System.out.println(widget.isEnabled());
//        widget.disable();
//        System.out.println(widget.isEnabled());
//
//        System.out.println("----------");

//        TextBox tb1 = new TextBox();
//        System.out.println(tb1.isEnabled());
//        System.out.println(tb1);

//        System.out.println(tb1.isEnabled());
//        tb1.disable();
//        System.out.println(tb1.isEnabled());
//        tb1.setText("I'm a TextBox");
//        System.out.println(tb1.getText());

//        System.out.println(tb1);
//        System.out.println(tb1.hashCode());
//        System.out.println(Integer.toHexString(tb1.hashCode()));
//        TextBox tb2 = tb1;
//        System.out.println(tb2);
//        System.out.println(tb1.equals(tb2));
//
//        System.out.println("----------");
//
//        TextBox box1 = new TextBox();
//        TextBox box2 = new TextBox();
//        System.out.println(box1.equals(box2));

//        Object obj = new Object();
//        System.out.println(obj.getClass());

//        UIWidget widget = new UIWidget();
//        show(widget);

//        TextBox box = new TextBox();
//        box.setText("hello");
//        show(box);

        UIWidget[] widgets = { /*new UIWidget(),*/ new TextBox(), new RadioButton() };

        for (UIWidget widget : widgets)
        {
            widget.render();
        }
    }

//    private static void show(UIWidget widget)
//    {
//        if (widget instanceof TextBox)
//        {
//            TextBox box = (TextBox)widget;    // downcasting
//            box.setText("world");
//        }
//        System.out.println(widget);
//    }
}
