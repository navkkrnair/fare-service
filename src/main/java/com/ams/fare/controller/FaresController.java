package com.ams.fare.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ams.fare.component.FaresComponent;
import com.ams.fare.entity.Fare;

@RestController
@CrossOrigin
@RequestMapping("/fares")
public class FaresController
{
    private static final Logger logger = LoggerFactory.getLogger(FaresController.class);
    FaresComponent              faresComponent;

    @Autowired
    FaresController(FaresComponent faresComponent)
    {
        this.faresComponent = faresComponent;
    }

    @RequestMapping("/get")
    Fare getFare(@RequestParam(value = "flightNumber") String flightNumber, @RequestParam(value = "flightDate") String flightDate)
    {
        logger.info("FareService /fares/get API called");
        return faresComponent.getFare(flightNumber,
                                      flightDate);
    }
}
