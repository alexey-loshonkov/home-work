public class ArenaRunner {
    public static void main(String[] args) {
        Hero archer = new Archer("Lego");
        Hero warrior = new Warrior("War");
        Hero mage = new Mage("Gend");
        Enemy enemy = new Enemy("Zombie", 100);

        attackEnemy(enemy,archer, warrior, mage);

    }

    private static void attackEnemy(Enemy enemy, Hero... heroes) {
        for (Hero hero : heroes) {
            hero.attackEnemy(enemy);
        }
        }
}
