all: 
	make clean
	make client 
	make server

client: Client.class

Client.class:
	javac -d . ./client/*.java

server: Server.class
	
Server.class:
	javac -d . ./server/*.java
	
clean:
	rm -rf ./*.class ./server/*.class ./client/*.class
