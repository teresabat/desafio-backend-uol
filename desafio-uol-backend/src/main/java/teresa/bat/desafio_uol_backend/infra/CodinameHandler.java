package teresa.bat.desafio_uol_backend.infra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import teresa.bat.desafio_uol_backend.model.GroupType;
import teresa.bat.desafio_uol_backend.service.CodinameService;

@Component
public class CodinameHandler {

    @Autowired
    private CodinameService service;

    public String findCodiname(GroupType groupType){
        if(groupType == GroupType.AVENGERS){
            String firstMatch = service.getAvengersCodinameList().stream().findFirst().orElseThrow();
            this.service.getAvengersCodinameList().remove(firstMatch);
            return firstMatch;
        }
        String firstMatch = service.getJusticeLeagueList().stream().findFirst().orElseThrow();
        this.service.getJusticeLeagueList().remove(firstMatch);
        return firstMatch;
    }
}
