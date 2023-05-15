package school.management.system;

import java.util.List;

/**
 * Many teacher, many students.
 * Implements student and teachers.
 * Uses an ArrayLists.
 */
public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * new school object is created.
     * @param teachers list of teachers in the school.
     * @param students list of students in the school.
     */
    public School (List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     *
     * @return the list of teachers in the school.
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * adds teacher to school
     * @param teacher the teacher to be added.
     */
    public void addTeacher (Teacher teacher){
        teachers.add(teacher);
    }

    /**
     *
     * @return the list of students in the school.
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * add a student to the school
     * @param student the student to be added.
     */
    public void addStudent (Student student){
        students.add(student);
    }

    /**
     *
     * @return the total money earned by the school.
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     *
     * @return the money earned by school.
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    /**
     * adds the total money earned by the school.
     * @param MoneyEarned money that is supposed to be added.
     */
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /**
     * update the money is spent by the school.
     * is the salary given by the school to its teachers.
     * @param MoneySpent the money
     */
    public static void updateTotalMoneySpent(int MoneySpent) {
        totalMoneyEarned -= MoneySpent;
    }


}