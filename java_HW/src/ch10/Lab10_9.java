package ch10;
class Course {
    private String courseName;
    private String[] students = new String[10];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }
    public void addStudent(String student) {
    	if(numberOfStudents>=students.length){
    		String[] biggerstudents=new String[students.length+10]; //increase the size
    		for(int i=0;i<students.length;i++)    //copy the content to the current array 
    			biggerstudents[i]=students[i];
    		students=null;
    		students=biggerstudents;
    	}
        students[numberOfStudents] = student;
        numberOfStudents++;
    }
    public String[] getStudents() {
        return students;
    }
    public int getNumberOfStudents(){
    	return numberOfStudents;
    }
    public String gerCoursename(){
    	return courseName;
    }
    public void dropStudent(String student){
    	int i=0;
    	for(i=0;i<numberOfStudents;i++){
    		if(students[i].equals(student))
    			break;
    	}
    	if(i==numberOfStudents){
    		System.out.print("No such a student "+student+" in this course\n");
    	    return;
    	}
    	else{
    		for(int j=i+1;j<numberOfStudents;j++){
    			students[j-1]=students[j];
    		}
    		numberOfStudents--;
    	}
    	return;
    }
    public void clear(){
    	this.numberOfStudents=0;
    	this.students=new String[0];
    	return;
    }
    public void dispaly(){
    	for(int i=0;i<numberOfStudents;i++){
    		System.out.print(students[i]+",\n");
    	}
    	if(numberOfStudents==0)
    		System.out.print("there is no student\n");
    	return;
    }
}

public class Lab10_9 {
	public static void main(String[] args) {
		
		Course course1=new Course("Math");
		course1.addStudent("Jones");
		course1.addStudent("peter");
		course1.addStudent("joe");
		course1.addStudent("nono");
		
		System.out.print("Course Name:"+course1.gerCoursename()+"\n");
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
