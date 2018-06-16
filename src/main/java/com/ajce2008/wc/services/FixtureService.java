package com.ajce2008.wc.services;

import com.ajce2008.wc.models.Fixture;
import com.ajce2008.wc.models.FixtureData;
import com.ajce2008.wc.repositories.FixtureRepository;
import com.ajce2008.wc.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FixtureService {

    @Autowired private FixtureRepository fixtureRepository;
    @Autowired private TeamRepository teamRepository;

    public List<Fixture> getAllFixtures() {
        return (List<Fixture>) fixtureRepository.findAll();
    }

    public List<FixtureData> getAllFixtureDatas() {
        List<Fixture> fixtures = getAllFixtures();
        List<FixtureData> fixtureDataList = new ArrayList<>(fixtures.size());
        for(Fixture fixture : fixtures) {
            String homeTeam = teamRepository.findById(fixture.getHomeTeamId()).get().getTeamName();
            String awayTeam = teamRepository.findById(fixture.getAwayTeamId()).get().getTeamName();
            fixtureDataList.add(new FixtureData(fixture.getVenue(), fixture.getLocation(),
                    fixture.getMatchStartTime().toString(), homeTeam, awayTeam));
        }
        return fixtureDataList;
    }
}
