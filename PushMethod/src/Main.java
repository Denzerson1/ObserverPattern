public class Main {

    public static void main(String[] args) {
        // Create the NewsRoom (Subject)
        NewsRoom newsRoom = new NewsRoom();

        // Create Observers
        Otherchannel otherChannel = new Otherchannel();
        Webchannel webChannel = new Webchannel();

        // Register Observers to the Subject
        newsRoom.add(otherChannel);
        newsRoom.add(webChannel);

        // Simulate updates to the NewsRoom text
        newsRoom.setTxt("Breaking News: Observer Pattern Implemented!");
        newsRoom.setTxt("Update: Push Method Demonstrated!");
    }
}
