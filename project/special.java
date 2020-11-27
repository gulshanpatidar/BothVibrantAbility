import java.util.Random;

//    in this type of hotel room user will have ac service but do not have any special view
class special extends Basic {

    //constructor for special room class
    special(String n, long a, long mobile, String add, int num, String e) {
        super(n, a, mobile, add, num,e);
        Random rand = new Random();
        int random = rand.nextInt(10000);
        String random1 = Integer.toString(random);
        uniqueCode = "sp" + random1;
        availibiliyOfAc = true;
        availibiliyOfWifi = true;
        price = 2000;
    }

    public String getServices() {
        String str1 = super.getServices();
        String str5 = "\n5. For therapy\n"; // different than basic rooms
        String str6 = "6. For medication or medical emergency\n"; // different than basic rooms
        return str1 + str5 + str6;
    }

}
