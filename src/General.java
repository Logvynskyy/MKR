public class General extends Human{
    private String surname;
    private boolean warAble;

    public General(String name, int age, String surname, boolean isWarAble) {
        super(name, age);
        this.surname = surname;
        this.warAble = isWarAble;
    }

    public String  getSurname() {
        return surname;
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
        return this;
    }

    @Override
    public String toString() {
        return super.toString() + "General{" +
                "surname='" + surname + '\'' +
                ", warAble=" + warAble +
                '}';
    }
}
