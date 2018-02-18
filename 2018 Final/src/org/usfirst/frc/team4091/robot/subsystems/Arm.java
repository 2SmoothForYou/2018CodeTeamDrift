package org.usfirst.frc.team4091.robot.subsystems;

import org.usfirst.frc.team4091.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Arm extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	private Talon left = new Talon(RobotMap.leftArm);
	private Talon right = new Talon(RobotMap.rightArm);
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void kick(){
    	right.set(.5);
    	left.set(-.5);
    }
    
    public void suck(){
    	right.set(-.5);
    	left.set(.5);
    }
    
    public void stop(){
    	right.set(0);
    	left.set(0);
    }
    
}

