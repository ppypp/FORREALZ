package org.usfirst.frc4212.Robot.subsystems;

import org.usfirst.frc4212.Robot.OI;
import org.usfirst.frc4212.Robot.RobotMap;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class GearModule extends Subsystem {

    private final SpeedController spark2 = RobotMap.gearSpark;

    public void initDefaultCommand() {
    }

    /*
     * This picks up the gears
     */
    public void pickup(double d) {
    	spark2.set(d);
	}
	/*
     * This flips the gear up
     */
	public void flip(double d) {
		spark2.set(-d);
	}
	/*
     * This release of gear
     */
	public void release(double d) {
		spark2.set(-d);
	}
	/*
     * This stop motor 
     */
	public void stop() {
		spark2.set(0);
	}
	/*
     * The UP stop condition
     */
	public boolean isDoneUp() {
		return false;
		//return elevHighLS.get() || !OI.jB1.get();
	}
	/*
     * The DOWN stop condition
     */
	public boolean isDoneDown() {
		return false;
		//return elevLowLS.get() || !OI.jB2.get();
	}
}

