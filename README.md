CORENTIN 

Observer : De par la nécessité d'envoyer des notifications dans différents systèmes.
Ce design pattern de notifier des évènements a des observeurs lors d'un changement d'état.

Adapter : Il permet de faire le lien entre notre interface et la signature d'une classe qui ne correspond pas à notre interface. (ThermalSensor de la marque B avec notre interface ISensor)

Factory : Utile pour notre système de notification afin de créer des systèmes de notifications différents (email, discord, log) sans avoir à modifier le code client qui utilise ces systèmes de notifications.
C'est utile si on veut ajouter de nouveaux types de notifications plus tard.