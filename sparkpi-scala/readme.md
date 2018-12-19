1. `docker exec -it -w /opt/cdap/sandbox-5.1.0/ cdap-sandbox-5.1.0 rm sparkpi-1.0.0-SNAPSHOT.jar ; docker cp sparkpi-1.0.0-SNAPSHOT.jar cdap-sandbox-5.1.0:/opt/cdap/sandbox-5.1.0/ ; docker exec -it -w /opt/cdap/sandbox-5.1.0/ cdap-sandbox-5.1.0 chown cdap:cdap sparkpi-1.0.0-SNAPSHOT.jar`
2. `load artifact sparkpi-1.0.0-SNAPSHOT.jar`
3. `create app test sparkpi 1.0.0-SNAPSHOT user`
4. `start spark test.PiSpark`