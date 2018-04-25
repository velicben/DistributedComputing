package at.fhj.iit;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LogHelperRPCTest {

    XmlRpcClient client;

    @Before
    public void setup() throws MalformedURLException {
        // init needed XML-RPC Configuration
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        // define Server URL with reference name "sample"
        config.setServerURL(new URL("http://127.0.0.1:8080/sample"));

        // init XML-RPC Client
        client = new XmlRpcClient();
        // set config to client
        client.setConfig(config);
    }

    @Test
    public void testRead() throws XmlRpcException {

        // init params for Method-Call
        Vector params = new Vector();

        // execute remote method with reference name "sample" and method name "sum"
        Object result = client.execute("log.read", params);

        // parse current value
        Assert.assertEquals("16.03.2018 12:33:22 - Demo Message for Distributed Computing", (String) result);
    }

    @Test
    public void testWrite() throws XmlRpcException {

        // init params for Method-Call
        Vector params = new Vector();
        // add needed params in correct order
        params.addElement("Just a test message for Distributed Computing!");


        // execute remote method with reference name "sample" and method name "sum"
        Object result = client.execute("log.write", params);

        // parse current value
        Assert.assertEquals(true, (boolean) result);
    }
}
