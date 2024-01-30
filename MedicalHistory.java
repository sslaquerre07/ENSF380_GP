public class MedicalHistory {
    //Private variables
    private String date;
    private String info;

    //Constructors
    public MedicalHistory(){

    }

    public MedicalHistory(String date, String info){
        this.date = date;
        this.info = info;
    }

    //Getters
    public String getDate(){
        return this.date;
    }

    public String getInfo(){
        return this.info;
    }

    //No setters as the medical history contains several anectdotes which cannot be changed
    //for security purposes
}
