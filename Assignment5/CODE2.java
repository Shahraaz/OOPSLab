import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Student
 */
class Student {
    int internal_marks, external_marks, assignment_marks;
    String name, rollNo;

    Student(String name, String rollNo, int internal_marks, int external_marks, int assignment_marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.internal_marks = internal_marks;
        this.external_marks = external_marks;
        this.assignment_marks = assignment_marks;
    }

    /**
     * @param internal_marks the internal_marks to set
     */
    public void setInternal_marks(int internal_marks) {
        this.internal_marks = internal_marks;
    }

    /**
     * @param external_marks the external_marks to set
     */
    public void setExternal_marks(int external_marks) {
        this.external_marks = external_marks;
    }

    /**
     * @param assignment_marks the assignment_marks to set
     */
    public void setAssignment_marks(int assignment_marks) {
        this.assignment_marks = assignment_marks;
    }

    public String toString() {
        String ret = "Name " + name + "\n";
        ret = ret + "rollNo " + rollNo + "\n";
        ret = ret + "internal_marks " + internal_marks + ", " + "external_marks " + external_marks + ", "
                + "assignment_marks " + assignment_marks + "\n";
        return ret;
    }
}

class OutOfBoundException extends Exception {
    String name;
    int lim;

    OutOfBoundException(String name, int lim) {
        this.name = name;
        this.lim = lim;
    }

    public String toString() {
        return "Out Of Bound " + name + " " + lim;
    }
}

class NegMarksException extends Exception {
    String name;
    int lim;

    NegMarksException(String name) {
        this.name = name;
    }

    public String toString() {
        return "Neg Marks Exception " + name;
    }
}

/**
 * CODE2
 */
public class CODE2 {

    static Student getDetails() throws OutOfBoundException, NegMarksException {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        String rollNo = in.next();
        int internal_marks = in.nextInt();
        int external_marks = in.nextInt();
        int assignment_marks = in.nextInt();
        in.close();
        if (internal_marks > 15)
            throw new OutOfBoundException("internal_marks", 15);
        if (external_marks > 50)
            throw new OutOfBoundException("external_marks", 50);
        if (assignment_marks > 25)
            throw new OutOfBoundException("assignment_marks", 25);

        if (internal_marks < 0)
            throw new NegMarksException("internal_marks");
        if (external_marks < 0)
            throw new NegMarksException("external_marks");
        if (assignment_marks < 0)
            throw new NegMarksException("assignment_marks");
        return new Student(name, rollNo, internal_marks, external_marks, assignment_marks);
    }

    public static void main(String[] args) {
        try {
            Student S = getDetails();
            System.out.println(S);
        } catch (InputMismatchException e) {
            // TODO: handle exception
            System.out.println("InputMismatchException You have given some wrong input");
        } catch (OutOfBoundException e) {
            System.out.println(e);
        } catch (NegMarksException e) {
            System.out.println(e);
        } finally {

        }

    }
}