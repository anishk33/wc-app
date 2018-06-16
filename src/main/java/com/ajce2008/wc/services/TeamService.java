package com.ajce2008.wc.services;

import com.ajce2008.wc.models.Team;
import com.ajce2008.wc.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.util.Assert.notNull;

@Service
public class TeamService {

    @Autowired private TeamRepository teamRepository;

    public List<Team> getAllTeams() {
        return (List<Team>) teamRepository.findAll();
    }

    public Team getTeam(final Integer teamId) {
        return teamRepository.findById(teamId).get();
    }

    public Team updateTeam(final Integer teamId, final Team team) {
        notNull(teamId, "Team id is required!");
        notNull(team, "Team data is reqired!");

        Team existingTeam = getTeam(teamId);
        notNull(existingTeam, "Team does not exist for id:" + teamId);

        existingTeam.setTeamName(team.getTeamName());
        return saveTeam(existingTeam);
    }

    public Team addTeam(final Team team) {
        notNull(team, "Team data is required!");

        team.setTeamId(getNextTeamId());
        return saveTeam(team);
    }

    private Team saveTeam(final Team team) {
        return teamRepository.save(team);
    }

    private Integer getNextTeamId() {
        return teamRepository.getMaxTeamId() + 1;
    }
}
