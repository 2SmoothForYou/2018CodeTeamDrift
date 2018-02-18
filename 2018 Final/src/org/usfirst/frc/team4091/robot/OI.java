/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4091.robot;

import org.usfirst.frc.team4091.robot.commands.Kick;
import org.usfirst.frc.team4091.robot.commands.Suck;
import org.usfirst.frc.team4091.robot.commands.SwitchGear;
import org.usfirst.frc.team4091.robot.commands.ToggleArm;
import org.usfirst.frc.team4091.robot.commands.ToggleBrake;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	static Joystick stick = new Joystick(0);
	static Joystick armStick = new Joystick(1);
	
	static Button kickButton = new JoystickButton(armStick, 8);
	static Button suckButton = new JoystickButton(armStick, 7);
	
	static Button armButton = new JoystickButton(armStick, 5);
	
	static Button brakeButton = new JoystickButton(armStick, 2);
	
	static Button gearButton = new JoystickButton(stick, 1);
	
	public static Joystick getStick(){
		return stick;
	}
	
	public static Joystick getArmStick(){
		return armStick;
	}
	
	public OI(){
		kickButton.whileHeld(new Kick());
		suckButton.whileHeld(new Suck());
		armButton.whenPressed(new ToggleArm());
		brakeButton.whenPressed(new ToggleBrake());
		gearButton.whenPressed(new SwitchGear());
	}
	
	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
}
