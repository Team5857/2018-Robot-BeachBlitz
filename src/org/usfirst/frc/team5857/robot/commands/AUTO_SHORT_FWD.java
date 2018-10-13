package org.usfirst.frc.team5857.robot.commands;

import org.usfirst.frc.team5857.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class AUTO_SHORT_FWD extends Command {

	public AUTO_FWD() {
		super("AUTO_SHORT_FWD");
		requires(Robot.driveTrain);
	}
	
	protected void initialize() {}
	
	protected void execute()
	{
		Robot.driveTrain.autoDriveForward(1, 1, 1, 3);
	}
	
	protected boolean isFinished() {
		return true;
	}
	
	protected void end() {}
	
	protected void interrupted()
	{
		end();
	}

}