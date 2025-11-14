package Day13;

import java.util.*;

public class Queue_Imple {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);

        q.remove(1);
        System.out.println(q);

        q.add(4);
        q.add(5);
        
        System.out.println(q);
        q.poll();

        System.out.println(q.element());

        System.out.println(q.contains(10));
        // q.remove(4);



        for(int a :q){
            System.out.print(a +" ");
        }

        q.addAll(Arrays.asList(10,20,30));
        System.out.println(q);

        System.out.println(q.size());
    }
}
