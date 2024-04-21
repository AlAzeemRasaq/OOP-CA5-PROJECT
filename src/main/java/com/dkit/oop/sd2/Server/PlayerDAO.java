package com.dkit.oop.sd2.Server;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * Main author: Michael Atagamen
 * Other contributors:
 * Sean Afolabi
 * Al-Azeem Abdul Rasaq
 */
public interface PlayerDAO {
    List<PlayerDTO> getAllPlayers() throws DaoException;
    PlayerDTO getPlayerById(int playerId) throws DaoException;
    void insertPlayer(PlayerDTO player) throws DaoException;
    void updatePlayer(PlayerDTO player) throws DaoException;
    void deletePlayer(int playerId) throws DaoException;
    void deleteEntityById(Scanner scanner) throws DaoException;

    List<PlayerDTO> findPlayersUsingFilter(Comparator<PlayerDTO> comparator) throws DaoException;
}
