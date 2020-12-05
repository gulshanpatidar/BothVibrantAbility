import java.io.*;
import java.text.SimpleDateFormat;
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
    static void afterBooked(Basic basicRoom) {
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

    static void afterRant() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("you have the following options till you are living in this apartment");
            System.out.println("\n1. For Water related issues");
            System.out.println("2. For Electricity related issues");
            System.out.println("3. For any complaints or suggestions");
            System.out.println("4. For emergency use");
            System.out.println("5. For exit");
            byte service = sc.nextByte();
            switch (service) {
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
                        System.out.println("1. Sign-up for new user");
                        System.out.println("2. Sign-in for existing user");
                        byte user = sc.nextByte();
                        if (user == 1) {
                            System.out.println("Now you have to choose from two types of room");
                            System.out.println("1. Single bed room\n2. Double bed room");
                            int numberOfBeds = sc.nextByte();
                            if (numberOfBeds == 1 || numberOfBeds == 2) {
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
                                basicRoom.setRoomNumber();
                                String details = basicRoom.getDetails();
                                System.out.println(details);
                                System.out.println("\nnow as you have booked the room, you will have following options till your booking expired ===>");
                                Date date = new Date();
                                Timer timer = new Timer();
                                Checker ch = new Checker();
                                ch.setDate(date);
                                SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
                                System.out.println("you have booked room at " + date);
                                System.out.println("your session will expire at " + ch.getNext());
                                String str = basicRoom.name + "\n" + basicRoom.adharId + "\n" + basicRoom.mobileNumber + "\n" + basicRoom.address + "\n" + basicRoom.uniqueCode + "\n" + basicRoom.email + "\n" + basicRoom.roomType + "\n" + basicRoom.roomNumber + "\n" +simpleDateFormat.format(date) + "\n" + simpleDateFormat.format(ch.getNext());
                                FileWriter fw = new FileWriter("hotel.txt");
                                for (int i = 0; i < str.length(); i++)
                                    fw.write(str.charAt(i));
                                System.out.println("entry recorded");
                                fw.close();
                                timer.schedule(ch, 0, 10000);
                                try {
                                    afterBooked(basicRoom);
                                } catch (Exception e) {
                                    System.out.println("an exception was occurred");
                                }

                            } else {
                                System.out.println("this is not a valid option");
                            }
                        } 
                        else if (user == 2) {
                            System.out.println("Now you have to choose from two types of room");
                            System.out.println("1. Single bed room\n2. Double bed room");
                            int numberOfBeds = sc.nextByte();
                            if (numberOfBeds == 1 || numberOfBeds == 2) {
                                FileReader fr = new FileReader("hotel.txt");
                                BufferedReader bufferedReader = new BufferedReader(fr);
                                String line;
                                String[] sb = new String[10];
                                int i = 0;
                                while ((line = bufferedReader.readLine()) != null) {
                                    sb[i] = line;
                                    i += 1;
                                }
                                fr.close();
                                String name = sb[0];
                                String adhar = sb[1];
                                String mobile = sb[2];
                                String address = sb[3];
                                String uniqueCode = sb[4];
                                String email = sb[5];
                                String roomNumber = sb[7];
                                String bookingDate = sb[8];
                                Basic basic = new Basic(name, Long.parseLong(adhar), Long.parseLong(mobile), address, numberOfBeds, email);

                                basic.setUniqueCode(uniqueCode);
                                basic.setPrice();
                                basic.setRoomNumber(Integer.parseInt(roomNumber));
                                SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
                                Date date = simpleDateFormat.parse(bookingDate);
                                Timer timer = new Timer();
                                Checker checker = new Checker();
                                checker.setDate(date);
                                System.out.println("you have booked your apartment on " + date);
                                System.out.println("your monthly subscription will end on " + checker.getNext());
                                timer.schedule(checker, 0, 10000);
                                System.out.println(basic.getDetails());
                                afterBooked(basic);
                            } else System.out.println("error occurred");
                        } else System.out.println("error occured");
                        break;
                    }
                    case 2: {
                        System.out.println("1. Sign-up for new user");
                        System.out.println("2. Sign-in for existing user");
                        byte user1 = sc.nextByte();
                        if (user1 == 1) {
                            System.out.println("Now you have to choose from two types of room");
                            System.out.println("1. Single bed room\n2. Double bed room");
                            int numberOfBeds = sc.nextByte();
                            if (numberOfBeds == 1 || numberOfBeds == 2) {
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
                                specialRoom.setRoomNumber();
                                String details = specialRoom.getDetails();
                                System.out.println(details);
                                System.out.println("\nnow as you have booked the room, you will have following options till your booking expired ===>");
                                Date date = new Date();
                                Timer timer = new Timer();
                                Checker ch = new Checker();
                                ch.setDate(date);
                                SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
                                System.out.println("you have booked room at " + date);
                                System.out.println("your session will expire at " + ch.getNext());
                                String str = specialRoom.name + "\n" + specialRoom.adharId + "\n" + specialRoom.mobileNumber + "\n" + specialRoom.address + "\n" + specialRoom.uniqueCode + "\n" + specialRoom.email + "\n" + specialRoom.roomType + "\n" + specialRoom.roomNumber + "\n" + simpleDateFormat.format(date) + "\n" + simpleDateFormat.format(ch.getNext());
                                FileWriter fw = new FileWriter("hotel.txt");
                                for (int i = 0; i < str.length(); i++)
                                    fw.write(str.charAt(i));
                                System.out.println("entry recorded");
                                fw.close();
                                timer.schedule(ch, 0, 10000);
                                try {
                                    afterBooked(specialRoom);
                                } catch (Exception e) {
                                    System.out.println("exception occured");
                                }

                            } else {
                                System.out.println("this is not a valid option");
                            }
                        } else if (user1 == 2) {
                            System.out.println("Now you have to choose from two types of room");
                            System.out.println("1. Single bed room\n2. Double bed room");
                            int numberOfBeds = sc.nextByte();
                            if (numberOfBeds == 1 || numberOfBeds == 2) {
                                FileReader fr = new FileReader("hotel.txt");
                                BufferedReader bufferedReader = new BufferedReader(fr);
                                String line;
                                String[] sb = new String[10];
                                int i = 0;
                                while ((line = bufferedReader.readLine()) != null) {
                                    sb[i] = line;
                                    i += 1;
                                }
                                fr.close();
                                String name = sb[0];
                                String adhar = sb[1];
                                String mobile = sb[2];
                                String address = sb[3];
                                String uniqueCode = sb[4];
                                String email = sb[5];
                                String roomNumber = sb[7];
                                String bookingDate = sb[8];
                                special sp = new special(name, Long.parseLong(adhar), Long.parseLong(mobile), address, numberOfBeds, email);

                                sp.setUniqueCode(uniqueCode);
                                sp.setPrice();
                                sp.setRoomNumber(Integer.parseInt(roomNumber));
                                SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
                                Date date = simpleDateFormat.parse(bookingDate);
                                Timer timer = new Timer();
                                Checker checker = new Checker();
                                checker.setDate(date);
                                System.out.println("you have booked your apartment on " + date);
                                System.out.println("your monthly subscription will end on " + checker.getNext());
                                timer.schedule(checker, 0, 10000);
                                System.out.println(sp.getDetails());
                                afterBooked(sp);
                            } else System.out.println("error occurred");
                        } else System.out.println("error occurred");
                        break;
                    }
                    case 3: {
                        System.out.println("Sign-up for new user");
                        System.out.println("Sign-in for existing user");
                        byte user = sc.nextByte();
                        if (user == 1) {
                            System.out.println("Now you have to choose from two types of room");
                            System.out.println("1. Single bed room\n2. Double bed room");
                            int numberOfBeds = sc.nextByte();
                            if (numberOfBeds == 1 || numberOfBeds == 2) {
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
                                advancedRoom.setRoomNumber();
                                String details = advancedRoom.getDetails();
                                System.out.println(details);
                                System.out.println("\nnow as you have booked the room, you will have following options till your booking expired ===>");
                                Date date = new Date();
                                Timer timer = new Timer();
                                Checker ch = new Checker();
                                ch.setDate(date);
                                SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
                                System.out.println("you have booked room at " + date);
                                System.out.println("your session will expire at " + ch.getNext());
                                String str = advancedRoom.name + "\n" + advancedRoom.adharId + "\n" + advancedRoom.mobileNumber + "\n" + advancedRoom.address + "\n" + advancedRoom.uniqueCode + "\n" + advancedRoom.email + "\n" + advancedRoom.roomType + "\n" + advancedRoom.roomNumber + "\n" + simpleDateFormat.format(date) + "\n" + simpleDateFormat.format(ch.getNext());
                                FileWriter fw = new FileWriter("hotel.txt");
                                for (int i = 0; i < str.length(); i++)
                                    fw.write(str.charAt(i));
                                System.out.println("entry recorded");
                                fw.close();
                                timer.schedule(ch, 0, 10000);
                                try {
                                    afterBooked(advancedRoom);
                                } catch (Exception e) {
                                    System.out.println("exception occured");
                                }

                            } else {
                                System.out.println("this is not a valid option");
                            }
                        } else if (user == 2) {
                            System.out.println("Now you have to choose from two types of room");
                            System.out.println("1. Single bed room\n2. Double bed room");
                            int numberOfBeds = sc.nextByte();
                            if (numberOfBeds == 1 || numberOfBeds == 2) {
                                FileReader fr = new FileReader("hotel.txt");
                                BufferedReader bufferedReader = new BufferedReader(fr);
                                String line;
                                String[] sb = new String[10];
                                int i = 0;
                                while ((line = bufferedReader.readLine()) != null) {
                                    sb[i] = line;
                                    i += 1;
                                }
                                fr.close();
                                String name = sb[0];
                                String adhar = sb[1];
                                String mobile = sb[2];
                                String address = sb[3];
                                String uniqueCode = sb[4];
                                String email = sb[5];
                                String roomNumber = sb[7];
                                String bookingDate = sb[8];
                                advanced ad = new advanced(name, Long.parseLong(adhar), Long.parseLong(mobile), address, numberOfBeds, email);

                                ad.setUniqueCode(uniqueCode);
                                ad.setPrice();
                                ad.setRoomNumber(Integer.parseInt(roomNumber));
                                SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
                                Date date = simpleDateFormat.parse(bookingDate);
                                Timer timer = new Timer();
                                Checker checker = new Checker();
                                checker.setDate(date);
                                System.out.println("you have booked your apartment on " + date);
                                System.out.println("your monthly subscription will end on " + checker.getNext());
                                timer.schedule(checker, 0, 10000);
                                System.out.println(ad.getDetails());
                                afterBooked(ad);
                            } else System.out.println("error occurred");
                        } else System.out.println("error occurred");
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
                switch (ap) {
                    case 1:
                        System.out.println("you have choosen the rural area apartments\n");
                        System.out.println("1. Sign-up for new user");
                        System.out.println("2. Sign-in for existing user");
                        byte user = sc.nextByte();
                        if (user == 1) {
                            System.out.println("you have following type of apartments in this location");
                            System.out.println("1. 1BHK \n2. 2BHK \n3. 3BHK");
                            byte flatSizeR = sc.nextByte();
                            if (flatSizeR > 3 || flatSizeR < 1) {
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
                            Rural_area rural_area = new Rural_area(nameR, townR, adharR, mobileR, flatSizeR);
                            rural_area.setCharge();
                            rural_area.setFlatNumber();
                            System.out.println("you have successfully booked " + rural_area.flatSize + "BHK flat of rural area");
                            System.out.println("your monthly charge of apartment is " + rural_area.getMonthlyCharge());
                            System.out.println("your unique code of the apartment is " + rural_area.getUniqueCode());
                            System.out.println("your apartment number is " + rural_area.flatNumber);
                            Date date = new Date();
                            Timer timer = new Timer();
                            Checker1 checker1 = new Checker1();
                            checker1.setDate(date);
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
                            System.out.println("you have booked your apartment on " + date);
                            System.out.println("your monthly subscription will end on " + checker1.getNext());
                            String str = rural_area.name + "\n" + rural_area.permanent_address + "\n" + rural_area.adharId + "\n" + rural_area.mobileNumber + "\n" + rural_area.flatNumber + "\n" + rural_area.uniqueCode + "\n" + rural_area.flattype + "\n" + rural_area.flatSize + "\n" + simpleDateFormat.format(date) + "\n" + simpleDateFormat.format(checker1.getNext());
                            FileWriter fw = new FileWriter("apartment.txt");
                            for (int i = 0; i < str.length(); i++)
                                fw.write(str.charAt(i));
                            System.out.println("booking recorded successfully");
                            fw.close();
                            timer.schedule(checker1, 0, 10000);
                            afterRant();
                        } else if (user == 2) {
                            FileReader fr = new FileReader("apartment.txt");
                            BufferedReader bufferedReader = new BufferedReader(fr);
                            String line;
                            String[] sb = new String[10];
                            int i = 0;
                            while ((line = bufferedReader.readLine()) != null) {
                                sb[i] = line;
                                i += 1;
                            }
                            fr.close();
                            String name = sb[0];
                            String town = sb[1];
                            String adhar = sb[2];
                            String mobile = sb[3];
                            String flatSize = sb[4];
                            String uniqueCode = sb[5];
                            String flatNumber = sb[7];
                            String BookedDate = sb[8];
                            long adharI = Long.parseLong(adhar);
                            long mobileI = Long.parseLong(mobile);
                            byte flatSizeI = Byte.parseByte(flatSize);
                            Rural_area rural_area = new Rural_area(name, town, adharI, mobileI, flatSizeI);
                            rural_area.setCharge();
                            rural_area.setPreviousFlatNumber(Byte.parseByte(flatNumber));
                            rural_area.setUniqueCode(uniqueCode);
                            System.out.println("you have previously booked " + rural_area.flatSize + "BHK flat of rural area");
                            System.out.println("your monthly charge of apartment is " + rural_area.getMonthlyCharge());
                            System.out.println("your unique code of the apartment is " + uniqueCode);
                            System.out.println("your apartment number is " + rural_area.flatNumber);
                            Checker1 checker1 = new Checker1();
                            Date date = checker1.setDate(BookedDate);
                            Timer timer = new Timer();
                            checker1.setDate(date);
                            System.out.println("you have booked your apartment on " + date);
                            System.out.println("your monthly subscription will end on " + checker1.getNext());
                            timer.schedule(checker1, 0, 10000);
                            afterRant();
                        } else System.out.println("you have not given the correct choice");
                        break;
                    case 2:
                        System.out.println("you have choosen the middle of the town area apartments");
                        System.out.println("1. Sign-up for new user");
                        System.out.println("2. Sign-in for existing user");
                        byte user1 = sc.nextByte();
                        if (user1 == 1) {
                            System.out.println("you have following type of apartments in this location");
                            System.out.println("1. 1BHK \n2. 2BHK \n3. 3BHK");
                            byte flatSizeM = sc.nextByte();
                            if (flatSizeM > 3 || flatSizeM < 1) {
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
                            Middle_of_the_town middle_of_the_town = new Middle_of_the_town(nameM, townM, adharM, mobileM, flatSizeM);
                            middle_of_the_town.setCharge();
                            middle_of_the_town.setFlatNumber();
                            System.out.println("you have successfully booked " + middle_of_the_town.flatSize + "BHK flat of middle of the town area");
                            System.out.println("your monthly charge of apartment is " + middle_of_the_town.getMonthlyCharge());
                            System.out.println("your unique code of the apartment is " + middle_of_the_town.getUniqueCode());
                            System.out.println("your apartment number is " + middle_of_the_town.flatNumber);
                            Date date1 = new Date();
                            Timer timer1 = new Timer();
                            Checker1 checker11 = new Checker1();
                            checker11.setDate(date1);
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
                            System.out.println("you have booked your apartment on " + date1);
                            System.out.println("your monthly subscription will end on " + checker11.getNext());
                            String str1 = middle_of_the_town.name + "\n" + middle_of_the_town.permanent_address + "\n" + middle_of_the_town.adharId + "\n" + middle_of_the_town.mobileNumber + "\n" + middle_of_the_town.flatNumber + "\n" + middle_of_the_town.uniqueCode + "\n" + middle_of_the_town.flattype + "\n" + middle_of_the_town.flatSize + "\n" + simpleDateFormat.format(date1) + "\n" + simpleDateFormat.format(checker11.getNext());
                            FileWriter fw1 = new FileWriter("apartment.txt");
                            for (int i = 0; i < str1.length(); i++)
                                fw1.write(str1.charAt(i));
                            System.out.println("booking recorded successfully");
                            fw1.close();
                            timer1.schedule(checker11, 0, 10000);
                            afterRant();
                        } else if (user1 == 2) {
                            FileReader fr1 = new FileReader("apartment.txt");
                            BufferedReader bufferedReader1 = new BufferedReader(fr1);
                            String line1;
                            String[] sb1 = new String[10];
                            int i = 0;
                            while ((line1 = bufferedReader1.readLine()) != null) {
                                sb1[i] = line1;
                                i += 1;
                            }
                            fr1.close();
                            String name1 = sb1[0];
                            String town1 = sb1[1];
                            String adhar1 = sb1[2];
                            String mobile1 = sb1[3];
                            String flatSize1 = sb1[4];
                            String uniqueCode1 = sb1[5];
                            String flatNumber1 = sb1[7];
                            String BookedDate1 = sb1[8];
                            long adharI1 = Long.parseLong(adhar1);
                            long mobileI1 = Long.parseLong(mobile1);
                            byte flatSizeI1 = Byte.parseByte(flatSize1);
                            Middle_of_the_town middle_of_the_town = new Middle_of_the_town(name1, town1, adharI1, mobileI1, flatSizeI1);
                            middle_of_the_town.setCharge();
                            middle_of_the_town.setPreviousFlatNumber(Byte.parseByte(flatNumber1));
                            middle_of_the_town.setUniqueCode(uniqueCode1);
                            System.out.println("you have previously booked " + middle_of_the_town.flatSize + "BHK flat of middle of the town area");
                            System.out.println("your monthly charge of apartment is " + middle_of_the_town.getMonthlyCharge());
                            System.out.println("your unique code of the apartment is " + uniqueCode1);
                            System.out.println("your apartment number is " + middle_of_the_town.flatNumber);
                            Checker1 checker11 = new Checker1();
                            Date date1 = checker11.setDate(BookedDate1);
                            Timer timer1 = new Timer();
                            checker11.setDate(date1);
                            System.out.println("you have booked your apartment on " + date1);
                            System.out.println("your monthly subscription will end on " + checker11.getNext());
                            timer1.schedule(checker11, 0, 10000);
                            afterRant();
                        } else System.out.println("error occured");
                        break;
                    case 3:
                        System.out.println("you have choosen the sea facing area apartments");
                        System.out.println("1. Sign-up for new user ");
                        System.out.println("2. Sign-in for existing user");
                        byte user2 = sc.nextByte();
                        if (user2 == 1) {
                            System.out.println("you have following type of apartments in this location");
                            System.out.println("1. 1BHK \n2. 2BHK \n3. 3BHK");
                            byte flatSizeS = sc.nextByte();
                            if (flatSizeS > 3 || flatSizeS < 1) {
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
                            SeaFacing seaFacing = new SeaFacing(nameS, townS, adharS, mobileS, flatSizeS);
                            seaFacing.setCharge();
                            seaFacing.setFlatNumber();
                            System.out.println("you have successfully booked " + seaFacing.flatSize + "BHK flat of sea facing area");
                            System.out.println("your monthly charge of apartment is " + seaFacing.getMonthlyCharge());
                            System.out.println("your unique code of the apartment is " + seaFacing.getUniqueCode());
                            System.out.println("your apartment number is " + seaFacing.flatNumber);
                            Date date2 = new Date();
                            Timer timer2 = new Timer();
                            Checker1 checker12 = new Checker1();
                            checker12.setDate(date2);
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
                            System.out.println("you have booked your apartment on " + date2);
                            System.out.println("your monthly subscription will end on " + checker12.getNext());
                            String str2 = seaFacing.name + "\n" + seaFacing.permanent_address + "\n" + seaFacing.adharId + "\n" + seaFacing.mobileNumber + "\n" + seaFacing.flatNumber + "\n" + seaFacing.uniqueCode + "\n" + seaFacing.flattype + "\n" + seaFacing.flatSize + "\n" + simpleDateFormat.format(date2) + "\n" + simpleDateFormat.format(checker12.getNext());
                            FileWriter fw2 = new FileWriter("apartment.txt");
                            for (int i = 0; i < str2.length(); i++)
                                fw2.write(str2.charAt(i));
                            System.out.println("booking recorded successfully");
                            fw2.close();
                            timer2.schedule(checker12, 0, 10000);
                            afterRant();
                        } else if (user2 == 2) {
                            FileReader fr2 = new FileReader("apartment.txt");
                            BufferedReader bufferedReader2 = new BufferedReader(fr2);
                            String line2;
                            String[] sb2 = new String[10];
                            int i = 0;
                            while ((line2 = bufferedReader2.readLine()) != null) {
                                sb2[i] = line2;
                                i += 1;
                            }
                            fr2.close();
                            String name2 = sb2[0];
                            String town2 = sb2[1];
                            String adhar2 = sb2[2];
                            String mobile2 = sb2[3];
                            String flatSize2 = sb2[4];
                            String uniqueCode2 = sb2[5];
                            String flatNumber2 = sb2[7];
                            String BookedDate2 = sb2[8];
                            long adharI2 = Long.parseLong(adhar2);
                            long mobileI2 = Long.parseLong(mobile2);
                            byte flatSizeI2 = Byte.parseByte(flatSize2);
                            SeaFacing seaFacing = new SeaFacing(name2, town2, adharI2, mobileI2, flatSizeI2);
                            seaFacing.setCharge();
                            seaFacing.setPreviousFlatNumber(Byte.parseByte(flatNumber2));
                            seaFacing.setUniqueCode(uniqueCode2);
                            System.out.println("you have previously booked " + seaFacing.flatSize + "BHK flat of sea facing area");
                            System.out.println("your monthly charge of apartment is " + seaFacing.getMonthlyCharge());
                            System.out.println("your unique code of the apartment is " + uniqueCode2);
                            System.out.println("your apartment number is " + seaFacing.flatNumber);
                            Checker1 checker12 = new Checker1();
                            Date date2 = checker12.setDate(BookedDate2);
                            Timer timer2 = new Timer();
                            checker12.setDate(date2);
                            System.out.println("you have booked your apartment on " + date2);
                            System.out.println("your monthly subscription will end on " + checker12.getNext());
                            timer2.schedule(checker12, 0, 10000);
                            afterRant();
                        } else System.out.println("error occured");
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