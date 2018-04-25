

## Web Socket
### Getting Started
- Install [Node.js](https://nodejs.org/en/ "Node.js")
- run simple [webserver demo](https://github.com/michaelulm/DistributedComputing/blob/master/Web%20Socket/node-webserver/app.js "Webserver Demo with Node.js")

after testing Node.js is running at your local enviroment, start exploring Web Socket extension for Node.js, you are welcome to start with the prepares websocket template:

- (use npm package manager to) install [websocket](https://www.npmjs.com/package/websocket) extension
- install or replace jquery reference
- use [websocket template](https://github.com/michaelulm/DistributedComputing/blob/master/Web%20Socket%20/node-websocket-simple) for your next steps
 


### Chat Client ONLY
The **first Task** should introduce you 

- how to use an existing Web Socket, 
- to understand different Web Socket Event Handlers,
- and also to understand json messaging format.

The exercise should include

- implement / extend a Chat UI
- implement **receive** and **send** method to use existing Web Socket Server for communication 

at the End you should be able to use a Web Socket for a **two-way-communication**.
This simple starter example helps to start implementing only the client. You will 

- handle messages,  
- display those messages on the screen and 
- send messages to other users


### Full Chat - Client and Server
#### Main Tasks

The Full Chat Example will be the next step of understanding Web Socket. The Client Behaviour is for understanding major event-driven communication of Web Sockets. The Server should now introduce you

- to understand handling data on server side
- how to forward incoming messages to all clients
- implementing your first Web Socket Server


#### Additional Tasks
- **Add username**: input ausername before starting your communication, and other people will see your username as a Prefix of your message
- **Message Counter**: count all messages and add those counter as a prefix
- **Message History**: add a message history, because new users will not get old messages per defaullt (because it's a **real-time-communication**, and history doesn't work out of the box.)
- **Private Message**: Type in a username before start writing your message, only this user will get the private message
- **Log messages**: log all messages e.g. on the file system or in a database


### IoT Web Socket
In some - up to many - use-cases you will get in contact with existing data or existing Web Socket Implementation. With the IoT Web Socket Example you can use an existing IoT Demo Projekt for create your own GUI for e.g. Real-Time Visualization.

#### Data Structure
- JSON messages
	- Temperature
	- Humidity
	- CO2 (coming)

#### Idea

- build your own GUI with incoming weather data
- create a real-time-visualization of incoming data
- your instructor will publish the current URL with IoT Web Socket Example

