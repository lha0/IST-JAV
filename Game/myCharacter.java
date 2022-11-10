public abstract class myCharacter implements Training {
    private int hp;
    private int atk;
    private int def;
    private int spd;
    private int eur;
    private int runCard;
    private int level;
    private String tech1;
    private String tech2;
    private String tech3;

    /*
     * get; getting each stat
     * set; updating each stat
     */

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getSpd() {
        return spd;
    }

    public void setSpd(int spd) {
        this.spd = spd;
    }

    public int getEur() {
        return eur;
    }

    public void setEur(int eur) {
        this.eur = eur;
    }

    public int getRA() {
        return runCard;
    }

    public void setRA(int runCard) {
        this.runCard = runCard;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getTech1() {
        return tech1;
    }

    public void setTech1(String tech1) {
        this.tech1 = tech1;
    }

    public String getTech2() {
        return tech2;
    }

    public void setTech2(String tech2) {
        this.tech2 = tech2;
    }

    public String getTech3() {
        return tech3;
    }

    public void setTech3(String tech3) {
        this.tech3 = tech3;
    }

    public void showStat() {
        System.out.println("\n===== My Stat =====");
        System.out.println("Hp : " + hp);
        System.out.println("Attack : " + atk);
        System.out.println("Defence : " + def);
        System.out.println("Speed : " + spd);
        System.out.println("Money : " + eur);
        System.out.println("Run Card : " + runCard);
        System.out.println("Level: " + level);
        System.out.println("====================");
    }
}


