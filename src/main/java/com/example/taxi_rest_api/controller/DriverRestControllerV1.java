package com.example.taxi_rest_api.controller;


import com.example.taxi_rest_api.model.DriverEntity;
import com.example.taxi_rest_api.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/drivers")
public class DriverRestControllerV1{

    private final DriverService driverService;
    @Autowired
    public DriverRestControllerV1(DriverService driverService) {
        this.driverService = driverService;
    }

    @PostMapping("save")
    @ResponseBody
    public DriverEntity create(@RequestBody DriverEntity driver){
        return driverService.save(driver);
    }

    @GetMapping("/get")
    public List<Auto> getAll(){
        return driverService.findAll();
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable long id){
        driverService.deleteById(id);
    }
}
