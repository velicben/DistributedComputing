package at.fhj.iit;

import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.TimeUnit;

public class WordpressClient {
    public static void main(String[] args) throws InterruptedException {

        boolean login = false;
        String username = "distdemo";
        String password = "JustDemo1234!?";
//        int demoCounter = 1200;
//        do{
//            demoCounter++;
//            password ="JustDemo" + demoCounter + "!?";
//            login = rpc(username, password);
//            if(login)
//                System.out.println("Login was successful with password " + password);
//            else
//                System.out.println("DENIED with password " + password);
//
//            TimeUnit.SECONDS.sleep(10);
//        }while(login == false);

        rpc(username, password);

    }

    public static boolean rpc(String username, String password){

        try {

            XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
            config.setServerURL(new URL("http://distcomp.sandbox.co.at/xmlrpc.php"));

//            config.setBasicUserName("distdemo");
//            config.setBasicPassword("JustDemo1234!?");

            XmlRpcClient client = new XmlRpcClient();
            client.setConfig(config);

            //https://codex.wordpress.org/XML-RPC_WordPress_API


            Vector params = new Vector();

            // wp.getTags
            params.addElement(new Integer(1));  // postId
            params.addElement(username);       // username
            params.addElement(password); // password
            params.addElement(new Integer(2));  // user id

            // https://codex.wordpress.org/XML-RPC/system.listMethods
//            Object result = client.execute("system.listMethods", params);
            Object result = client.execute("wp.getUser", params);

//            Object[] response = (Object[]) result;
//            for (Object tag : response) {

                HashMap<String, Object> t = (HashMap<String, Object>) result;

                t.forEach((k, v) -> {
                    System.out.println("key: "+k+", value: "+v);
                });
//            }

//            Object result = client.execute("wp.getTags", params);
//            Object[] response = (Object[]) result;
//            for (Object tag : response) {
//
//                HashMap<String, Object> t = (HashMap<String, Object>) tag;
//
//                t.forEach((k, v) -> {
//                    System.out.println("key: "+k+", value: "+v);
//                });
//            }
            System.out.println("The Response is: " + result.toString());

//            int sum = ((Integer) result).intValue();
//            System.out.println("The sum is: " + sum);

        } catch (Exception exception) {
            System.err.println("WordpressClient: " + exception);
            return false;
        }
        return true;
    }
}