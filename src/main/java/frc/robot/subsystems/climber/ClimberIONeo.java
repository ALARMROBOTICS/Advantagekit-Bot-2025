package frc.robot.subsystems.climber;

import com.revrobotics.AbsoluteEncoder;
import com.revrobotics.spark.SparkAbsoluteEncoder;
import com.revrobotics.spark.SparkFlex;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import edu.wpi.first.math.geometry.Rotation2d;
import frc.robot.configs.climberConfig;

public class ClimberIONeo implements ClimberIO{

private final SparkFlex climberSpark;
private final AbsoluteEncoder climberEncoder;
public final climberConfig config;

private Rotation2d targetAngle = Rotation2d.fromDegrees(0);

//might not need**
private final double restingPosition = 0;
private final double climbPosition = 0;  

// public final TunableValue CLIMBERP;
// public final TunableValue CLIMBERI;
// public final TunableValue CLIMBERD;
// public final TunableValue CLIMBERF;

public ClimberIONeo(climberConfig config){
    this.config = config;

    climberSpark = new SparkFlex(this.config.climberMotorID, MotorType.kBrushless);
    climberEncoder = climberSpark.getAbsoluteEncoder();
    //climberEncoder.setPositionConversionFactor(config.positionScalingFactor);
}

}
