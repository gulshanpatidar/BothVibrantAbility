import java.util.Scanner;

//main class or driver class
public class Main {
    //function to add items in food cart
    static void addItems(restro food) {
        System.out.println("####  Below is our menu , type the desired food code to add this in your food cart  ####");
        String menu = food.getServices();
        System.out.println(menu);
        Scanner sc = new Scanner(System.in);
        byte choice = sc.nextByte();
        food.order(choice);
        System.out.println("1. to add more items\n2. to print bill");
        byte options = sc.nextByte();
        if (options == 1) {
            addItems(food);
        }
    }

    //function to order the food using restro class
    static void foodOrder() {
        System.out.println("*********** welcome to the food order service **********");
        restro food = new restro();
        addItems(food);
        food.printBill();
        System.out.println("your food will be delivered within half an hour, contact on 1264726316 for any query");
    }

    //method to be called after booking the room of basic type
    static void afterBooked(Basic basicRoom) {
        System.out.println("\nnow as you have booked the room, you will have following options till your booking expired ===>");
        Scanner sc = new Scanner(System.in);
        while (true) {
            String services = basicRoom.getServices();
            System.out.println(services);
            byte choice = sc.nextByte();
            switch (choice) {
                case 1: {
                    System.out.println("you have choosen room services.\n an executive will arrive at your room in 5 minutes.\n For queries you can call on 34656394");
                    System.out.println("Thank you");
                    break;
                }
                case 2: {
                    System.out.println("you have choosen Appliance Repair or any glitch/issue.\n an executive will arrive at your room in 5 minutes.\n For queries you can call on 34656394");
                    break;
                }
                case 3: {
                    foodOrder();
                    break;
                }
                case 4: {
                    System.out.println("you have choosen water services. \n an executive will arrive at your room in 5 minutes.\n For queries you can call on 34656394");
                    break;
                }
                case 5: {
                    System.out.println("********** thank you for using our services ***********");
                    System.exit(0);
                }
                default:
                    System.out.println("please enter a valid choice");
            }
        }
    }

    //method to be called after booking the room of special type
    static void afterBooked(special specialRoom) {
        System.out.println("\nnow as you have booked the room, you will have following options till your booking expired ===>");
        Scanner sc = new Scanner(System.in);
        while (true) {
            String services = specialRoom.getServices();
            System.out.println(services);
            byte choice = sc.nextByte();
            switch (choice) {
                case 1: {
                    System.out.println("you have choosen room services.\n an executive will arrive at your room in 5 minutes.\n For queries you can call on 34656394");
                    System.out.println("Thank you");
                    break;
                }
                case 2: {
                    System.out.println("you have choosen Appliance Repair or any glitch/issue.\n an executive will arrive at your room in 5 minutes.\n For queries you can call on 34656394");
                    break;
                }
                case 3: {
                    foodOrder();
                    break;
                }
                case 4: {
                    System.out.println("you have choosen water services. \n an executive will arrive at your room in 5 minutes.\n For queries you can call on 34656394");
                    break;
                }
                case 7: {
                    System.out.println("********** thank you for using our services ***********");
                    System.exit(0);
                }
                case 5: {
                    System.out.println("you have choosen therapy service.\n an executive will arrive at your room in 5 minutes.\n For queries you can call on 34656394");
                    break;
                }
                case 6: {
                    System.out.println("you have choosen medication or medical emergency.\n an executive will arrive at your room in 5 minutes.\n For queries you can call on 34656394");
                    break;
                }
                default:
                    System.out.println("please enter a valid choice");
            }
        }
    }

