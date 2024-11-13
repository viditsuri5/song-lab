import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class SongImporter {
    public static ArrayList<Song> importSongsFromCSV(String filename) {
        ArrayList<Song> songs = new ArrayList<>();
        int lineNumber = 0;

        try {
            File file = new File(filename);
            Scanner csvReader = new Scanner(file);

            // Read header line
            String header = csvReader.nextLine();
            System.out.println("Header fields: " + header);

            // Read each line in the CSV file
            while (csvReader.hasNextLine()) {
                lineNumber++;

                String line = csvReader.nextLine();
                String[] fields = line.split(",");

                String artist = fields[0];
                String title = fields[1];
                String date = fields[2];
                String genre = fields[3];
                String length = fields[4];
                String shakeability = fields[5];
                String obscenity = fields[6];
                String danceability = fields[7];
                String loudness = fields[8];
                String topic = fields[9];

                Song song = new Song(artist, title, date, genre, length, shakeability, obscenity, danceability, loudness, topic);
                songs.add(song);
            }
            csvReader.close();
        } catch (Exception ex) {
            System.out.println("Error on line: " + lineNumber);
            ex.printStackTrace();
        }
        return songs;
    }
}
