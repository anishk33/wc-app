package com.ajce2008.wc.services;

import com.ajce2008.wc.models.Fixture;
import com.ajce2008.wc.repositories.FixtureRepository;
import com.ajce2008.wc.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FixtureService {

    @Autowired private FixtureRepository fixtureRepository;
    @Autowired private TeamRepository teamRepository;

    public List<Fixture> getAllFixtures() {
        return (List<Fixture>) fixtureRepository.findAll();
    }

    public List<Fixture> getAllFixturesPopulated() {
        List<Fixture> fixtures = getAllFixtures();
        for(Fixture fixture : fixtures) {
            fixture.setHomeTeam(teamRepository.findById(fixture.getHomeTeamId()).get().getTeamName());
            fixture.setAwayTeam(teamRepository.findById(fixture.getAwayTeamId()).get().getTeamName());
        }
        return fixtures;
    }
}
