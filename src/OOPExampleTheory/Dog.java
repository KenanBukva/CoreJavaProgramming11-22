package OOPExampleTheory;

public class Dog {
    private static int counter;
    private String name;
    private double weight;
    private int age;

    public Dog(String name, double weight){
        this.name=name;
        this.weight=weight;
        counter++;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void printCounter(){
        System.out.println("COUNTER: "+counter);
    }

    public String getName() {
        return name;
    }

    public static int getCounter() {
        return counter;
    }
}

