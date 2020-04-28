package com.sujah.medicare.medicaretreatmentservice.controller;

import com.sujah.medicare.common.model.treatment.Treatment;
import com.sujah.medicare.medicaretreatmentservice.model.Response;
import com.sujah.medicare.medicaretreatmentservice.model.SimpleResponse;
import com.sujah.medicare.medicaretreatmentservice.service.TreatmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/services")
@CrossOrigin("http://localhost:4200")
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
    public Response fetchById(@RequestParam int treatmentId, @RequestParam(required = false) String type){
        if (type==null){
            return new SimpleResponse(treatmentService.fetchById(treatmentId));
        }
        else if (type.equals("full")){
            return treatmentService.fetchDetailResponse(treatmentId);
        }
        else {
            return null;
        }
    }

}
