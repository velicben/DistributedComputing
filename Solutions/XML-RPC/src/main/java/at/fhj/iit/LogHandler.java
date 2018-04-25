package at.fhj.iit;

public class LogHandler {

    public boolean write(String message){
        // TODO add implementation to write to log file
        System.out.println("Write message to log: " + message);

        // TODO replace static true
        return true;
    }

    public String read(){
        // TODO add implementation to read from log file
        return "16.03.2018 12:33:22 - Demo Message for Distributed Computing";
    }
}
