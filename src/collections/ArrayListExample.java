package collections;

import java.util.*;

public class ArrayListExample {

    public void studentArrayList(){
        ArrayList<String> studentList = new ArrayList<>();
        studentList.add("Ahmet");
        studentList.add("Mehmet");
        studentList.add("Can");
        studentList.add("Ayse");

        // System.out.println(studentList);

        /*
        Iterator iterator = studentList.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (String item: studentList) {
            System.out.println(item);
        }


        Collections.sort(studentList);

        ListIterator<String> listIterator = studentList.listIterator(studentList.size());

        while(listIterator.hasPrevious()){
            String value = listIterator.previous();
            System.out.println(value);
        }

        for (int i = 0; i<studentList.size(); i++){
            System.out.println(studentList.get(i));
        }


        studentList.forEach(item->{
            System.out.println(item);
        });
         */

         Iterator<String> stringIterator = studentList.iterator();
         stringIterator.forEachRemaining(item->{
             System.out.println(item);
         });


    }
}
