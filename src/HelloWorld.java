public class HelloWorld {
        // method - similar to function in javascript
        //main method -> specific method in java tha acts as our entry point when running java
    public static void main (String[] args){
        //print helloworld to console
        System.out.println("Hello World");
        // 1.My favorite number
        int myFavoriteNumber = 7;
        System.out.println(myFavoriteNumber);
        // 2.My string
        String myString = "3.14159";
        System.out.println(myString);
        //3.Declare a long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
        float  myNumber = 314;
        System.out.println(myNumber);
        //10.
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
//
//        //12
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

//        int three = (int) "three";
        //13
//        Rewrite the following expressions using the relevant shorthand assignment operators:
//
//
//                int x = 4;
//                //x = x + 5;
//                x += 5;
//        System.out.println(x);

//                int x = 3;
//                int y = 4;
//                //y = y * x;
//                y *= x;
//        System.out.println(y);


                int x = 10;
                int y = 2;
                //x = x / y;
                    x /=y;
        System.out.println(x);
                //y = y - x;
                y -= x;
        System.out.println(y);

    }

}
