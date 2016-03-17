package org.usfirst.frc4212.Robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc4212.Robot.Robot;

/**
 *
 */
public class LowerArm extends Command {


    public LowerArm() {
        requires(Robot.arm);

    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.arm.down(Robot.ASPEED);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return Robot.arm.isDoneDown();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.arm.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.arm.stop();
    }
}
