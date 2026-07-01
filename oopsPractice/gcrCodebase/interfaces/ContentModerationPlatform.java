package oopsPractice.gcrCodebase.interfaces;
interface TextModeration {

    boolean isOffensive(String post);

    default void displayModerationPolicy() {

        System.out.println("No offensive language is allowed.");
    }

    static boolean containsRestrictedWords(String post) {

        String text = post.toLowerCase();

        return text.contains("bad")
                || text.contains("hate")
                || text.contains("abuse");
    }
}

interface SpamDetection {

    boolean isSpam(String post);

    default void displayModerationPolicy() {

        System.out.println("Spam posts are prohibited.");
    }
}

class ContentModerator implements TextModeration, SpamDetection {

    @Override
    public boolean isOffensive(String post) {

        return TextModeration.containsRestrictedWords(post);
    }

    @Override
    public boolean isSpam(String post) {

        String text = post.toLowerCase();

        return text.contains("buy now")
                || text.contains("click here")
                || text.contains("free money");
    }

    @Override
    public void displayModerationPolicy() {

        TextModeration.super.displayModerationPolicy();
        SpamDetection.super.displayModerationPolicy();
    }
}

public class ContentModerationPlatform {

    public static void main(String[] args) {

        String[] posts = {

                "I love Java Programming.",
                "Buy now and get free money!",
                "I hate this app.",
                "Click here to win prizes.",
                "Have a wonderful day!"
        };

        ContentModerator moderator = new ContentModerator();

        moderator.displayModerationPolicy();

        System.out.println();

        for (String post : posts) {

            System.out.println("Post : " + post);

            if (moderator.isSpam(post)) {

                System.out.println("Status : Spam Post");

            } else if (moderator.isOffensive(post)) {

                System.out.println("Status : Offensive Post");

            } else {

                System.out.println("Status : Valid Post");
            }

            System.out.println();
        }
    }
}