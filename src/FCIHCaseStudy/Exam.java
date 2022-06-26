package FCIHCaseStudy;

import java.io.Serializable;

/**
 *
 * @author Salma Hnay
 */
public class Exam implements Serializable {

    private String EName, EId ,q1 , q2 , q3 , q4;
    private double MaxGrade;
    

    FileManger FManger = new FileManger();
    private final String ExamsFileName = "Exams.txt";

    public Exam() {

    }

    public Exam(String EName, String EId, double MaxGrade ,String q1 , String q2 , String q3 , String q4) {
        this.EName = EName;
        this.EId = EId;
        this.MaxGrade = MaxGrade;
        this.q1=q1 ; 
        this.q2=q2 ;
        this.q3=q3;
        this.q4=q4;
                
    }

    public void setEName(String EName) {
        this.EName = EName;
    }

    public void setEId(String EId) {
        this.EId = EId;
    }

    public void setMaxGrade(double MaxGrade) {
        this.MaxGrade = MaxGrade;
    }

    public String getQ1() {
        return q1;
    }

    public void setQ1(String q1) {
        this.q1 = q1;
    }

    public String getQ2() {
        return q2;
    }

    public void setQ2(String q2) {
        this.q2 = q2;
    }

    public String getQ3() {
        return q3;
    }

    public void setQ3(String q3) {
        this.q3 = q3;
    }

    public String getQ4() {
        return q4;
    }

    public void setQ4(String q4) {
        this.q4 = q4;
    }
    
    

    public String getEName() {
        return this.EName;
    }

    public String getEId() {
        return this.EId;
    }

    public double getMaxGrade() {
        return this.MaxGrade;
    }

    public boolean addExam() {
        if (FManger.write(getExamData(), ExamsFileName, true)) {
            return true;
        } else {
            return false;
        }
    }

    private String getExamData() {
        return this.EName + "@" + this.EId + "@" + this.MaxGrade + "@";
    }

    
    @Override
    public String toString() {
        return "Exam Name : " + EName + "\t" + "Exam ID : " + EId + "\n" + "Exam Max Grade : " + MaxGrade + "\n";
    }

}
