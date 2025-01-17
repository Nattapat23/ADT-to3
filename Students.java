

public class Students {

    private String firstName;
    private double GPA ;
    private String SID ;

    
    public Students(String firstName, double gPA, String sID) {
        this.firstName = firstName;
        GPA = gPA;
        SID = sID;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public double getGPA() {
        return GPA;
    }
    public void setGPA(double gPA) {
        GPA = gPA;
    }
    public String getSID() {
        return SID;
    }
    public void setSID(String sID) {
        SID = sID;
    }

    @Override
    public String toString() {
        return "[firstName = " + firstName + ", GPA = " + GPA + ", SID = " + SID + "]";
    }


    



    

    

    



}
