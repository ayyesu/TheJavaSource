package src.sandbox.objecttype;

import java.util.List;

public interface Musician{
    int getTimeToLive();

    String getMusicSchool();

    void setMusicSchool(String musicSchool);

    String getGenre();

    public void setGenre(String genre);

    public List<String> getSongs();

    public void setSongs(List<String> songs);
}
