package com.wipro.velocity.efarming.controller;

import com.wipro.velocity.efarming.module.Farmer;

public class ReturningValue {
	public final Boolean status;
    public final Farmer farmer;

    public ReturningValue(Boolean status, Farmer farmer) {
        this.status = status;
        this.farmer = farmer;
    }
}
