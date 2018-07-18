package org.launchcode.offsitesales.models.data;

import org.launchcode.offsitesales.models.Year;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface YearDao extends CrudRepository<Year, Integer> {
}
