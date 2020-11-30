import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimerTask;
import java.util.Date;

class Checker extends TimerTask{
    Date booking;
    Date now;
    Date next;

    public void setDate(Date date) throws ParseException {
        this.booking = date;
        SimpleDateFormat sdformat = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
//        System.out.println(sdformat.format(date));
        String my = sdformat.format(booking);
        String str1 = my.substring(0,2);
        String str2 = my.substring(2);
        int i = Integer.parseInt(str1);
        i+=1;
        str1 = Integer.toString(i);
//        System.out.println(str1+str2);
        String nextDate = str1+str2;
//        System.out.println(nextDate);
        this.next = sdformat.parse(nextDate);
    }

    public Date getNext(){
        return this.next;
    }

    @Override
    public void run() {
        now = new Date();
        if (now.compareTo(this.next)==0){
            System.out.println("your session expired");
            System.exit(0);
        }
    }
}