package problemSolving;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TimeConversion {
	
	/*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        String[] clockStrings = s.split(":");
        String hoursString = clockStrings[0];
        String minutesString = clockStrings[1];
        String secondeString = clockStrings[2].substring(0,2);// 45
        String timeSystemString = clockStrings[2].substring(2,4); //PM
        int tempHours = 0;
        
        if(timeSystemString.equalsIgnoreCase("PM") ){
            if(Integer.parseInt(hoursString)<12){
                tempHours = 12 + Integer.parseInt(hoursString) ;
                hoursString = Integer.toString(tempHours);
            }
        }
        if(timeSystemString.equalsIgnoreCase("AM")){
            //'hoursString'==12, 
            if(Integer.parseInt(hoursString) == 12){
                hoursString="00";
                
            }
            

        }
        
        return hoursString + ':' + minutesString + ':' + secondeString;
    }
        private static final Scanner scan = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            String s = scan.nextLine();

            String result = timeConversion(s);

            bw.write(result);
            bw.newLine();

            bw.close();
        }
}
