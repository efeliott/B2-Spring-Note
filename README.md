# Projet Spring Boot - Gestion des Notes

## Description
Ce projet est une application Java Spring pour la gestion des notes. Elle permet de :
- Créer, modifier, supprimer et consulter des notes.
- Gérer les auteurs et les catégories associés aux notes.
- Tester les endpoints via un fichier Postman exporté.

L'application utilise PostgreSQL comme base de données et offre une API REST pour l'interaction.

---

## Prérequis

### Logiciels nécessaires
- **Java 17 ou supérieur**
- **Maven 3.8+**
- **PostgreSQL**
- **Postman** (pour tester les requêtes API)

---

## Configuration

### Étape 1 : Cloner le projet
```bash
git clone <url-du-repo>
cd <nom-du-repo>
```

### Étape 2 : Configurer PostgreSQL
1. Créez une base de données PostgreSQL.
2. Utilisez le script de création fourni dans `src/main/resources/script_bdd.sql` pour initialiser la base.
3. Modifiez le fichier `src/main/resources/application.properties` pour configurer votre base de données PostgreSQL :

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/<nom-de-votre-base>
spring.datasource.username=<votre-username>
spring.datasource.password=<votre-password>
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### Étape 3 : Compiler et exécuter le projet
```bash
mvn clean install
mvn spring-boot:run
```

L'application sera disponible à l'adresse suivante : [http://localhost:8080](http://localhost:8080).

---

## Endpoints principaux

### Notes
- **Créer une note** : `POST /api/notes`
- **Modifier une note** : `PUT /api/notes/{id}`
- **Supprimer une note** : `DELETE /api/notes/{id}`
- **Lister les notes** : `GET /api/notes`
- **Notes par catégorie** : `GET /api/notesByCategorie/{categorieId}`
- **Notes par auteur** : `GET /api/notesByAuteur/{auteurId}`

### Auteurs
- **Créer un auteur** : `POST /api/auteurs`
- **Supprimer un auteur** : `DELETE /api/auteurs/{id}`
- **Modifier un auteur** : `PUT /api/auteurs/{id}`
- **Lister les auteurs** : `GET /api/auteurs`

### Catégories
- **Créer une catégorie** : `POST /api/categories`
- **Supprimer une catégorie** : `DELETE /api/categories/{id}`
- **Lister les catégories** : `GET /api/categories`

---

## Informations supplémentaires pour le professeur
1. **Diagrammes** :
   - Les diagrammes demandés se trouvent dans le dossier : `src/main/resources/`.
   - Ils incluent un diagramme de cas d'utilisation et un diagramme de classe de la base de données.

2. **Script de création de la base** :
   - Le fichier SQL `script_bdd.txt` dans le même dossier initialise la base de données PostgreSQL avec les tables nécessaires.

3. **Fichier Postman** :
   - Un fichier JSON nommé `SPRING NOTE.postman_collection.json` est fourni dans `src/main/resources/`.
   - Importez ce fichier dans Postman pour tester directement les endpoints.
   - Instructions d'importation :
     1. Ouvrez Postman.
     2. Cliquez sur **Import**.
     3. Sélectionnez le fichier `SPRING NOTE.postman_collection.json`.

---

## Remarques finales
Si vous avez des questions ou besoin d'une assistance supplémentaire, n'hésitez pas à me contacter.

Merci de votre attention et bon test du projet !