    //method to be called after booking the room of advanced type
    static void afterBooked(advanced advancedRoom) {
        System.out.println("\nnow as you have booked the room, you will have following options till your booking expired ===>");
        Scanner sc = new Scanner(System.in);
        while (true) {
            String services = advancedRoom.getServices();
            System.out.println(services);
            byte choice = sc.nextByte();
            switch (choice) {
                case 1: {
                    System.out.println("you have choosen room services.\n an executive will arrive at your room in 5 minutes.\n For queries you can call on 34656394");
                    System.out.println("Thank you");
                    break;
                }
                case 2: {
                    System.out.println("you have choosen Appliance Repair or any glitch/issue.\n an executive will arrive at your room in 5 minutes.\n For queries you can call on 34656394");
                    break;
                }
                case 3: {
                    foodOrder();
                    break;
                }
                case 4: {
                    System.out.println("you have choosen water services. \n an executive will arrive at your room in 5 minutes.\n For queries you can call on 34656394");
                    break;
                }
                case 10: {
                    System.out.println("********** thank you for using our services ***********");
                    System.exit(0);
                }
                case 5: {
                    System.out.println("you have choosen therapy service.\n an executive will arrive at your room in 5 minutes.\n For queries you can call on 34656394");
                    break;
                }
                case 6: {
                    System.out.println("you have choosen medication or medical emergency.\n an executive will arrive at your room in 5 minutes.\n For queries you can call on 34656394");
                    break;
                }
                case 7: {
                    System.out.println("you have choosen city tour service.\n an executive will arrive at your room in 5 minutes and tell you more about this service.\n For queries you can call on 34656394");
                    break;
                }
                case 8: {
                    System.out.println("you have choosen special Dinner arrangement service.\n an executive will arrive at your room in 5 minutes and tell you more about this service.\n For queries you can call on 34656394");
                    break;
                }
                case 9: {
                    System.out.println("you have choosen swimming pool slot booking service.\n an executive will arrive at your room in 5 minutes and tell you more about this service.\n For queries you can call on 34656394");
                    break;
                }
                default:
                    System.out.println("please enter a valid choice");
            }
        }
    }

