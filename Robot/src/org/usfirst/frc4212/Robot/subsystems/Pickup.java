package org.usfirst.frc4212.Robot.subsystems;

import org.usfirst.frc4212.Robot.OI;
import org.usfirst.frc4212.Robot.RobotMap;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Pickup extends Subsystem {

    private final SpeedController spark3 = RobotMap.pickupSpark;
    private final DigitalInput pickupLS = RobotMap.pickupPickupLS;

    public void initDefaultCommand() {
    }
    /*
     * This raises the elevator
     */
	public void in(double d) {
			spark3.set(d);
	}
	/*
     * This lowers the elevator
     */
	public void out(double d) {
			spark3.set(-d);
	}
	/*
     * This stop motor on the elevator
     */
	public void stop() {
		spark3.set(0);
	}
	/*
     * Checks state of Pickup
     */
	public boolean isPickupDone() {
		return false;
		//return pickupLS.get() || !OI.jB5.get();
	}
	/*
     * Shoot the BALL
     */
	public boolean isShootDone() {
		return false;
		//return !OI.jB6.get();
	}
}

