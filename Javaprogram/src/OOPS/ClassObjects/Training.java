package OOPS.ClassObjects;
import java.util.Scanner;

//Write a program to print trainer profile - name,email,technology,mobile using class and objects
public class Training {
    public static void main(String[] args) {
        //create class instance of trainerprofile
        TrainerProfile trainerProfile = new TrainerProfile();
        trainerProfile.trainerName = "pawan sharma";
        trainerProfile.trainerEmail = "pawansharma5857@gmail.com";
        trainerProfile.trainerTechnology = "JAVA";
        
        System.out.println("My Name is "+trainerProfile.trainerName  +
               " my email "+ trainerProfile.trainerEmail +" and my Technology is"+ trainerProfile.trainerTechnology  );
        Student student = new Student();
        System.out.println("Enter the student name:");
        System.out.println("My Technology is:");
        Scanner scanner = new Scanner(System.in);
        student.studentName=scanner.nextLine();
        student.studentEnrolledTechnology= scanner.nextLine();
        student.studentName="Suraj Jaiswal";
        student.studentEnrolledTechnology="Java";
        System.out.println("My Name is "+student.studentName  + " My technology is "+ student.studentEnrolledTechnology );

        System.out.println("Enter no of days");
        int days = scanner.nextInt();


        // to call the method
        trainerProfile.printTrainerProfile( trainerProfile.trainerName,trainerProfile.trainerTechnology,trainerProfile.trainerEmail);
    }
}

class TrainerProfile{
    String trainerName;
    String trainerEmail;
    String trainerTechnology;
    int noOfHoursCompleted;

    void printTrainerProfile(String trainerName,String trainerTechnology,String trainerEmail,int noOfHoursCompleted){
        System.out.println(trainerName + trainerTechnology + trainerEmail + noOfHoursCompleted );
    }


    int noOfHoursCompleted() {
        int noOfDays= 0;
        return noOfDays*3;
        }

    public void printTrainerProfile(String trainerName, String trainerTechnology, String trainerEmail) {
    }
}


class Student{
    String studentName;
    String studentEnrolledTechnology;

}