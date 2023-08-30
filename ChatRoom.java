import java.util.ArrayList;

public class ChatRoom implements ISend {
    public ArrayList <IReceive> chatters = new ArrayList<>();

    public void Send(String user, String message)
    {
        for (IReceive chatter : chatters)
        {
            chatter.Receive(user, message);
        }
    }
    public void add(IReceive chatter)
    {
        chatters.add(chatter);
    }

}
