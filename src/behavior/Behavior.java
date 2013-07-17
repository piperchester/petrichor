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

package behavior;
import robocode.HitByBulletEvent;
import robocode.HitWallEvent;
import robocode.ScannedRobotEvent;

public interface Behavior {
    /**
     * The run loop is your behaviors continuous action is happenin'
     * This loop will return true while the behavior should be running, when you
     * return false be ready to switch behavior and instantiate the new behavior.
     * @return decision to keep running
     */
    public boolean runLoop();

    /**
     * See Robocode docs for the following...
     * TODO pass everything to behaviors without explicitly defining
     * @param e
     */
    public void onScannedRobot(ScannedRobotEvent e);
    public void onHitByBullet(HitByBulletEvent e);
    public void onHitWall(HitWallEvent e);
}
