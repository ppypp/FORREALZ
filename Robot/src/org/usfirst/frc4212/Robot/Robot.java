package org.usfirst.frc4212.Robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import org.usfirst.frc4212.Robot.commands.*;
import org.usfirst.frc4212.Robot.subsystems.*;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

    Command autonomousCommand;

	public final static double ASPEED = 1;
	public final static double ESPEED = 1;
	public final static double PSPEED = 1;
	
    
    //Drive and Lift
    public static DriveTrain driveTrain;
    //Lift
    public static LiftModule lift;
    //Balls
    public static BallModule ball;
    //Gears
    public static GearModule gear;
    
    public static OI oi;

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    	RobotMap.init();
    	
        driveTrain = new DriveTrain();
        
        lift = new LiftModule();
        
        ball = new BallModule();
        
        gear = new GearModule();
        
        //OI MUST BE LAST TO BE MADE
        oi = new OI();
        
        //AUTO Mode
        autonomousCommand = new Auto1();
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    public void disabledInit(){
    }

    public void disabledPeriodic() {
        Scheduler.getInstance().run();
    }

    public void autonomousInit() {
        // schedule the autonomous command (example)
        if (autonomousCommand != null) autonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
    	//Cancels AUTO if it isn't off yet
        if (autonomousCommand != null) autonomousCommand.cancel();
        
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }

    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
