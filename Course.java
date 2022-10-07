import java.io.Serializable;

public class Course implements Serializable{
    private String subject;
    private Teacher teacher;
    private int grade;
    private boolean current;

    public Course(String subject, int grade){
        this.subject = subject;
        this.grade = grade;
    }
    public Teacher getTeacher(){
        return teacher;
    }
    public int getGrade(){
        return grade;
    }
    public String getSubj(){
        return subject;
    }
    public void setSubj(String subject){
        this.subject = subject;
    }
    public void setGrade(int grade){
        this.grade = grade;
    }
    public void setTeacher(Teacher t){
        this.teacher = t;
    }
    public boolean currentlyTaking(){
        return current;
    }
    public String toString(){
        return "("+subject+" , by , "+teacher+", ,"+grade+")";
    }
}
