import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        List<Student> LS =  new ArrayList<>();
        LS.add(new Student(1, "abc"));
        LS.add(new Student(21, "dadfdfbc"));
        LS.add(new Student(13, "asdsbc"));
        LS.add(new Student(15, "aabc"));

        Comparator<Student> c = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {

                if(o1.roll< o2.roll)
                    return 1;
                else

                return -1;
            }
        };
        Collections.sort(LS,c);
        for(Student s: LS)
            System.out.println(s);


     List<Employee> LE = new ArrayList<>();
     LE.add(new Employee(11,"agjhgs"));
        LE.add(new Employee(21,"dtrdh"));
        LE.add(new Employee(141,"ghgf"));
        LE.add(new Employee(31,"kjlkj"));
        LE.add(new Employee(41,"wrtrte"));

Collections.sort(LE);

for(Employee e: LE)
    System.out.println(e);


    }
}