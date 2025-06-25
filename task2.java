import java.util.*;
 class Student{
  
    double Id ;
      String Name;
    int Marks;

    Student( double Id ,String Name , int Marks){
        
        this.Id = Id;
        this.Name = Name;
        this.Marks = Marks;
    }
}


public class task2 { 
     
        static ArrayList<Student> students = new ArrayList<>();
    public static void main(String args[]){ 


      int Choice ; 
      
        do{
     System.out.println("==== Student CRUD Menu ====");
     System.out.println("1.Add Student.");
     System.out.println("2.Update Student.");
     System.out.println("3.Delete Student.");
     System.out.println("4.See All Students.");
     System.out.println("5.Exit From Menu.");
      Scanner sc  = new Scanner(System.in);
      Choice = sc.nextInt();
      if (Choice >=1 && Choice <=4){
        switch (Choice) {
            case 1: AddStudent();
                
                break;

            case 2 :UpdateStudent();
            
               break;
            case 3: DeleteStudent();
               break;
            case 4 :ShowStudent();
               break;
            case 5 :
               System.out.println("Exiting.....");
               break;
        
            default:
            System.out.println("Invalid Choice.");
                break;
        }
      }



        } while(Choice !=5);
       
    }
    
    static void AddStudent(){
    Scanner sc = new Scanner(System.in);
   
    System.out.println("Enter Student id:");
    double Id = sc.nextDouble();
     sc.nextLine(); 
    System.out.println("Enter Student Name:");
    String Name = sc.nextLine();
    System.out.println("Enter Marks of Student:");
    int Marks = sc.nextInt();
    students.add(new Student(Id,Name,Marks));
    System.out.println("Student Added");
    return;
    
}
static void UpdateStudent(){
    Scanner sc  = new Scanner(System.in);
    System.out.println("Enter Id of Student ");
    double Id = sc.nextDouble();
     for (Student s : students){
        if (s.Id == Id){
            

             System.out.println("Enter new Marks:");
            s.Marks= sc.nextInt();
            sc.nextLine();
            System.out.println("Enter new Name:");
            s.Name = sc.nextLine();
            System.out.println("student updated");
            return;
        }
        
     }
    System.out.println("Student not found");
}
static void DeleteStudent(){
    Scanner sc  = new Scanner(System.in);
    System.out.println("Enter Id of Student ");
    double Id = sc.nextDouble();
     for (Student s : students){
        if (s.Id == Id){
           students.remove(s);
           System.out.println("student deleted");
           return;
        }
        
     }
     System.out.println("Student not found");
    
}

static void ShowStudent(){
     if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        for (Student s : students) {
            System.out.println("ID: " + s.Id + ", Name: " + s.Name + ", Marks: "+s.Marks);

        }
}
    
}
