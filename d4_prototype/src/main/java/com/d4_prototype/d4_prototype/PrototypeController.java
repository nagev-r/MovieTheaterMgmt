package com.d4_prototype.d4_prototype;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrototypeController {

    @GetMapping("/")
    public String getHomepage(Model model) {
        return "index"; // Renders templates/index.html
    }
    @GetMapping("/ticket_selection")  //Will update to "/movies/{id}"
    public String getTicketSelection (Model model) {
        return "ticketsPage";
    }
    @GetMapping("/seat_selection") //Will update to "/movies/{id}/seats"
    public String getSeatSelection(Model model) {
        return "seatingPage";
    }
    @GetMapping("/checkout")
    public String getCheckout (Model model) {
        return "checkoutPage";
    }
}
