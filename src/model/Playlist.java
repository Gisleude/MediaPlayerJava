/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author gisleude
 */
public class Playlist {
    private int id_playlist;
    private String name_playlist;
    private int id_user_playlist;
    private ArrayList<Musica> musicas;

    /**
     * @return the id_playlist
     */
    public int getId_playlist() {
        return id_playlist;
    }

    /**
     * @param id_playlist the id_playlist to set
     */
    public void setId_playlist(int id_playlist) {
        this.id_playlist = id_playlist;
    }

    /**
     * @return the name_playlist
     */
    public String getName_playlist() {
        return name_playlist;
    }

    /**
     * @param name_playlist the name_playlist to set
     */
    public void setName_playlist(String name_playlist) {
        this.name_playlist = name_playlist;
    }

    /**
     * @return the id_user_playlist
     */
    public int getId_user_playlist() {
        return id_user_playlist;
    }

    /**
     * @param id_user_playlist the id_user_playlist to set
     */
    public void setId_user_playlist(int id_user_playlist) {
        this.id_user_playlist = id_user_playlist;
    }

    /**
     * @return the musicas
     */
    public ArrayList<Musica> getMusicas() {
        return musicas;
    }

    /**
     * @param musicas the musicas to set
     */
    public void setMusicas(ArrayList<Musica> musicas) {
        this.musicas = musicas;
    }
}
