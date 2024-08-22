import java.util.Scanner;

class Student{
    String name;
    String id;
    float cgpa;
    
    Student(String n, String i, float c){
        name = n;
        id = i; 
        cgpa = c;
    }
    
    void printStdDetails(){
        System.out.println(name + " " + id + " " + cgpa);
    }
    
}
public class MyClass {
    public static void main(String args[]) {
        Student std [] = new Student[3];
        
        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i<3; i++){
            String tmpName = sc.next();
            String tmpId = sc.next();
            float tmpRes = sc.nextFloat();

            std[i] = new Student(tmpName, tmpId, tmpRes);
        } 
        
        for(int i=0; i<3; i++){
            std[i].printStdDetails();
        } 
    }
}
