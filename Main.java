
public class Main {
    public static void main(String[] args) {
       Bankaccount xristinas = new Bankaccount();
       xristinas.setBalance(1000);
       xristinas.money_withdrawing(100);
       xristinas.money_depositing(500);

       Customer customer = new Customer("Tim", 1000,
               "tim@email.com");
       System.out.println(customer.getName());
       System.out.println(customer.getCreditlimit());
       System.out.println(customer.getEmail());

       Customer secondCustomer = new Customer();
       System.out.println(secondCustomer.getName());
       System.out.println(secondCustomer.getCreditlimit());
       System.out.println(secondCustomer.getEmail());

       Customer thirdCustomer = new Customer("Joe", "joe@email.com");
       System.out.println(thirdCustomer.getName());
       System.out.println(thirdCustomer.getCreditlimit());
       System.out.println(thirdCustomer.getEmail());

       Customer anotherCustomer=thirdCustomer;
       anotherCustomer.setName("Lila");
       System.out.println(anotherCustomer.getName());
       System.out.println(thirdCustomer.getName());

       for (int i = 1; i <= 5; i++) {
           LPAStudent s = new LPAStudent("S92300" + i,
                   switch (i) {
                       case 1 -> "Mary";
                       case 2 -> "Carol";
                       case 3 -> "Tim";
                       case 4 -> "Harry";
                       case 5 -> "Lisa";
                       default -> "Anonymous";
                   },
                   "05/11/1985",
                   "Java Masterclass");
           System.out.println(s);
       }

       Student pojoStudent = new Student("S923006", "Ann",
               "05/11/1985", "Java Masterclass");
       LPAStudent recordStudent = new LPAStudent("S923007", "Bill",
               "05/11/1985", "Java Masterclass");

       System.out.println(pojoStudent);
       System.out.println(recordStudent);

       pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");

       System.out.println(pojoStudent.getName() + " is taking " +
               pojoStudent.getClassList());
       System.out.println(recordStudent.name() + " is taking " +
               recordStudent.classList());

       Point point1= new Point(1,1);
       Point point2= new Point(3,3);
       System.out.println("Distance is : "+ point1.distance(3,3));
       System.out.println("Distance is : "+ point1.distance(point2));

       Animal animal = new Animal("Generic Animal", "Huge", 400);
       doAnimalStuff(animal, "slow");
       Dog dog = new Dog();
       doAnimalStuff(dog, "fast");

       Dog yorkie = new Dog("Yorkie", 15);
       doAnimalStuff(yorkie, "fast");
       Dog retriever = new Dog("Labrador Retriever", 65,
               "Floppy", "Swimmer");
       doAnimalStuff(retriever, "slow");
       Dog kanis = new Dog("kanis",20);
       System.out.println(kanis);

        ComputerCase theCase = new ComputerCase("2208", "Dell", "240");
        Monitor theMonitor = new Monitor("27inch Beast","Acer",27,"250x1440");
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
        PersonalComputer thePC = new PersonalComputer("2208", "Dell", theCase, theMonitor, theMotherboard);
   }

       public static void doAnimalStuff(Animal animal, String speed) {

           animal.makeNoise();
           animal.move(speed);
           System.out.println(animal);
           System.out.println("_ _ _ _");
       }
}