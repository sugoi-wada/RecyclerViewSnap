package com.github.rubensousa.recyclerviewsnap;


import java.util.List;

public class Snap {

    private boolean padding;
    private int gravity;
    private String text;
    private List<App> apps;
    private int offset;

    public Snap(int gravity, String text, boolean padding, List<App> apps) {
        this(gravity, text, padding, apps, 0);
    }

    public Snap(int gravity, String text, boolean padding, List<App> apps, int offset) {
        this.gravity = gravity;
        this.text = text;
        this.apps = apps;
        this.padding = padding;
        this.offset = offset;
    }

    public boolean getPadding() {
        return padding;
    }

    public String getText() {
        return text;
    }

    public int getGravity() {
        return gravity;
    }

    public List<App> getApps() {
        return apps;
    }

    public int getOffset() { return offset; }

}
