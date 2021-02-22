package com.music.backend.browse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BrowseController {

    @GetMapping(value = "/v1/recommendations/available-genre-seeds")
    public ResponseEntity<?> getAvailableGenreSeedsVersion1(@PathVariable("category_id") String categoryId) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(value = "/v1/browse/categories")
    public ResponseEntity<?> getAListOfBrowseCategoriesVersion1() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(value = "/v1/browse/categories/{category_id}")
    public ResponseEntity<?> getASingleBrowseCategoryVersion1(@PathVariable("category_id") String categoryId) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(value = "/v1/browse/categories/{category_id}/playlists")
    public ResponseEntity<?> getACategorySPlaylistsVersion1(@PathVariable("category_id") String categoryId) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(value = "/v1/browse/featured-playlists")
    public ResponseEntity<?> getAListOfFeaturedPlaylistsVersion1() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(value = "/v1/browse/new-releases")
    public ResponseEntity<?> getAListOfNewReleasesVersion1() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(value = "/v1/recommendations")
    public ResponseEntity<?> getRecommendationsBasedOnSeedsVersion1() {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
