package com.javatests.util.movies.data;

import com.javatests.util.movies.model.Movie;

import java.util.Collection;

public interface MovieRepository {

    Movie findBy(long id);
    Collection<Movie> findAll();
    void saveOrUpdate(Movie movie);

}
