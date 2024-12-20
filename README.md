# 🦁🐘 Projet Gestion du Zoo - 💼 Projet Gestion des Employés

## Description Générale  
Ce projet est un système de gestion de zoo 🦓🐟 permettant de gérer différents types d'animaux (terrestres et aquatiques). Les différentes fonctionnalités sont implémentées dans des branches distinctes.  
C'est aussi un système de gestion des employés 🧑‍💻👩‍💼 permettant de gérer différents aspects comme les informations personnelles, les départements et les affectations. Chaque fonctionnalité principale est implémentée dans des branches distinctes.  

### Branches disponibles

1. **[Prosit 1 Branch](https://github.com/mariemkhalfallah/java/tree/prosit1)**  
   - 📋 Création des classes de base `Animal` et `Zoo`.  
   - Mise en place des attributs principaux pour les animaux : `id`, `nom`, `age`, `type`.  
   - 🏗️ Définition des structures initiales pour représenter les animaux dans un zoo.

2. **[Prosit 2 Branch](https://github.com/mariemkhalfallah/java/tree/prosit2)**  
   - 🔧 Ajout des constructeurs paramétrés dans les classes `Animal` et `Zoo`.  
   - 🔄 Simplification de l'initialisation des objets pour rendre le code plus lisible et réduire la duplication.

3. **[Prosit 3 Branch](https://github.com/mariemkhalfallah/java/tree/prosit3)**  
   - 👁️ Ajout des méthodes d'affichage :  
     - `afficherInformationsZoo()`.  
     - `afficherInformationsAnimal()`.  
   - Permet de visualiser les données des animaux et du zoo de manière structurée.

4. **[Prosit 4 Branch](https://github.com/mariemkhalfallah/java/tree/prosit4)**  
   - ➕ Gestion de l'ajout d'animaux avec :  
     - Un compteur automatique d'animaux pour assurer un suivi précis.  
     - ✅ Validation des données avant l'ajout (âge, type, nom).

5. **[Prosit 5 Branch](https://github.com/mariemkhalfallah/java/tree/prosit5)**  
   - 🔍 Ajout des fonctionnalités :  
     - Recherche d'animaux par `id` ou `nom`.  
     - ❌ Suppression d'animaux du zoo.  
     - 🔒 Restriction d'accès aux attributs à l'aide de modificateurs d'accès (`private`, `protected`, `public`).

6. **[Prosit 6 Branch](https://github.com/mariemkhalfallah/java/tree/prosit6)**  
   - 🐠 Introduction des catégories d'animaux :  
     - `Aquatique` : ajout des attributs spécifiques comme `typeEau`.  
     - `Terrestre` : gestion des attributs comme `vitesseMax`.  
   - Héritage des classes filles à partir de `Animal`.

7. **[Prosit 7 Branch](https://github.com/mariemkhalfallah/java/tree/prosit7)**  
   - 🚨 Gestion des exceptions pour :  
     - Empêcher la saisie d'un âge négatif pour les animaux.  
     - Lancer une exception personnalisée lorsque le zoo atteint sa capacité maximale.

8. **[Prosit 8 Branch](https://github.com/mariemkhalfallah/java/tree/prosit8)**  
   - 🍖🌿 Implémentation des interfaces pour les régimes alimentaires :  
     - `Carnivore` : méthode `mangerViande()`.  
     - `Herbivore` : méthode `mangerPlantes()`.  
     - `Omnivore` : combinaison des deux.  
   - Mise en œuvre des interfaces dans les classes animales.

9. **[Prosit 9 Branch](https://github.com/mariemkhalfallah/java/tree/prosit9)**  
   - 🏢 Implémentation de la classe `Employe` avec :  
     - Identifiant, nom, prénom, département, grade.  
     - Constructeurs, getters, setters.  
   - 🔄 Création de l'interface `IGestion` pour ajouter, rechercher, supprimer et trier les employés.  

10. **[Prosit 10 Branch](https://github.com/mariemkhalfallah/java/tree/prosit10)**  
    - 🏢 Création de la classe `Departement` avec gestion des départements (ajout, tri, suppression).  

11. **[Prosit 11 Branch](https://github.com/mariemkhalfallah/java/tree/prosit11)**  
    - 🔗 Gestion des affectations des employés aux départements avec une `HashMap`.  

12. **[Prosit 12 Branch](https://github.com/mariemkhalfallah/java/tree/prosit12)**  
    - 📚 Gestion des étudiants en utilisant des interfaces fonctionnelles comme `Consumer` et `Predicate`.

### Fonctionnalités principales
- 🦓 Gestion des animaux : ajout, suppression, recherche, affichage.  
- 🌍 Classification des animaux : aquatiques et terrestres.  
- 🛠️ Utilisation des exceptions pour un code robuste.  
- 💼 Gestion des employés et des départements.  
- 📊 Gestion des affectations et des informations des étudiants.  

🚀 Explorez les branches pour découvrir les implémentations détaillées et leurs applications au sein du projet !
