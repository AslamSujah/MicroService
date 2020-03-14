package com.sujah.medicare.common.model.doctor;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "tblDoctor")
@Data       //The @Data annotation from lombok package. If we use it, we don't need to create getter and setter methods manually. But, You must need to install Lombok plug-in to your IDE. otherwise it will not gives getters and setters methods.
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;
    String gender;
    String contactNo;
    String specialization;

}
