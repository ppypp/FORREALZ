package org.usfirst.frc4212.Robot;

import org.usfirst.frc4212.Robot.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
import edu.wpi.first.wpilibj.command.Command;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
    public static JoystickButton jB1;
    public static JoystickButton jB2;
    public static JoystickButton jB3;
    public static JoystickButton jB4;
    public static JoystickButton jB5;
    public static JoystickButton jB6;
    public static JoystickButton jB7;
    
    public static JoystickButton jBX1;
    public static JoystickButton jBX2;
    public static JoystickButton jBX3;
    public static JoystickButton jBX4;
    
    public static Joystick left;
//	public static Joystick right;
	public static Joystick xbox;
	
    public OI() {

        left = new Joystick(0);
//        right = new Joystick(1);
        xbox = new Joystick(2);
//        
//        jB7 = new JoystickButton(left, 11);
//        jB7.whenPressed(new Task1());
//        
        //Elevator
//        jB1 = new JoystickButton(left, 3);
//        jB1.whileHeld(new ExtendElev());
//        jB1.whenReleased(new ElevStop());
//        
//        jB2 = new JoystickButton(left, 2);
//        jB2.whileHeld(new RetractElev());
//        jB2.whenReleased(new ElevStop());
        
        jBX1 = new JoystickButton(xbox, 1);
        jBX1.whileHeld(new Lift());
        jBX1.whenReleased(new BallEject());
        
        jBX2 = new JoystickButton(xbox, 3);
        jBX2.whileHeld(new GearRelease());
        jBX2.whenReleased(new BallEject());
        
        //Arm
//        jB3 = new JoystickButton(left, 4);
//        jB3.whileHeld(new RaiseArm());
//        jB3.whenReleased(new ArmStop());
//        
//        jB4 = new JoystickButton(left, 5);
//        jB4.whileHeld(new LowerArm());
//        jB4.whenReleased(new ArmStop());
//        
        jBX3 = new JoystickButton(xbox, 6);
        
        jBX4 = new JoystickButton(xbox, 5);
             
        //Pickup-Shoot
        jB5 = new JoystickButton(left, 7);
        
        jB6 = new JoystickButton(left, 6);
        jB6.whileHeld(new BallShooter());
        jB6.whenReleased(new GearPickup());
        
        // SmartDashboard Buttons
        SmartDashboard.putData("Task1", new Task1());
        SmartDashboard.putData("Auto1", new Auto1());
        SmartDashboard.putData("Auto2", new Auto2());
        SmartDashboard.putData("Lift", new Lift());
        SmartDashboard.putData("Lower", new Lower());
        SmartDashboard.putData("GearPickup", new GearPickup());
        SmartDashboard.putData("GearFlip", new GearFlip());
        SmartDashboard.putData("GearRelease", new GearRelease());
        SmartDashboard.putData("BallIntake", new BallIntake());
        SmartDashboard.putData("BallEject", new BallEject());
        SmartDashboard.putData("BallShooter", new BallShooter());
        
        SmartDashboard.putData("Drive", new Drive());
    }

    public Joystick getJoystick1() {
        return left;
    }
//    public Joystick getJoystick2() {
//        return right;
//    }
}

