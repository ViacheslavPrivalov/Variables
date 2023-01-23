public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1 () {
        System.out.println("Задача 1");

        System.out.println("собаки");
        var dog = 8.0;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        dog -= 3.5;
        System.out.println(dog);

        System.out.println("кошки");
        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        cat -= 1.6;
        System.out.println(cat);

        System.out.println("бумага");
        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
        paper -= 7639;
        System.out.println(paper);
    }

    public static void task2 () {
        System.out.println("Задача 2");

        System.out.println("друг");
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("лягушка");
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);

    }

    public static void task3 () {
        System.out.println("Задача 3");

        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var sumWeight = firstBoxer + secondBoxer;
        System.out.println("Общий вес боксёров " + sumWeight + " кг");
        var diffWeight = firstBoxer - secondBoxer;
        System.out.println("Разница в весе " + diffWeight + " кг");

        diffWeight = secondBoxer - firstBoxer;
        System.out.println("Вычитание = " + diffWeight);
        diffWeight = secondBoxer % firstBoxer;
        System.out.println("Остаток от деления = " + diffWeight);

        var workHours = 640;
        var employeesNumber = workHours / 8;
        System.out.println("Всего работников в компании - " + employeesNumber + " человек");
        employeesNumber += 94;
        workHours = employeesNumber * 8;
        System.out.println("Если в компании работает " + employeesNumber + " человек, то всего " + workHours + " часов работы может быть поделено между сотрудниками");
    }
}