public class Main {
    public static void main(String[] args) {
        System.out.println();
        int age = 33;
        if (age >= 18) {
            System.out.println("Если возраст человека равен, " + age + " то он совершеннолетний. ");
        } else {
            System.out.println("Если возраст человека равен, " + age +
                    " то он не достиг совершенолетия, нужно немного подождать.");
        }

        int temperatures = 11;
        if (temperatures < 5) {
            System.out.println("На улице " + temperatures + ", то нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperatures + ", то можно идти без шапки.");
        }

        int speed = 111;
        boolean fine = speed > 60;
        if (fine) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф. ");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно. ");
        }

        int yearsOld = 23;
        if (yearsOld >= 2 && yearsOld <= 6) {
            System.out.println("Если возраст человека равен, " + yearsOld + " то ему нужно ходить в садик. ");
        }
        if (yearsOld >= 7 && yearsOld <= 17) {
            System.out.println("Если возраст человека равен, " + yearsOld + " то ему нужно ходить в школу. ");
        }
        if (yearsOld >= 18 && yearsOld <= 24) {
            System.out.println("Если возраст человека равен, " + yearsOld + " то ему нужно ходить в университет. ");
        } else {
            System.out.println("Если возраст человека равен, " + yearsOld + " то ему нужно ходить на работу. ");
        }

        int child = 76;
        if (child < 5){
            System.out.println("Если возраст ребенка равен, " + child + " то он не может кататься на аттракционе. ");
        }
        if (child >= 5 && child < 14) {
            System.out.println("Если возраст ребенка равен, " + child + ", " +
                    "то он может кататься только в сопровождении взрослого. " + "Если взрослого нет,то кататься нельзя.");
        }
        if (child >= 14){
            System.out.println("Если возраст ребенка равен, " + child + " то он может кататься без сопровождения взрослого. ");
        }




        }
    }