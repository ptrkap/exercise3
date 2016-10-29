package org.misc;

public class Kitchen {

    private double size;
    private boolean tiles;
    private boolean sink;

    public void setSize(double size) {
        this.size = size*10;
    }

    public void setTiles(boolean tiles) {
        this.tiles = tiles;
    }

    public void setSink(boolean sink) {
        this.sink = sink;
    }

    @Override
    public String toString() {
        return "Kitchen{" +
                "size=" + size +
                ", tiles=" + tiles +
                ", sink=" + sink +
                '}';
    }
}
