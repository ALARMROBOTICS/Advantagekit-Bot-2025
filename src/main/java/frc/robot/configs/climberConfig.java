package frc.robot.configs;

public class climberConfig {
  public final int climberMotorID;

  public final double climbAngle;
  public final double restAngle;


  public climberConfig(int climberMotor) {
    this(climberMotor, 0.0, 0.0);
  }

  public climberConfig(int climberMotor, double climbAngle, double restAngle){
    this.climberMotorID = climberMotor;
    this.climbAngle = climbAngle;
    this.restAngle = restAngle;
  }
}
