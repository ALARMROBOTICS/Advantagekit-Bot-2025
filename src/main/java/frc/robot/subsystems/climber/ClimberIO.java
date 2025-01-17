package frc.robot.subsystems.climber;

import org.littletonrobotics.junction.AutoLog;

import edu.wpi.first.math.geometry.Rotation2d;

public interface ClimberIO {
    @AutoLog
    public static class ClimberIOInputs{
        public boolean climberConnected = false;
        public double climberPositionRad = 0.0;
        public double climberVelocityPerSec = 0.0;
        public double climberAppliedVolts = 0.0;
        public double climberCurrentAmps = 0.0;

    }

public default void updateInputs(ClimberIOInputs inputs){}

public default void setClimberOpenLoop(double output){}

public default void setClimberVelocity(double velocityRadPerSec){}

public default void setClimberPosition(Rotation2d rotation){}
}
