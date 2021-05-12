// Stu's super amazing Easter Year calculator!!!!

public class Beeby implements FinalProject
{
    public Beeby()
    {

    }

    public void begin() throws NumberFormatException
    {
        int vInput;
        System.out.println("Enter a year");
        try
        {
            vInput = Itse2417Main.myScan.nextInt();
            if(vInput > 0)
            {
                Easter(vInput);
            }
            else
            {
                throw new NumberFormatException();
            }
        }
        catch(InterruptedException e)
        {
            
        }
        catch(NumberFormatException e)
        {
            System.out.println("Needs to be a positive number!");
            try
            {
                java.util.concurrent.TimeUnit.SECONDS.sleep(2);  
            }
            catch(InterruptedException f)
            {} 
        }
        
    }
    
    public void Easter(int yearInt) throws InterruptedException
    {
        String month;
        String ordinal;
        int a,b,c,d,e,g,h,j,k,m,n,p,r;
        
        a = yearInt%19;
        b = yearInt/100;
        c = yearInt%100;
        d = b/4;
        e = b%4;
        g = ((8*b)+13)/25;
        h = ((19*a)+b-d-g+15)%30;
        j = c/4;
        k = c%4;
        m = (a+11*h)/319;
        r = ((2*e)+(2*j)-k-h+m+32)%7;
        n = (h-m+r+90)/25;
        p = (h-m+r+n+19)%32;
        
        ordinal = ordinalCalculator(p);
        
        if (n == 4)
        {
            month = "April";
        }
        else
        {
            month = "March";
        }
        
        System.out.println("Therefore, in " + yearInt + ", Easter Sunday fell on " + month + " " + p + ordinal);
        System.out.println();
        System.out.println();
        java.util.concurrent.TimeUnit.SECONDS.sleep(2);  
    }
    
    public static String ordinalCalculator(int dayNumber)
    {
        String ordinal;
        if (dayNumber == 1 || dayNumber == 21 || dayNumber == 31)
        {
            ordinal = "st";
        }
        else if (dayNumber == 2 || dayNumber == 22)
        {
            ordinal = "nd";
        }
        else if (dayNumber == 3 || dayNumber == 23)
        {
            ordinal = "rd";
        }
        else
        {
            ordinal = "th";
        }
        return ordinal;
    }
}
