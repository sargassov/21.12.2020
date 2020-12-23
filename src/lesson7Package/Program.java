package lesson7Package;

import lesson7Package.CatRepository;

public class Program {
    public static void main(String[] args) {
        int randomCapacityOfFood = 50 + (int)(Math.random()*50);
        Plate plate = new Plate();
        plate.setCapacity(randomCapacityOfFood);
        plate.plateInfo();

        CatRepository repository = new CatRepository(5);

        for (int i = 0; i < repository.getRepository().size(); i++) {
            if(!repository.getRepository().get(i).toEat(plate)) {
                System.out.println("Add more food");
                plate.setCapacity(plate.getCapacity() + randomCapacityOfFood);
                plate.plateInfo();
                i--;
            }
        }
    }
}
