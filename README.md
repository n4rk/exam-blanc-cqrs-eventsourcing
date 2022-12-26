# Examen Blanc : Systèmes Distribués

> Réalisé par : **HACHMI Mohamed Amine**

## Architecture technique du projet :

![architecture.jpg](screenshots/architecture.jpg)
	
## Diagramme de classes global du projet :
 
![class-diagram.jpg](screenshots/class-diagram.jpg)

------------------------------------------------
## Partie Backend :

-> **Nous allons séparer la partie Command de la partie Query pour tous les services**

![structure-projet.jpg](screenshots%2Fstructure-projet.jpg)

![project-modules.jpg](screenshots%2Fproject-modules.jpg)

### Common-api :

![commonapi.jpg](screenshots%2Fcommonapi.jpg)

### Radar-Service :

- #### Radar Service Command Side:

![radar-command-service.jpg](screenshots%2Fradar-command-service.jpg)

- #### Radar Service Query Side:

![radar-query-service.jpg](screenshots%2Fradar-query-service.jpg)


### Immatriculation Service :

- #### Immatriculation Service Command Side :

![immatriculation-command-service.jpg](screenshots%2Fimmatriculation-command-service.jpg)

- #### Immatriculation Service Query Side :

![immatriculation-query-service.jpg](screenshots%2Fimmatriculation-query-service.jpg)


### Infractions Service :

- #### Infraction Service Command Side :

![infraction-command-service.jpg](screenshots%2Finfraction-command-service.jpg)

- #### Infraction Service Query Side :

![infraction-query-service.jpg](screenshots%2Finfraction-query-service.jpg)

### Gateway Service :

![gateway-service.jpg](screenshots%2Fgateway-service.jpg)

## Eureka Discovery Service :

![eureka-discovery-service.jpg](screenshots%2Feureka-discovery-service.jpg)

------------------------------------------------
-> Nous allons Essayer l'API :

![axon1.jpg](screenshots%2Faxon1.jpg)

![axon2.jpg](screenshots%2Faxon2.jpg)

![eureka.jpg](screenshots%2Feureka.jpg)

![infraction-command-controller.jpg](screenshots%2Finfraction-command-controller.jpg)

![infraction-query-controller.jpg](screenshots%2Finfraction-query-controller.jpg)

![radar-command-controller.jpg](screenshots%2Fradar-command-controller.jpg)

![radar-query-controller.jpg](screenshots%2Fradar-query-controller.jpg)

![vehicle-command-controller.jpg](screenshots%2Fvehicle-command-controller.jpg)

![vehicle-query-controller.jpg](screenshots%2Fvehicle-query-controller.jpg)

![createRadar.jpg](screenshots%2FcreateRadar.jpg)

![createVehicle.jpg](screenshots%2FcreateVehicle.jpg)

------------------------------------------------
## Partie Frontend :

------------------------------------------------