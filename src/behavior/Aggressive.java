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

import robocode.AdvancedRobot;
import robocode.HitByBulletEvent;
import robocode.HitWallEvent;
import robocode.ScannedRobotEvent;

public class Aggressive implements Behavior {

    private AdvancedRobot me;

    public Aggressive(AdvancedRobot r) {
        this.me = r;
    }

    @Override
    public boolean runLoop() {

        me.ahead(50);
        me.setTurnGunLeft(360);
        me.turnLeft(30);

        return true;
    }

    @Override
    public void onScannedRobot(ScannedRobotEvent e) {
        me.fire(3);
    }

    @Override
    public void onHitByBullet(HitByBulletEvent e) {
        double heading = e.getHeading();
        double meHead = me.getHeading();
        me.turnLeft(meHead - heading);
    }

    @Override
    public void onHitWall(HitWallEvent e) {

    }
}
