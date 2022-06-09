package ch.teko.prg2.tag06.input.CommandLineReaderApp;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * CommandLineTool to interact with the chinook DB and execute simple SELECT queries.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("DemoJDBCWithMaven");
        CommandLineReader clr1 = new CommandLineReader();

        // individuell anpassen
        String urlToSQLiteFile = "jdbc:sqlite:/Users/glm/Desktop/JDBCTutorial/chinook.db";
        ChinookHandler chinookHandler = new ChinookHandler(urlToSQLiteFile);

        int digit = 0;

        do {
            System.out.println("Following Functions can be executed with this program:");
            System.out.println("Enter digit 0 to exit");
            System.out.println("Enter digit 1 to list all artist");
            System.out.println("Enter digit 2 to list all tracks from a artist");
            System.out.println("Enter digit 3 to list all albums from a artist");

            digit = clr1.readDigitFromCommandLine();

            switch (digit) {
                case 0:
                    System.out.println("Exiting programm");
                    break;
                case 1:
                    ResultSet artists = chinookHandler.getArtists();
                    try {
                        // iterate ResultSet
                        while (artists.next()) {
                            String artistsName = artists.getString("Name");
                            System.out.println(artistsName);
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    System.out.println("Enter Artist Name: ");
                    CommandLineReader clr2 = new CommandLineReader();
                    String input = clr2.readStringFromCommandLine();
                    System.out.println("Listing tracks for: " + input + "\n");
                    ResultSet resultSet = chinookHandler.getTracksFromArtists(input);
                    try {
                        // iterate ResultSet
                        while (resultSet.next()) {
                            String musicName = resultSet.getString("Name");
                            System.out.println(musicName);
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    break;
                default:
                    System.out.println("Unknown digit for command, exiting programm");
                    digit = 0;
                    break;
            }

        } while (digit != 0);

        clr1.close();
        chinookHandler.closeConnection();

    }
}
