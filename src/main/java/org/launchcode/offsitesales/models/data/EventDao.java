package org.launchcode.offsitesales.models.data;


import org.launchcode.offsitesales.models.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface EventDao extends CrudRepository<Event, Integer> {
}
