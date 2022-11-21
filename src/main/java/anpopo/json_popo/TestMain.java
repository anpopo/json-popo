package anpopo.json_popo;

import anpopo.json_popo.core.JpopoPrettier;

public class TestMain {
    public static void main(String[] args) {
        String ugly = "{\"items\":[{\"address\":\"someemail1@yahoo.com\",\"code\":\"554\",\"error\":\"554 delivery error: dd This user doesn't have a yahoo.com account (someemail1@yahoo.com) [0] - mta1481.mail.ne1.yahoo.com\",\"created_at\":\"Thu, 07 May 2015 23:07:47 UTC\"},{\"address\":\"someemail2@gmail.com\",\"code\":\"550\",\"error\":\"550 5.1.1 The email account that you tried to reach does not exist. Please try\\n5.1.1 double-checking the recipient's email address for typos or\\n5.1.1 unnecessary spaces. Learn more at\\n5.1.1 http://support.google.com/mail/bin/answer.py?answer=6596 xv3si12818843vdb.43 - gsmtp\",\"created_at\":\"Sun, 03 May 2015 13:22:49 UTC\"},{\"address\":\"someemail3@domain.com\",\"code\":\"550\",\"error\":\"550 No Such User Here\",\"created_at\":\"Thu, 02 Jul 2015 17:01:31 UTC\"},{\"address\":\"someemail4@domain.com\",\"code\":\"550\",\"error\":\"550 Administrative prohibition\",\"created_at\":\"Thu, 21 May 2015 03:30:38 UTC\"}],\"paging\":{\"first\":\"https://api.mailgun.net/v3/mg.yourdomain.com/bounces?limit=100\",\"last\":\"https://api.mailgun.net/v3/mg.yourdomain.com/bounces?page=last\\u0026limit=100\",\"next\":\"https://api.mailgun.net/v3/mg.yourdomain.com/bounces?page=next\\u0026address=someemail4%40domain.com\\u0026limit=100\",\"previous\":\"https://api.mailgun.net/v3/mg.yourdomain.com/bounces?page=previous\\u0026address=someemail1%40yahoo.com\\u0026limit=100\"}}\n";
        String singleUgly = "{\"paging\":{\"first\":\"https://api.mailgun.net/v3/mg.yourdomain.com/bounces?limit=100\",\"last\":\"https://api.mailgun.net/v3/mg.yourdomain.com/bounces?page=last\\u0026limit=100\",\"next\":\"https://api.mailgun.net/v3/mg.yourdomain.com/bounces?page=next\\u0026address=someemail4%40domain.com\\u0026limit=100\",\"previous\":\"https://api.mailgun.net/v3/mg.yourdomain.com/bounces?page=previous\\u0026address=someemail1%40yahoo.com\\u0026limit=100\"}}";

//        System.out.println(ugly);
//
//        byte[] bytes = ugly.getBytes(StandardCharsets.UTF_8);
//
//        System.out.println(Arrays.toString(bytes));
//
//        String replace = ugly.replace("\"", "");
//        System.out.println(replace);
//
//        System.out.println(Arrays.toString(replace.getBytes(StandardCharsets.UTF_8)));
//
//
//        for (char c : ugly.toCharArray()) {
//            System.out.println(c);
//        }
//

        JpopoPrettier parser = new JpopoPrettier();
        System.out.println(parser.makePretty(ugly));


    }
}
