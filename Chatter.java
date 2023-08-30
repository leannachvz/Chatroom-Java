import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Chatter extends JFrame implements IReceive {
    JTextArea msgField;
    public Chatter(String name, ISend server) {
        //Retrieves username
        super();

        String userName = name;

        //creates user view
        JFrame msgFrame = new JFrame();
        msgFrame.setLayout(new BorderLayout());
        msgFrame.setTitle(userName);

        msgField = new JTextArea("",15, 25);
        JTextArea userMsg = new JTextArea(3,25);
        msgFrame.add(msgField, BorderLayout.CENTER);

        JPanel sendPanel = new JPanel();
        JButton sendButton = new JButton("Send");
        sendPanel.add(userMsg);
        sendPanel.add(sendButton);
        msgFrame.add(sendPanel, BorderLayout.SOUTH);

        JScrollPane scroller = new JScrollPane(msgField);
        msgFrame.add(scroller, BorderLayout.CENTER);

        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                server.Send(userName, userMsg.getText());
                userMsg.setText("");
            }
        });

        msgFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        msgFrame.pack();
        msgFrame.setVisible(true);

    }

    public void Receive(String user, String message){
        msgField.append(user +": " + message +"\n");
    }

}
