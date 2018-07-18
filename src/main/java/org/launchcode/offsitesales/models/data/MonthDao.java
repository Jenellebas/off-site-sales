package org.launchcode.offsitesales.models.data;

import org.launchcode.offsitesales.models.Month;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface MonthDao extends CrudRepository<Month, Integer> {
}
