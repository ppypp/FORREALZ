package org.usfirst.frc4212.Robot.subsystems;

import org.usfirst.frc4212.Robot.OI;
import org.usfirst.frc4212.Robot.RobotMap;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Arm extends Subsystem {

    private final SpeedController spark1 = RobotMap.armSpark;
    private final DigitalInput armHighLS = RobotMap.armArmHighLS;
    private final DigitalInput armLowLS = RobotMap.armArmLowLS;

    public void initDefaultCommand() {
    }

    /*
     * This raises the arm
     */
	public void up(double d) {
		spark1.set(d);
	}
	/*
     * This lowers the arm
     */
	public void down(double d) {
		spark1.set(-d);
	}
	/*
     * This stop motor on the arm
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

