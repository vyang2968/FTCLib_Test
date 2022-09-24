package org.firstinspires.ftc.teamcode.subsystems;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.arcrobotics.ftclib.hardware.motors.MotorEx;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.Constants;

public class Flywheel extends SubsystemBase {

    private MotorEx motor;
    private Telemetry telemetry;

    public Flywheel(MotorEx motor, Telemetry telemetry) {
        this.motor = motor;
        this.telemetry = telemetry;

        motor.resetEncoder();
        cd 
    }

    @Override
    public void periodic() {
        telemetry.addData("get", get());
        telemetry.update();
    }

    public void set(double percent) {
        motor.set(percent);
    }

    public double getVelocity() {
        return motor.getVelocity();
    }

    public double get() {
        return motor.get();
    }

}
