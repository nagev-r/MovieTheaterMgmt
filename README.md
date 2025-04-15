# Movie Theater Movie Management System

This project is a database management system that will be used to keep track of movie tickets sold and seats available. 
The aim with the system is to create a simple to use and accurate storage system of all the movies that are being 
currently shown as well as how many seats are available in that specific theater.

We created a springbaord application that handles the backend for our movie service system. The movie file defines the sturcure for what movies are currently playing and in the system. 
This then moves forward into the MovieService file that will disaply the movie along with it's details once the app starts running for the user. Once the system is setup and diaplyed on the web any user will have the option to look through the selection and choose a movie they would like to see. This oepration is guided by the built in controller. 

When the application would work when it is on the web.
 1.	The browser loads index.html.
 2.	JavaScript sends a GET request to /tickets/movies.
 3.	TicketController uses MovieService to return the list of movies as JSON.
 4.	The dropdowns on the page are populated with movie titles and showtimes.
 5.	When the user clicks "Book Ticket", a POST request is sent to /tickets/book.
 6.	The controller verifies the selection and returns a confirmation message.
