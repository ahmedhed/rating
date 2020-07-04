package com.rating.client.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rating.client.domain.Profile;

@Repository
public interface IProfileRepository extends JpaRepository<Profile, Long>{

}
