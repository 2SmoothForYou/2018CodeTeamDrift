/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4091.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;
	
	public static int left1 = 0;
	public static int left2 = 1;
	
	public static int right1 = 2;
	public static int right2 = 3;
	
	public static int actuator = 4;
	
	public static int leftArm = 5;
	public static int rightArm = 6;

	public static int openBrake = 0;
	public static int closeBrake = 1;
	
	public static int firstGear = 2;
	public static int secondGear = 3;
	
	public static int openArm = 4;
	public static int closeArm = 5;
	
	public static int climber = 7;
	
	public static int limitSwitchDown = 0;
	public static int limitSwitchUp = 1;
	
	public static int limitSwitchOpen = 2;
	public static int limitSwitchClosed = 3;
	
	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}
