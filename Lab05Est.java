// Lab05Est.java
// The Speeding Ticket Program
// This is the student, starting version of Lab 05E.


public class Lab05Est
{
    public static void main(String args[])
    {
        System.out.println("Lab 05E");
        System.out.println();
        System.out.println("Speeding Ticket");
        System.out.println();
        System.out.println("What is the posted speed limit?");
        int speedlimit=Expo.enterInt();                                  //speedlimit variable
        System.out.println();
        System.out.println("How fast was the car travelling in mph?");
        int speed=Expo.enterInt();                                      //speed variable
        System.out.println();
        System.out.println("Did the violation occure in a school zone? (Y/N)");
        char Schoolvio=Expo.enterChar();
        System.out.println();
        int ticket = 0;
        if(speedlimit<speed)
         {
             ticket = 75 + 6*(speed-speedlimit);
           if(speed-speedlimit>=30)
            {
                ticket= ticket + 160;
            }
           if(Schoolvio=='Y')
            {
                ticket= ticket*2;
            }
            System.out.println("Ticket Value=" + ticket);
        }
    }
}
