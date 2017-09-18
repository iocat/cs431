all: 
	make clean
	make client 
	make server

client: Client.class

Client.class:
	javac -d . ./src/client/*.java

server: Server.class
	
Server.class:
	javac -d . ./src/server/*.java
	
clean:
	rm -rf ./*.class ./src/server/*.class ./src/client/*.class
