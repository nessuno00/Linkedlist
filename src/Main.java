
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Fruit> fruits = new LinkedList<>();

        fruits.add(new Fruit("Mela"));
        fruits.add(new Fruit("Banana"));
        fruits.add(new Fruit("Arancia"));

        System.out.println(fruits);

        fruits.addFirst(new Fruit("Fragola"));
        fruits.addLast(new Fruit("Pera"));

        System.out.println(fruits);
    }
}
