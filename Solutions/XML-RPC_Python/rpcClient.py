import xmlrpc.client

# server = xmlrpc.client.ServerProxy('http://localhost:8080/sample'),

server = xmlrpc.client.ServerProxy("http://127.0.0.1:8080")
print("3 is even: %s" % str(server.sample.sum(11,7)))
