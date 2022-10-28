public class MainApp {
    public static void main(String[] args) {
        FitnessTracker Rob = new FitnessTracker(
                "Rob",
                23,
                5,
                1990,
                "Rob@gmail.com",
                80501234,
                "Stark",
                80,
                120,
                1200
        );
        FitnessTracker Jon = new FitnessTracker(
                "Jon",
                14,
                10,
                1988,
                "Jon@gmail.com",
                806745345,
                "Snow",
                78,
                125,
                15000
        );
        FitnessTracker Arya = new FitnessTracker(
                "Arya",
                1,
                12,
                2000,
                "Arya@gmail.com",
                807345531,
                "Stark",
                50,
                110,
                6000
        );
        FitnessTracker Sansa = new FitnessTracker(
                "Sansa",
                17,
                11,
                1996,
                "Sansa@gmail.com",
                806673455,
                "Stark",
                52,
                112,
                4000
        );

        printAccountInfo(Rob);
        printAccountInfo(Jon);
        printAccountInfo(Arya);
        printAccountInfo(Sansa);


    }


        public static void printAccountInfo(FitnessTracker Client){
            String a = Client.getName();
            int b = Client.getDatOfBirth();
            int c = Client.getMonthOfBirth();
            int d = Client.getYearsOfBirth();
            int age = 2020-Client.getYearsOfBirth();
            String e = Client.getMail();
            int f = Client.getTelNumber();
            String g = Client.getSurname();
            int h = Client.getWeight();
            int i = Client.getPressure();
            int k = Client.getNumberOfSteps();

            System.out.println("Name: "+a+"\nSurname: "+g+"\nBirthday of dat: "+b +"\nMonth of birthday: "
                    +c+ "\nYears of birthday: "+ d+ "\nage:"+ age+ "\nMail: "+e+ "\nTel.: "+f+ "\nWeight :"+h+
                    "\nPressure: "+i+ "\namount of Steps: "+ k);

        }



}