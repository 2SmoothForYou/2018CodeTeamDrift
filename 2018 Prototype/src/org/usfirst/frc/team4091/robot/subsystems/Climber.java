package org.usfirst.frc.team4091.robot.subsystems;

import org.usfirst.frc.team4091.robot.RobotMap;
import org.usfirst.frc.team4091.robot.commands.OperateClimber;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Climber extends Subsystem {

	Talon climber = new Talon(RobotMap.climber);
	
	private DigitalInput limitSwitchDown = new DigitalInput(RobotMap.limitSwitchDown);
	private DigitalInput limitSwitchUp = new DigitalInput(RobotMap.limitSwitchUp);
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new OperateClimber());
    }
    
    public void operateClimber(Joystick stick) {
    	//climber.set(-stick.getRawAxis(1));
    	if(!limitSwitchDown.get() && stick.getRawAxis(1) > 0){
    		climber.set(0);
    	} else if(!limitSwitchUp.get() && stick.getRawAxis(1) < 0){
    		climber.set(0);
    	} else {
    		climber.set(-stick.getRawAxis(1));
    	}

    }
    
    public void stopClimber(){
    	climber.set(0);
    }
    
}

