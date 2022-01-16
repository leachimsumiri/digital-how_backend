package com.michaelirimus.digitalhow.Controller;

import com.michaelirimus.digitalhow.Model.Studio;
import com.michaelirimus.digitalhow.Services.StudioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudioController {

    @Autowired
    private StudioServiceImpl studioService;

    @GetMapping("/studios")
    public List<Studio> getStudios() {
        return studioService.getAllStudios();
    }
}
