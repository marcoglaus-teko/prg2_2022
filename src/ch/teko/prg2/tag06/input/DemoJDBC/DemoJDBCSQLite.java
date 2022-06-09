package ch.teko.prg2.tag06.input.DemoJDBC;

import java.sql.*;

public class DemoJDBCSQLite {
    public static void main(String[] args) {
        // Pfad zur Datenbank
        // individuell anpassen!!!
        String url = "jdbc:sqlite:/Users/glm/Desktop/JDBCTutorial/chinook.db";

        // Connection Objekt zur Datenbank
        Connection conn = null;

        // SQL Statement
        Statement stmt = null;

        try {
            conn = DriverManager.getConnection(url);

            boolean isValid = conn.isValid(0);
            System.out.println("Do we have a db connection? " + isValid);

            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT *\n" +
                    "FROM tracks \n" +
                    "JOIN playlists ON (playlists.PlaylistId = playlist_track.PlaylistId)\n" +
                    "JOIN playlist_track ON (playlist_track.TrackId = tracks.TrackId)\n" +
                    "WHERE playlists.Name='Grunge';");
            while (rs.next()) {
                String musicName = rs.getString("Name");
                System.out.println(musicName);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }

    }
}
