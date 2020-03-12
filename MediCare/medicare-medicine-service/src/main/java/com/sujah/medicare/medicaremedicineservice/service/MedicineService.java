package com.sujah.medicare.medicaremedicineservice.service;

import com.sujah.medicare.common.model.medicine.Medicine;

import java.util.List;

public interface MedicineService {

    Medicine save(Medicine medicine);
    List<Medicine> fetchAllMedicine();
    Medicine fetchById(int id);

}
