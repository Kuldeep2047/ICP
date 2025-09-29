package Day2;

import java.util.Comparator;

class Person implements Comparable<Person> {
    int height;
    int age;
    String name;

    Person(int height, int age, String name){
        this.height = height;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString(){
        return this.name + " " + this.height + " " + this.age;
    }


    @Override
    public int compareTo(Person other) {
        if(this.height < other.height) return -1;
        else if(this.height > other.height) return 1;
        else return 0;
    }
}

class MyComparator implements Comparator<Person>{


    // Sorting according to age -> height -> name 
    @Override
    public int compare(Person o1, Person o2){
        if(o1.age < o2.age) return -1;
        else if(o1.age > o2.age) return 1;
        else{
            if(o1.height < o2.height) return -1;
            else if(o1.height > o2.height) return 1;
            else{
                return o1.name.compareTo(o2.name);
            }
        }
    }
}
        