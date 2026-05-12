package ArrayList;

import java.util.*;
class Student {
    private String name;
    private double gpa;

    public Student(String name,double gpa){
        this.name = name;
        this.gpa = gpa;
    }

    public String getName(){
        return name;
    }
    public double getGpa(){
        return gpa;
    }
}

class MyComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o2.length() - o1.length();
    }
}

//  o1   o2
// "ok" "bye"




class MyList {
   public static void main(String[] args) {
       List<Student> students = new ArrayList<>();
       students.add(new Student("Alice",3.5));
       students.add(new Student("Bob",3.7));
       students.add(new Student("Charlie",3.5));
       students.add(new Student("Akshit",3.9));
//       students.sort((o1,o2) ->Double.compare (o2.getGpa(), o1.getGpa()));

       students.sort((o1,o2) -> {
           if (o2.getGpa() - o1.getGpa() > 0) {
               return 1;
           } else if (o2.getGpa() - o1.getGpa() < 0) {
               return -1;
           } else {
               return 0;
           }
       });
       for (Student s: students){
           System.out.println(s.getName() + ":" + s.getGpa());
       }






//       List<String> words = Arrays.asList("banana", "apple", "date");
//        words.sort((a,b) -> b.length() - a.length());
//        System.out.println(words);
//
//
//
//
////        System.out.println(list.getClass().getName());
//        List<Integer> list = new ArrayList<>();
//
//        list.add(3);
//        list.add(2);
//        list.add(1);
//
//        list.sort((a,b) -> b - a);
//        System.out.println(list);


//        Integer[] array = list.toArray(new Integer[0]);

//        list.remove(Integer.valueOf(1));

//        System.out.println(list);
//        Collections.sort(list);


        // for replace
//        list.set(3,10);
//        System.out.println(list);

//        List<Integer> list1 = List.of(4, 5, 6, 7, 8, 9);
//        list.addAll(list1);
//        System.out.println(list);







/*


        System.out.println(list.get(2));
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

         for (int x : list) {
            System.out.println(x);
        }

        //        list.add(1);
//        list.add(5);
//        list.add(80);

//        list.remove(2);
//        list.add(2,50);
//        list.set(2,60);

//        for (int x : list) {
//            System.out.println(x);
//        }
//        System.out.println(list);

list.add(1);


 ArrayList<Integer> list = new ArrayList<>(11);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        System.out.println(list.size());



        System.out.println(list.contains(5));
        System.out.println(list.contains(50));*/

    }
}