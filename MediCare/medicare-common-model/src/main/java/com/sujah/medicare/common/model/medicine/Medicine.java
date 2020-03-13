package com.sujah.medicare.common.model.medicine;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tblMedicine")
@Data
public class Medicine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;
    String quantity;
    String expiryDate;

}
