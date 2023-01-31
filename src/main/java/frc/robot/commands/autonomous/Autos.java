// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.autonomous;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.Commands;

// Import all subsystems for auton use
import frc.robot.subsystems.*;

public final class Autos {
  
  /** Example static factory for an autonomous command. */
  public static CommandBase exampleAuto(Object subsystem) {
    return Commands.sequence(null);
  }

  private Autos() {
    throw new UnsupportedOperationException("This is a utility class!");
  }
}