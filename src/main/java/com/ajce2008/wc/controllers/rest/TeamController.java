package com.ajce2008.wc.controllers.rest;

import com.ajce2008.wc.models.Team;
import com.ajce2008.wc.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

@RequestMapping("/teams")
@RestController
public class TeamController {

    @Autowired private TeamService teamService;

    @RequestMapping(method = GET)
    public List<Team> getAllTeams() {
        return teamService.getAllTeams();
    }

    @RequestMapping(value = "/{teamId}", method = GET)
    public Team getNextTeamId(@PathVariable("teamId") final Integer teamId) {
        return teamService.getTeam(teamId);
    }

    @RequestMapping(method = POST)
    public Team addNewTeam(@RequestBody final Team team) {
        return teamService.addTeam(team);
    }

    @RequestMapping(value = "/{teamId}",method = PUT)
    public Team updateTeam(@PathVariable("teamId") final Integer teamId, @RequestBody final Team team) {
        return teamService.updateTeam(teamId, team);
    }
}
