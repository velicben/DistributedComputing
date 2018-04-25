package at.fhj.iit;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

public class ChatClientImpl extends UnicastRemoteObject implements ChatClient {

    private String name;

    /**
     * creates new chat client with name of user,
     * stores user name local
     * @param n
     * @throws RemoteException
     */
    public ChatClientImpl(String n) throws RemoteException {
        name = n;
    }

    /**
     * will be triggered by server to write messages from other clients
     * @param msg
     * @throws RemoteException
     */
    public void tell(String msg) throws RemoteException {
        System.out.println(msg);
        // TODO integrate an UI
//    		ui.writeMsg(st);
    }

    public String getName() throws RemoteException {
        return name;
    }

    public static void main(String[] argv) {
        try {
            // Input your name to console
            Scanner s = new Scanner(System.in);
            System.out.println("Enter Your name and press Enter:");
            String name = s.nextLine().trim();

            // initialise current chat client
            ChatClientImpl client = new ChatClientImpl(name);

            // load remote RMI Registry and look for name
//            String host = "localhost"; // local only
            String host = "192.168.137.148"; // TODO replace with your IP
            Registry registry = LocateRegistry.getRegistry("192.168.137.148");
            ChatServer server = (ChatServer) registry.lookup("IITchat");

            // "register" / login with your client to current chat server
            server.login(client);

            // type in new messages into your console
            String msg = "";
            while (true) {
                msg = s.nextLine().trim();
                msg = "[" + client.getName() + "] " + msg;
                server.publish(msg);
            }

        } catch (Exception e) {
            // catch exception
            System.out.println("[System] Server failed: " + e);
        }
    }

}