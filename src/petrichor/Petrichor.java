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
import robocode.*;
import java.awt.Color;

/**
 * Petrichor - a robot by Piper Chester and Michael Timbrook
 */
public class Petrichor extends AdvancedRobot
{
	/**
	 * Petrichor's default behavior. Initialization of robot occurs here.
	 */
	public void run() {
	
		setColors(Color.blue, Color.cyan, Color.green); // Body, gun, radar

		// Robot main loop.
		while(true) {
			ahead(100);
			turnGunRight(360);
			back(100);
			turnGunRight(360);
		}
	}

	/**
	 * What to do when you see another robot.
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		fire(5);
	}

	/**
	 * What to do when you're hit by a bullet.
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		back(10);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		back(20);
	}	
}
