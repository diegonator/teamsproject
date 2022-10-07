import java.io.Serializable;
import java.util.ArrayList;

public class Teacher implements Serializable {
    private String name;
    private int YOE; 
    private ArrayList<Course> ctaught;

    public Teacher(String name, int YOE){
        this.name = name;
        this.YOE = YOE;
    }
    public String getName(){
        return name;
    }
    public int getYOE(){
        return YOE; 
    }
    public ArrayList<Course> getCourses(){
        return ctaught;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setYOE(int YOE){
        this.YOE = YOE;
    }
    public void setCourses(ArrayList<Course> ctaught){
        this.ctaught = ctaught;
    }
    public void addCourse(Course courses){
        courses.add();
    }
    public void removeCourse(Course courses){
        courses.remove();
    }
}