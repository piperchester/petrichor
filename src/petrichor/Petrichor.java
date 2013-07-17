/**
 * The MIT License (MIT)
 *
 * Copyright (c) 2013 Piper Chester and Michael Timbrook
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package petrichor;
import behavior.Aggressive;
import behavior.Behavior;
import robocode.*;
import java.awt.Color;

/**
 * Petrichor - a robot by Piper Chester and Michael Timbrook
 */
public class Petrichor extends AdvancedRobot
{
    private Behavior active;

	/**
	 * Petrichor's default behavior. Initialization of robot occurs here.
	 */
	public void run() {
	
		setColors(Color.blue, Color.cyan, Color.green); // Body, gun, radar

		// Set behavior
        active = new Aggressive(this);

        // Sit in the behaviors run loop
        while (active.runLoop());

	}

	/**
	 * What to do when you see another robot.
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		active.onScannedRobot(e);
	}

	/**
	 * What to do when you're hit by a bullet.
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		active.onHitByBullet(e);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		active.onHitWall(e);
	}	
}
