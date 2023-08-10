package Q12Time;

import java.util.Scanner;

public class Q12Time {
	
		/*
		 * this program used for sum the clock angle
		 * this program have a function for sum clock angle (hour and minute angle)
		 */
	
		public static int TimeAngle(double h, double m) // initializing the function ( for sum clock angle )
		{
	        if (m == 60) // if minute = 60, hour gonna plus one
	        {
	        	m = 0;
	        	h += 1;
	        }
	        
	        if(h>=12) // if hour more than 12, hour gonna be minus 12 (because in analogue clock only have 12 hour
	        	h = h-12;
	 
	        // Calculate the angles moved by hour and minute hands
	        // with reference to 12:00
	        int hour_angle = (int)(0.5 * (h*60 + m)); // formula for hour angle
	        int minute_angle = (int)(6*m); // formula for minute angle
	        int angle; // declare the variable
	        
	        if(hour_angle<minute_angle) { // if hour angle less than minute angle, the sum will used the outter angle not the inner angle
	        	angle = hour_angle+360-minute_angle;
	        }
	 
	        else { // this case if hour angle more than minute angle
	        	 angle = Math.abs(hour_angle - minute_angle);
	 
	        	 // smaller angle of two possible angles
	        	 angle = Math.min(360-angle, angle);
	        }
	       
	 
	        return angle; // return the value for angle (after summing progress)
	    }
	     
	    // Driver Code
	    public static void main (String[] args)
	    {
	    	double Hour, Minute; // declare variables
	    	Scanner Input = new Scanner (System.in); // initializing for input
	    	
	    	Hour= Input.nextDouble(); //initializing input (hour)
	    	Minute= Input.nextDouble(); // intializing input (minute)
	    	
	        System.out.println(TimeAngle(Hour, Minute)+" degree"); //print the output (sum angle)
	        
	        Input.close(); // close the input
	    }

}
