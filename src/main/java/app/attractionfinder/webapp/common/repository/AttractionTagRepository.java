package app.attractionfinder.webapp.common.repository;

import app.attractionfinder.webapp.common.model.Attraction;
import app.attractionfinder.webapp.common.model.Match;
import app.attractionfinder.webapp.common.model.Tag;

import java.util.List;

public interface AttractionTagRepository {

        List<Long> getAllTags(long attraction_id);

        List<Long> getAllAttractions(long tag_id);

        List<Match> getAllMatches();

        Match getMatch(long id);

}

