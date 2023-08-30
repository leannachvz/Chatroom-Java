public class Main {
    public static void main(String[] args) {
     ChatRoom gcServer = new ChatRoom();
     gcServer.add(new Chatter("Summer", gcServer));
     gcServer.add(new Chatter("Rick", gcServer));
     gcServer.add(new Chatter("Morty", gcServer));
     gcServer.add(new Chatter("Leanna", gcServer));
    }
}