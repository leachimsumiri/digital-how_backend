package com.michaelirimus.digitalhow.Repositories;

import com.michaelirimus.digitalhow.Model.SocialNetwork.SocialNetworkType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocialNetworkTypeRepository extends JpaRepository<SocialNetworkType, Long> {
}
