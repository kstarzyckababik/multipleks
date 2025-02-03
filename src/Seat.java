class Seat {
    private int seatNumber;
    private boolean occupied;

    public Seat(int seatNumber) {
        this.seatNumber = seatNumber;
        this.occupied = false;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void reserve() {
        this.occupied = true;
    }
}