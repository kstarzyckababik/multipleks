import java.util.ArrayList;
import java.util.List;

class Customer {
    private String name;
    private String email;
    private boolean isRegistered;
    private List<Ticket> tickets;

    public Customer(String name, String email, boolean isRegistered) {
        this.name = name;
        this.email = email;
        this.isRegistered = isRegistered;
        this.tickets = new ArrayList<>();
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public void printTickets() {
        for (Ticket ticket : tickets) {
            System.out.println("Bilet na miejsce " + ticket.getSeat().getSeatNumber());
        }
    }

    public String getName() {
        return name;
    }
}
