package com.malikoo.players.repo;

import com.malikoo.players.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepo extends JpaRepository<Player, Long >{

    Player findByFirstName(String firstName);

}
