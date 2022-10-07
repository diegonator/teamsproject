import java.io.Serializable;

public class Course implements Serializable{
    private String subject;
    private Teacher t;
    private int grade;
    private boolean current;

    public Course(String subject, int grade){
        this.subject = subject;
        this.grade = grade;
    }
    public Course(String subj){
        subject = subj;
    }
}
