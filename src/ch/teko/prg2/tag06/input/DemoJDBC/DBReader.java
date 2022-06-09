package ch.teko.prg2.tag06.input.DemoJDBC;

import java.sql.*;
import java.util.Scanner;

public class DBReader {
    private Scanner scanner = new Scanner(System.in);

    public String readStringFromCommandLine() {
        System.out.println("Enter Artistname: ");
        return this.scanner.nextLine();
    }

    public Connection getDBConnection(String url) {
        try {
            Connection conn = DriverManager.getConnection(url);
            return conn;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public ResultSet getResultsFromDB(Connection conn, String placeholder) {
        // SQL String
        String sql = "SELECT tracks.Name FROM tracks \n" +
                "JOIN albums on (tracks.AlbumId = albums.AlbumId) \n" +
                "JOIN artists on (albums.ArtistId = artists.ArtistId) \n" +
                "WHERE artists.Name = ?";

        try {
            // PreparedStatement definieren
            PreparedStatement ps = conn.prepareStatement(sql);

            // Platzhalter ? befüllen
            ps.setString(1, placeholder);

            // ResultSet
            return ps.executeQuery();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) throws SQLException {
        DBReader dbReader = new DBReader();
        String placeholder = dbReader.readStringFromCommandLine();
        // url anpassen!!!
        Connection conn = dbReader.getDBConnection("jdbc:sqlite:/Users/glm/Desktop/JDBCTutorial/chinook.db");
        ResultSet rs = dbReader.getResultsFromDB(conn, placeholder);

        // ResultSet auslesen
        while (rs.next()) {
            String musicName = rs.getString("Name");
            System.out.println(musicName);
        }

    }

}
