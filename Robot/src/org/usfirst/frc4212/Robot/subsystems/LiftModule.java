package org.usfirst.frc4212.Robot.subsystems;

import org.usfirst.frc4212.Robot.OI;
import org.usfirst.frc4212.Robot.RobotMap;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class LiftModule extends Subsystem {

    private final SpeedController spark1 = RobotMap.lift1Spark;
    private final SpeedController spark2 = RobotMap.lift2Spark;

    public void initDefaultCommand() {
    }
    /*
     * This raises the elevator
     */
	public void up(double d) {
			spark1.set(d);
	}
	/*
     * This lowers the elevator
     */
	public void down(double d) {
			spark1.set(-d);
	}
	/*
     * This stop motor on the elevator
     */
	public void stop() {
		spark1.set(0);
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

