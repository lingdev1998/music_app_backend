package com.music.backend.follow;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class FollowController {

    @DeleteMapping(value = "/v1/me/following")
    public ResponseEntity<?> unfollowArtistsOrUsersVersion1() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(value = "/v1/playlists/{playlist_id}/followers")
    public ResponseEntity<?> unfollowAPlaylistVersion1(@PathVariable("playlist_id") String categoryId) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(value = "/v1/me/following/contains")
    public ResponseEntity<?> checkIfCurrentUserFollowsArtistsOrUsersVersion1() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(value = "/v1/me/following")
    public ResponseEntity<?> getFollowedArtistsVersion1() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(value = "/v1/playlists/{playlist_id}/followers/contains")
    public ResponseEntity<?> checkIfUsersFollowAPlaylistVersion1(@PathVariable("playlist_id") String categoryId) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping(value = "/v1/me/following")
    public ResponseEntity<?> followArtistsOrUsersVersion1() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping(value = "/v1/playlists/{playlist_id}/followers")
    public ResponseEntity<?> followAPlaylistVersion1(@PathVariable("playlist_id") String categoryId) {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
