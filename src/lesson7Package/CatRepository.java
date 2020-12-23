package lesson7Package;

import lesson7Package.Cat;

import java.util.ArrayList;

public class CatRepository {
    private ArrayList<Cat> cats;

    public CatRepository(int val){
        cats = new ArrayList<>();
        for (int i = 0; i < val; i++) {
            cats.add(new Cat());
        }
        System.out.println("Invite " + val + " of street cats to eat -- ");
    }

    public ArrayList<Cat> getRepository(){
        return cats;
    }

}
