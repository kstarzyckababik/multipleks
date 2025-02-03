import java.util.ArrayList;
import java.util.List;

class CinemaRoom {
    private String name;
    private int totalSeats;

    public CinemaRoom(String name, int totalSeats) {
        this.name = name;
        this.totalSeats = totalSeats;
    }

    public List<Seat> generateSeats() {
        List<Seat> seats = new ArrayList<>();
        for (int i = 1; i <= totalSeats; i++) {
            seats.add(new Seat(i));
        }
        return seats;
    }
}