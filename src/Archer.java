public class Archer extends Hero{

    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " attacks the enemy" + enemy);
    }
}
