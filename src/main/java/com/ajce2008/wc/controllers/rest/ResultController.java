package com.ajce2008.wc.controllers.rest;

import com.ajce2008.wc.models.Result;
import com.ajce2008.wc.services.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RequestMapping("/results")
@RestController
public class ResultController {

    @Autowired private ResultService resultService;

    @RequestMapping(method = GET)
    public List<Result> getAllResults() {
        return resultService.getAllResults();
    }

    /*@RequestMapping(value = "/{teamId}", method = GET)
    public Team getNextTeamId(@PathVariable("teamId") final Integer teamId) {
        return resultService.getTeam(teamId);
    }

    @RequestMapping(method = POST)
    public Team addNewTeam(@RequestBody final Team team) {
        return resultService.addTeam(team);
    }

    @RequestMapping(value = "/{teamId}",method = PUT)
    public Team updateTeam(@PathVariable("teamId") final Integer teamId, @RequestBody final Team team) {
        return resultService.updateTeam(teamId, team);
    }*/
}
