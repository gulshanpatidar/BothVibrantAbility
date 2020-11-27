import java.util.Random;

//    in this type of hotel room user will have ac service but do not have any special view
class special extends Hotel {
    String specialHashCode;
    String email;
    boolean availibiliyOfAc = true;
    boolean availibiliyOfWifi = true;
    boolean availibilityOfView = false;
    boolean availibiltyOfSwimmingPool = false;
    int price = 2000; // special room price
    int totalCost;

    //constructor for special room class
    special(String n, long a, long mobile, String add, int num, String e) {
        super(n, a, mobile, add, num);
        Random rand = new Random();
        int random = rand.nextInt(10000);
        String random1 = Integer.toString(random);
        specialHashCode = "sp" + random1;
        email = e;
    }

    //some getters and setters
    protected void setPrice() {
        float gst = (float) (0.18 * price);
        totalCost = (int) (price + gst);
    }

    String getServices() {
        String str1 = "1. For room services\n";
        String str2 = "2. For Appliance Repair or any glitch/issue\n";
        String str3 = "3. For Order of food\n";
        String str4 = "4. For water\n";
        String str5 = "5. For therapy\n"; // different than basic rooms
        String str6 = "6. For medication or medical emergency\n"; // different than basic rooms
        String str7 = "7. For exit\n";
        return str1 + str2 + str3 + str4 + str5 + str6 + str7;
    }

    //returns the details of the booked room
    String getDetails() {
        String str1 = "your have booked special room with " + numberOfbeds + " number of beds\n";
        String str2 = "see your details below ----->\n";
        String str3 = "name - " + name + "\nAdhar Number - " + adharId + "\nMobile Number - " + mobileNumber + "\n city - " + address + "\nEmail - " + email;
        String str4 = "\nyou will get these additional facilities with your room ----->";
        String str5 = "\navailibility of AC ==> " + availibiliyOfAc + "\nAvailibility of Wifi ==> " + availibiliyOfWifi + "\nAvailibility of view ==> " + availibilityOfView + "\nAvailibility of Swimming pool ==> " + availibiltyOfSwimmingPool;
        String str6 = "\n \n below are your pricing details";
        String str7 = "\n Total cost of the room is " + totalCost + "\nafter adding gst " + "\nand your unique hash code is " + specialHashCode + "\nYour room number is " + roomNumber;
        String str8 = "\n--------- Kindly do not share this unique hash code with anyone, also this is the password of your room lock ---------";
        return str1 + str2 + str3 + str4 + str5 + str6 + str7 + str8;
    }

}
