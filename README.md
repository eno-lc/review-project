# Running the application
- Please enter the correct credentials in twitter4j.properties file in twitter-to-kafka-service 
and enter your github password and url on bootstrap.yml file of config-server
- Then run mvn install -DskipTests command
- Then increase the vm.max_map_count to 262144 by running the following command on your terminal 
- wsl -d docker-desktop 
- sysctl -w vm.max_map_count=262144
- Then run docker-compose up command in docker-compose folder
- Then run kafka-to-elastic-service in intelliJ
- Check kafka to elastic service, where we used the elastic modules to index the data into elasticsearch