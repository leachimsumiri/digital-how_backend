package com.michaelirimus.digitalhow.Controller;

import com.michaelirimus.digitalhow.Model.City;
import com.michaelirimus.digitalhow.Repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CityController {
    @Autowired
    private CityRepository cityRepository;

    @GetMapping("/cities")
    public List<City> getCities(@RequestParam(name = "page") int page,
                                @RequestParam(name = "size") int size) {
        return cityRepository.findAll(Pageable.ofSize(size).withPage(page)).getContent();
    }

    @GetMapping("/citiesCount")
    public long getCitiesCount() {
        return cityRepository.count();
    }

    @GetMapping("/citiesPages")
    public long getCitiesPages(@RequestParam(name = "size", required = true) int size) {
        return cityRepository.count() / size + 1;
    }
}
