package org.usfirst.frc.team4091.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import org.usfirst.frc.team4091.robot.RobotMap;
import org.usfirst.frc.team4091.robot.commands.ArcadeDrive;

/**
 *
 */
public class DriveTrain extends Subsystem {
	
	private Talon left1 = new Talon(RobotMap.left1);
	private Talon left2 = new Talon(RobotMap.left2);
	private Talon left3 = new Talon(RobotMap.left3);
	private SpeedControllerGroup left = new SpeedControllerGroup(left1, left2, left3);

	private Talon right1 = new Talon(RobotMap.right1);
	private Talon right2 = new Talon(RobotMap.right2);
	private Talon right3 = new Talon(RobotMap.right3);
	private SpeedControllerGroup right = new SpeedControllerGroup(right1, right2, right3);

	private DifferentialDrive drive = new DifferentialDrive(left, right);

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    	setDefaultCommand(new ArcadeDrive());
    }
    
    public void arcadeDrive(Joystick driver){
    	drive.arcadeDrive(driver.getRawAxis(1), -driver.getRawAxis(2));
    	
    	
    }

        
    public void stop(){
    	drive.stopMotor();
    }
}
