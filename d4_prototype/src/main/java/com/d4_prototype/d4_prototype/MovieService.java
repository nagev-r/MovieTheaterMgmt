package com.d4_prototype.d4_prototype;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.Map;

@Service
public class MovieService {
    private Map<String, Movie> movies;

    @PostConstruct
    public void init() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            InputStream is = getClass().getClassLoader().getResourceAsStream("data/dummydata.json"); // put your JSON in /src/main/resources/static
            movies = mapper.readValue(is, new TypeReference<>() {
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Map<String, Movie> getAllMovies() {
        return movies;
    }

    public Movie getMovieById(String id) {
        return movies.get(id);
    }
}

