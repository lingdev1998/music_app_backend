package com.music.backend.library;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibraryController {
    @DeleteMapping(value = "/v1/me/albums")
    public ResponseEntity<?> removeAlbumsForCurrentUserVersion1(@RequestParam("ids") List<String> ids) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(value = "/v1/me/shows")
    public ResponseEntity<?> removeUserSSavedShowsVersion1(@RequestParam("ids") List<String> ids, @RequestParam("market") String market) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(value = "/v1/me/tracks")
    public ResponseEntity<?> removeTracksForCurrentUserVersion1(@RequestParam("ids") List<String> ids) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(value = "/v1/me/albums/contains")
    public ResponseEntity<?> checkCurrentUserSSavedAlbumsVersion1(@RequestParam("ids") List<String> ids) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(value = "/v1/me/shows/contains")
    public ResponseEntity<?> checkUserSSavedShowsVersion1(@RequestParam("ids") List<String> ids) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(value = "/v1/me/tracks/contains")
    public ResponseEntity<?> checkCurrentUserSSavedTracksVersion1(@RequestParam("ids") List<String> ids) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(value = "/v1/me/albums")
    public ResponseEntity<?> getCurrentUserSSavedAlbumsVersion1(@RequestParam("market") String market,
                                                                @RequestParam("limit") Long limit,
                                                                @RequestParam("offset") Long offset) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(value = "/v1/me/shows")
    public ResponseEntity<?> getUserSavedShowsVersion1(@RequestParam("limit") Long limit, @RequestParam("offset") Long offset) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(value = "/v1/me/tracks")
    public ResponseEntity<?> getCurrentUserSavedTracksVersion1(@RequestParam("market") String market,
                                                               @RequestParam("limit") Long limit,
                                                               @RequestParam("offset") Long offset) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping(value = "/v1/me/albums")
    public ResponseEntity<?> saveAlbumsForCurrentUserVersion1(@RequestParam("ids") List<String> ids) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping(value = "/v1/me/shows")
    public ResponseEntity<?> saveShowsForCurrentUserVersion1(@RequestParam("ids") List<String> ids) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping(value = "/v1/me/tracks")
    public ResponseEntity<?> saveTracksForCurrentUserVersion1(@RequestParam("ids") List<String> ids) {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
