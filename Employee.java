package class_design;

public class Employee {
    public String fname;
    public String lname;

    @Override
    public String toString() {
        return "fname:" + fname + "and lname:" + lname;
    }
}
