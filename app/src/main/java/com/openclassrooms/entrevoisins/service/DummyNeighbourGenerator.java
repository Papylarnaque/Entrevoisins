package com.openclassrooms.entrevoisins.service;

import com.openclassrooms.entrevoisins.model.Neighbour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

abstract class DummyNeighbourGenerator {

    public static final List<Neighbour> DUMMY_NEIGHBOURS = Arrays.asList(
            new Neighbour(1, "Caroline", "https://picsum.photos/id/237/300", "Saint-Pierre-du-Mont ; 5km",
                    "+33 6 86 57 90 14", "Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot.."),
            new Neighbour(2, "Jack", "https://picsum.photos/id/1005/300", "Saint-Pierre-du-Mont ; 5km",
                    "+33 6 86 57 90 14", "Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot.." +
                    "Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot.." +
                    "Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot.."),
            new Neighbour(3, "Chloé", "https://picsum.photos/id/1011/300", "Saint-Pierre-du-Mont ; 5km",
                    "+33 6 86 57 90 14", "Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot.."),
            new Neighbour(4, "Vincent", "https://picsum.photos/id/1010/300", "Saint-Pierre-du-Mont ; 5km",
                    "+33 6 86 57 90 14", "Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot.."),
            new Neighbour(5, "Elodie", "https://picsum.photos/id/1013/300", "Saint-Pierre-du-Mont ; 5km",
                    "+33 6 86 57 90 14", "Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot.."),
            new Neighbour(6, "Sylvain", "https://picsum.photos/id/1025/300", "Saint-Pierre-du-Mont ; 5km",
                    "+33 6 86 57 90 14", "Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot.."),
            new Neighbour(7, "Laetitia", "https://picsum.photos/id/1027/300", "Saint-Pierre-du-Mont ; 5km",
                    "+33 6 86 57 90 14", "Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot.."),
            new Neighbour(8, "Dan", "https://picsum.photos/id/103/300", "Saint-Pierre-du-Mont ; 5km",
                    "+33 6 86 57 90 14", "Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot.."),
            new Neighbour(9, "Joseph", "https://picsum.photos/id/1035/300", "Saint-Pierre-du-Mont ; 5km",
                    "+33 6 86 57 90 14", "Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot.."),
            new Neighbour(10, "Emma", "https://picsum.photos/id/129/300", "Saint-Pierre-du-Mont ; 5km",
                    "+33 6 86 57 90 14", "Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot.."),
            new Neighbour(11, "Patrick", "https://picsum.photos/id/1074/300", "Saint-Pierre-du-Mont ; 5km",
                    "+33 6 86 57 90 14", "Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot.."),
            new Neighbour(12, "Ludovic", "https://picsum.photos/id/177/300", "Saint-Pierre-du-Mont ; 5km",
                    "+33 6 86 57 90 14", "Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot..")
    );

    static List<Neighbour> generateNeighbours() {
        return new ArrayList<>(DUMMY_NEIGHBOURS);
    }
}
