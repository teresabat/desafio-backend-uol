package teresa.bat.desafio_uol_backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import teresa.bat.desafio_uol_backend.infra.CodinameHandler;
import teresa.bat.desafio_uol_backend.model.GroupType;
import teresa.bat.desafio_uol_backend.model.Player;
import teresa.bat.desafio_uol_backend.model.dtos.PlayerDto;
import teresa.bat.desafio_uol_backend.repositories.PlayerRepository;

import javax.swing.*;
import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository repository;

    @Autowired
    private CodinameHandler handler;

    public Player createPlayer(PlayerDto dto){
        Player newPlayer = new Player(dto);
        String codiname = getCodiname(dto.groupType());
        newPlayer.setCodiname(codiname);
        return repository.save(newPlayer);

    }

    private String getCodiname(GroupType groupType){
        return handler.findCodiname(groupType);
    }

    public List<Player> getAllPlayers(){
        return repository.findAll();
    }
}
