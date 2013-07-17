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
