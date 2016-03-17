package org.usfirst.frc4212.Robot.subsystems;

import org.usfirst.frc4212.Robot.OI;
import org.usfirst.frc4212.Robot.RobotMap;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Elevator extends Subsystem {

    private final SpeedController spark2 = RobotMap.elevatorSpark;
    private final DigitalInput elevHighLS = RobotMap.elevatorElevHighLS;
    private final DigitalInput elevLowLS = RobotMap.elevatorElevLowLS;

    public void initDefaultCommand() {
    }

    /*
     * This raises the elevator
     */
    public void up(double d) {
    	spark2.set(d);
	}
	/*
     * This lowers the elevator
     */
	public void down(double d) {
		spark2.set(-d);
	}
	/*
     * This stop motor on the elevator
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

