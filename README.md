"# Microservices_Test" 

Infos:
Um das Projekt zu starten muss Frontend Backend und Docker gestartet werden. Hier ist die Anleitung

Docker: 
    Befehle:
        - zu Folder Docker wechseln
        - docker compose up -d 
        - docker exec -it my-mysql-db mysql -u root -p
        - passwort eingeben: mySecurePassword
        - CREATE DATABASE my_database; DB Erstellen
        - EXIT;

Backend: 
    Befehle: 
        - Springboot normal starten
        Port sollte 8080 sein

Frontend:
    Befehle: 
        - neues Terminal öffnen
        - zu Frontend Folder wechseln
        - in terminal npm install machen
        - npm start


Um das Projekt zu Benutzen und Einträge zu sehen, muss ein eintrag gemacht werden
