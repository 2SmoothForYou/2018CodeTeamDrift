package org.usfirst.frc.team4091.robot.subsystems;

import org.usfirst.frc.team4091.robot.OI;
import org.usfirst.frc.team4091.robot.RobotMap;
import org.usfirst.frc.team4091.robot.commands.Actuator;

import edu.wpi.first.wpilibj.DigitalInput;
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
	
	private Talon actuator = new Talon(RobotMap.actuator);
	
	private DigitalInput limitSwitchOpen = new DigitalInput(RobotMap.limitSwitchOpen);
	private DigitalInput limitSwitchClosed = new DigitalInput(RobotMap.limitSwitchClosed);
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new Actuator());
    }
    
    public void kick(){
    	right.set(1);
    	left.set(-1);
    }
    
    public void suck(){
    	right.set(-1);
    	left.set(1);
    }
    
    public void stop(){
    	right.set(0);
    	left.set(0);
    }
    
    public void moveActuator(){
    	//actuator.set(OI.getArmStick().getRawAxis(3)/2.0);
    	if(!limitSwitchOpen.get() && OI.getArmStick().getRawAxis(3) < 0){
    		actuator.set(0);
    	} else if(!limitSwitchClosed.get() && OI.getArmStick().getRawAxis(3) > 0){
    		actuator.set(0);
    	} else {
    		actuator.set(-OI.getArmStick().getRawAxis(3)/2.0);
    	}
    }
    
}

