package impl;


import OOP.objects.People;

public class BusDriver implements Driver, Transport {

    private People people;
    private String category;
    int speed = 60;
    @Override
    public void setCategory(String c) {
        this.category = c;
        people = new People("Bob" , "Marty", 65, null);

    }

    @Override
    public void go() {
        if (people != null) {
            System.out.println("We are moving");
        } else {
            System.out.println("We are not moving");
        }
    }
    @Override
    public int getSpeed() {
return this.speed;
    }
}
