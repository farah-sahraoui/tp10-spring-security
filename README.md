# TP Spring Security : Authentification Personnalisée
Ce projet est une implémentation d'un mécanisme d'authentification sécurisé utilisant Spring Security. L'objectif est 
de remplacer la page de connexion par défaut par un formulaire HTML personnalisé, tout en gérant les rôles (USER/ADMIN),
les erreurs de connexion et la déconnexion.

## Technologies utilisées
Java 17+

Spring Boot (Web, Security, DevTools)

Thymeleaf (Moteur de templates pour les vues HTML)

Maven (Gestion des dépendances)

## Identifiants de test
Le projet utilise une configuration en mémoire avec deux utilisateurs :

Rôle	Nom d'utilisateur	Mot de passe
ADMIN	admin	1234
USER	user	1111
## Flux d'authentification
Voici le parcours utilisateur complet au sein de l'application, illustré par les captures d'écran ci-dessous.

1. Page de Connexion
L'accès à l'application redirige vers cette page personnalisée (/login). Elle présente un formulaire propre demandant l'identifiant et le mot de passe.

Page de Connexion:

![WhatsApp Image 2026-03-28 at 12 41 42](https://github.com/user-attachments/assets/61390c2d-8dcd-4710-a9f8-d04b85858df7)


2. Page d'Accueil
Après une authentification réussie, l'utilisateur est redirigé vers la page d'accueil (/home). Cette page sert de hub, proposant des liens vers les différents
espaces selon les droits de l'utilisateur connecté.

Page d'Accueil:


![WhatsApp Image 2026-03-28 at 12 42 11](https://github.com/user-attachments/assets/cc59e815-9ad8-4d44-a76b-ec7723cc9873)


3. Espace Utilisateur (Dashboard User)
En accédant à /user/dashboard, l'utilisateur standard (ou l'admin) voit cette interface. Elle est caractérisée par un fond bleu clair et confirme l'accès à l'espace personnel.

Espace Utilisateur:


![WhatsApp Image 2026-03-28 at 12 42 46](https://github.com/user-attachments/assets/28a2a229-2f84-43e4-9e1a-418c6c2e7df0)


4. Espace Administrateur (Dashboard Admin)
L'accès à /admin/dashboard est strictement réservé. L'interface se distingue par son fond jaune clair et un message confirmant l'accès restreint aux administrateurs.

Espace Administrateur:

![WhatsApp Image 2026-03-28 at 12 43 10](https://github.com/user-attachments/assets/fda5a7c0-ce59-4ead-a48c-389cbe5e8cb7)


5. Gestion des erreurs (Accès Refusé 403)
Si un utilisateur simple (user) tente d'accéder directement à l'URL de l'administrateur, Spring Security intercepte la requête et renvoie une erreur 403 Forbidden.
Cela garantit la confidentialité des données administratives.

Erreur 403 Forbidden:

![WhatsApp Image 2026-03-28 at 12 43 53](https://github.com/user-attachments/assets/11ac2370-7d22-4b6e-827c-c0510eb4a38c)


6. Déconnexion
Lorsqu'un utilisateur clique sur le bouton "Quitter" ou "Se déconnecter", la session est détruite et il est renvoyé vers la page de login. Un message de confirmation verte
 s'affiche pour valider l'action.

![WhatsApp Image 2026-03-28 at 13 01 03](https://github.com/user-attachments/assets/30236760-f00e-452c-a8b4-85a490cfb7f5)


Déconnexion réussie

