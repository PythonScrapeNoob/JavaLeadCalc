import java.util.Scanner;

public class APLeadCalcl extends PlatformTables{
    static double investment;
    static String platformChoice;
    static String leadIndustry;
    
    public static void main(String[] args) {
        
        String[] platform = {"facebook", "google"};

         Scanner scanner = new Scanner(System.in);

         System.out.print("Enter a number: ");

                boolean validDoub = false;
            if (scanner.hasNextDouble()){
                validDoub = true;
            }
             if (validDoub){
              investment = scanner.nextDouble();

        } else{
            System.exit(1);
        }

           boolean platFound = false;
           System.out.println("Input a platform ");
           platformChoice = scanner.next();
           for (String i : platform) {
               if (platformChoice.equalsIgnoreCase(i)) {
                   platFound = true;
                   break;      
           }
        }
        if (!platFound)
        {System.out.println("Invalid platform");
    }
        
        System.out.println("Input the industry you are in ");
        leadIndustry = scanner.next();

        switch (platformChoice) {
            case  "facebook":
            for (String key : facebook.keySet()) {
                if (key.equalsIgnoreCase(leadIndustry)) {
                    double value = facebook.get(key);
                    double calcFacebook = investment / value;
                    int roundedFacebook = (int) Math.round(calcFacebook);
                    if (roundedFacebook < 0){
                        System.out.println("The amount invested is not enough to get a single lead.");
                    } else {
                    System.out.println("The amount of leads you can get on " + platformChoice + " based on your investment is " + roundedFacebook + " leads.");
                    System.exit(1);
                    break;
                    }
                }
            }

            case "google":
            for (String keyGo : google.keySet()) {
                if (keyGo.equalsIgnoreCase(leadIndustry)) {
                double valueGoogle = google.get(keyGo);
                double calcGoogle = investment / valueGoogle;
                int roundedGoogle = (int) Math.round(calcGoogle);
                if (roundedGoogle < 0){
                    System.out.println("The amount invested is not enough to get a single lead.");
                } else {
                System.out.println("The amount of leads you can get on " + platformChoice + " based on your investment is " + roundedGoogle + " leads.");
                break;
        
                }
             scanner.close();
            }
        }
    }
}
}

                
        
           

      