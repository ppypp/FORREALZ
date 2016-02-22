package org.usfirst.frc4212.Robot;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.VictorSP;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
    public static SpeedController driveTrainSP1;
    public static SpeedController driveTrainSP2;
    public static RobotDrive driveTrainRD;
    public static AnalogGyro driveTrainGyro;
    public static PowerDistributionPanel driveTrainPDP;
    
    public static SpeedController armSpark;
    public static DigitalInput armArmHighLS;
    public static DigitalInput armArmLowLS;
    
    public static SpeedController elevatorSpark;
    public static DigitalInput elevatorElevHighLS;
    public static DigitalInput elevatorElevLowLS;
    
    public static SpeedController pickupSpark;
    public static DigitalInput pickupPickupLS;

    public static void init() {
        driveTrainSP1 = new VictorSP(0);
        LiveWindow.addActuator("DriveTrain", "SP1", (VictorSP) driveTrainSP1);
        
        driveTrainSP2 = new VictorSP(1);
        LiveWindow.addActuator("DriveTrain", "SP2", (VictorSP) driveTrainSP2);
        
        driveTrainRD = new RobotDrive(driveTrainSP1, driveTrainSP2);
        
        driveTrainRD.setSafetyEnabled(false);
        driveTrainRD.setExpiration(0.1);
        driveTrainRD.setSensitivity(0.5);
        driveTrainRD.setMaxOutput(1.0);

        driveTrainRD.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
        driveTrainRD.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
        driveTrainGyro = new AnalogGyro(0);
        LiveWindow.addSensor("DriveTrain", "Gyro", driveTrainGyro);
        driveTrainGyro.setSensitivity(0.007);
        driveTrainPDP = new PowerDistributionPanel(0);
        LiveWindow.addSensor("DriveTrain", "PDP", driveTrainPDP);
        
        armSpark = new Spark(2);
        LiveWindow.addActuator("Arm", "Spark1", (Spark) armSpark);
        
        armArmHighLS = new DigitalInput(0);
        LiveWindow.addSensor("Arm", "ArmHighLS", armArmHighLS);
        
        armArmLowLS = new DigitalInput(1);
        LiveWindow.addSensor("Arm", "ArmLowLS", armArmLowLS);
        
        elevatorSpark = new Spark(3);
        LiveWindow.addActuator("Elevator", "Spark2", (Spark) elevatorSpark);
        
        elevatorElevHighLS = new DigitalInput(2);
        LiveWindow.addSensor("Elevator", "ElevHighLS", elevatorElevHighLS);
        
        elevatorElevLowLS = new DigitalInput(3);
        LiveWindow.addSensor("Elevator", "ElevLowLS", elevatorElevLowLS);
        
        pickupSpark = new Spark(4);
        LiveWindow.addActuator("Pickup", "Spark3", (Spark) pickupSpark);
        
        pickupPickupLS = new DigitalInput(4);
        LiveWindow.addSensor("Pickup", "PickupLS", pickupPickupLS);
	}
}