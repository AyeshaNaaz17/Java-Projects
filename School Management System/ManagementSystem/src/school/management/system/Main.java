package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher mellisa = new Teacher(2, "Mellisa", 700);
        Teacher vanderhorn = new Teacher(3, "Vanderhorn", 600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(vanderhorn);

        Student tom = new Student(1, "Tom", 4);
        Student jerry = new Student(2, "Jerry", 12);
        Student rocky = new Student(3, "Rocky", 5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(tom);
        studentList.add(jerry);
        studentList.add(rocky);

        School kvs = new School(teacherList, studentList);


        tom.payFees(5000);
        rocky.payFees(6000);
        System.out.println("KVS has earned $" + kvs.getTotalMoneyEarned());

        System.out.println("-----Making School Pay The Salary-----");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("KVS has spent for salary to " + lizzy.getName() + " and now has $" +
                kvs.getTotalMoneyEarned());

        vanderhorn.receiveSalary(vanderhorn.getSalary());
        System.out.println("KVS has spent for salary to " + vanderhorn.getName() + " and now has $" +
                kvs.getTotalMoneyEarned());


        System.out.println(vanderhorn);
        System.out.println(lizzy);
    }
}
