import datastructure.*;
import test.People;

public class Test {
    public static void main(String[] args) {
        Array<People> array = new Array<>();
        System.out.println(array.getSize());
        System.out.println(array.getCapacity());
        array.add(0,new People("fl","man"));
        array.toString();

        Array<Integer> ia = new Array<>();
        for (int i = 0; i < 20; i++) {
            ia.addLast(i);
        }
        System.out.println(ia.toString());


        Stack<Integer> as = new ArrayStack<>();
        for (int i = 0; i < 5; i++) {
            as.push(i);
            System.out.println(as.toString());
        }
        as.pop();
        System.out.println(as.toString());

        Queue<Integer> queue = new LoopQueue<>();
        for (int i = 0; i < 5; i++) {
            queue.enqueue(i);
            System.out.println(queue.toString());

            if (i % 2 == 1){
                queue.dequeue();
                System.out.println(queue.toString());
            }
        }
    }
}
