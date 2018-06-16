package com.ajce2008.wc.services;

import com.ajce2008.wc.models.Fixture;
import com.ajce2008.wc.models.Prediction;
import com.ajce2008.wc.models.PredictionData;
import com.ajce2008.wc.models.User;
import com.ajce2008.wc.repositories.FixtureRepository;
import com.ajce2008.wc.repositories.PredictionRepository;
import com.ajce2008.wc.repositories.TeamRepository;
import com.ajce2008.wc.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PredictionService {

    @Autowired private PredictionRepository predictionRepository;
    @Autowired private FixtureRepository fixtureRepository;
    @Autowired private TeamRepository teamRepository;
    @Autowired private UserRepository userRepository;

    public List<Prediction> getAllPredictions() {
        return (List<Prediction>) predictionRepository.findAll();
    }

    public List<PredictionData> getAllPredictionDataList() {
        List<Prediction> predictions = getAllPredictions();
        List<PredictionData> predictionDataList = new ArrayList<>(predictions.size());
        for (Prediction prediction : predictions) {
            User user = userRepository.findById(prediction.getUserId()).get();
            Fixture fixture = fixtureRepository.findById(prediction.getFixtureId()).get();
            String match = teamRepository.findById(fixture.getHomeTeamId()).get().getTeamName()
                    + " vs " + teamRepository.findById(fixture.getAwayTeamId()).get().getTeamName();
            String winner = prediction.getWinner() == -1 ? "Draw" : teamRepository.findById(prediction.getWinner()).get().getTeamName();
            predictionDataList.add(new PredictionData(user.getUserName(), user.getUserBranch(),
                    match, winner, prediction.getUpdatedAt().toString()));
        }
        return predictionDataList;
    }
}
