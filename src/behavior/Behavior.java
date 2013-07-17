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
