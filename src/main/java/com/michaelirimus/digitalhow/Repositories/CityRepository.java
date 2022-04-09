package com.michaelirimus.digitalhow.Repositories;

import com.michaelirimus.digitalhow.Model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
}
