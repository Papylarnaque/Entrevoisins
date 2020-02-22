package com.openclassrooms.entrevoisins.service;

import com.openclassrooms.entrevoisins.model.Neighbour;

import java.util.ArrayList;
import java.util.List;

/**
 * Dummy mock for the Api
 */
public class DummyNeighbourApiService implements  NeighbourApiService {

    private List<Neighbour> neighbours = DummyNeighbourGenerator.generateNeighbours();


    /**
     * {@inheritDoc}
     */
    @Override
    public List<Neighbour> getNeighbours() {
        return neighbours;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void deleteNeighbour(Neighbour neighbour) {
        neighbours.remove(neighbour);
    }

    /**
     * {@inheritDoc}
     * @param neighbour
     */
    @Override
    public void createNeighbour(Neighbour neighbour) {
        neighbours.add(neighbour);
    }


    @Override
    public void addFavoriteNeighbour(long neighbourId) {
        for(Neighbour neighbour: neighbours) {
            if(neighbour.getId()==neighbourId) {
                neighbour.setFavorite(true);
            }
        }
    }

    @Override
    public void removeFavoriteNeighbour(long neighbourId) {
        for(Neighbour neighbour: neighbours) {
            if(neighbour.getId()==neighbourId) {
                neighbour.setFavorite(false);
            }
        }
    }

    @Override
    public Neighbour getNeighbour(long neighbourId) {
        for(Neighbour neighbour: neighbours) {
            if(neighbour.getId()==neighbourId) {
                return neighbour;
            }
        }
        return null;
    }

    @Override
    public List<Neighbour> getFavoriteNeighbours() {
        List<Neighbour> result = new ArrayList<>();
        for(Neighbour neighbour: neighbours) {
            if(neighbour.isFavorite()) {
                result.add(neighbour);
            }
        }
        return result;
    }




}
