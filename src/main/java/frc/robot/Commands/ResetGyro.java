package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Subsystems.DriveSubsystem;

public class ResetGyro extends Command 
{
    private final DriveSubsystem driveSubsystem;

    public ResetGyro(DriveSubsystem driveSubsystem)
    {
        this.driveSubsystem = driveSubsystem;
        addRequirements(driveSubsystem);
    }

    @Override
    public void initialize()
    {
        System.out.println("DriveSubsystem started");

    }

    @Override
    public void execute()
    {
        driveSubsystem.zeroHeading();
    }

    @Override
    public void end(boolean interrupted)
    {
        System.out.println("DriveSubsystem ended");
    }

    @Override
    public boolean isFinished()
    {
        return false;
    }
}