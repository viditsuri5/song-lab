import java.util.ArrayList;
public class App {
    public static void main(String[] args) {
        // Load songs from CSV file
        var songList = SongImporter.importSongsFromCSV("songs.csv");

        // Initialize counters and variables
        int count1982 = 0, count1998 = 0, count2011 = 0, highDanceabilityCount = 0, longestSongLength = 0;
        String longestSong = "", leastShakeableSong = "", loudestSong = "";
        double minShakeability = Double.MAX_VALUE, maxLoudness = Double.NEGATIVE_INFINITY;

        // Obscenity tracking by decade
        double[] obscenitySums = new double[7]; // For decades 1950-2019
        int[] obscenityCounts = new int[7];
        
        // Loop through all imported songs
        for (Song song : songList) {
            try {
                // Parse attributes
                int year = Integer.parseInt(song.getDate());
                double danceability = Double.parseDouble(song.getDanceability());
                double loudness = Double.parseDouble(song.getLoudness());
                double shakeability = Double.parseDouble(song.getShake_the_audience());
                double obscenity = Double.parseDouble(song.getObscene());
                int length = Integer.parseInt(song.getLen());

                // Count songs by specific years
                if (year == 1982) count1982++;
                else if (year == 1998) count1998++;
                else if (year == 2011) count2011++;

                // Count highly danceable songs
                if (danceability > 0.75) highDanceabilityCount++;

                // Find longest song
                if (length > longestSongLength) {
                    longestSongLength = length;
                    longestSong = song.getTitle();
                }

                // Find least shakeable song
                if (shakeability < minShakeability) {
                    minShakeability = shakeability;
                    leastShakeableSong = song.getTitle();
                }

                // Find loudest song
                if (loudness > maxLoudness) {
                    maxLoudness = loudness;
                    loudestSong = song.getTitle();
                }

                // Track obscenity by decade
                int decadeIndex = (year / 10) - 195;
                if (decadeIndex >= 0 && decadeIndex < 7) {
                    obscenitySums[decadeIndex] += obscenity;
                    obscenityCounts[decadeIndex]++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid data format for song: " + song.getTitle());
            }
        }

        // Print statistics
        System.out.println("Total number of songs: " + songList.size());
        System.out.printf("Songs from 1982: %d%n", count1982);
        System.out.printf("Songs from 1998: %d%n", count1998);
        System.out.printf("Songs from 2011: %d%n", count2011);
        System.out.printf("Songs with danceability > 0.75: %d%n", highDanceabilityCount);
        System.out.printf("Longest song: %s (Length: %d)%n", longestSong, longestSongLength);
        System.out.printf("Least shakeable song: %s (Shakeability: %.2f)%n", leastShakeableSong, minShakeability);
        System.out.printf("Loudest song: %s (Loudness: %.2f)%n", loudestSong, maxLoudness);

        // Print average obscenity levels for each decade
        String[] decades = {"1950-1959", "1960-1969", "1970-1979", "1980-1989", "1990-1999", "2000-2009", "2010-2019"};
        for (int i = 0; i < decades.length; i++) {
            if (obscenityCounts[i] > 0) {
                double avgObscenity = obscenitySums[i] / obscenityCounts[i];
                System.out.printf("Average obscenity level for %s: %.2f%n", decades[i], avgObscenity);
            } else {
                System.out.printf("No data for %s.%n", decades[i]);
            }
        }
    }
}

