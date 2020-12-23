package lesson7Package;

public class Plate{
    private int capacity;

    public Plate(){capacity = 0;}

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity(){
        return capacity;
    }

    public void plateInfo(){
        System.out.println("Now we have a " + capacity + " values of food in the plate --");
    }


    }


