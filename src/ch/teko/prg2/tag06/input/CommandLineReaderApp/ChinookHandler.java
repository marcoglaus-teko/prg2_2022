package ch.teko.prg2.tag06.input.CommandLineReaderApp;

import java.sql.*;

public class ChinookHandler implements IChinookDB {
    private String url;
    private Connection connection;

    public ChinookHandler(String url) {
        this.url = url;
        this.connection = this.getDBConnection(url);
    }

    private Connection getDBConnection(String url) {
        try {
            //registering the jdbc driver here
            Class.forName("org.sqlite.JDBC");
            return DriverManager.getConnection(url);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void closeConnection() {
        try {
            if (this.connection != null) {
                this.connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public ResultSet getArtists () {
        String sql = "SELECT artists.Name from artists";
        try {
            Statement statement = this.connection.createStatement();
            return statement.executeQuery(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public ResultSet getTracksFromArtists (String placeholder){
        // SQL query as String with placeholder "?"
        String sql = "SELECT tracks.Name FROM tracks \n" +
                "JOIN albums on (tracks.AlbumId = albums.AlbumId) \n" +
                "JOIN artists on (albums.ArtistId = artists.ArtistId) \n" +
                "WHERE artists.Name = ?";

        try {
            // define PreparedStatement
            PreparedStatement ps = this.connection.prepareStatement(sql);

            // set placeholder with given artist
            ps.setString(1, placeholder);

            // get a ResultSet
            return ps.executeQuery();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public ResultSet getAlbumsFromArtists (String placeholder){
        return null;
    }
}
