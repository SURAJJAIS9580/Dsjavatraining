package OOPS.ClassObjects;

//Write a program to print trainer profile - name,email,technology,mobile using class and objects
public class Training {
    public static void main(String[] args) {
        //create class instance of trainerprofile
        TrainerProfile trainerProfile = new TrainerProfile();
        trainerProfile.trainerName = "Pawan sharma";
        trainerProfile.trainerEmail = "pawansharma548@gmail.com";
        trainerProfile.trainerTechnology = "JAVA Android IOS Flutter React Native";
        System.out.println("My Name is "+trainerProfile.trainerName  +
               " my email "+ trainerProfile.trainerEmail +" and my profile "+ trainerProfile.trainerTechnology );
    }
}

class TrainerProfile{
    String trainerName;
    String trainerEmail;
    String trainerTechnology;
}