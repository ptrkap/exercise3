package org.misc;

public class House {

    private int flatNumber;
    private int buildingNumber;
    private LivingRoom room;

    public House(int flatNumber, int buildingNumber) {
        this.flatNumber = flatNumber;
        this.buildingNumber = buildingNumber;
    }

    @Override
    public String toString() {
        return "House{" +
                "flatNumber=" + flatNumber +
                ", buildingNumber=" + buildingNumber +
                ", room=" + room +
                '}';
    }

    public void setRoom(LivingRoom room) {
        this.room = room;
    }
}
