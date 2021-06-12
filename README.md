# Match-End-Result

# Description
Project for live results streaming of football clubs that consistst of generator that creates random match-end-result and a service for sinking results to a database. \
**Generator** is developed in Python - it runs endlessly and generate results every second. \
**Service** is developed in Java as a Spring Boot appplication - it accepts messages and inserts them into database. \
**Database** is spinned up with a help of docker.

Pre requirements: 
* You have to have Python installed, Java Development Kit (JDK), IDE for Java, Docker Compose, IDE for Database Management

# Getting started:
After cloning the repository and setting up your IDEs, you need to run the applications in these order: 

* Inside the root folder of the docker file, run: 

```docker-compose up -d ```  

* Inside the root folder of the spring boot application, run: 

```./mvnw spring-boot:run```

* Inside the root folder of the python file, run: 

```python generator.py```

You can end the generator by pressing CTRL + C on keyboard. After that, in your database IDE you can see the new match-end-result events.
