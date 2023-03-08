public class Main {
    public static void main(String[] args) {
        //Создать класс Voter (Избиратель) , содержащий поля имя, адрес, возраст
        //а также конструктор, геттеры и сеттеры.
        //При создании должно быть учтено, что минимальный возраст в Германии для участия в выборах - 16 лет.

        Voter jonathan = new Voter("Jonathan","München, Auweg 1",25);
        System.out.println("The name of the voter is "+jonathan.getName());
        System.out.println("voter lives at "+jonathan.getAddress());
        System.out.println("voter is "+jonathan.getAge()+" years old");


        System.out.println();


        Voter sebastian = new Voter("Sebastian","Günzburg, Augsburger strasse 5",16);
        System.out.println("The name of the voter is "+sebastian.getName());
        System.out.println("voter lives at "+sebastian.getAddress());
        System.out.println("voter is "+sebastian.getAge()+" years old");

        System.out.println();
        sebastian.setAge(15);

        System.out.println("voter is "+sebastian.getAge()+" years old");


    }
}