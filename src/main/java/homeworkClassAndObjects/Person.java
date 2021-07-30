package homeworkClassAndObjects;

public class Person {
    String name;
    int age;
    boolean isMarried;

    public int holiday() {
        int count = age / 10;
        return count;
    }

    public char starting() {
        char a = name.charAt(0);
        return a;
    }

    public Person() {
        this.name = "Ivan";
        this.age = 30;
        this.isMarried = false;
    }

    //constructor with 1 parameter
    public Person(String name) {
        this.name = name;
    }

    //constructor with 2 parameters
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //constructor with 3 parameters
    public Person(String name, int age, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.isMarried = isMarried;
    }

    @Override
    public String toString() {
        return String.format("My name is %s. I'm %d years old. Am I merried? %b", name, age, isMarried);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person that = (Person) o;
        return name.equals(that.name) &&
                age == that.age &&
                isMarried == that.isMarried;
    }

    @Override
    public int hashCode() {
        int j;
        if (isMarried) {
            j = 10;
        } else {
            j = 0;
        }
        return name.hashCode() + age + j;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public void setMarried(boolean newIsMarried) {
        isMarried = newIsMarried;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean getIsMarried() {
        return isMarried;
    }

    public void printAge() {
        System.out.println(age);
    }
    public void printName() {
        System.out.println(name);
    }
    public void printIsMarried(){
        System.out.println(isMarried);
    }


    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person("John");
        Person person2 = new Person("Conor", 25);
        Person person3 = new Person("Amanda", 23, true);

        person.printAge();
        person.printName();
        person.printIsMarried();

        person3.setAge(31);
        System.out.println("New age for person 3 will be " + person3.age);

        Person[] array = new Person[4];
        array[0] = person;
        array[1] = person1;
        array[2] = person2;
        array[3] = person3;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("How much holidays did I have? " + person.holiday());
        System.out.println("How much holidays did I have? " + person1.holiday());

        System.out.println("First book of the name is " + person.starting());
        System.out.println("First book of the name is " + person1.starting());
    }
}
