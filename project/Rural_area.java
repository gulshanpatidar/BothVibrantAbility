import java.util.Random;

class Rural_area extends flats implements rental{
    public Rural_area(String name,String address,long adhar,long mobile,byte size){
        super(name,address,adhar,mobile);
        this.flatNumber = 0;
        this.flatSize = size;//in BHK
        this.flattype = "Rural Area";
    }

    @Override
    public void setCharge() {
        //*electricity excluded
        monthlyCharge = 4000;
    }

    @Override
    public int setFlatNumber() {
        flatNumber+=1;
        return flatNumber;
    }

    @Override
    public int setPreviousFlatNumber(byte number) {
        this.flatNumber = number;
        return this.flatNumber;
    }

    @Override
    public String getUniqueCode() {
        Random random = new Random();
        int randInt = random.nextInt(10000);
        String randString = Integer.toString(randInt);
        uniqueCode = "rr" + randString;
        return uniqueCode;
    }

    @Override
    public int getMonthlyCharge() {
        return monthlyCharge;
    }

    @Override
    public void setUniqueCode(String code) {
        this.uniqueCode = code;
    }
}