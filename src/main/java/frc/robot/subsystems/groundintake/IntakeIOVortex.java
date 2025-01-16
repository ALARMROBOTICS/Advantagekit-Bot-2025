// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.groundintake;

import com.revrobotics.spark.SparkFlex;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import frc.robot.RobotConstants;
import frc.robot.subsystems.groundintake.IntakeIO.IntakeIOInputs;

/** Add your docs here. */
public class IntakeIOVortex implements IntakeIO{

    private final SparkFlex tiltMotor;
    private final SparkFlex spinMotor;


    public IntakeIOVortex() {
        tiltMotor = new SparkFlex(RobotConstants.Intake.tiltMotorID, MotorType.fromId(RobotConstants.Intake.tiltMotorID));
        spinMotor = new SparkFlex(RobotConstants.Intake.spinMotorID, MotorType.fromId(RobotConstants.Intake.spinMotorID));

    }

    @Override
    public void updateInputs(IntakeIOInputs inputs) {
        
    }
}
