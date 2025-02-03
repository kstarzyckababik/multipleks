import java.util.ArrayList;
import java.util.List;

class Cinema {
    private String name;
    private String address;
    private List<Screening> screenings;

    public Cinema(String name, String address) {
        this.name = name;
        this.address = address;
        this.screenings = new ArrayList<>();
    }

    public void addScreening(Screening screening) {
        this.screenings.add(screening);
    }

    public void printProgramme() {
        System.out.println("Repertuar dla kina: " + this.name);
        for (Screening screening : screenings) {
            System.out.println(screening.getMovie().getTitle() + " - " + screening.getTime());
        }
    }
}
