public interface rental {
    void setCharge();
    int setFlatNumber();
    String getUniqueCode();
    int getMonthlyCharge();
    int setPreviousFlatNumber(byte number);
    static void leaveApartment(){
        flats.flatNumber -=1;
    };
    void setUniqueCode(String code);
}