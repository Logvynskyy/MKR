public class Commander extends Human{
    private String place;
    private boolean warAble;
    private General boss;

    public Commander(String name, int age, String place, boolean isWarAble, General boss) {
        super(name, age);
        this.place = place;
        this.warAble = isWarAble;
        this.boss = boss;
    }

    public void setPlace(String place){
        this.place = place;
    }

    @Override
    public boolean isWarAble() {
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
        return super.toString() + "Commander{" +
                "place='" + place + '\'' +
                ", warAble=" + warAble +
                ", boss=" + boss.getSurname() +
                '}';
    }
}
