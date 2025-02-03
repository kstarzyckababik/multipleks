class Movie {
    private String title;
    private String description;
    private String genre;
    private int duration;
    private boolean is3D;
    private boolean isVIP;

    public Movie(String title, String description, String genre, int duration, boolean is3D, boolean isVIP) {
        this.title = title;
        this.description = description;
        this.genre = genre;
        this.duration = duration;
        this.is3D = is3D;
        this.isVIP = isVIP;
    }

    public String getTitle() {
        return title;
    }
}