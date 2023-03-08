package com.javatests.util.movies.data;

import com.javatests.util.movies.model.Genre;
import com.javatests.util.movies.model.Movie;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


import java.util.Collection;

public class MovieRepositoryJdbc implements MovieRepository {

    private final JdbcTemplate jdbcTemplate;


    public MovieRepositoryJdbc(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Movie findBy(long id) {
        return null;
    }

    @Override
    public Collection<Movie> findAll() {
        return jdbcTemplate.query("select * from movies", movieMapper);
    }

    @Override
    public void saveOrUpdate(Movie movie) {

    }

    private static final RowMapper<Movie> movieMapper = (rs, rowNum) -> new Movie(

            rs.getInt("id"),
            rs.getString("name"),
            rs.getInt("minutes"),
            Genre.valueOf(rs.getString("genre"))

    );



}
