public class Main {
    public static void main(String[] args) {
        Human[] humans = new Human[9];
        General general = new General("Petro", 54, "Petrov", false);
        Commander commader1 = new Commander("Vlad", 40, "Kyiv", true, general);
        Commander commader2 = new Commander("Yaroslav", 40, "Lviv", false, general);
        Soldier soldier1 = new Soldier("Vasyl", 20, true, 1, commader1);
        Soldier soldier2 = new Soldier("Petro", 25, false, 2, commader1);
        Soldier soldier3 = new Soldier("Dmytro", 30, true, 3, commader1);
        Soldier soldier4 = new Soldier("Serhii", 35, false, 4, commader2);
        Soldier soldier5 = new Soldier("Stas", 18, true, 5, commader2);
        Soldier soldier6 = new Soldier("Max", 39, false, 6, commader2);
        humans[0] = general;
        humans[1] = commader1;
        humans[2] = commader2;
        humans[3] = soldier1;
        humans[4] = soldier2;
        humans[5] = soldier3;
        humans[6] = soldier4;
        humans[7] = soldier5;
        humans[8] = soldier6;


        for(Human human : humans){
            try {
                human.report();
            } catch (ReportException e) {
                e.printStackTrace();
            }
        }
    }
}
