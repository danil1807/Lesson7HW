public class Main {
    public static void main(String[] args) {
        Cat cats[] = new Cat[6];
        cats[0] = new Cat("Barsik", 5);
        cats[1] = new Cat("Kotik", 2);
        cats[2] = new Cat("Tolstyj", 20);
        cats[3] = new Cat("Sfinks", 10);
        cats[4] = new Cat("Murzik", 5);
        cats[5] = new Cat("Lev", 80);


        Plate plate = new Plate(100);
        plate.info();

        for (int i = 0; i < cats.length; i++) {
            System.out.printf("%s started to eat...", cats[i].getName());
            cats[i].eat(plate);
            plate.info();
        }

        plate.increaseFood(20);
        plate.info();



    }
}
