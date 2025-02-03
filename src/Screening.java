import java.util.List;

class Screening {
    private Movie movie;
    private String time;
    private CinemaRoom room;
    private List<Seat> seats;

    public Screening(Movie movie, String time, CinemaRoom room) {
        this.movie = movie;
        this.time = time;
        this.room = room;
        this.seats = room.generateSeats();
    }

    public void reservePlaces(int... seatNumbers) {
        for (int seatNumber : seatNumbers) {
            Seat seat = findSeat(seatNumber);
            if (seat != null && !seat.isOccupied()) {
                seat.reserve();
                System.out.println("Miejsce " + seatNumber + " zarezerwowane.");
            } else {
                System.out.println("Miejsce " + seatNumber + " już zajęte.");
            }
        }
    }

    public void reservePlaces(Customer customer, int... seatNumbers) {
        for (int seatNumber : seatNumbers) {
            Seat seat = findSeat(seatNumber);
            if (seat != null && !seat.isOccupied()) {
                seat.reserve();
                customer.addTicket(new Ticket(seat));
                System.out.println("Miejsce " + seatNumber + " zarezerwowane dla " + customer.getName());
            } else {
                System.out.println("Miejsce " + seatNumber + " już zajęte.");
            }
        }
    }

    public Ticket purchaseTicket(Customer customer, int seatNumber) {
        Seat seat = findSeat(seatNumber);
        if (seat != null && !seat.isOccupied()) {
            seat.reserve();
            Ticket ticket = new Ticket(seat);
            customer.addTicket(ticket);
            System.out.println("Bilet zakupiony dla " + customer.getName() + " na miejsce " + seatNumber);
            return ticket;
        }
        return null;
    }

    private Seat findSeat(int seatNumber) {
        for (Seat seat : seats) {
            if (seat.getSeatNumber() == seatNumber) {
                return seat;
            }
        }
        return null;
    }

    public Movie getMovie() {
        return movie;
    }

    public String getTime() {
        return time;
    }
}