package Day2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonMain {
    public static void main(String[] args) {
        Person p1 = new Person(160, 21, "Kuldeep");
        Person p2 = new Person(149, 19, "Ankit");
        Person p3 = new Person(55, 21, "Aparna");
        Person p4 = new Person(160, 25, "Pranjal");
        // System.out.println(p1.toString());
        List<Person> ll = new ArrayList<>();
        ll.add(p1);
        ll.add(p2);
        ll.add(p3);
        ll.add(p4);


        // Collections.sort(ll, (a,b)->a.height - b.height);
        // for(Person p : ll){
        //     System.out.println(p.name + " " + p.height + " " + p.age);
        // }

        Person[] arr = {p1,p2};
        // Arrays.sort(arr);
        Arrays.sort(arr , new MyComparator());
        for(Person p :arr){
            System.out.println(p);
        }
        
    }
}
