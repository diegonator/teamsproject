import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable {
    private String name;
    private int gl;
    private ArrayList<Course> courses;

    public Student(String name, int gl, ArrayList<Course> courses){
        this.name = name;
        this.gl  = gl;
        courses = new ArrayList<>();
    }
    public String getName(){
        return name;
    }
    public int getGradeLevel(){
        return gl;
    }
    public ArrayList<Course> getCourses(){
        return courses;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setGradeLevel(int gl){
        this.gl = gl;
    }
    public void setCourses(ArrayList<Course> courses){
        this.courses = courses;
    }
    public double calculateGPA(){
        int gpaPoints = 0;
        for(int i = 0; i <courses.size();i++){
            Course c = courses.get(i);
            int grade = c.getGrade();
            if(grade >= 90){
                gpaPoints+=4;
            }
            if(grade <= 89 && grade >=80){
                gpaPoints += 3;
            }
            if(grade <= 79 && grade >=70){
                gpaPoints += 2;
            }
            if(grade <= 69){
                gpaPoints += 1;
            }
        }

        return (double)gpaPoints/courses.size();
    }
    public Course getBestClass(){
        if(courses.size() == 0){
            return null;
        }
        Course best = courses.get(0);
        for(int i = 0; i <courses.size();i++){
            Course c = courses.get(i);
            if(best.getGrade() < c.getGrade()){
                best = c;
            }
        }
        
        return best;
    }
    public void removeCourse(Course courses){
        courses.remove();
    }
    public void addCourse(Course courses){
        courses.add();
    }
    public String toString(){
        return "("+name+",\n, grade level:  , "+gl+", \n, GPA:  "+calculateGPA()+")";
    }
    
}
