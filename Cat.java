public class Cat {
    private String name;
    private int appetite;
    private boolean fullandhappy;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        boolean fullandhappy = false;
    }

    public String getName() {
        return name;
    }

    public void eat(Plate p) {
        if (p.getFood() >= appetite){
            p.decreaseFood(appetite);
            fullandhappy = true;
        } else{
            fullandhappy = false;
        }
        System.out.println("The cat is full and happy -  " + fullandhappy);
    }

}
