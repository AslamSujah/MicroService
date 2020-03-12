package com.sujah.medicare.medicaretreatmentservice.controller;

import com.sujah.medicare.common.model.treatment.Treatment;
import com.sujah.medicare.medicaretreatmentservice.service.TreatmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/services")
public class TreatmentController {

    @Autowired
    TreatmentService treatmentService;

    @RequestMapping(value = "/treatment", method = RequestMethod.POST)
    public Treatment save(@RequestBody Treatment treatment){
        return treatmentService.save(treatment);
    }

    @RequestMapping(value = "/treatments", method = RequestMethod.GET)
    public List<Treatment> fetchAllTreatment(){
        return treatmentService.fetchAllTreatment();
    }

    @RequestMapping(value = "/treatment", method = RequestMethod.GET)
    public Treatment fetchById(@RequestParam int treatmentId){
        return treatmentService.fetchById(treatmentId);
    }


}
