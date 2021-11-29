public class Soldier extends Human{
    private int yearsOfExperience;
    private boolean warAble;
    private Commander boss;

    public Soldier(String name, int age, boolean warAble, int yearsOfExperience, Commander boss) {
        super(name, age);
        this.yearsOfExperience = yearsOfExperience;
        this.warAble = warAble;
        this.boss = boss;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        if(yearsOfExperience > this.yearsOfExperience)
            this.yearsOfExperience = yearsOfExperience;
    }

    public void setBoss(Commander boss) {
        this.boss = boss;
    }

    @Override
    public boolean isWarAble(){
        return warAble;
    }

    @Override
    public void setWarAble(boolean flag) {
        warAble = flag;
    }

    @Override
    public Human getBoss() {
        return boss;
    }

    @Override
    public String toString() {
        return  super.toString() + "Soldier{" +
                "yearsOfExperience=" + yearsOfExperience +
                ", warAble=" + warAble +
                ", boss=" + boss +
                '}';
    }
}
