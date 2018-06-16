package com.ajce2008.wc.controllers.rest;

import com.ajce2008.wc.models.User;
import com.ajce2008.wc.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RequestMapping("/users")
@RestController
public class UserController {

    @Autowired private UserService userService;

    @RequestMapping(method = GET)
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    /*@RequestMapping(value = "/{teamId}", method = GET)
    public Team getNextTeamId(@PathVariable("teamId") final Integer teamId) {
        return userService.getTeam(teamId);
    }

    @RequestMapping(method = POST)
    public Team addNewTeam(@RequestBody final Team team) {
        return userService.addTeam(team);
    }

    @RequestMapping(value = "/{teamId}",method = PUT)
    public Team updateTeam(@PathVariable("teamId") final Integer teamId, @RequestBody final Team team) {
        return userService.updateTeam(teamId, team);
    }*/
}
