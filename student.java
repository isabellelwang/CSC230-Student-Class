// Student Class due 1/29/26
// CSC230 
public class Student {
    //Properties
    String name;
    String email;
    String major1;
    String major2;
    String minor;
    String path; // for pre-med, pre-law, certificate, etc
    int classYear;
    int gradYear;
    int id;
    Course[] completedCourses; // Completed Courses - dictionary of Courses
    Course[] requirements; // Requirements - dictionary of Courses - get from major, minor
    Instructor advisor; // Advisor - type Instructor / Faculty / whatever name we're going with
    int creditsEnrolled;
    int creditsCompleted;
    double gpa;
    boolean holdActive;

    // Constructor
    public Student(){
        this.name = null;
        this.email = null;
        this.major1 = null;
        this.major2 = null;
        this.minor = null;
        this.path = null;
        this.gradYear = 0; // e.g. 2026
        this.classYear = 0; // first year 0, sophomore 1, junior 2, senior 3
        this.id = 0;
        this.creditsEnrolled = 0;
        this.creditsCompleted = 0;
        this.gpa = 0.00;
        this.holdActive = false;
    }
    // Methods
    //Getters
    public String getName() { return name; }
    public String getEmail() { return email; }
    public boolean holdActive() { return holdActive; }

    //Setters
    public Instructor advisor(Instructor newAdvisor) { this.advisor = newAdvisor; }
    public boolean holdActive(boolean updateHold) { this.holdActive = updateHold; }
}
