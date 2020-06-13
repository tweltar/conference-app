package com.tweltar.conferenceapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tweltar.conferenceapp.models.Speaker;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {

}
