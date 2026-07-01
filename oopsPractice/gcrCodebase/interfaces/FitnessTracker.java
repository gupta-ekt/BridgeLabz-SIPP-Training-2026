package oopsPractice.gcrCodebase.interfaces;


interface Trackable{
    void logActivity();

    default void resetData(){
        System.out.println("Data reset");
    }
}

interface Reportable{
    void generateReport();
}

interface Notifiable{
    void sendAlert();
}

class FitnessDevice implements Trackable, Reportable, Notifiable{

    @Override
    public void logActivity(){
        System.out.println("logged suceessfully");
    }

    @Override
    public void generateReport(){
        System.out.println("report generated successfully");
    }

    @Override
    public void sendAlert(){
        System.out.println("alert sent to user");
    }
}



public class FitnessTracker {
    public static void main(String[] args) {

        FitnessDevice tracker = new FitnessDevice();
        tracker.logActivity();
        tracker.generateReport();
        tracker.sendAlert();
        tracker.resetData();        
    }
}
