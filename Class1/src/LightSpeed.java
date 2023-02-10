import java.sql.SQLOutput;

public class LightSpeed {
    public static void main(String args[]){

        //This a program regarding long data type which is 64 bit
        //find the distance of the light....
        int lightSpeed  = 299792458;
        long days = 365 ;
        long seconds ;
        long distance;

        seconds = days * 60 * 60 ;
        distance = lightSpeed * seconds ;

        System.out.println("In " + days + "");
        System.out.println("days of the light travel : " + distance);



    }
}
