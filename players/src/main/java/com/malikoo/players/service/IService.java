package com.malikoo.players.service;

import com.malikoo.players.entity.Player;

import java.util.List;

public interface IService {

     Player getPlayerByFirstName(String firstname);
     List<Player> getAllPlayers();
     Player savePlayer(Player person);
}
