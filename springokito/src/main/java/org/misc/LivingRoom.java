package org.misc;

public class LivingRoom {

    private int width;
    private int length;

    public LivingRoom(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    private int calcArea(int width, int length) {
        return width*length;
    }

    @Override
    public String toString() {
        return "LivingRoom{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + calcArea(width, length) +
                '}';
    }
}
