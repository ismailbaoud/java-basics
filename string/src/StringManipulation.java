import java.sql.SQLOutput;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.GregorianCalendar;

        //count, search, cut
//        String str1 = "hello world w";
//        System.out.println(str1.length());
//        int position = str1.indexOf("l");
//        String sub = str1.substring(position);
//        System.out.println(position+ " " + sub);

        //remove white spaces

//        String str1 = "     ismail               j";
//        String str2 = "         ismail";
//        System.out.print(str1.trim() );
//        System.out.print(str2.trim().length());

        //date time -7 version gregorian calendar
//        Date date = new Date();
//        System.out.println(date);
//
//        GregorianCalendar gs = new GregorianCalendar(2016,1,30);
//        Date d2 = gs.getTime();
//        System.out.println(gs.getTime());
//        gs.add(GregorianCalendar.DATE,1);
//        System.out.println(gs.getTime());
//
//        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
//        System.out.println(gs.getTime());

        // new api time +7 with  your style

//        LocalDateTime ldt = LocalDateTime.now();
//        System.out.println(ldt);
//
//        DateTimeFormatter dtf = DateTimeFormatter.ISO_DATE;
//        System.out.println(dtf.format(ldt));
//
//        FormatStyle fs = FormatStyle.MEDIUM;
//        DateTimeFormatter dtfs = DateTimeFormatter.ofLocalizedDate(fs);
//        System.out.println(dtfs.format(ldt));
//
//        DateTimeFormatter dtfp = DateTimeFormatter.ofPattern("dd/MM/Y:H:m:s");
//        System.out.println(dtfp.format(ldt));
//
//        LocalDate ldt2 = LocalDate.of(2015,12,30);
//        System.out.println(dtfs.format(ldt2));

        //syntax err && run time exeption

//        System.out.println("program started");
//
//        char letters[] = {'h', 'i'};
//        System.out.println(letters[2]);


        //try / catch
//        try {
//
//        String ageS = "21 years";
//        int ageI = Integer.parseInt(ageS);
//        String s = "hello! i'm "+ageS;
//        char chars[] = s.toCharArray();
//            for(int i = 0; i <= chars.length; i++){
//                System.out.println(chars[i]);
//            }
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("index not found");
//        } catch (Exception e) {
//            System.out.println("error handler");
//        }
//        System.out.println("finished");
//    }


//    public static void main(String[] args) throws RuntimeException {
//        try {
//        String ageS = "212";
//        int ageI = Integer.parseInt(ageS);
//        if(ageI >120){
//            throw(new Exception("zombies are not allowed!"));
//        }
//        String s = "hello! i'm "+ageS;
//        char chars[] = s.toCharArray();
//            for(int i = 0; i <= chars.length; i++){
//                System.out.println(chars[i]);
//            }
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("index not found");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println("finished");
//    }
//public static void main(String[] args) {
//    int number  = square(5, 7);
//    System.out.println(number);
//}
//
//    public static int square(int number, int number1){
//        int result = number * number1;
//        int r = adition(result);
//        return r;
//    }
//
//    public static int adition(int number){
//        return number + number;
//    }

//    public static void main(String[] args) {
//        surface(6,7);
//    }

//    public static void surface(int a){
//        int s = a*a;
//        System.out.println("s = "+s);
//    }
//    public static void surface(int a,int b){
//        int s = a*a*b;
//        System.out.println("s = "+s);
//    }
//    public static void surface(){
//        System.out.println("hello world");
//    }




//}



