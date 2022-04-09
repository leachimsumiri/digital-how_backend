package com.michaelirimus.digitalhow.Controller;

import com.michaelirimus.digitalhow.Model.City;
import com.michaelirimus.digitalhow.Repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CityController {
    @Autowired
    private CityRepository cityRepository;

    @GetMapping("/cities")
    public List<City> getCities() {
        return cityRepository.findAll();
    }
}
