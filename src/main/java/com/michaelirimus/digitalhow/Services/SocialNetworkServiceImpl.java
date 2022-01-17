package com.michaelirimus.digitalhow.Services;

import com.michaelirimus.digitalhow.Model.SocialNetwork.SocialNetwork;
import com.michaelirimus.digitalhow.Repositories.SocialNetworkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocialNetworkServiceImpl implements SocialNetworkService {

    @Autowired
    private SocialNetworkRepository socialNetworkRepository;

    @Override
    public List<SocialNetwork> getAllSocialNetworks() {
        return this.socialNetworkRepository.findAll();
    }
}
