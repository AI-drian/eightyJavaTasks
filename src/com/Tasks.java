package com;

import java.awt.geom.Area;
import java.util.Scanner;

public class Tasks {

    //Input squared
    public static void nr1() {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Your number squared = " + (number * number));
    }

    //Salesmen Salary Calculator
    public static void nr2() {
        System.out.println("Enter sales amount for this month: ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        double commission = sales * 0.09;
        int basic = 8000;
        System.out.println("Your total income this month is " + (basic + commission));
    }

    //Hour to minute & second converter
    public static void nr3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of hours:");
        int hrs = scanner.nextInt();
        int min = hrs * 60;
        int sec = min * 60;
        System.out.println(hrs + " hours = " + min + "minutes, or " + sec + "seconds");
    }

    //Sum and mean of three input values
    public static void nr4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int total = (a + b + c);
        double avg = (total / 3);
        System.out.println("Your total is: " + total);
        System.out.println("Your average is: " + avg);
    }

    //Currency converter
    public static void nr5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your amount of Sek:");
        double sek = scanner.nextDouble();
        double usd = sek / 6;
        double gbp = sek / 10;
        System.out.println("You've got:");
        System.out.println(usd + " USD");
        System.out.println(gbp + " GBP");
    }

    //Input a3x*7 equation
    public static void nr6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value for variable 'a' and 'x':");
        int a = scanner.nextInt();
        int x = scanner.nextInt();
        x = x * 3;
        int function = a * x + 7;
        System.out.println("Result: " + function);
    }

    //Gas station price
    public static void nr7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many liters of gas you need: ");
        int liter = scanner.nextInt();
        int pricePerLiter = 14;
        int sum = liter * pricePerLiter;
        double discount = sum * 0.05;
        double finalPrice = sum - discount;
        System.out.println("Price: " + sum + ":-");
        System.out.println("Nice price discount 5%: " + finalPrice + ":-");
    }

    //Area and circumference of rectangle
    public static void nr8() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base and height in cm for a rectangle: ");
        int base = scanner.nextInt();
        int height = scanner.nextInt();
        int area = base * height;
        int ccf = base + base + height + height;
        System.out.println("Area = " + area + "cm2");
        System.out.println("circumference =" + ccf + "cm");
    }

    //Area, circumference, diameter of circle
    public static void nr9() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the circle's radius:");
        double radius = scanner.nextDouble();
        double pi = 3.14;
        double diameter = 2 * radius;
        double area = radius * radius * pi;
        double circumference = pi * diameter;
        System.out.println("Diameter: " + diameter + "cm");
        System.out.println("Area:" + area + "cm2");
        System.out.println("Circumference: " + circumference + "cm");
    }

    //Fahrenheit -2- Celsius
    public static void nr10() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter fahrenheit: ");
        double fahr = scanner.nextInt();
        double cels = (fahr - 32.0) * 5.0 / 9.0;
        System.out.println(fahr + " Fahrenheit = " + cels + " Celsius");
    }

    //Only print if first number is higher
    public static void nr11() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println(a);
        }
    }

    //If first number more than twice the size of second it's too big
    public static void nr12() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a / 2 > b) {
            System.out.println("Too Big!");
        }
    }

    //Check if even number
    public static void nr13() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = scanner.nextInt();

        if (a % 2 == 0) {
            System.out.println("It's an even number!");
        }
    }

    //Check if even or odd number
    public static void nr14() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = scanner.nextInt();

        if (a % 2 == 0) {
            System.out.println("It's an even number!");
        } else {
            System.out.println("It's an uneven number!");
        }
    }

    //Check if first number can be evenly split with second nr.
    public static void nr15() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a % b == 0) {
            System.out.println("Great, even division!");
        }
    }


    //10% discount if above 1000:-, and quantity)
    public static void nr16() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter price of product:");
        System.out.println("Enter quantity:");
        double price = scanner.nextDouble(); //price per item
        double quantity = scanner.nextDouble(); //number of that item
        double total = price * quantity;

        if (total > 1000) {
            double discount = total * 0.10; //count 10% off total
            System.out.println("Total Price: " + total + ":- Discount: " + discount + ":- Final price: " + (total - discount));
        } else {
            System.out.println("Sorry no discount for you, Final price: " + total);
        }
    }

    //Write a function that reads two numbers and divides the first number by the second number.
    //If the second number (denominator) is 0, an error message must be given, otherwise the quota must be printed.
    public static void nr17() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (y == 0) {
            System.out.println("ERROR DIVIDE BY ZERO NOT ALLOWED");
        } else {
            int z = x / y;
            System.out.println(z);
        }
    }

    //Construct a function where values of the variables X and Y are read in.
    // Assign variable A to the value 2 if X is greater than 5 + Y, otherwise assign A to the value 5. Print variable A.
    public static void nr18() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value x:");
        System.out.println("Enter value y:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int a;

        if (x > y + 5) {
            a = 2;
        } else {
            a = 5;
        }
        System.out.println(a);
    }

    //Overtime Calculator
    public static void nr19() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many hours you've worked this week:");
        int hoursWorked = scanner.nextInt(); //number of horus worked.
        int hourlyPay = 200; //sek/hour
        double salary = hourlyPay * hoursWorked; //Salary = time you've worked multiplied with hourly wage.

        if (hoursWorked > 40) {
            int overtime = hoursWorked - 40; //calculating how many hours overtime you've worked
            double ob = hourlyPay * 1.5; // 50% higher hourly pay for overtime.
            salary = salary + overtime * ob; //adding overtime payment to your initial 40 hours.
            System.out.println("You've worked overtime, paycheck:" + salary);
        } else {
            System.out.println("Paycheck:" + salary);
        }
    }

    // If between 1-9 print square, else error
    public static void nr20() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value x:");
        int x = scanner.nextInt();
        if (x >= 0 && x <= 9) {
            System.out.println(x * x);
        } else {
            System.out.println("ERROR CANNOT CALCULATE!");
        }
    }

    //Check if below -10 or above +10
    public static void nr21() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        if (number < -10) {
            System.out.println("Your number is lower than -10");
        } else if (number > 10) {
            System.out.println("Your number is higher than 10");
        } else {
            System.out.println("That's a standard number, thumbs up!");
        }
    }

    //Between 0-9 but not 5
    public static void nr22() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = scanner.nextInt();

        if (a > 0 && a <= 4) {
            System.out.println("Good number.");
        } else if (a >= 6 && a <= 9) {
            System.out.println("Great number.");
        } else {
            System.out.println("Shitty number.");
        }
    }

    //div with 3, but not 30.
    public static void nr23() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = scanner.nextInt();

        if (x % 3 == 0 && x % 30 != 0) { //Number 33 for example
            System.out.println("Oddly and unevenly divided by 3 not 30!");
            x = x / 3;
            System.out.println("Your number is now equal to: " + x);
        }
    }

    //Body temp
    public static void nr24() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your body temperature:");
        int temp = scanner.nextInt();

        if (temp <= 35) {
            System.out.println("Dude go inside you are cold!");
        } else if (temp >= 42) {
            System.out.println("Dude you've got a fever!");
        } else {
            System.out.println("Could be better, could be worse!");
        }
    }

    //Check if + or -
    public static void nr25(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = scanner.nextInt();

        if (x < 0){
            System.out.println(x +" is a negative number.");
        }
        else if (x > 0){
            System.out.println(x +" is a positive number.");
        }
        else{
        System.out.println(x +" is neither positive or negative.");
        }
        }

    public static void nr26() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x > y) {
            System.out.println(x + " is bigger than " + y);
        } else if (y > x) {
            System.out.println(y + " is bigger than " + x);
        } else {
            System.out.println("Woah they are equal!");
        }
    }

    public static void nr27() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        if (x < y && x < z) {
            System.out.println(x + " is the smallest number.");
        } else if (y < x && y < z) {
            System.out.println(y + " is the smallest number.");
        } else {
            System.out.println(z + " is the smallest number.");
        }
    }

    public static void nr28() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature:");
        int temp = scanner.nextInt();

        if (temp > 25) {
            System.out.println("Too hot damnit!");
        } else if (temp < 18) {
            System.out.println("Too cold damnit!");
        } else {
            System.out.println("Too perfect damnit! Never satisfied.");
        }
    }

    //Undone
    public static void nr29(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter train department hour:");
            int depHr = scanner.nextInt();
            System.out.println("...and minute: ");
            int depMin = scanner.nextInt();
            System.out.println("Enter travel time hour:");
            int travelHr = scanner.nextInt();
            System.out.println("...and travel minutes:");
            int travelMin = scanner.nextInt();

            int arrivalHr = depHr + travelHr;
            int arrivalMin = depMin + travelMin;

            if (arrivalMin > 60) {
                arrivalMin = arrivalMin - 60;
                arrivalHr = arrivalHr + 1;

                if (arrivalHr > 24) {
                    arrivalHr = arrivalHr - 24;
                    System.out.println("You will arrive " + arrivalHr + ":" + arrivalMin + "The next day.");
                } else {
                    System.out.println("You will arrive " + arrivalHr + ":" + arrivalMin);
                }
            }
        }

    public static void nr30() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int i = scanner.nextInt();

        if (i < 10) {
            System.out.println("Number is less than 10");
        } else if (i > 10 && i <= 100) {
            System.out.println("Number is more than 10, but less than 100");
        } else {
            System.out.println("Number is bigger than 100");
        }
    }

    //31. -- NOT READY
        /*int end=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 numbers:");*/

    public static void nr32() {
        int i = 0;
        while (i < 100) {
            i = i + 2;
            System.out.println(i);
        }
    }

    //33.
        /*int i = 100;
        while (i>0){
            i--;
            System.out.println(i);
        }*/

    //34-- NOT READY
      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int i = scanner.nextInt();
        do {
            System.out.println(i);
            i++;
        }while (i != '*');*/

    //35.
        /*int i =0;
        while (i<9){
            i++;
            System.out.println(i + " times itself = " + i*i);
        }*/

    //36.
        /*int years =0;
        double savings = 1000;
        double interest = 1.035;
        while(years <10){
           savings = savings * interest;
            years++;
            System.out.println("Year " + years + ", You have saved " + savings);
        }*/

    //37--working but is it right?
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter:?");
        int i= scanner.nextInt();
        int x =1;
        while (x<=i){
            System.out.println("Enter your number "+ x + ":");
            int number= scanner.nextInt();
            x++;
            System.out.println(number);
        }*/

    //38 --UNDONE
    /*

     */

    //39.
       /* Scanner scanner = new Scanner(System.in);
        double price;
        do{
            System.out.println("Enter price of item:");
            price = scanner.nextInt();
            double tax = 1.25;
            double total = price * tax;
            System.out.println("Your total will be: " +total);
        }while (price != 0);*/

    //40.--?
        /* int x = -10;
        while (x<10){
            int answer = 3*x^3-5*x^2+2*x-20; //3x^3-5x^2+2x-20
            System.out.println(answer);
            x++;
        }*/

    //41
        /*int x =1;
        int y =1;
        while(x<50) {
            y = x + y;
            x++;
            System.out.println("Summan är :" + y);
        }*/

    //42
        /*Scanner scanner = new Scanner(System.in);
        int y=1;
        int x=0;
        while (y<20) {
            System.out.println("Enter number: " + y);
            x = x +  scanner.nextInt();
            y++;
            System.out.println("X now holds the value: " + x);
        }*/

    //43.
        /*int x=2;
        int y=2;
        while (x<30){
            y = x + y;
            x=x+2;
            System.out.println(y);
        }*/

    //44.
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number you want to sum: ");
        int x = scanner.nextInt();
        int y=1;
        int z=1;
        while (y < x){
           z =  z + y;
           y++;
            System.out.println("The sum is: " + z); //kept inside loop to see whats going on!
        }*/

    //45. --NOT READY
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = scanner.nextInt();
        int y =0;
        while (y<=100000){
           y= x + x;
            System.out.println(y);
        }*/

    //46.
        /*double x=0.01;
        int y =1;
        while (x<1000000){
            x=x*2;
            y++;
            System.out.println("inkomst: " + x + ". Antal dagar: " + y);
        }*/

    //47.--?
    /*

     */

    //48.
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scanner.nextInt();
        System.out.print(n+"! =");
        int x=1;
        int y=1;
        while (x<n){
            y = y * x;
            x++;
            System.out.print("*" +x);
        }*/

    //49--NOT YET
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value X:");
        int x = scanner.nextInt();
        System.out.println("Enter value n:");
        int n = scanner.nextInt();
        int y=1;
        while (y<n){
            x=x*x;
            y++;
            System.out.println(x);
        }*/

    //50-- Not READY
        /*int x=1;
        int y=1;
        while (x<=9 && y<=9){
          int z= x*y;
          System.out.println(x + "x" + y + "=" + z);
           y++;
           if (y<=9){
                x++;
            }
        }*/

    //51.
        /*int x=0;
        int g=0; //seventh letter "G"
        Random random = new Random(0);
        while (x<100) {
            int nr = random.nextInt(20);
            System.out.println(nr);
            x++;
            if(nr == 7){
                g++;
            }
        }
        System.out.println("Number seven appears " + g + " times");*/

    //52
        /*Random random =new Random();
        int x=0;
        int sum =0;
        while (x<100){ //loop from 0-100
            int y = random.nextInt();
            System.out.println(y);
            if (y > 0) { //if random number is positive
                sum = sum + y; //add to sum.
            }
            x++;
        }
        System.out.println("Your sum is: " + sum);*/

    //53 --Vad i helvete.
         /*int x=0;
         int sum =0;
        int cnr; //correct number
        Random random = new Random();
        while (x<10) {
        cnr = 5000 + random.nextInt(10000);
        x++;
        sum = sum + cnr;
        System.out.println(cnr);
        }
        System.out.println("Sum is: " + sum);
        System.out.println("Average is: " + sum/10);*/

    //54
       /* Random random = new Random();
        int positive =0;
        int negative =0;
        int loop=0;
        while (loop<100){
            int rndm = random.nextInt();

            if (rndm < 0){
                negative ++;
            }
            else{
                positive ++;
            }
            loop++;
        }
        System.out.println("Number of positives: "+ positive);
        System.out.println("Number of negatives: " + negative);*/

    //55.
        /*Scanner scanner = new Scanner(System.in);
        Random r =new Random();
        int x=0;
        int higher =0;
        int lower =0;
        System.out.println("Enter number to compare with:");
        int input = scanner.nextInt();
        while (x<100) {
            int random = r.nextInt();
            if (random > input) {
                higher++;
            } else {
                lower++;
            }
            x++;
        }
            System.out.println("Numbers higher than " + input + "=" + higher);
            System.out.println("Numbers lower than " + input + "=" + lower);*/

    //56.--?


    //57.--?

    //58.
        /*Random random = new Random();
        int newNr;
        int highestNr=0; //osäkert värde 0...
        int x=0;
        while (x<10) { // Loopar 10 gånger.
            newNr = random.nextInt(100); //variabeln Newnr tilldelas slumpat tal.
            System.out.println(newNr);
            if (newNr>highestNr) { //Kontrollerar om det nya nummret är högre än högsta nummret
                highestNr = newNr; //om nya numret är högre ersätts värdet i highest nunmber
            }
            x++;
        }
        System.out.println("The highest number is: " + highestNr);*/

    //59
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many digits you want to control:");
        int i = scanner.nextInt();
        int x=0;
        int newNr;
        int highest=0;
        int lowest=10;
        while(x<i){
            System.out.println("Enter value number " + x + ":" );
            newNr = scanner.nextInt();
            if (newNr>highest){
                highest=newNr;

            }else if(newNr<lowest){
                lowest = newNr;
            }
                x++;
        }
        System.out.println("Highest number =" + highest + ", Lowest number = "+ lowest);
        System.out.println(highest+lowest);*/

    //60.
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers, exit with '0':");
        int i=1;
        int x=0;
        while(i != 0) {
            i = scanner.nextInt();
            x++;
        } x--;
            System.out.println("You entered "+ x + " numbers. "+ x  + "x2 = " + x * 2);*/

    //61.

    //62.

    //63.

    //64.

    //65.

    //66.
        /*ArrayList<String> personnr = new ArrayList<>();
        personnr.add("9");
        personnr.add("0");
        personnr.add("1");
        personnr.add("0");
        personnr.add("0");
        personnr.add("6");
        personnr.add("-");
        personnr.add("6");
        personnr.add("8");
        personnr.add("9");
        personnr.add("4");

        int i = personnr.indexOf("-");
        if (i == 6) {
            System.out.println("Personnr is correct! - is on spot 6");
        }else{
            System.out.println("Personnr is incorrect!");
        }*/

    //67.

        /*String[] persnr = new String[11];
        persnr[0] = "9";
        persnr[1] = "0";
        persnr[2] = "1";
        persnr[3] = "0";
        persnr[4] = "0";
        persnr[5] = "6";
        persnr[6] = "-";
        persnr[7] = "6";
        persnr[8] = "8";
        persnr[9] = "9";
        persnr[10] = "4";

        Integer.parseInt(persnr[9]);
        System.out.println(Integer.parseInt(persnr[9]));
        }*/


    //68.

    //69.

    //70.

    //71.

    //72.

    //73.

    //74.

    //75.

    //76.

    //77.

    //78.

    //79.

    //80.
}

