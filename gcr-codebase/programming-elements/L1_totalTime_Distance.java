public class L1_totalTime_Distance {
    public static void main(String[] args) {
        double distanceCV = 156.6;
        int timeCV = 4*60 + 4;

        double distanceVB = 211.8;
        int timeVB = 4*60+25;

        double total_dstance = distanceCV + distanceVB;
        int total_time = timeCV+ timeVB;
        
        System.out.println("total distance: " + total_dstance + " km");
        System.out.println("total time: " + total_time + " min");

    }
    
}
