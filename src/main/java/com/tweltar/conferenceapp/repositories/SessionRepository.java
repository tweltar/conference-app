package com.tweltar.conferenceapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tweltar.conferenceapp.models.Session;

public interface SessionRepository extends JpaRepository<Session, Long> {

}
