public abstract class Human implements Available{
    private final String name;
    private int age;
    public abstract boolean isWarAble();
    public abstract void setWarAble(boolean flag);
    public abstract Human getBoss();

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean warAble() throws WarException {
        if(this.age > 90)
            throw new WarException("Солдат занадто старий!");
        return this.isWarAble();
    }

    @Override
    public void report() throws ReportException {
        if(this.getBoss() == null)
            throw new ReportException("Не знайдено боса");
        System.out.println(this.name + " Перебуває у підпорядкуванні - " + this.getBoss().name);
        System.out.println("Можливість воювати - " + isWarAble());
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
