Partie 1 :

 - Création de l'interface IDao avec une méthode getData :

    Nous avons commencé par définir une interface nommée IDao, qui expose une méthode getData. Cette interface servira de contrat pour toutes les classes qui implémentent la logique 
    d'accès aux données.

 -Implémentation de l'interface IDao :

    Ensuite, nous avons développé une classe DaoImpl qui implémente l'interface IDao. Cette classe contient la logique concrète pour récupérer la date à partir de la source de données, 
    conformément au contrat défini dans IDao.

 -Création de l'interface IMetier avec une méthode calcul :

    Nous avons également défini une interface IMetier avec une méthode calcul. Cette interface représente la couche métier de notre application et fournit un moyen d'effectuer des 
    calculs sur les données.

  -Implémentation de l'interface IMetier avec un couplage faible :

    Pour l'implémentation de IMetier, nous avons opté pour un couplage faible en utilisant le principe de l'inversion de contrôle (IoC). Cela nous permet de séparer la logique métier de 
    son implémentation concrète, favorisant ainsi la modularité et la maintenabilité de notre code.

  -Injection des dépendances :

    Nous avons exploré trois méthodes pour injecter les dépendances dans notre application :

    Par instanciation statique : Les dépendances sont instanciées directement dans la classe utilisatrice.

    Par instanciation dynamique : Les dépendances sont passées à la classe utilisatrice via son constructeur ou des méthodes d'injection.

    En utilisant le Framework Spring : Nous avons utilisé le Framework Spring pour gérer l'injection des dépendances. Deux approches ont été abordées :

    Version XML : Les dépendances sont définies dans un fichier de configuration XML.

    Version annotations : Les dépendances sont définies à l'aide d'annotations dans le code source.

    Ces techniques d'injection de dépendances permettent de rendre notre code plus flexible, testable et facile à maintenir en réduisant le couplage entre les différentes parties de 
    l'application.
