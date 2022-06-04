package laba_3.task2.building;

public class Theater extends PublicBuilding {

    Theater(String name) {
        super(name);
    }

    @Override
    public void open() {
    }

    @Override
    public void close() {
    }
    @Override
    public String toString(){

        return "Teatr:" + name;
    }

}
