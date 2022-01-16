package com.michaelirimus.digitalhow.Repositories;

import com.michaelirimus.digitalhow.Model.Studio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudioRepository extends JpaRepository<Studio, Long> {
}
