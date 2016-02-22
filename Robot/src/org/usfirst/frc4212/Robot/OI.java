package org.usfirst.frc4212.Robot;

import org.usfirst.frc4212.Robot.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;


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
    public static Joystick joystick1;

    public OI() {

        joystick1 = new Joystick(0);
        
        jB7 = new JoystickButton(joystick1, 11);
        jB7.whenPressed(new Task1());
        
        jB1 = new JoystickButton(joystick1, 4);
        jB1.whileHeld(new ExtendElev());
        jB1.whenReleased(new ElevStop());
        
        jB2 = new JoystickButton(joystick1, 5);
        jB2.whileHeld(new RetractElev());
        jB2.whenReleased(new ElevStop());
        
        jB3 = new JoystickButton(joystick1, 1);
        jB3.whileHeld(new RaiseArm());
        jB3.whenReleased(new ArmStop());
        
        jB4 = new JoystickButton(joystick1, 2);
        jB4.whileHeld(new LowerArm());
        jB4.whenReleased(new ArmStop());
        
        jB5 = new JoystickButton(joystick1, 3);
        jB5.whileHeld(new IntakePickup());
        jB5.whenReleased(new PickupStop());
        
        jB6 = new JoystickButton(joystick1, 7);
        jB6.whileHeld(new ShootPickup());
        jB6.whenReleased(new PickupStop());
        
        // SmartDashboard Buttons
        SmartDashboard.putData("Task1", new Task1());
        SmartDashboard.putData("Auto1", new Auto1());
        SmartDashboard.putData("Auto2", new Auto2());
        SmartDashboard.putData("ExtendElev", new ExtendElev());
        SmartDashboard.putData("RetractElev", new RetractElev());
        SmartDashboard.putData("RaiseArm", new RaiseArm());
        SmartDashboard.putData("LowerArm", new LowerArm());
        SmartDashboard.putData("IntakePickup", new IntakePickup());
        SmartDashboard.putData("ShootPickup", new ShootPickup());
        SmartDashboard.putData("Drive", new Drive());
    }

    public Joystick getJoystick1() {
        return joystick1;
    }
}

