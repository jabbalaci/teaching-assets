package com.example;

public class TextBox extends UIWidget
{
    private String text = "";

    public TextBox()
    {
        super(true);
//        System.out.println("TextBox konstruktor lefutott");
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        this.text = "";
    }

//    @Override

    @Override
    public String toString() {
        return "TextBox(" +
                "text='" + text + '\'' +
                ')';
    }
}
