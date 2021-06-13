package ch11;

import java.util.ArrayList;

 class Course{
    private String courseName;
    @SuppressWarnings("rawtypes")
    java.util.ArrayList students = new java.util.ArrayList();
    private int numberOfStudents;
    
    public Course(String courseName){
        this.courseName=courseName;
    }
    @SuppressWarnings("unchecked")
    public void addStudent(String student){
        this.students.add(student);
        numberOfStudents++;
    }
    @SuppressWarnings("rawtypes")
    public ArrayList getStudents(){
        return students;
    }
    public int getNumberOfStudents(){
        return numberOfStudents;
    }
    public String getCourseName(){
        return courseName;
    }
    public void dropStudent(String student) {
        int i=0;
        for(i=0;i<numberOfStudents;i++){
            if(students.get(i).equals(student))
                break;
        }
        if(i==numberOfStudents){
            System.out.print("No such a student "+student+" in this course\n");
            return;
        }
        else{
            students.remove(i);
            numberOfStudents--;
        }
        return;
    }
    public void clear(){
        students.clear();
        numberOfStudents=0;
    }
    public void dispaly(){
        if(numberOfStudents==0){
            System.out.print("there is no student\n");
            return;
        }
        for(int i=0;i<numberOfStudents;i++)
            System.out.print(students.get(i)+",\n");
        return;
    }
}

public class LabP404_11_5 {
    public static void main(String[] args) {            
        Course course1=new Course("Math");
        course1.addStudent("Jones");
        course1.addStudent("peter");
        course1.addStudent("joe");
        course1.addStudent("nono");
        
        System.out.print("Course Name:"+course1.getCourseName()+"\n");
        System.out.print("has "+course1.getNumberOfStudents()+" students, they are:\n");
        course1.dispaly();
        
        System.out.print("\n");
        String Aname="peter";
        System.out.print("drop the student "+Aname+"\n");
        course1.dropStudent(Aname);
        System.out.print("now they are:\n");
        course1.dispaly();
        
        System.out.print("\nclear all \n");
        course1.clear();

        course1.dispaly();
        
    }

}
