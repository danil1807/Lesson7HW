public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {
        if (food >= n) {
            food -= n;
        } else {
            System.out.printf("%s food still remaining", food);
        }
    }

    public void increaseFood(int n){
        food = food + n;
    }

    public void info() {
        System.out.println("plate status: " + food + "%");
    }

    public int getFood() {
        return food;
    }
}
