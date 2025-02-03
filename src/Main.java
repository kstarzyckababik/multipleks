public class Main {
    public static void main(String[] args) {

        Cinema cinema1 = new Cinema("Kino Krakow", "ul. Dluga 5");

        Movie movie1 = new Movie("Titanic", "Film o katastrofie statku", "Romance", 120, false, false);

        CinemaRoom room1 = new CinemaRoom("Sala 1", 100);
        Screening screening1 = new Screening(movie1, "2025-02-01 19:00", room1);

        cinema1.addScreening(screening1);

        cinema1.printProgramme();

        screening1.reservePlaces(1, 2, 3);

        Customer customer = new Customer("Jan Nowak", "jan@gmail.com", true);
        screening1.reservePlaces(customer, 3, 4, 5);

        Ticket ticket = screening1.purchaseTicket(customer, 1);

        customer.printTickets();
    }
}
