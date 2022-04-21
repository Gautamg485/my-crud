package com.gowtham.mycrud.models;

import javax.persistence.*;

@Entity
@Table(name = "profiles")
public class Profiles {

    @Id
    @Column(name = "profile_id")
    private Long profileId;
    @Column(name = "profile_name")
    private String profileName;

    public Long getProfileId() {
        return profileId;
    }

    public void setProfileId(Long id) {
        this.profileId = id;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

}
