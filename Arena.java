public class Arena {

    public static void main(String[] args) {
        
        Monster balrog = new Monster("Balrog");
        Monster gollum = new Monster("Gollum");

        System.out.println("Le combat oppose : " + balrog.getName() + " et " + gollum.getName());

        while (!(balrog.isKO() || gollum.isKO())) {

            balrog.takeHit(gollum.getAttack());
            gollum.takeHit(balrog.getAttack());
        }
    }
}