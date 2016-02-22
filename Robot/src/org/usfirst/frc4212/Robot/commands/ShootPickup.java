package org.usfirst.frc4212.Robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc4212.Robot.Robot;

/**
 *
 */
public class ShootPickup extends Command {

	public ShootPickup() {
        requires(Robot.pickup);
    }

    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.pickup.out(Robot.PSPEED);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return (Robot.pickup.isShootDone()); // When button released
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.pickup.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.pickup.stop();
    }
}
