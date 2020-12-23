package lesson7Package;

public class Cat {
    private int appetite;
    private boolean isHungry;
    private static int counter = 1;

    public Cat(){
        appetite = 20 + (int)(Math.random()*20);
        isHungry = true;
    }

    public boolean toEat(Plate plate) {
        if (plate.getCapacity() >= appetite) {
            System.out.println(counter + " cat with appetite = " + appetite + " eat from the plate -- ");
            isHungry = false;
            plate.setCapacity(plate.getCapacity() - appetite);
            plate.plateInfo();
            counter++;
            return true;
        }

        System.out.println("Not enough food to feed next cat");
        return false;
    }
}






