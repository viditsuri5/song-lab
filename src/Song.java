public class Song
{
  // Private instance variables
  private String title = "Unknown";
  private String artist = "Unknown Artist";
  private String date = "Unknown Date";
  private String genre = "Unknown genre";
  private String len = "Unknown Length";
  private String Shake_the_audience = "Unknown";
  private String obscene = "Unknown";
  private String danceability = "Unknown Danceability";
  private String loudness = "Unknown Loudness";
  private String topic = "Unknown topic";
  // Default constructor
  public Song(){} 
// shake the audience,obscene,danceability,loudness,topic
  // Overloaded constructor
  public Song(String artist, String title, String date, String genre, String len, String Shake_the_audience, String obscene, String danceability, String loudness, String topic) 
  {
    // note usage of this to assign to the instance variables
    this.artist = artist;
    this.title = title;
    this.date = date;
    this.len = len;
    this.Shake_the_audience = Shake_the_audience;
    this.obscene = obscene;
    this.danceability = danceability;
    this.loudness = loudness;
    this.topic = topic;

  }

  // toString for printing the object
  public String toString()
  {
    return artist + " - " + title + " - "+ date + " - "+ genre + " - "+ len +" - "+ Shake_the_audience+ " - "+ obscene+ " - "+danceability + " - "+ loudness+" - "+ topic;
  }
  
  // Getters for getting private instance variables
  public String getTitle()
  {
    return title;
  }
  
  public String getArtist()
  {
    return artist;
  }
  public String getDate()
  {
    return date;
  }
  public String getGenre()
  {
    return genre;
  }
  public String getLen()
  {
    return len;
  }
  public String getShake_the_audience()
  {
    return Shake_the_audience;
  }
  public String getObscene()
  {
    return obscene;
  }
  public String getDanceability()
  {
    return danceability;
  }
  public String getLoudness()
  {
    return loudness;
  }
  public String getTopic()
  {
    return topic;
  }
  
  // Setters to update instance variables
  public void setTitle(String title)
  {
      this.title = title;
  }
  
  public void setArtist(String artist)
  {
    this.artist = artist;
  }
  public void setDate(String date)
  {
      this.date = date;
  }
  public void setGenre(String genre)
  {
      this.genre = genre;
  }
  public void setLen(String len)
  {
      this.len = len;
  }
  public void setShake_the_audience(String Shake_audience)
  {
      this.Shake_the_audience = Shake_audience;
  }
  public void setObscene(String obscene)
  {
      this.obscene = obscene;
  }
  public void setDanceability(String danceability)
  {
      this.danceability = danceability;
  }
  public void setLoudness(String loudness)
  {
      this.loudness = loudness;
  }
  public void setTopic(String topic)
  {
      this.topic = topic;
  }

}