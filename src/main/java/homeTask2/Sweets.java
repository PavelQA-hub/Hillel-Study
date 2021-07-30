package homeTask2;

public class Sweets {
    String name;
    int weight;

    public Sweets() {

    }

    @Override
    public String toString() {
        return "Sweets{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Sweets(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
}
