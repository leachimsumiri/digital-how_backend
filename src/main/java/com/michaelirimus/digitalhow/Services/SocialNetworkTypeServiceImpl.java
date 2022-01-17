package com.michaelirimus.digitalhow.Services;

import com.michaelirimus.digitalhow.Model.SocialNetwork.SocialNetworkType;
import com.michaelirimus.digitalhow.Repositories.SocialNetworkTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocialNetworkTypeServiceImpl implements SocialNetworkTypeService {

    @Autowired
    private SocialNetworkTypeRepository socialNetworkTypeRepository;

    @Override
    public List<SocialNetworkType> getAllSocialNetworkTypes() {
        return this.socialNetworkTypeRepository.findAll();
    }
}
