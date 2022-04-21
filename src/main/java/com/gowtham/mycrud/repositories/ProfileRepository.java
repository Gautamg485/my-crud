package com.gowtham.mycrud.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.gowtham.mycrud.models.Profiles;

@Repository
public interface ProfileRepository extends CrudRepository<Profiles, Long> {
}
