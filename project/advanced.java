import java.util.Random;

// in this type of hotel room user will have ac rooms and special service
class advanced extends Hotel {
    String advancedHashCode;
    String email;
    boolean availibiliyOfAc = true;
    boolean availibiliyOfWifi = true;
    boolean availibilityOfView = true;
    boolean availibiltyOfSwimmingPool = true;
    int price = 4000; // advance room price
    int totalCost;

    //constructor for the advanced room class
    advanced(String n, long a, long mobile, String add, int num, String e) {
        super(n, a, mobile, add, num);
        Random rand = new Random();
        int random = rand.nextInt(10000);
        String random1 = Integer.toString(random);
        advancedHashCode = "ad" + random1;
        email = e;
    }

    //some setters and getters
    protected void setPrice() {
        float gst = (float) (0.18 * price);
        totalCost = (int) (price + gst);
    }


    String getServices() {
        String str1 = "1. For room services\n";
        String str2 = "2. For Appliance Repair or any glitch/issue\n";
        String str3 = "3. For Order of food\n";
        String str4 = "4. For water\n";
        String str5 = "5. For therapy\n";
        String str6 = "6. For medication or medical emergency\n";
        String str7 = "7. For city tour\n"; // different than special rooms
        String str8 = "8. For special Dinner arrangement\n"; // different than special rooms
        String str9 = "9. For swimming pool slot booking\n"; // different than special rooms
        String str10 = "10. For exit\n";
        return str1 + str2 + str3 + str4 + str5 + str6 + str7 + str8 + str9 + str10;
    }

    //returns the details of the booked room
    String getDetails() {
        String str1 = "your have booked advanced room with " + numberOfbeds + " number of beds\n";
        String str2 = "see your details below ----->\n";
        String str3 = "name - " + name + "\nAdhar Number - " + adharId + "\nMobile Number - " + mobileNumber + "\n city - " + address + "\nEmail - " + email;
        String str4 = "\nyou will get these additional facilities with your room ----->";
        String str5 = "\navailibility of AC ==> " + availibiliyOfAc + "\nAvailibility of Wifi ==> " + availibiliyOfWifi + "\nAvailibility of view ==> " + availibilityOfView + "\nAvailibility of Swimming pool ==> " + availibiltyOfSwimmingPool;
        String str6 = "\n \n below are your pricing details";
        String str7 = "\n Total cost of the room is " + totalCost + "\nafter adding gst " + "\nand your unique hash code is " + advancedHashCode + "\nYour room number is " + roomNumber;
        String str8 = "\n--------- Kindly do not share this unique hash code with anyone, also this is the password of your room lock ---------";
        return str1 + str2 + str3 + str4 + str5 + str6 + str7 + str8;
    }

}