

## Remote Method Invocation
### Getting Started
Getting started with [RMI Example](https://github.com/michaelulm/DistributedComputing/tree/master/Remote%20Method%20Invocation/RMI "RMI Example ")

Steps ToDo for [RMI Example](https://github.com/michaelulm/DistributedComputing/tree/master/Remote%20Method%20Invocation/RMI "RMI Example ")

- Clone [RMI Example](https://github.com/michaelulm/DistributedComputing/tree/master/Remote%20Method%20Invocation/RMI "RMI Example ")
- Test Local
- Test on two devices
  - Server
  - Client


### Develop RMI Chat
- Create Interfaces
- Create Implementations
- Use RMI for register / subscribe / login new clients
- Use RMI to publish new messages

###Possible Architecture for RMI Chat Server and Client
![Class Diagram for RMI Chat](https://raw.githubusercontent.com/michaelulm/DistributedComputing/master/Remote%20Method%20Invocation/RMI_Chat/docs/00_RMI_Chat_Overview.png)

- *interface* **ChatClient** *extends* Remote 
- *interface* **ChatServer** *extends* Remote 
- **ChatClientImpl** will 
  - *lookup(...)* for Remote Object
  - invoke *login(ChatClient)* at Remote **ChatServer** Object
  - invoke *publish(String msg)* at Remote **ChatServer** Object
- **ChatServerImpl** will 
  - store list of **ChatClient**s
  - *tell(String msg)* each subscribe **ChatClient** the new incoming message
- **StartServer** will (re)bind RemoteObject for later (remote) use by Client

#### Server Application
![Chat Server](https://raw.githubusercontent.com/michaelulm/DistributedComputing/master/Remote%20Method%20Invocation/RMI_Chat/docs/01_RMI_Chat_Server.png)
#### Client Application
![Chat Server](https://raw.githubusercontent.com/michaelulm/DistributedComputing/master/Remote%20Method%20Invocation/RMI_Chat/docs/02_RMI_Chat_Client.png)
#### Chat Workflow
![Chat Server](https://raw.githubusercontent.com/michaelulm/DistributedComputing/master/Remote%20Method%20Invocation/RMI_Chat/docs/03_RMI_Chat_Description.PNG)