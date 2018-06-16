package com.ajce2008.wc.repositories;

import com.ajce2008.wc.models.Team;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team, Integer> {

    @Query(value = "select max(team_id) from teams", nativeQuery = true)
    Integer getMaxTeamId();
}
