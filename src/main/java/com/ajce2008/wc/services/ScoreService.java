package com.ajce2008.wc.services;

import com.ajce2008.wc.models.*;
import com.ajce2008.wc.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ScoreService {

    @Autowired private FixtureRepository fixtureRepository;
    @Autowired private PredictionRepository predictionRepository;
    @Autowired private ScoreRepository scoreRepository;
    @Autowired private TeamRepository teamRepository;
    @Autowired private UserRepository userRepository;

    public List<Score> getAllScores() {
        return (List<Score>) scoreRepository.findAll();
    }

    public List<ScoreData> getAllScoreDataList() {
        List<Score> scores = getAllScores();
        List<ScoreData> scoreDataList = new ArrayList<>(scores.size());
        for(Score score : scores) {
            Prediction prediction = predictionRepository.findById(score.getPredictionId()).get();
            User user = userRepository.findById(prediction.getUserId()).get();
            Fixture fixture = fixtureRepository.findById(prediction.getFixtureId()).get();
            String match = teamRepository.findById(fixture.getHomeTeamId()).get().getTeamName()
                    + " vs " + teamRepository.findById(fixture.getAwayTeamId()).get().getTeamName();
            String winner = prediction.getWinner() == -1 ? "Draw" : teamRepository.findById(prediction.getWinner()).get().getTeamName();
            scoreDataList.add(new ScoreData(user.getUserName(), user.getUserBranch(),
                    match, winner, score.getScore()));
        }
        return scoreDataList;
    }
}
