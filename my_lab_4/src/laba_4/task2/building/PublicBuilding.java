package laba_3.task2.building;

abstract class PublicBuilding implements Building {
    protected int capacity;
    protected String name;

    PublicBuilding(String name) {
        this.name = name;
    }


    int getCapacity() {
        return this.capacity;
    }
    String getName(){
        return this.name;
    }
}
