package frc.robot.subsystems.groundintake;

import org.littletonrobotics.junction.AutoLog;

public interface IntakeIO {

    @AutoLog
    public static class IntakeIOInputs {
        
        
    }


    public default void updateInputs(IntakeIOInputs inputs) {}
    
}
