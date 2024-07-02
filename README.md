# Parcial ARSW

## Overview
This a basic web app that makes querys for some companys in the stock market based un one parameter that is time

### Key Feature
-Allows us to put a acronym for the company, and for diferent types of time based query parameter: INTRADAY, DAILY, WEEKLY, and MONTHLY

### Architecture
![image](https://github.com/juaneortiz1/Parcial_ARSW/assets/97971732/7ce3dadb-833d-49af-b31b-c427f2a3f04b)
User connects through a browser to connect to the web app, once there, he can select 4 diferent opctions, and also put a aacronym for the compnay he is going to look in the stock market, once he makes the petition, it is received by the controller that is in charge of verifying the parameters, QueryCache is in charged of verifying if the request was already done, if it is it returns a json with the info, and if it's not, it makes the query to the URL to get the object.

### Functionality
### Screenshots
![image](https://github.com/juaneortiz1/Parcial_ARSW/assets/97971732/4ab02a40-88b7-4d7f-800c-6bb91e2da1df)
![image](https://github.com/juaneortiz1/Parcial_ARSW/assets/97971732/242362d6-4e2b-4593-8be7-93aba5bc9e7b)
![image](https://github.com/juaneortiz1/Parcial_ARSW/assets/97971732/7607436d-3979-4556-a029-9e7059a0d71f)
![image](https://github.com/juaneortiz1/Parcial_ARSW/assets/97971732/0fa3b320-8773-4aad-81f8-029a4cd2ef8a)


## Technologies Used
- **Front-end**: HTML, thymeleaf
- **Back-end**: Java, Spring Boot
- **Deployment**: AWS EC2


## Deployment
http://ec2-54-196-92-232.compute-1.amazonaws.com:8080/
This web appa was deployed using Amazon Web Services EC2 instance
