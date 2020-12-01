abstract class flats {
    String name;
    String permanent_address;
    long adharId;
    long mobileNumber;
    int flatNumber;
    String uniqueCode;
    int monthlyCharge;
    byte flatSize;
    String flattype;

    public flats(String name,String permanent_address,long adharId,long mobileNumber){
        this.name = name;
        this.permanent_address = permanent_address;
        this.adharId = adharId;
        this.mobileNumber = mobileNumber;
    }
}