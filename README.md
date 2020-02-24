# Microservice-level1
Basic Micro-service Application  with spring boot (Eureka Server,Eureka client,load balancing, Rest Template, WebClient.builder)
Here i am createing the three Spring-boot application micro-service and one eureka registry server.
all microservice application are running on different port number
Step to crete the application 
1. from the spring initilizer (https://start.spring.io/) you can crete the application or any other way to create spring boot application 
2. add dependencies for micro-service application eureka "Eureka Discovery client", "spring boot cloud" and add annotation @ EnableEurekaClien
3. add dependencies for server "eureak server" and add annotation @EnableEurekaServer
4.Useing RestTemplate we can communicate between the two microservice end point (FYI :- A/C to oracle may RestTemplate will be not depricate and insted of this WebClientBuilder takes place )
