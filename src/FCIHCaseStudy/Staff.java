package FCIHCaseStudy;

import java.io.Serializable;

/**
 *
 * @author Salma Hnay
 */
public abstract class Staff extends Person implements Serializable {

    protected double salary;

    public Staff() {
    }

    public Staff(String user, String pass, int id, String fname, String lname, int age, double salary, Department dept) {
        super(user, pass, id, fname, lname, age, dept);
        this.salary = salary;
        this.myDept = dept;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public String getDeptName() {
        return this.myDept.getDeptName();
    }

    
    @Override
    public boolean equals(Object o) {
        Staff u = (Staff) o;
        return id == u.id && fname.equals(u.fname) && lname.equals(u.lname) && age == u.age && salary == u.salary && myDept.getDeptName().equals(u.myDept.getDeptName());
    }

    @Override
    public abstract String toString();
}
