package com.gowtham.mycrud.controllers;

import com.gowtham.mycrud.models.Profiles;
import com.gowtham.mycrud.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Annotation
@RestController
// Class
public class ProfileController {

    @Autowired private ProfileService profileService;

    // Save operation
    @PostMapping("/profiles")

    public Profiles saveProfile(@RequestBody Profiles profile)
    {
        System.out.println("profileadsdasdsa");
        return profileService.saveProfile(profile);
    }

    // Read operation
    @GetMapping("/profiles")

    public List<Profiles> fetchProfileList()
    {
        return profileService.fetchProfileList();
    }

    // Update operation
    @PutMapping("/profiles/{id}")

    public Profiles updateProfile(@RequestBody Profiles profile,
                     @PathVariable("id") Long profileId)
    {
        return profileService.updateProfile(
                profile, profileId);
    }

    // Delete operation
    @DeleteMapping("/profiles/{id}")

    public String deleteProfileById(@PathVariable("id")
                                       Long profileId)
    {
        profileService.deleteProfileById(
                profileId);
        return "Deleted Successfully";
    }
}