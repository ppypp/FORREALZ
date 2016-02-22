package org.usfirst.frc4212.Robot.commands;

import org.usfirst.frc4212.Robot.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Task1 extends CommandGroup {

    public Task1() {
    	requires(Robot.pickup);
    	requires(Robot.elevator);
    	requires(Robot.arm);
    } 
}
