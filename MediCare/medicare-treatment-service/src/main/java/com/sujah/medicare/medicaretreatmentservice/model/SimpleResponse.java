package com.sujah.medicare.medicaretreatmentservice.model;

import com.sujah.medicare.common.model.treatment.Treatment;

public class SimpleResponse implements Response {
    Treatment treatment;

    public SimpleResponse(Treatment treatment) {
        this.treatment = treatment;
    }

    public Treatment getTreatment() {
        return treatment;
    }

    public void setTreatment(Treatment treatment) {
        this.treatment = treatment;
    }
}
