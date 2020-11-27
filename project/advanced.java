import java.util.Random;

// in this type of hotel room user will have ac rooms and special service
class advanced extends special {

    //constructor for the advanced room class
    advanced(String n, long a, long mobile, String add, int num, String e) {
        super(n, a, mobile, add, num,e);
        Random rand = new Random();
        int random = rand.nextInt(10000);
        String random1 = Integer.toString(random);
        uniqueCode = "ad" + random1;
        availibilityOfView = true;
        availibiltyOfSwimmingPool = true;
        price = 4000;
    }


    public String getServices() {
        String str1 = super.getServices();
        String str7 = "7. For city tour\n"; // different than special rooms
        String str8 = "8. For special Dinner arrangement\n"; // different than special rooms
        String str9 = "9. For swimming pool slot booking\n"; // different than special rooms
        String str10 = "10. For exit\n";
        return str1 + str7 + str8 + str9 + str10;
    }

}