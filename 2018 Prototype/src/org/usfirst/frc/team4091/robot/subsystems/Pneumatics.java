package org.usfirst.frc.team4091.robot.subsystems;

import org.usfirst.frc.team4091.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Pneumatics extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	DoubleSolenoid armSolenoid = new DoubleSolenoid(RobotMap.openArm, RobotMap.closeArm);
	DoubleSolenoid gearSolenoid = new DoubleSolenoid(RobotMap.firstGear, RobotMap.secondGear);
	DoubleSolenoid brakeSolenoid = new DoubleSolenoid(RobotMap.openBrake, RobotMap.closeBrake);
			
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void toggleArm(){
    	if(armSolenoid.get() == DoubleSolenoid.Value.kOff){
    		armSolenoid.set(DoubleSolenoid.Value.kForward);
    	} else if(armSolenoid.get() == DoubleSolenoid.Value.kForward){
    		armSolenoid.set(DoubleSolenoid.Value.kReverse);
    	} else if(armSolenoid.get() == DoubleSolenoid.Value.kReverse){
    		armSolenoid.set(DoubleSolenoid.Value.kForward);
    	}
    }
    
    public void switchGear(){
    	if(gearSolenoid.get() == DoubleSolenoid.Value.kOff){
    		gearSolenoid.set(DoubleSolenoid.Value.kForward);
    	} else if(gearSolenoid.get() == DoubleSolenoid.Value.kForward){
    		gearSolenoid.set(DoubleSolenoid.Value.kReverse);
    	} else if(gearSolenoid.get() == DoubleSolenoid.Value.kReverse){
    		gearSolenoid.set(DoubleSolenoid.Value.kForward);
    	}
    }

    public void switchBrake(){
    	if(brakeSolenoid.get() == DoubleSolenoid.Value.kOff){
    		brakeSolenoid.set(DoubleSolenoid.Value.kForward);
    	} else if(brakeSolenoid.get() == DoubleSolenoid.Value.kForward){
    		brakeSolenoid.set(DoubleSolenoid.Value.kReverse);
    	} else if(brakeSolenoid.get() == DoubleSolenoid.Value.kReverse){
    		brakeSolenoid.set(DoubleSolenoid.Value.kForward);
    	}
    }
    
}

