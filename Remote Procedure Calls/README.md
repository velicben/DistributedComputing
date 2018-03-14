

## Remote Procedure Call
### Getting Started
Getting started with [XML-RPC](https://github.com/michaelulm/DistributedComputing/tree/master/Remote%20Method%20Invocation/RMI "XML-RPC Example ")

Steps ToDo for [XML-RPC Example](https://github.com/michaelulm/DistributedComputing/tree/master/Remote%20Method%20Invocation/RMI "XML-RPC Example ")

- Clone [XML-RPC Example](https://github.com/michaelulm/DistributedComputing/tree/master/Remote%20Method%20Invocation/RMI "XML-RPC Example ")
- Test Local
- Test on two devices
  - Server
  - Client

### A) Extend existing Server with addition functions
#### Exercise A1: Extend the Server with a simple Logging Function
  - Create new method write(String message)
  - Put current DateTime as prefix to log message before you
  - Write message to a log file on file system
  - Create another method read() where you
  - Return the latest log entry

### B) Develop a XML-RPC Client (with another Technology) for existing Java Server
#### Exercise B1: Develop a XML-RPC Client with Python
  - use existing Java Server
  - implement simple Python Client for Remote Procedure Call 
  - Links:
    - [Python Wiki](https://wiki.python.org/moin/XmlRpc "Python Wiki")
    - [Python 3](https://docs.python.org/3/library/xmlrpc.client.html "Python 3 Library")
    - [Python 2](https://docs.python.org/2/library/xmlrpclib.html "Python 2 Library")


### C) Develop XML-RPC Simple Demo Client
#### Excercise C1: Develop a XML-RPC Client for Wordpress 
  - use a Wordpress Site
    - you need username and password to get access
      - **Hint:** *config.setBasicUserName*
      - **Hint:** similiar method to set password
    - try your implementation with [wp.getUser](https://codex.wordpress.org/XML-RPC_WordPress_API/Users#wp.getUser)
    - take care about return value
      - **Hint:** maybe you need to cast the return value
      - **Hint:** debug your code
  - Links:
    - [Wordpress XML-RPC Support](https://codex.wordpress.org/XML-RPC_Support "Wordpress XML-RPC Support")
    - [Wordpress XML-RPC API](https://codex.wordpress.org/XML-RPC_WordPress_API "Wordpress XML-RPC API")

## XML-RPC References
- [XML-RPC Specification](http://xmlrpc.scripting.com/spec.html "XML-RPC Specification")