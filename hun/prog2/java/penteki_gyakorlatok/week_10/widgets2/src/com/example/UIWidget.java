package com.example;

public abstract class UIWidget
{
    private boolean isEnabled = true;

//    public UIWidget(boolean isEnabled) {
//        this.isEnabled = isEnabled;
//        System.out.println("UIWidget konstruktor lefutott");
//    }

    public void enable() {
        this.isEnabled = true;
    }

    public void disable() {
        this.isEnabled = false;
    }

    public boolean isEnabled() {
        return this.isEnabled;
    }

    public abstract void render();
}
