package src.sandbox.objecttype;

import java.util.List;

public interface Actor{
    int getTimeToLive();

    String getActingSchool();

    void setActingSchool(String actingSchool);

    List<String> getFilms();

    void setFilms(List<String> films);
    default boolean isCreative(){
        return true;
    }
}
