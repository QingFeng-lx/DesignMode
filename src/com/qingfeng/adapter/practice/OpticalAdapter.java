package com.qingfeng.adapter.practice;

public class OpticalAdapter implements Motor {
    private OpticalMotor opticalMotor;

    public OpticalAdapter(OpticalMotor opticalMotor) {
        this.opticalMotor = opticalMotor;
    }

    @Override
    public void drive() {
        opticalMotor.opticalDrive();
    }
}
