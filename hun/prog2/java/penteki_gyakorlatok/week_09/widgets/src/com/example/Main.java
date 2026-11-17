package com.example;

public class Main
{
    public static void main(String[] args)
    {
//        UIWidget widget = new UIWidget();
//        System.out.println(widget.isEnabled());
//        widget.disable();
//        System.out.println(widget.isEnabled());
//        System.out.println("-------------------");

//        TextBox tb1 = new TextBox();
//        System.out.println(tb1.isEnabled());
//        tb1.disable();
//        System.out.println(tb1.isEnabled());
//        tb1.setText("hello textbox");
//        System.out.println(tb1.getText());

//        System.out.println(tb1);

//        System.out.println(Integer.toHexString(tb1.hashCode()));

//        TextBox tb2 = tb1;
//
//        System.out.println(tb1.hashCode());
//        System.out.println(tb2.hashCode());
//
//        System.out.println(tb1.equals(tb2));
//
//        TextBox box1 = new TextBox();
//        TextBox box2 = new TextBox();
//
//        System.out.println(box1.equals(box2));


        //        System.out.println("-------------------");

//        Object obj = new Object();
//        obj.

//        TextBox box1 = new TextBox();
//        box1.setText("hello textbox");
//        System.out.println(box1);

        UIWidget widget = new UIWidget(true);
        show(widget);

        TextBox box = new TextBox();
        box.setText("hello there");
        show(box);
    }

    private static void show(UIWidget widget)
    {
        boolean ok = widget.isEnabled();
        System.out.println(widget);
    }
}
