package com.d4_prototype.d4_prototype;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Controller
public class PrototypeController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/")
    public String getHomepage(Model model) {
        model.addAttribute("movies", movieService.getAllMovies());
        return "index"; // templates/index.html
    }

    @GetMapping("/movies/{id}")
    //Might need to add a dropdown for showtimes in here so suer can select before getting tickets.
    public String getTicketsPage(@PathVariable String id, Model model) {
        Movie movie = movieService.getMovieById(id);
        if (movie == null) {
            return "404"; // handle error
        }
        /*
            Passing in a movie object didn't work for me, need to parse out the attributes and pass it in
            like this
        */
        model.addAttribute("path", movie.getPosterPath());
        model.addAttribute("title", movie.getTitle());
        model.addAttribute("genres", movie.getGenres());
        model.addAttribute("remainingSeats", movie.getRemainingSeats());
        model.addAttribute("showtimes", movie.getShowtimes());
        return "ticketsPage"; // templates/ticketsPage.html
    }

    @GetMapping("/movies/{id}/seats")
    public String getSeatSelection(@PathVariable String id, Model model) {
        model.addAttribute("movieId", id); // can use this later
        return "seatingPage";
    }

    @GetMapping("/checkout")
    public String getCheckout(Model model) {
        return "checkoutPage";
    }
}
