package org.usfirst.frc4212.Robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc4212.Robot.Robot;

/**
 *
 */
public class IntakePickup extends Command {


    public IntakePickup() {
        requires(Robot.pickup);

    }

    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.pickup.in(Robot.PSPEED);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return (Robot.pickup.isPickupDone()); // Should be checking if button is still helf
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.pickup.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
