# EntreVoisins
This is an Android app that allows neihgbours to provide themselves services like animals care, private lessons, small DIY... Many options are available !

## General info
This project is led by the company Entrevoisins.

The source code for the current version comes from the Github repository of  **Deyine** : [Entrevoisins](https://github.com/Deyine/OpenClassrooms/tree/master/Android/Entrevoisins)

That version originally contained the following functionalities :
* lis the neighbours ;
* add a neighbour ;
* delete a neighbour.

The [Framework paper](https://s3-eu-west-1.amazonaws.com/course.oc-static.com/projects/GEN+android+P3/De%CC%81veloppez+une+nouvelle+fonctionnalite%CC%81+pour+l%E2%80%99application+Entrevoisins-+Note+de+cadrage+(1).pdf "Framework paper") for this version of the app requires the following implementations :

>On the click on a neighbour on the list of neighbours, implement :
* a button to go to the former page ;
* the neighbour avatar ;
* the neighbour name ;
* a button that allows to add the neighbour to favorites ;
* a Favorite tab where are listed the neighbours marked as favorites.

## Setup
- You have to use Android Studio, download it and intall it if you don't have it yet.
- Download the Project.zip and extract zip
- Open Android Studio then open Entrevoisins project
- To compile the entire project, click the "Build project" button

  

## Tests
4 Unit tests :
- get the list of niehgbours with success
- delete neighbour with success
- create a neighbour with success
- add neighbour to favorites with success
- remove a neighbour from favorites list with success
- delete a neighbour, that is added to favorites, with success

4 Instrumented tests :
- recycler view not empty
- delete a niehgbour delete his item aswell
- open the neighbour profile with success
- when you add a neighbour to favorite, it should be diplayed in the favorites fragment
- when you click on the button to add a neighbour, it should display the add a neighbour view

## Status
Project is:  _finished_




