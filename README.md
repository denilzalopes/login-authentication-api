# Login Authentication API

Une API de gestion et d'authentification des utilisateurs basée sur Spring Boot. Ce projet utilise JSON Web Tokens (JWT) pour l'authentification et supporte les fonctionnalités essentielles comme l'enregistrement des utilisateurs, la connexion sécurisée, et la validation des jetons.

---

## 🛠️ Fonctionnalités Principales

- 🔒 Authentification via JWT.
- 📨 Gestion des utilisateurs (connexion/enregistrement).
- 🔍 Validation sécurisée des utilisateurs inscrits dans la base de données.
- 💡 Facile à étendre et intégrer dans d'autres applications.
- 📦 Basé sur **Spring Boot** avec **Spring Security** et **JPA**.

---

## 🛑 Prérequis

Avant de démarrer, vous devez avoir installé :
- **Java 17 ou une version plus récente**.
- **Maven** ou **Gradle** pour gérer les dépendances.
- **Mne autre base de données SQL** compatible avec JPA/Hibernate.

---

## 📂 Structure du Projet

La structure principale du projet :

```plaintext
src/main/java/com/example/login_authentication_api/
│
├── domain/         # Logique métier (entités, services, etc.)
├── infra/          # Code lié à l'infrastructure (sécurité, JWT, etc.)
├── repositories/   # Interfaces JPA pour la persistance des données
├── controllers/    # Endpoints REST
└── utils/          # Méthodes utils et autres classes générales
```

---

## ⚙️ Configuration

Voici les étapes pour configurer le projet :

1. Clonez ce repository dans votre machine locale :
   ```bash
   git clone https://github.com/denilzalopes/login-authentication-api.git
   ```
2. Accédez au dossier :
   ```bash
   cd login-authentication-api
   ```
3. Ajoutez les configurations nécessaires dans `application.properties` ou `application.yml` :
   Exemple pour **`application.properties`** :
   ```properties
   # Configuration de la base de données
   spring.datasource.url=jdbc:mysql://localhost:3306/login_auth
   spring.datasource.username=root
   spring.datasource.password=motdepasse
   spring.jpa.hibernate.ddl-auto=update

   # Clé secrète pour JWT
   api.security.token.secret=votre_clé_secrète
   ```

4. Compilez et exécutez le projet :
   Avec Maven :
   ```bash
   mvn spring-boot:run
   ```
   Avec Gradle :
   ```bash
   gradle bootRun
   ```

---

## 🗂️ Endpoints API

Voici une documentation des principaux endpoints de l'API :

### 🔑 Authentification & Gestion des Utilisateurs

| Méthode | Endpoint           | Description                          |
|---------|--------------------|--------------------------------------|
| POST    | `/api/auth/login`  | Authentification avec email/password |
| POST    | `/api/auth/register` | Inscription d'un nouvel utilisateur |
| GET     | `/api/users/{id}`  | Récupérer les informations d'un utilisateur |
  
### Exemple de body pour `/api/auth/login` :
```json
{
  "email": "exemple@email.com",
  "password": "monmotdepasse"
}
```

Réponse en cas de succès :
```json
{
  "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..."
}
```

---

## ✨ Technologies Utilisées

Ce projet utilise les technologies suivantes :
- **Java 17**
- **Spring Boot 3.x**
- **Spring Security** pour la gestion de l'authentification.
- **Spring Data JPA** pour la persistance et les repositories.
- **JWT (JSON Web Tokens)** pour la gestion de l'authentification.
- **Lombok** pour réduire le boilerplate dans le code.

