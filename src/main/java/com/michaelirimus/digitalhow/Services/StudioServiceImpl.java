package com.michaelirimus.digitalhow.Services;

import com.michaelirimus.digitalhow.Model.Studio;
import com.michaelirimus.digitalhow.Repositories.StudioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudioServiceImpl implements StudioService {
    @Autowired
    private StudioRepository studioRepository;

    @Override
    public List<Studio> getAllStudios() {
        return studioRepository.findAll();
    }
}
