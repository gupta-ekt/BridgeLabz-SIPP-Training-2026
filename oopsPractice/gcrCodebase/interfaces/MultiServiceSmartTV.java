package oopsPractice.gcrCodebase.interfaces;

interface StreamingService {

    void streamMovie(String movie);

    default void showSubscriptionDetails() {

        System.out.println("Streaming Subscription : Premium");
    }
}

interface GamingService {

    void playGame(String game);

    default void showSubscriptionDetails() {

        System.out.println("Gaming Subscription : Gold");
    }
}

class SmartTV implements StreamingService, GamingService {

    @Override
    public void streamMovie(String movie) {

        System.out.println("Streaming : " + movie);
    }

    @Override
    public void playGame(String game) {

        System.out.println("Playing : " + game);
    }

    @Override
    public void showSubscriptionDetails() {

        StreamingService.super.showSubscriptionDetails();
        GamingService.super.showSubscriptionDetails();
    }
}

public class MultiServiceSmartTV {

    public static void main(String[] args) {

        String[] movies = {
                "Inception",
                "Avatar",
                "Interstellar"
        };

        String[] games = {
                "FIFA",
                "Minecraft",
                "PUBG"
        };

        SmartTV tv = new SmartTV();

        tv.showSubscriptionDetails();

        System.out.println("\nMovies:");

        for (String movie : movies) {
            tv.streamMovie(movie);
        }

        System.out.println("\nGames:");

        for (String game : games) {
            tv.playGame(game);
        }
    }
}