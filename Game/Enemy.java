public class Enemy {
    private int enemyHp;
    private int enemyAtk;
    private int enemyDef;
    private int enemySpd;

    /*
     * get; getting enemy stat
     * set; updating enemy stat
     */

    public int getHp() {
        return enemyHp;
    }

    public void setHp(int enemyHp) {
        this.enemyHp = enemyHp;
    }

    public int getAtk() {
        return enemyAtk;
    }

    public void setAtk(int enemyAtk) {
        this.enemyAtk = enemyAtk;
    }

    public int getDef() {
        return enemyDef;
    }

    public void setDef(int enemyDef) {
        this.enemyDef = enemyDef;
    }

    public int getSpd() {
        return enemySpd;
    }

    public void setSpd(int enemySpd) {
        this.enemySpd = enemySpd;
    }

    //Enemy constructor
    public Enemy(int enemyHp, int enemyAtk, int enemyDef, int enemySpd) {
        setHp(enemyHp);
        setAtk(enemyAtk);
        setDef(enemyDef);
        setSpd(enemySpd);
    }

    public void showStatEnemy() {
        System.out.println("\n==== Enemy Stat ====");
        System.out.println("Attack : " + getAtk());
        System.out.println("Defence : " + getDef());
        System.out.println("Speed : " + getSpd());
        System.out.println("====================");
    }
    
}
