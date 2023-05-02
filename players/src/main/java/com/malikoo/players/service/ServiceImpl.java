package com.malikoo.players.service;

import com.malikoo.players.entity.Player;

import com.malikoo.players.repo.PlayerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImpl implements IService {
    @Autowired
    PlayerRepo repo;

    @Override
    public Player getPlayerByFirstName(String firstname) {
        return repo.findByFirstName(firstname);
    }

    @Override
    public List<Player> getAllPlayers() {
        return repo.findAll();
    }


    @Override
    public Player savePlayer(Player player) {
        return repo.save(player);
    }
}
