# How to use this repository

##### Start CDAP using docker:
    docker run -it --name cdap-sandbox-5.1.0 -p 11011:11011 -p 11015:11015 -p 5005:5005 caskdata/cdap-sandbox:5.1.0 cdap sandbox start --enable-debug --foreground
##### Build the project:
    mvn clean install
##### Copy jar from target folder to CDAP docker container:
    docker exec -it -w /opt/cdap/sandbox-5.1.0/ cdap-sandbox-5.1.0 rm -f sparkpi-1.0.0-SNAPSHOT.jar ; docker cp ./target/sparkpi-1.0.0-SNAPSHOT.jar cdap-sandbox-5.1.0:/opt/cdap/sandbox-5.1.0/ ; docker exec -it -w /opt/cdap/sandbox-5.1.0/ cdap-sandbox-5.1.0 chown cdap:cdap sparkpi-1.0.0-SNAPSHOT.jar
##### Open additional shell terminal to view the application logs:
    docker logs -f cdap-sandbox-5.1.0
##### Open additional shell terminal and login to CDAP docker container:
    docker exec -it -w /opt/cdap/sandbox-5.1.0/ cdap-sandbox-5.1.0 bash
##### Once in the CDAP docker container open the CDAP cli:
    cdap cli
##### Load the artifact:
    load artifact sparkpi-1.0.0-SNAPSHOT.jar
##### Create an application
    create app test sparkpi 1.0.0-SNAPSHOT user
##### Run the application:
    start spark test.PiSpark "slices=10"
##### You can also run the application using a curl command:
    curl -X POST http://localhost:11015/v3/namespaces/default/apps/test/versions/-SNAPSHOT/spark/PiSpark/start -d '{"slices": "10"}'
