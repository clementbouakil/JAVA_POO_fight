public class Monster {

    private String name;
    private int attack;
    private int life;

    // constructeurs
    public Monster(String name, int attack, int life) {
        this.name = name;
        this.attack = attack;
        this.life = life;
    }

    public Monster(String name) {
        this.name = name;
        this.attack = 33;
        this.life = 100;
    }

    // setters & getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    // Les méthodes
    public void takeHit(int hit) {
        this.life = Math.max(this.life - hit, 0);
        System.out.println(this.name + " has " + this.life + " points remaining.");
    }

    public boolean isKO() {
        if (this.life == 0) {
            System.out.println(this.name + " is KO !");
            return true;
        } else {
            return false;
        }
    }
}