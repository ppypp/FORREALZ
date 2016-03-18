package org.usfirst.frc4212.Robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4212.Robot.Robot;
import org.usfirst.frc4212.Robot.RobotMap;

/**
 *
 */
public class Auto1 extends Command {
	int x;
	int count;
	boolean done = false;
	
    public Auto1() {

        requires(Robot.driveTrain);
        requires(Robot.arm);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	x = 400;
    	count =0;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    		
    		done = true;
    		if (count < x && count < 10){
    			Robot.arm.up(1);
    			count++;
    		}else if (count < x){
    			RobotMap.driveTrainRD.drive(.5, 0);
    			Robot.arm.stop();
    			count++;
    		}else{
    			RobotMap.driveTrainRD.stopMotor();	
    			Robot.arm.stop();
    		}
    	}
    	
    	
    

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
