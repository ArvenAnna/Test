package src.com.mainacad;

public class Main {
    public static void main(String[] args) {
        SimpleQueue queue = new SimpleQueue();

        queue.add("Masha");
        queue.add("Sasha");
        queue.add("Pasha");


        queue.remove();
        queue.remove();
        queue.remove();

        System.out.println(queue.element()); //"Sasha"

        for (int a = 0; a < queue.getArrName().length; a++) {
            System.out.println(queue.getArrName()[a]);
        }

        System.out.println(queue.isEmpty()); //false

        queue.remove();
        queue.remove();
        System.out.println(queue.isEmpty());// true

    }
}
