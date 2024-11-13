public class Song {
    private String title = "Unknown";
    private String artist = "Unknown Artist";
    private String date = "Unknown Date";
    private String genre = "Unknown Genre";
    private String length = "Unknown Length";
    private String shakeability = "Unknown";
    private String obscenity = "Unknown";
    private String danceability = "Unknown Danceability";
    private String loudness = "Unknown Loudness";
    private String topic = "Unknown Topic";

    // Default constructor
    public Song() {}

    // Overloaded constructor
    public Song(String artist, String title, String date, String genre, String length, String shakeability, String obscenity, String danceability, String loudness, String topic) {
        this.artist = artist;
        this.title = title;
        this.date = date;
        this.genre = genre;
        this.length = length;
        this.shakeability = shakeability;
        this.obscenity = obscenity;
        this.danceability = danceability;
        this.loudness = loudness;
        this.topic = topic;
    }

    // toString for printing
    public String toString() {
        return artist + " - " + title + " - " + date + " - " + genre + " - " + length + " - " + shakeability + " - " + obscenity + " - " + danceability + " - " + loudness + " - " + topic;
    }

    // Getters
    public String getTitle() { return title; }
    public String getArtist() { return artist; }
    public String getDate() { return date; }
    public String getGenre() { return genre; }
    public String getLen() { return length; }
    public String getShake_the_audience() { return shakeability; }
    public String getObscene() { return obscenity; }
    public String getDanceability() { return danceability; }
    public String getLoudness() { return loudness; }
    public String getTopic() { return topic; }

    // Setters
    public void setTitle(String title) { this.title = title; }
    public void setArtist(String artist) { this.artist = artist; }
    public void setDate(String date) { this.date = date; }
    public void setGenre(String genre) { this.genre = genre; }
    public void setLen(String length) { this.length = length; }
    public void setShake_the_audience(String shakeability) { this.shakeability = shakeability; }
    public void setObscene(String obscenity) { this.obscenity = obscenity; }
    public void setDanceability(String danceability) { this.danceability = danceability; }
    public void setLoudness(String loudness) { this.loudness = loudness; }
    public void setTopic(String topic) { this.topic = topic; }
}