    //main method to run the whole program
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("************************************************");
        System.out.println("*         Welcome to the G9 Hotels             *");
        System.out.println("************************************************");
        System.out.println("we have the following types of rooms available---");
        System.out.println("1. basic room");
        System.out.println("2. special room");
        System.out.println("3. luxury room");
        System.out.println("In all three types of room you can choose size according to you.");
        System.out.println();
        System.out.println("***  choose any one type of room to take a look at its facilities and all other things by typing the number of it or Enter 0 to exit Hotel   ***");
        int choice = sc.nextByte();
        switch (choice) {
            case 1: {
                System.out.println("in Basic room you will get these facilities and services");
                //yaha par likh denge saari
                System.out.println("Now you have to choose from two types of room");
                System.out.println("1. Single bed room\n2. Double bed room");
                int numberOfBeds = sc.nextByte();
                if (numberOfBeds == 1) {
                    System.out.println("you have choosen single bed room of basic catagory");
                    System.out.println("to book this room please enter the details below");
                    System.out.println("Enter your first name: ");
                    String first = sc.next();
                    System.out.println("enter your last name");
                    String last = sc.next();
                    String name = first + " " + last;
                    System.out.println("enter your adhar id: ");
                    long adhar = sc.nextLong();
                    System.out.println("enter your mobile number: ");
                    long mobile = sc.nextLong();
                    System.out.println("enter your city: ");
                    String address = sc.next();
                    System.out.println("enter your mail id: ");
                    String email = sc.next();

                    Basic basicRoom = new Basic(name, adhar, mobile, address, numberOfBeds, email);
                    basicRoom.setPrice();
                    String details = basicRoom.getDetails();
                    System.out.println(details);
                    afterBooked(basicRoom);

                } else if (numberOfBeds == 2) {
                    System.out.println("you have choosen double bed room of basic catagory");
                    System.out.println("to book this room please enter the details below");
                    System.out.println("Enter your first name: ");
                    String first = sc.next();
                    System.out.println("enter your last name");
                    String last = sc.next();
                    String name = first + " " + last;
                    System.out.println("enter your adhar id: ");
                    long adhar = sc.nextLong();
                    System.out.println("enter your mobile number: ");
                    long mobile = sc.nextLong();
                    System.out.println("enter your city: ");
                    String address = sc.next();
                    System.out.println("enter your mail id: ");
                    String email = sc.next();
                    Basic basicRoom = new Basic(name, adhar, mobile, address, numberOfBeds, email);
                    basicRoom.setPrice();
                    String details = basicRoom.getDetails();
                    System.out.println(details);
                    afterBooked(basicRoom);

                } else {
                    System.out.println("this is not a valid option");
                }
                break;
            }
            case 2: {
                System.out.println("in special room you will get these facilities and services");
                //yaha par likh denge
                System.out.println("Now you have to choose from two types of room");
                System.out.println("1. Single bed room\n2. Double bed room");
                int numberOfBeds = sc.nextByte();
                if (numberOfBeds == 1) {
                    System.out.println("you have choosen single bed room of special catagory");
                    System.out.println("to book this room please enter the details below");
                    System.out.println("Enter your first name: ");
                    String first = sc.next();
                    System.out.println("enter your last name");
                    String last = sc.next();
                    String name = first + " " + last;
                    System.out.println("enter your adhar id: ");
                    long adhar = sc.nextLong();
                    System.out.println("enter your mobile number: ");
                    long mobile = sc.nextLong();
                    System.out.println("enter your city: ");
                    String address = sc.next();
                    System.out.println("enter your mail id: ");
                    String email = sc.next();
                    special specialRoom = new special(name, adhar, mobile, address, numberOfBeds, email);
                    specialRoom.setPrice();
                    String details = specialRoom.getDetails();
                    System.out.println(details);
                    afterBooked(specialRoom);

                } else if (numberOfBeds == 2) {
                    System.out.println("you have choosen double bed room of special catagory");
                    System.out.println("to book this room please enter the details below");
                    System.out.println("Enter your first name: ");
                    String first = sc.next();
                    System.out.println("enter your last name");
                    String last = sc.next();
                    String name = first + " " + last;
                    System.out.println("enter your adhar id: ");
                    long adhar = sc.nextLong();
                    System.out.println("enter your mobile number: ");
                    long mobile = sc.nextLong();
                    System.out.println("enter your city: ");
                    String address = sc.next();
                    System.out.println("enter your mail id: ");
                    String email = sc.next();
                    special specialRoom = new special(name, adhar, mobile, address, numberOfBeds, email);
                    specialRoom.setPrice();
                    String details = specialRoom.getDetails();
                    System.out.println(details);
                    afterBooked(specialRoom);

                } else {
                    System.out.println("this is not a valid option");
                }
                break;
            }
            case 3: {
                System.out.println("in advanced room you will get these services");
                //yaha par likh denge
                System.out.println("Now you have to choose from two types of room");
                System.out.println("1. Single bed room\n2. Double bed room");
                int numberOfBeds = sc.nextByte();
                if (numberOfBeds == 1) {
                    System.out.println("you have choosen single bed room of advanced catagory");
                    System.out.println("to book this room please enter the details below");
                    System.out.println("Enter your first name: ");
                    String first = sc.next();
                    System.out.println("enter your last name");
                    String last = sc.next();
                    String name = first + " " + last;
                    System.out.println("enter your adhar id: ");
                    long adhar = sc.nextLong();
                    System.out.println("enter your mobile number: ");
                    long mobile = sc.nextLong();
                    System.out.println("enter your city: ");
                    String address = sc.next();
                    System.out.println("enter your mail id: ");
                    String email = sc.next();
                    advanced advancedRoom = new advanced(name, adhar, mobile, address, numberOfBeds, email);
                    advancedRoom.setPrice();
                    String details = advancedRoom.getDetails();
                    System.out.println(details);
                    afterBooked(advancedRoom);

                } else if (numberOfBeds == 2) {
                    System.out.println("you have choosen double bed room of advanced catagory");
                    System.out.println("to book this room please enter the details below");
                    System.out.println("Enter your first name: ");
                    String first = sc.next();
                    System.out.println("enter your last name");
                    String last = sc.next();
                    String name = first + " " + last;
                    System.out.println("enter your adhar id: ");
                    long adhar = sc.nextLong();
                    System.out.println("enter your mobile number: ");
                    long mobile = sc.nextLong();
                    System.out.println("enter your city: ");
                    String address = sc.next();
                    System.out.println("enter your mail id: ");
                    String email = sc.next();
                    advanced advancedRoom = new advanced(name, adhar, mobile, address, numberOfBeds, email);
                    advancedRoom.setPrice();
                    String details = advancedRoom.getDetails();
                    System.out.println(details);
                    afterBooked(advancedRoom);

                } else {
                    System.out.println("this is not a valid option");
                }
                break;
            }
            case 0: {
                System.out.println("*****************************     thank you for coming     ************************************************");
                System.exit(0);
            }
            default: {
                System.out.println("please enter a valid choice");
            }

        }

    }
}