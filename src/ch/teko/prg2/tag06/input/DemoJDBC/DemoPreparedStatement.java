package ch.teko.prg2.tag06.input.DemoJDBC;

import java.sql.*;

public class DemoPreparedStatement {
    public static void main(String[] args) {
        // Pfad zur Datenbank
        // individuell anpassen!!!
        String url = "jdbc:sqlite:/Users/glm/Desktop/JDBCTutorial/chinook.db";

        // Connection Objekt zur Datenbank
        Connection conn = null;

        // SQL String
        String sql = "SELECT tracks.Name FROM tracks \n" +
                "JOIN albums on (tracks.AlbumId = albums.AlbumId) \n" +
                "JOIN artists on (albums.ArtistId = artists.ArtistId) \n" +
                "WHERE artists.Name = ?";

        try {
            conn = DriverManager.getConnection(url);

            boolean isValid = conn.isValid(0);
            System.out.println("Do we have a db connection? " + isValid);

            // PreparedStatement definieren
            PreparedStatement ps = conn.prepareStatement(sql);

            // Platzhalter ? befüllen
            ps.setString(1,"Black Sabbath");

            // ResultSet
            ResultSet rs = ps.executeQuery();

            // ResultSet auslesen
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
