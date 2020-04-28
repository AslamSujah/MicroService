package com.sujah.medicare.medicaremedicineservice.controller;

import com.sujah.medicare.common.model.medicine.Medicine;
import com.sujah.medicare.medicaremedicineservice.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/services")
@CrossOrigin("http://localhost:4200")
public class MedicineController {

    @Autowired
    MedicineService medicineService;

    @RequestMapping(value = "/medicine", method = RequestMethod.POST)
    public Medicine save(@RequestBody Medicine medicine){
        return medicineService.save(medicine);
    }

    @RequestMapping(value = "/medicines", method = RequestMethod.GET)
    public List<Medicine> fetchAllMedicine(){
        return medicineService.fetchAllMedicine();
    }

    @RequestMapping(value = "/medicine", method = RequestMethod.GET)
    public Medicine fetchById(@RequestParam int medicineId){
        return medicineService.fetchById(medicineId);
    }

}
