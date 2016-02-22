package org.usfirst.frc4212.Robot.subsystems;

import org.usfirst.frc4212.Robot.commands.*;
//import edu.wpi.first.wpilibj.AnalogGyro;
//import edu.wpi.first.wpilibj.PowerDistributionPanel;
//import edu.wpi.first.wpilibj.RobotDrive;
//import edu.wpi.first.wpilibj.SpeedController;
//import edu.wpi.first.wpilibj.VictorSP;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class DriveTrain extends Subsystem {

//    private final SpeedController sP1 = RobotMap.driveTrainSP1;
//    private final SpeedController sP2 = RobotMap.driveTrainSP2;
//    private final RobotDrive rD = RobotMap.driveTrainRD;
//    private final AnalogGyro gyro = RobotMap.driveTrainGyro;
    //private final PowerDistributionPanel pDP = RobotMap.driveTrainPDP;


    public void initDefaultCommand() {
        setDefaultCommand(new Drive());
    }
//    public double getC(int channel){
//    	return pDP.getCurrent(channel);
//    }
    //Other Data is global (ie. Temperature and voltage)
    
}

