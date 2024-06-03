package model;

import java.util.ArrayList;
import java.util.List;

public class GameList
{
    private static List<Game> gameList = new ArrayList<>();
    
    public static List<Game> getGameList() {
        return gameList;
    }

    public static void addGame(Game game) {
        gameList.add(game);
    }
}
