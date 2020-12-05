import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimerTask;
import java.util.Date;

class Checker1 extends TimerTask {
    Date booking;
    Date now;
    Date next;

    public void setDate(Date date) throws ParseException {
        this.booking = date;
        SimpleDateFormat sdformat = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
//        System.out.println(sdformat.format(date));
        String my = sdformat.format(booking);
        String str1 = my.substring(0,3);
        String str2 = my.substring(3,5);
        String str3 = my.substring(5);
        int i = Integer.parseInt(str2);
        if (i<12){
            i+=1;
        }else i=1;
        str2 = Integer.toString(i);
//        System.out.println(str1+str2+str3);
        String nextDate = str1+str2+str3;
//        System.out.println(nextDate);
        this.next = sdformat.parse(nextDate);
    }

    public Date setDate(String date) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        Date current = simpleDateFormat.parse(date);
        return current;
    }

    public Date getNext(){
        return this.next;
    }

    @Override
    public void run() {
        now = new Date();
        if (now.compareTo(this.next)==0){
            System.out.println("your session expired");
            rental.leaveApartment();
            System.exit(0);
        }
    }
}