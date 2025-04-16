
import java.util.PriorityQueue;

public class Priorityqueue {
    static class Student implements Comparable<Student>{
        String name ;
        int rollno;

        public Student(String name,int rollno){
         this.name = name;
         this.rollno = rollno;
        }
        @Override
        public int compareTo(Student s2){
            return this.rollno - s2.rollno;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("Ayush" , 1));
        pq.add(new Student("u  ", 4));
        pq.add(new Student("sh  ", 56));
        pq.add(new Student("ush  ", 100));
        pq.add(new Student("yush  ", 10));
     while(!pq.isEmpty()){
        System.out.println(pq.peek().name + "or   " + pq.peek().rollno );
       pq.remove();
    }
    }
}
