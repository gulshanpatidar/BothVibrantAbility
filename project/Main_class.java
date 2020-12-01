import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Timer;
import java.util.Date;
import java.text.ParseException;
//main class or driver class
public class Main_class {
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
    static void afterBooked(Basic basicRoom){
        Scanner sc = new Scanner(System.in);
        while (true) {
            String services = basicRoom.getServices();
            System.out.println(services + "\n5. For exit");
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
        Scanner sc = new Scanner(System.in);
        while (true) {
            String services = specialRoom.getServices();
            System.out.println(services + "7. For exit");
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

    static void afterRant(){
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("you have the following options till you are living in this apartment");
            System.out.println("\n1. For Water related issues");
            System.out.println("2. For Electricity related issues");
            System.out.println("3. For any complaints or suggestions");
            System.out.println("4. For emergency use");
            System.out.println("5. For exit");
            byte service = sc.nextByte();
            switch (service){
                case 1:
                    System.out.println("please call on 2347826835");
                    break;
                case 2:
                    System.out.println("please call on 2347826835");
                    break;
                case 3:
                    System.out.println("please call on 2347826835");
                    break;
                case 4:
                    System.out.println("please call on 102");
                    break;
                case 5:
                    System.out.println("thank you for using our services");
                    System.exit(0);
                    break;
                default:
                    System.out.println("please enter a valid choice");
            }
        }
    }

    //main method to run the whole program
    public static void main(String[] args) throws ParseException, IOException {

        Scanner sc = new Scanner(System.in);

        System.out.println("************************************************");
        System.out.println("*    Welcome to the G9 Hotels and apartments   *");
        System.out.println("************************************************");
        System.out.println("what do you want to do from following--");
        System.out.println("1. Want to book a hotel room for temporary stay");
        System.out.println("2. Want to rent a apartment for long term stay");
        byte select = sc.nextByte();
        switch (select) {
            case 1:
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
                        System.out.println("Now you have to choose from two types of room");
                        System.out.println("1. Single bed room\n2. Double bed room");
                        int numberOfBeds = sc.nextByte();
                        if (numberOfBeds == 1 || numberOfBeds == 2) {
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
                            System.out.println("\nnow as you have booked the room, you will have following options till your booking expired ===>");
                            Date date = new Date();
                            Timer timer = new Timer();
                            Checker ch = new Checker();
                            ch.setDate(date);
                            System.out.println("you have booked room at "+date);
                            System.out.println("your session will expire at "+ch.getNext());
                            String str = "Name : " + basicRoom.name + "\nAdhar : " + basicRoom.adharId+ "\nMobile Number : " + basicRoom.mobileNumber + "\nAddress : "+basicRoom.address + "\nUnique code : " + basicRoom.uniqueCode + "\nEmail : " +basicRoom.email + "Room Type : " + basicRoom.roomType + "\nRoom Number : " + basicRoom.roomNumber + "\nCheck in time : " + date + "\nCheck out time : " + ch.getNext();
                            FileWriter fw = new FileWriter("hotel.txt");
                            for (int i = 0; i < str.length(); i++)
                                fw.write(str.charAt(i));
                            System.out.println("entry recorded");
                            fw.close();
                            timer.schedule(ch,0,10000);
                            try {
                                afterBooked(basicRoom);
                            }catch (Exception e){
                                System.out.println("an exception was occured");
                            }

                        } else {
                            System.out.println("this is not a valid option");
                        }
                        break;
                    }
                    case 2: {
                        System.out.println("in special room you will get these facilities and services");
                        System.out.println("Now you have to choose from two types of room");
                        System.out.println("1. Single bed room\n2. Double bed room");
                        int numberOfBeds = sc.nextByte();
                        if (numberOfBeds == 1 || numberOfBeds == 2) {
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
                            System.out.println("\nnow as you have booked the room, you will have following options till your booking expired ===>");
                            Date date = new Date();
                            Timer timer = new Timer();
                            Checker ch = new Checker();
                            ch.setDate(date);
                            System.out.println("you have booked room at "+date);
                            System.out.println("your session will expire at "+ch.getNext());
                            String str = "Name : " + specialRoom.name + "\nAdhar : " + specialRoom.adharId+ "\nMobile Number : " + specialRoom.mobileNumber + "\nAddress : "+specialRoom.address + "\nUnique code : " + specialRoom.uniqueCode + "\nEmail : " +specialRoom.email + "Room Type : " + specialRoom.roomType + "\nRoom Number : " + specialRoom.roomNumber + "\nCheck-in time : "+date + "\nCheck-out time : "+ch.getNext();
                            FileWriter fw = new FileWriter("hotel.txt");
                            for (int i = 0; i < str.length(); i++)
                                fw.write(str.charAt(i));
                            System.out.println("entry recorded");
                            fw.close();
                            timer.schedule(ch,0,10000);
                            try {
                                afterBooked(specialRoom);
                            }catch (Exception e){
                                System.out.println("exception occured");
                            }

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
                        if (numberOfBeds == 1 || numberOfBeds == 2) {
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
                            System.out.println("\nnow as you have booked the room, you will have following options till your booking expired ===>");
                            Date date = new Date();
                            Timer timer = new Timer();
                            Checker ch = new Checker();
                            ch.setDate(date);
                            System.out.println("you have booked room at "+date);
                            System.out.println("your session will expire at "+ch.getNext());
                            String str = "Name : " + advancedRoom.name + "\nAdhar : " + advancedRoom.adharId+ "\nMobile Number : " + advancedRoom.mobileNumber + "\nAddress : "+advancedRoom.address + "\nUnique code : " + advancedRoom.uniqueCode + "\nEmail : " +advancedRoom.email + "Room Type : " + advancedRoom.roomType + "\nRoom Number : " + advancedRoom.roomNumber + "\nCheck-in time : "+date+"\nCheck-out time : "+ch.getNext();
                            FileWriter fw = new FileWriter("hotel.txt");
                            for (int i = 0; i < str.length(); i++)
                                fw.write(str.charAt(i));
                            System.out.println("entry recorded");
                            fw.close();
                            timer.schedule(ch,0,10000);
                            try {
                                afterBooked(advancedRoom);
                            }catch (Exception e){
                                System.out.println("exception occured");
                            }

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
                break;
            case 2:
                System.out.println("we have the following types of locations available");
                System.out.println("1. Rural Area \n2. Middle of the town \n3. Sea Facing");
                System.out.println("enter the one which suits you the best");
                byte ap = sc.nextByte();
                switch (ap){
                    case 1:
                        System.out.println("you have choosen the rural area apartments\n");
                        System.out.println("you have following type of apartments in this location");
                        System.out.println("1. 1BHK \n2. 2BHK \n3. 3BHK");
                        byte flatSizeR = sc.nextByte();
                        if (flatSizeR>3 || flatSizeR<1){
                            System.out.println("you have entered the wrong choice");
                            System.exit(0);
                        }
                        System.out.println("Enter your first name : ");
                        String firstR = sc.next();
                        System.out.println("Enter your last name : ");
                        String lastR = sc.next();
                        String nameR = firstR + " " + lastR;
                        System.out.println("Enter your home city/town/village name : ");
                        String townR = sc.next();
                        System.out.println("Enter your adhar number : ");
                        long adharR = sc.nextLong();
                        System.out.println("Enter your mobile number : ");
                        long mobileR = sc.nextLong();
                        Rural_area rural_area = new Rural_area(nameR,townR,adharR,mobileR,flatSizeR);
                        rural_area.setCharge();
                        rural_area.setFlatNumber();
                        System.out.println("you have successfully booked "+rural_area.flatSize+"BHK flat of rural area");
                        System.out.println("your monthly charge of apartment is " + rural_area.getMonthlyCharge());
                        System.out.println("your unique code of the apartment is "+rural_area.getUniqueCode());
                        System.out.println("your apartment number is "+rural_area.flatNumber);
                        Date date = new Date();
                        Timer timer = new Timer();
                        Checker1 checker1 = new Checker1();
                        checker1.setDate(date);
                        System.out.println("you have booked your apartment on "+ date);
                        System.out.println("your monthly subscription will end on " + checker1.getNext());
                        String str = rural_area.name + "\n" + rural_area.permanent_address + "\n" + rural_area.adharId + "\n" + rural_area.mobileNumber + "\n" + rural_area.flatNumber + "\n"+rural_area.uniqueCode + "\n"+ rural_area.flattype + "\n" + rural_area.flatSize + "\n" + date + "\n" + checker1.getNext();
                        FileWriter fw = new FileWriter("apartment.txt");
                        for (int i = 0; i < str.length(); i++)
                            fw.write(str.charAt(i));
                        System.out.println("booking recorded successfully");
                        fw.close();
                        timer.schedule(checker1,0,10000);
                        afterRant();
                        break;
                    case 2:
                        System.out.println("you have choosen the middle of the town area apartments");
                        System.out.println("you have following type of apartments in this location");
                        System.out.println("1. 1BHK \n2. 2BHK \n3. 3BHK");
                        byte flatSizeM = sc.nextByte();
                        if (flatSizeM>3 || flatSizeM<1){
                            System.out.println("you have entered the wrong choice");
                            System.exit(0);
                        }
                        System.out.println("Enter your first name : ");
                        String firstM = sc.next();
                        System.out.println("Enter your last name : ");
                        String lastM = sc.next();
                        String nameM = firstM + " " + lastM;
                        System.out.println("Enter your home city/town/village name : ");
                        String townM = sc.next();
                        System.out.println("Enter your adhar number : ");
                        long adharM = sc.nextLong();
                        System.out.println("Enter your mobile number : ");
                        long mobileM = sc.nextLong();
                        Middle_of_the_town middle_of_the_town = new Middle_of_the_town(nameM,townM,adharM,mobileM,flatSizeM);
                        middle_of_the_town.setCharge();
                        middle_of_the_town.setFlatNumber();
                        System.out.println("you have successfully booked "+middle_of_the_town.flatSize+"BHK flat of middle of the town area");
                        System.out.println("your monthly charge of apartment is " + middle_of_the_town.getMonthlyCharge());
                        System.out.println("your unique code of the apartment is "+middle_of_the_town.getUniqueCode());
                        System.out.println("your apartment number is "+middle_of_the_town.flatNumber);
                        Date date1 = new Date();
                        Timer timer1 = new Timer();
                        Checker1 checker11 = new Checker1();
                        checker11.setDate(date1);
                        System.out.println("you have booked your apartment on "+ date1);
                        System.out.println("your monthly subscription will end on " + checker11.getNext());
                        String str1 = "Name : " + middle_of_the_town.name + "\nAddress : " + middle_of_the_town.permanent_address + "\nAdhar Id : " + middle_of_the_town.adharId + "\nMobile Number : " + middle_of_the_town.mobileNumber + "\nFlat Number : " + middle_of_the_town.flatNumber + "\nUnique Code : "+middle_of_the_town.uniqueCode + "\nFlat type : "+ middle_of_the_town.flattype + "\nFlat Size : " + middle_of_the_town.flatSize + "\n" + date1 + "\n" + checker11.getNext();
                        FileWriter fw1 = new FileWriter("apartment.txt");
                        for (int i = 0; i < str1.length(); i++)
                            fw1.write(str1.charAt(i));
                        System.out.println("booking recorded successfully");
                        fw1.close();
                        timer1.schedule(checker11,0,10000);
                        afterRant();
                        break;
                    case 3:
                        System.out.println("you have choosen the sea facing area apartments");
                        System.out.println("you have following type of apartments in this location");
                        System.out.println("1. 1BHK \n2. 2BHK \n3. 3BHK");
                        byte flatSizeS = sc.nextByte();
                        if (flatSizeS>3 || flatSizeS<1){
                            System.out.println("you have entered the wrong choice");
                            System.exit(0);
                        }
                        System.out.println("Enter your first name : ");
                        String firstS = sc.next();
                        System.out.println("Enter your last name : ");
                        String lastS = sc.next();
                        String nameS = firstS + " " + lastS;
                        System.out.println("Enter your home city/town/village name : ");
                        String townS = sc.next();
                        System.out.println("Enter your adhar number : ");
                        long adharS = sc.nextLong();
                        System.out.println("Enter your mobile number : ");
                        long mobileS = sc.nextLong();
                        SeaFacing seaFacing = new SeaFacing(nameS,townS,adharS,mobileS,flatSizeS);
                        seaFacing.setCharge();
                        seaFacing.setFlatNumber();
                        System.out.println("you have successfully booked "+seaFacing.flatSize+"BHK flat of sea facing area");
                        System.out.println("your monthly charge of apartment is " + seaFacing.getMonthlyCharge());
                        System.out.println("your unique code of the apartment is "+seaFacing.getUniqueCode());
                        System.out.println("your apartment number is "+seaFacing.flatNumber);
                        Date date2 = new Date();
                        Timer timer2 = new Timer();
                        Checker1 checker12 = new Checker1();
                        checker12.setDate(date2);
                        System.out.println("you have booked your apartment on "+ date2);
                        System.out.println("your monthly subscription will end on " + checker12.getNext());
                        String str2 = "Name : " + seaFacing.name + "\nAddress : " + seaFacing.permanent_address + "\nAdhar Id : " + seaFacing.adharId + "\nMobile Number : " + seaFacing.mobileNumber + "\nFlat Number : " + seaFacing.flatNumber + "\nUnique Code : "+seaFacing.uniqueCode + "\nFlat type : "+ seaFacing.flattype + "\nFlat Size : " + seaFacing.flatSize + "\n" + date2 + "\n" + checker12.getNext();
                        FileWriter fw2 = new FileWriter("apartment.txt");
                        for (int i = 0; i < str2.length(); i++)
                            fw2.write(str2.charAt(i));
                        System.out.println("booking recorded successfully");
                        fw2.close();
                        timer2.schedule(checker12,0,10000);
                        afterRant();
                        break;
                    default:
                        System.out.println("you have entered an wrong choice");
                        System.exit(0);
                        break;
                }
                break;
            default:
                System.out.println("you have entered a incorrect choice");
        }


    }
}