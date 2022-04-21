package com.gowtham.mycrud.service;

import com.gowtham.mycrud.models.Profiles;
import com.gowtham.mycrud.repositories.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService {

    @Autowired
    private ProfileRepository profilesRepository;

    // Save operation
    public Profiles saveProfile(Profiles profile)
    {
        System.out.println(profile.getProfileName());
        System.out.println(profile.getProfileId());
        return profilesRepository.save(profile);
    }

    // Read operation
    public List<Profiles> fetchProfileList()
    {
        return (List<Profiles>)
                profilesRepository.findAll();
    }

    // Update operation
    public Profiles
    updateProfile(Profiles profiles,
                     Long profileId)
    {

        Profiles profileDB
                = profilesRepository.findById(profileId)
                .get();

        profileDB.setProfileName(profiles.getProfileName());
        return profilesRepository.save(profileDB);
    }

    // Delete operation
    public void deleteProfileById(Long profileId)
    {
        profilesRepository.deleteById(profileId);
    }
}