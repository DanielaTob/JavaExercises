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
    public Movie findById(long id) {

        Object[] args = { id };

        return jdbcTemplate.queryForObject("select * from movies where id = ?", args, movieMapper);
    }

    @Override
    public Collection<Movie> findAll() {
        return jdbcTemplate.query("select * from movies", movieMapper);
    }

    @Override
    public void saveOrUpdate(Movie movie) {

        jdbcTemplate.update("insert into movies (name, minutes, genre) values (?, ?, ?)",
                movie.getName(),
                movie.getMinutes(),
                movie.getGenre().toString());

    }

    private static final RowMapper<Movie> movieMapper = (rs, rowNum) -> new Movie(

            rs.getInt("id"),
            rs.getString("name"),
            rs.getInt("minutes"),
            Genre.valueOf(rs.getString("genre"))

    );



}
