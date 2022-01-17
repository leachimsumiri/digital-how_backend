package com.michaelirimus.digitalhow.Repositories;

import com.michaelirimus.digitalhow.Model.SocialNetwork.SocialNetwork;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocialNetworkRepository extends JpaRepository<SocialNetwork, Long> {
}
