import java.util.Random;

class SeaFacing extends flats implements rental{
    public SeaFacing(String name,String address,long adhar,long mobile,byte size){
        super(name,address,adhar,mobile);
        this.flatNumber = 0;
        this.flatSize = size;//in BHK
        this.flattype = "sea facing";
    }

    @Override
    public void setCharge() {
        //*electricity excluded
        monthlyCharge = 10000;
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
        uniqueCode = "ss" + randString;
        return uniqueCode;
    }

    @Override
    public int getMonthlyCharge() {
        return monthlyCharge;
    }
}