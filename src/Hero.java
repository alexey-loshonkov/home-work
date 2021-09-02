public class Hero {
    private String name;

    public Hero(String name) {
        this.name = name;
    }

    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " атакует противника " + enemy);
    }

    public String getName() {
        return name;
    }
}
