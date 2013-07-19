package behavior;

import robocode.AdvancedRobot;
import robocode.HitByBulletEvent;
import robocode.HitWallEvent;
import robocode.ScannedRobotEvent;

public class Evasive implements Behavior {

    private AdvancedRobot me;

    public Evasive(AdvancedRobot r) {
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
        me.turnLeft(180);
        me.back(50);
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
