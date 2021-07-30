package homeTask2;

public class Main {
    public static void main(String[] args) {
        Sweets sweet1 = new Sweets();
        sweet1.setName("Cow");
        sweet1.setWeight(20);

        ChocolateSweet chocolate1 = new ChocolateSweet();
        chocolate1.setName("Romashka");
        chocolate1.setWeight(15);
//        System.out.println(chocolate1.getWeight());

        IceSweet ice1 = new IceSweet();
        ice1.setName("Max");
        ice1.setWeight(10);
//        System.out.println(chocolate1.getWeight());

        MilkSweet milk1 = new MilkSweet();
        milk1.setName("Jack");
        milk1.setWeight(10);
//        System.out.println(chocolate1.getWeight());

        System.out.println(chocolate1.getWeight() + sweet1.getWeight() + ice1.getWeight() + milk1.getWeight());

    }
}
