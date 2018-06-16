package com.ajce2008.wc.controllers.rest;

import com.ajce2008.wc.models.Fixture;
import com.ajce2008.wc.services.FixtureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RequestMapping("/fixtures")
@RestController
public class FixtureController {

    @Autowired private FixtureService fixtureService;

    @RequestMapping(method = GET)
    public List<Fixture> getAllFixtures() {
        return fixtureService.getAllFixtures();
    }

    /*@RequestMapping(value = "/{teamId}", method = GET)
    public Team getNextTeamId(@PathVariable("teamId") final Integer teamId) {
        return fixtureService.getTeam(teamId);
    }

    @RequestMapping(method = POST)
    public Team addNewTeam(@RequestBody final Team team) {
        return fixtureService.addTeam(team);
    }

    @RequestMapping(value = "/{teamId}",method = PUT)
    public Team updateTeam(@PathVariable("teamId") final Integer teamId, @RequestBody final Team team) {
        return fixtureService.updateTeam(teamId, team);
    }*/
}
