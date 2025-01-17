package frc.robot.configs;

import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.wpilibj.DigitalInput;

public class climberConfig {
    public final int climberMotorID;

    public final double climbAngle;
    public final double restAngle;

    public final double positionScalingFactor;

    public climberConfig(int climberMotor, double scalingFactor){
        this(climberMotor,
        0.0,
        0.0,
        scalingFactor);
    }

    public climberConfig(int climberMotor, double climbAngle, double restAngle, double scalingFactor){
        this.climberMotorID = climberMotor;
        this.climbAngle = climbAngle;
        this.restAngle = restAngle;
        this.positionScalingFactor = scalingFactor;
    }

}
