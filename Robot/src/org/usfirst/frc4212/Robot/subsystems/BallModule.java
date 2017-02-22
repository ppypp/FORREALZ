package org.usfirst.frc4212.Robot.subsystems;

import org.usfirst.frc4212.Robot.OI;
import org.usfirst.frc4212.Robot.RobotMap;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class BallModule extends Subsystem {

    private final SpeedController spark1 = RobotMap.ballPickupSpark;
    private final SpeedController spark2 = RobotMap.ballShooterSpark;

    public void initDefaultCommand() {
    }

    /*
     * This intakes ball
     */
	public void intake(double d) {
		spark1.set(d);
	}
	/*
     * This ejects ball
     */
	public void eject(double d) {
		spark1.set(-d);
	}
	/*
     * This shoots ball
     */
	public void shoot(double d) {
		spark1.set(-d);
	}
	/*
     * This stops both motors 
     */
	
	public void stop() {
		spark1.set(0);
	}
	/*
     * The UP stop condition
     */
	public boolean isDoneUp() {
		return false;
		//return armHighLS.get() || !OI.jB3.get();
	}
	/*
     * The DOWN stop condition
     */
	public boolean isDoneDown() {
		return false;
		//return armLowLS.get() || !OI.jB4.get();
	}
}

