public class FitnessTracker {
   private String name;
    private int datOfBirth;
    private int monthOfBirth;
    private int yearsOfBirth;
    private String mail;
    private int telNumber;
    private String surname;
    private int weight;
    private int pressure;
    private int numberOfSteps;

    public FitnessTracker(String name, int datOfBirth, int monthOfBirth,
                          int yearsOfBirth, String mail, int telNumber,
                          String surname, int weight, int pressure, int numberOfSteps) {
        this.name = name;
        this.datOfBirth = datOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearsOfBirth = yearsOfBirth;
        this.mail = mail;
        this.telNumber = telNumber;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.numberOfSteps = numberOfSteps;
    }

    public String getName() {
        return name;
    }

    public int getDatOfBirth() {
        return datOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearsOfBirth() {return yearsOfBirth;}

    public String getMail() {
        return mail;
    }

    public int getTelNumber() {
        return telNumber;
    }
    public String getSurname() {return surname;}
    public int getWeight() {return weight;}

    public int getPressure() {return pressure;}

    public int getNumberOfSteps() {return numberOfSteps;}

    public void setSurname(String surname) {this.surname = surname;}

    public void setWeight(int weight) {this.weight = weight;}

    public void setPressure(int pressure) {this.pressure = pressure;}

    public void setNumberOfSteps(int numberOfSteps) {this.numberOfSteps = numberOfSteps;}

    public int getAge(){
        return 2020-yearsOfBirth;
    }

}
