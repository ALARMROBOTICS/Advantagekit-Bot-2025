package frc.robot.subsystems.climber;

import com.revrobotics.AbsoluteEncoder;
import com.revrobotics.spark.SparkAbsoluteEncoder;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.configs.climberConfig;

public class ClimberIONeo implements ClimberIO{

private final SparkMax climberMotor;
private final AbsoluteEncoder climberAbsoluteEncoder;
public final climberConfig config;

private Rotation2d targetAngle = Rotation2d.fromDegrees(0);

private final double restingPosition = 0;
private final double climbPosition = 0;

public ClimberIONeo(climberConfig config){
    this.config = config;
    climberMotor = new SparkMax(this.config.climberMotorID,MotorType.kBrushless);
    climberAbsoluteEncoder = climberMotor.getAbsoluteEncoder();
}

public void setTargetAngle(Rotation2d angle){
    this.targetAngle = angle;
}

public void stopMotor(){
    climberMotor.stopMotor();
}

private Rotation2d getPosition(Rotation2d position){
    position = Rotation2d.fromRotations(climberAbsoluteEncoder.getPosition());
    return position;
}

@Override
public void periodic(){
    SmartDashboard.putNumber
}
}
