package OOPS.Encapsulation;

//Encapsulation is a means of binding data variables and methods together in a class
public class EncapsulationExample {
    public static void main(String[] args) {
        //call the encapsulation class and bind the data using object in methods
        TrainerProfile trainerProfile = new TrainerProfile();
        trainerProfile.setTrainerEmail("Pawansharma548@gmail.com");
        trainerProfile.setTrainerName("Pawan Sharma");
        trainerProfile.setTrainerTechnology("Java");


        System.out.println(trainerProfile.getTrainerName()+ "\n"+
                trainerProfile.getTrainerEmail() +"\n"+ trainerProfile.getTrainerTechnology());

    }
}

//trainer profile add using encapsulation
class TrainerProfile{
    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public String getTrainerEmail() {
        return trainerEmail;
    }

    public void setTrainerEmail(String trainerEmail) {
        this.trainerEmail = trainerEmail;
    }

    public String getTrainerTechnology() {
        return trainerTechnology;
    }

    public void setTrainerTechnology(String trainerTechnology) {
        this.trainerTechnology = trainerTechnology;
    }

    String trainerName;
    String trainerEmail;
    String trainerTechnology;

}


