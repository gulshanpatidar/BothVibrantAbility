import java.util.Random;

class Middle_of_the_town extends flats implements rental{
    public Middle_of_the_town(String name,String address,long adhar,long mobile,byte size){
        super(name,address,adhar,mobile);
        this.flatNumber = 0;
        this.flatSize = size;//in BHK
        this.flattype = "Middle of the town";
    }

    @Override
    public void setCharge() {
        //*electricity excluded
        monthlyCharge = 7000;
    }

    @Override
    public int setFlatNumber() {
        flatNumber+=1;
        return flatNumber;
    }

    @Override
    public String getUniqueCode() {
        Random random = new Random();
        int randInt = random.nextInt(10000);
        String randString = Integer.toString(randInt);
        uniqueCode = "mm" + randString;
        return uniqueCode;
    }

    @Override
    public int getMonthlyCharge() {
        return monthlyCharge;
    }
}