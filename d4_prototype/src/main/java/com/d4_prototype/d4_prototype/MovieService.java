package com.d4_prototype.d4_prototype;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;// was throwing error when I didn't have this
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
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false); // was throwing error when I didn't have this
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

    /*
        How to reserve seats using MovieService since java uses pass by value
    */

    public void reserveSeatById(String id, int row, int column) {
        movies.get(id).reserveSeat(row, column);
    }

    public int  getRemainingSeatsById(String id, int row, int column) {
        return movies.get(id).getRemainingSeats();
    }
} 

