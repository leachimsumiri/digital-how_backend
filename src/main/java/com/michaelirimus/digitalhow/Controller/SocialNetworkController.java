package com.michaelirimus.digitalhow.Controller;

import com.michaelirimus.digitalhow.Model.SocialNetwork.SocialNetwork;
import com.michaelirimus.digitalhow.Model.SocialNetwork.SocialNetworkType;
import com.michaelirimus.digitalhow.Services.SocialNetworkServiceImpl;
import com.michaelirimus.digitalhow.Services.SocialNetworkTypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SocialNetworkController {

    @Autowired
    private SocialNetworkServiceImpl socialNetworkService;

    @Autowired
    private SocialNetworkTypeServiceImpl socialNetworkTypeService;

    @GetMapping(value = "/social-networks")
    public List<SocialNetwork> getSocialNetworks() {
        return socialNetworkService.getAllSocialNetworks();
    }

    @GetMapping(value = "/social-network-types")
    public List<SocialNetworkType> getSocialNetworkTypes() {
        return socialNetworkTypeService.getAllSocialNetworkTypes();
    }
}
