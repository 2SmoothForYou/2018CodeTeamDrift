package org.usfirst.frc.team4091.robot.subsystems;

import org.usfirst.frc.team4091.robot.RobotMap;
import org.usfirst.frc.team4091.robot.commands.Drive;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *
 */
public class DriveTrain extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	private Talon left1 = new Talon(RobotMap.left1);
	private Talon left2 = new Talon(RobotMap.left2);
	private Talon left3 = new Talon(RobotMap.left3);
	SpeedControllerGroup left = new SpeedControllerGroup(left1, left2, left3);
	
	private Talon right1 = new Talon(RobotMap.right1);
	private Talon right2 = new Talon(RobotMap.right2);
	private Talon right3 = new Talon(RobotMap.right3);
	SpeedControllerGroup right = new SpeedControllerGroup(right1, right2, right3);
	
	DifferentialDrive drive = new DifferentialDrive(left, right);
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new Drive());
    }
    
    public void drive(Joystick stick){
    	drive.arcadeDrive(stick.getRawAxis(0), stick.getRawAxis(2));
    }
    
    public void stop(){
    	drive.arcadeDrive(0, 0);
    }
    
}

