package ch.teko.prg2.tag06.input.CommandLineReaderApp;

import java.sql.Connection;
import java.sql.ResultSet;

public interface IChinookDB {
    ResultSet getArtists();
    ResultSet getTracksFromArtists(String placeholder);
    ResultSet getAlbumsFromArtists(String placeholder);
}
