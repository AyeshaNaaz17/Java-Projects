package school.management.system;

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * to create a new student by initiALIZING.
     * Fees for every student is $30,000.
     * Fess paid initially is zero.
     * @param id id for the student: unique.
     * @param name name of the student.
     * @param grade grade of the student.
     */

    public Student(int id, String name, int grade) {

        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;

    }

    // Not going to alter student's name, id.

    /**
     * Used to update the student's grade.
     * @param grade new grade of the student.
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * Keep adding the fees to feesPaid field.(ex: fees paid = 10,000 + 5000 + 15,000)
     * Add the fees to the fees paid.
     * The school is going to receive the funds.
     * @param fees the fees that the student pays.
     */
    public void payFees(int fees) {
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    /**
     *
     * @return id of the student.
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return toayal fees.
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     *
     * @return grade of the student
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return name of the student.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return fees paid by the student.
     */
    public int getFeesPaid() {
        return feesPaid;
    }


    public int getRemainingFees(){
        return feesTotal -= feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name: " + name + " Total fees paid so far: $" + feesPaid;
    }
}
