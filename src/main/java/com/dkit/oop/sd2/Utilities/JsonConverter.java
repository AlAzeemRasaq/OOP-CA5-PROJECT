package com.dkit.oop.sd2.Utilities;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.dkit.oop.sd2.Server.PlayerDTO;
import java.util.*;

public class JsonConverter {

    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    /**
    Converts a list of PlayerDTO objects to a JSON string.*
    @param playersList The list of PlayerDTO objects to convert.
            @return JSON string representing the list of players.*/
    public static String playersListToJson(List<PlayerDTO> playersList) {
        return gson.toJson(playersList);
    }

    /**
     Converts a single PlayerDTO object to a JSON string.*
     @param player The PlayerDTO object to convert.
     @return JSON string representing the player.*/

    public static String playerToJson(PlayerDTO player) {
        return gson.toJson(player);
    }
}