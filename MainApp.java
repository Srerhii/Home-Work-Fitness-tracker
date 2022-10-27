public class MainApp {
    public static void main(String[] args) {
 FitnessTracker Rob = new FitnessTracker("Rob",23,5,1990,
         "Rob@gmail.com",80501234,"Stark",80,120,1200);
 FitnessTracker Jon= new FitnessTracker("Jon",14,10,1988,
         "Jon@gmail.com",806745345,"Snow",78,125,15000);
 FitnessTracker Arya = new FitnessTracker("Arya",1,12,2000,
         "Arya@gmail.com", 807345531,"Stark",50,110,6000);
 FitnessTracker Sansa = new FitnessTracker("Sansa",17,11,1996,
         "Sansa@gmail.com",806673455,"Stark",52,112,4000);
     String Name= Rob.getName();
     int dat= Rob.getDatOfBirth();


    }
    public void printAccountInfo(){

    }
}