package org.firstinspires.ftc.teamcode.commands;

import com.arcrobotics.ftclib.command.CommandBase;

import org.firstinspires.ftc.teamcode.subsystems.Flywheel;

public class SpinMotor extends CommandBase {
    private Flywheel flywheel;
    private double percent;

    public SpinMotor(Flywheel flywheel, double percent) {
        addRequirements(flywheel);
        this.flywheel = flywheel;
        this.percent = percent;
    }

    @Override
    public void execute() {
        flywheel.set(percent);
    }
}
