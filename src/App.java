import java.util.ArrayList;

public class App {
    public static void main(String[] args)
    {
        // Variable to store the songs
        ArrayList<Song> songs;

        // import the songs from the CSV using the SongImporter
        songs = SongImporter.importSongsFromCSV("songs.csv");

        // Loop across all the songs imported
        int year_count = 0;
        int dance_count = 0;
        int largest = 0;
        String largest_len_song = "";
        double lowest_shakeability = 1.00; 
        String shakeability_song = "";
        double loudness = 0.0;
        String loudest_song = "";
        double obscenity_1 = 0.0; 
        int count_1 = 0; 
        double obscenity_2 = 0.0; 
        int count_2 = 0; 
        double obscenity_3 = 0.0; 
        int count_3 = 0; 
        double obscenity_4 = 0.0; 
        int count_4 = 0; 
        double obscenity_5 = 0.0; 
        int count_5 = 0; 
        double obscenity_6 = 0.0; 
        int count_6 = 0; 
        double obscenity_7 = 0.0; 
        int count_7 = 0;

        for (int i=0; i<songs.size(); i++)
        {
            // Get the current song matching the loop index i
            Song s = songs.get(i);
            // Example - print the song
            // You should add code to compute song statistics here.
            String year = s.getDate();
            String danceability = s.getDanceability();
            if(Integer.parseInt(year) == 1982 || Integer.parseInt(year) == 1998 || Integer.parseInt(year) == 2011){
                year_count++;
            }
            if(1959 >= Integer.parseInt(s.getDate()) && 1950 <= Integer.parseInt(s.getDate())){
                obscenity_1 += Double.parseDouble(s.getObscene());
                count_1+=1; 
            }
            if(1969 >= Integer.parseInt(s.getDate()) && 1960 <= Integer.parseInt(s.getDate())){
                obscenity_2 += Double.parseDouble(s.getObscene());
                count_2+=1; 
            }
            if(1979 >= Integer.parseInt(s.getDate()) && 1970 <= Integer.parseInt(s.getDate())){
                obscenity_3 += Double.parseDouble(s.getObscene());
                count_3+=1; 
            }
            if(1989 >= Integer.parseInt(s.getDate()) && 1980 <= Integer.parseInt(s.getDate())){
                obscenity_4 += Double.parseDouble(s.getObscene());
                count_4 +=1; 
            }
            if(1999 >= Integer.parseInt(s.getDate()) && 1990 <= Integer.parseInt(s.getDate())){
                obscenity_5 += Double.parseDouble(s.getObscene());
                count_5 +=1; 
            }
            if(2009 >= Integer.parseInt(s.getDate()) && 2000 <= Integer.parseInt(s.getDate())){
                obscenity_6 += Double.parseDouble(s.getObscene());
                count_6 +=1; 
            }
            if(2019 >= Integer.parseInt(s.getDate()) && 2010 <= Integer.parseInt(s.getDate())){
                obscenity_7 += Double.parseDouble(s.getObscene());
                count_7 +=1; 
            }
            if(Double.parseDouble(danceability) > 0.75){
                dance_count++;
            }
            if(Integer.parseInt(s.getLen()) > largest){
                largest = Integer.parseInt(s.getLen());
                largest_len_song = s.getTitle();
            }
            if(Double.parseDouble(s.getShake_the_audience()) < lowest_shakeability){
                lowest_shakeability = Double.parseDouble(s.getShake_the_audience());
                shakeability_song = s.getTitle();
            if(Double.parseDouble(s.getLoudness()) > loudness){
                loudness = Double.parseDouble(s.getLoudness());
                loudest_song = s.getTitle();
            }
            
            }
        }
        System.out.println("Number of songs: " + songs.size());
        System.out.println("Number of songs from 1982 , 1998 or 2011: " + year_count);
        System.out.println("Songs with danceability > 0.75: "+ dance_count);
        System.out.println("Song with the largest len: " + largest_len_song + ". Len size: " + largest) ;
        System.out.println("Song with the lowest shakeability: " + shakeability_song + ".  shakeability: " + lowest_shakeability);
        System.out.println("Loudest song: " + loudest_song + " Loudness: "+ loudness);
        System.out.println("average obscenity from 1950 - 1959- " + (double)(obscenity_1/count_1));
        System.out.println("average obscenity from 1960 - 1969- " + (double)(obscenity_2/count_2));
        System.out.println("average obscenity from 1970 - 1979- " + (double)(obscenity_3/count_3));
        System.out.println("average obscenity from 1980 - 1989- " + (double)(obscenity_4/count_4));
        System.out.println("average obscenity from 1990 - 1999- " + (double)(obscenity_5/count_5));
        System.out.println("average obscenity from 2000 - 2009- " + (double)(obscenity_6/count_6));
        System.out.println("average obscenity from 2010 - 2019- " + (double)(obscenity_7/count_7));
    }
}

