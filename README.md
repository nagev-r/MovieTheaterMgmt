# Movie Theater Movie Management System

## This project is a database management system that will be used to keep track of movie tickets sold and seats available. 
The aim with the system is to create a simple to use and accurate storage system of all the movies that are being currently shown as well as how many seats are available in that specific theater.

We created a SpringBoot application that handles the backend for our movie service system. The movie file defines the structure for what movies are currently playing and in the system. 
This then moves forward into the MovieService file that will display the movie along with its details once the app starts running for the user. Once the system is set up and displayed on the web any user will have the option to look through the selection and choose a movie they would like to see. 

When the application would work when it is on the web.
When opened the first thing a user would see is the page filled with a list of different movies to select from.
A user would then select a movie of their choice 
From the movie selected they would then choose a time they would like to attend
This leads them to the checkout page which prompts them to pay.

### Project Structure
1. Controller: Manages the HTTP requests and responses.
2. Model: Represents the Movie and Showtime data.
3. View (Thymeleaf templates): Displays movie information, showtimes, and ticket booking form.

### How It Works
1. Homepage: Displays a list of movies with their details.
2. Select Movie: Click on a movie to see the available showtimes.
3. Ticket Purchase: Choose a showtime and select the number of tickets.
4. Confirmation: Confirm your booking with the selected tickets.
