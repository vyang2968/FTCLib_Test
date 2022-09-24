package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.command.CommandOpMode;
import com.arcrobotics.ftclib.command.RunCommand;
import com.arcrobotics.ftclib.hardware.motors.MotorEx;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.commands.SpinMotor;
import org.firstinspires.ftc.teamcode.subsystems.Flywheel;

@TeleOp
public class Auto extends CommandOpMode {
    private MotorEx motor;
    private Flywheel flywheel;

    private SpinMotor command;

    @Override
    public void initialize() {
        motor = new MotorEx(hardwareMap, "motor");
        flywheel = new Flywheel(motor, telemetry);

        command = new SpinMotor(flywheel, 0.6);

        register(flywheel);

        flywheel.setDefaultCommand(command);
    }

}
