package ch11;
class Person{
    String name;
    String address;
    String phoneNumber;
    String emailAddress;
    
    public String toString(){
        String info="Person "+name;
        //System.out.print(info);
        return info;
    }
}
class Student extends Person{
    enum class_status
    { 
        freshman,sophomore,junior,senior;
    } 
    class_status status;
    Student(){}
    
    public String toString(){
        String info="Student "+name;
        System.out.print(info);
        return info;
    }
}
class Employee extends Person{
    String office;
    double salary;
    Mydate date_hired;
    
    class Mydate{
        int year;
        int month;
        int day;
    }
    
    Employee(){}
    public String toString(){
        String info="Employee "+name;
        System.out.print(info);
        return info;
    }
}
class Faculty extends Employee{
    int office_hours;
    int rank;
    
    Faculty(){}
    public String toString(){
        String info="Faculty "+name;
        System.out.print(info);
        return info;
    }
}
class Staff extends Employee{
    String title;
    
    Staff(){}
    public String toString(){
        String info="Staff "+name;
        System.out.print(info);
        return info;
    }
}
public class LabP403_11_2 {
    public static void main(String[] args) {
        Person n1=new Person();
        n1.name="jone";
        System.out.print(n1);
    }

}
