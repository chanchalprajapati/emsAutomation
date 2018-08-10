package uitilities;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by chanchal.k on 31-07-2018.
 */
public class genric {
    public  static String  email_id()
    {
       String email_id  = getCurrentDateTime()+"test@testmail.mm";
       return email_id;
    }

    public static String  getCurrentDateTime ()
    {
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("ddMMyyhhmmss");
        String datetime = ft.format(dNow);
        return datetime;


    }
}
