public class Main {

    public static void main(String[] args) {

        //PULL METHODE
        NewsRoom newsRoom = new NewsRoom();

        OtherChannel otherChannel = new OtherChannel(newsRoom);
        Webchannel webChannel = new Webchannel(newsRoom);

        // Register Observers to the Subject
        newsRoom.add(otherChannel);
        newsRoom.add(webChannel);

        System.out.println("Initial State: " + newsRoom.getTxt());

        newsRoom.setText("Breaking News: Observer Pattern Implemented!");

        newsRoom.setText("Update: Pattern Successfully Tested!");
    }

}
