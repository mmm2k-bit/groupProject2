package com.group2;

public class Main {

    public static void main(String[] args) {
//        Test task #1

	Circle circle = new Circle();
    Square square = new Square();
    double circumference = circle.calculatePerimeter(23.4);
    System.out.format("Circumference of the circle is %.2f",circumference).println();
    double circleArea = circle.calculateArea(34.6);
    System.out.format("Area of the circle is %.2f",circleArea).println();
    double perimeter = square.calculatePerimeter(56);
    System.out.format("Perimeter of the square is %.2f",perimeter).println();
    double squareArea = square.calculateArea(4.6);
    System.out.format("Area of the square is %.2f", squareArea ).println();

    //Test task #2
        StudentA studentA = new StudentA(56.8,34.3,67.9);
        double studentAAverage = studentA.getPercentage(3);
        System.out.format("Grade average for Student A is %.2f ",studentAAverage).println();
        StudentB studentB = new StudentB(45.8,34.0,78.6,99.6);
        double studentBAverage = studentB.getPercentage(4);
        System.out.format("Grade average for Student B is %.2f ", studentBAverage).println();

//    Test task #3

        Car truck = new Truck(2000.0,"blue",2022);
        System.out.println("You can buy this truck for " + truck.calculateSalePrice());
        Sedan sedan = new Sedan(35700,"black",22);
        System.out.println("You can buy this sedan for "+sedan.calculateSalePrice());

//    Test task #4
        Registration registerUser1 = new Registration();
        registerUser1.setEmail("abs@gmail.com");
        Registration registerUser2 = new Registration();
        registerUser2.setEmail("abs@yahoo.com");
        System.out.println(registerUser2.getEmail());
        registerUser1.setUserName("");
        registerUser1.setUserName("234");
        registerUser2.setUserName("johnsnow");
        System.out.println(registerUser2.getUserName());
        registerUser2.setPassword("johnsnow");
        registerUser1.setPassword("2348");
        registerUser1.setPassword("rtertertert");
        System.out.println(registerUser1.getPassword());

//    Test task #5

        IRemoteWebDriver[]drivers={new ChromeDriver(),new FirefoxDriver(),new SafariDriver()};
        for(IRemoteWebDriver d:drivers){
            d.navigate();
            d.open();
            d.getScreenshot();
            d.getTitle();
            d.close();
        }
    }
}
