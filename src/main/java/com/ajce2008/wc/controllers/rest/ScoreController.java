package com.ajce2008.wc.controllers.rest;

import com.ajce2008.wc.models.Score;
import com.ajce2008.wc.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RequestMapping("/scores")
@RestController
public class ScoreController {

    @Autowired private ScoreService scoreService;

    @RequestMapping(method = GET)
    public List<Score> getAllScores() {
        return scoreService.getAllScores();
    }

    /*@RequestMapping(value = "/{teamId}", method = GET)
    public Team getNextTeamId(@PathVariable("teamId") final Integer teamId) {
        return scoreService.getTeam(teamId);
    }

    @RequestMapping(method = POST)
    public Team addNewTeam(@RequestBody final Team team) {
        return scoreService.addTeam(team);
    }

    @RequestMapping(value = "/{teamId}",method = PUT)
    public Team updateTeam(@PathVariable("teamId") final Integer teamId, @RequestBody final Team team) {
        return scoreService.updateTeam(teamId, team);
    }*/
}
