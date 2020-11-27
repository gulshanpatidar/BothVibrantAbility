import java.util.Random;

class Basic extends Hotel {
    //    in this type of service we provide user rooms with non ac and with no special views
    String basicHashCode;
    String email;
    boolean availibiliyOfAc = false;
    boolean availibiliyOfWifi = false;
    boolean availibilityOfView = false;
    boolean availibiltyOfSwimmingPool = false;
    int price = 1000; // basic room price
    int totalCost = 0;

    //constructor for the basic room class
    Basic(String n, long a, long mobile, String add, int num, String e) {
        super(n, a, mobile, add, num);
        Random rand = new Random();
        int random = rand.nextInt(10000);
        String random1 = Integer.toString(random);
        basicHashCode = "bs" + random1;
        email = e;
    }
    //some setters and getters
    protected void setPrice() {
        float gst = (float) (0.18 * price);
        totalCost = (int) ( price + gst);
    }

    String getServices() {
        String str1 = "1. For room services\n";
        String str2 = "2. For Appliance Repair or any glitch/issue\n";
        String str3 = "3. For Order of food\n";
        String str4 = "4. For water";
        String str5 = "5. for exit";
        return str1 + str2 + str3 + str4 + str5;
    }
    //returns the details of room
    String getDetails() {
        String str1 = "your have booked basic room with " + numberOfbeds + " number of beds\n";
        String str2 = "see your details below ----->\n";
        String str3 = "name - " + name + "\nAdhar Number - " + adharId + "\nMobile Number - " + mobileNumber + "\n city - " + address + "\nEmail - " + email;
        String str4 = "\nyou will get these additional facilities with your room ----->";
        String str5 = "\navailibility of AC ==> " + availibiliyOfAc + "\nAvailibility of Wifi ==> " + availibiliyOfWifi + "\nAvailibility of view ==> " + availibilityOfView + "\nAvailibility of Swimming pool ==> " + availibiltyOfSwimmingPool;
        String str6 = "\n \n below are your pricing details";
        String str7 = "\n Total cost of the room is " + totalCost + "\nafter adding gst " + "\nand your unique hash code is " + basicHashCode + "\nYour room number is " + roomNumber;
        String str8 = "\n--------- Kindly do not share this unique hash code with anyone, also this is the password of your room lock ---------";
        return str1 + str2 + str3 + str4 + str5 + str6 + str7 + str8;
    }

}