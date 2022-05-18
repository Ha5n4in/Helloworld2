import java.util.Scanner;

public class main {
    public static void main(String[] args){
        //String myString = "HelloWorld";
        //String myString = "My name is Hasnain";
        //System.out.println(myString);

        int n = 1;

        do {
            Scanner myScanner = new Scanner(System.in);
            System.out.println("Enter Length of Wall (metres)");
            double WallLength = myScanner.nextDouble();
            System.out.println("Enter Height of Wall (metres)");
            double WallHeight = myScanner.nextDouble();

            double TotalWallArea = WallLength * WallHeight;

            System.out.println("Enter Number of Windows");
            int NumOfWindows = myScanner.nextInt();
            double TotalWinArea = 0;
            double WinArea = 0;
            if (NumOfWindows > 0) {
                do {
                    System.out.println("Enter Length of Window (metres)");
                    double WinLength = myScanner.nextDouble();
                    System.out.println("Enter Height of Window (metres)");
                    double WinHeight = myScanner.nextDouble();
                    WinArea = WinLength * WinHeight;
                    TotalWinArea = TotalWinArea + WinArea;
                    NumOfWindows = NumOfWindows - 1;

                } while (NumOfWindows > 0);
            }


            System.out.println("Enter Number of Doors");
            int NumOfDoors = myScanner.nextInt();
            double TotalDoorArea = 0;
            double DoorArea = 0;
            if (NumOfDoors > 0) {
                do {
                    System.out.println("Enter Length of Door (metres)");
                    double DoorLength = myScanner.nextDouble();
                    System.out.println("Enter Height of Door (metres)");
                    double DoorHeight = myScanner.nextDouble();
                    DoorArea = DoorLength * DoorHeight;
                    TotalDoorArea = TotalDoorArea + DoorArea;
                    NumOfDoors = NumOfDoors - 1;
                } while (NumOfDoors > 0);
            }

            System.out.println("Enter Number of Sockets");
            int NumOfSocs = myScanner.nextInt();
            double TotalSocArea = 0;
            double SocArea = 0;
            if (NumOfSocs > 0) {
                do {
                    System.out.println("Enter Length of Socket (metres)");
                    double SocLength = myScanner.nextDouble();
                    System.out.println("Enter Height of Socket (metres)");
                    double SocHeight = myScanner.nextDouble();
                    SocArea = SocLength * SocHeight;
                    TotalSocArea = TotalSocArea + SocArea;
                    NumOfSocs = NumOfSocs - 1;
                }while (NumOfSocs > 0 );
            }

            double ActWallArea = TotalWallArea - TotalWinArea - TotalDoorArea - TotalSocArea;

            System.out.println("Area covered per bucket of paint (m2)");
            double BucketArea = myScanner.nextDouble();
            double BucketsNeeded = ActWallArea / BucketArea;

            System.out.println("Length of Wall: " + WallLength + " m");
            System.out.println("Height of Wall: " + WallHeight + " m");
            System.out.println("Total Area of Wall: " + TotalWallArea + " m2");
            System.out.println("Actual Area of Wall: " + ActWallArea + " m2");
            System.out.println(Math.ceil(BucketsNeeded) + " Buckets of paint needed");

            System.out.println("Calculate new wall (yes/no)");
            String NewWall = myScanner.next().toLowerCase();

            switch (NewWall)
            {
                case "yes":
                    n = 1;
                    break;

                case "no":
                    n = 0;
                    break;
            }
        }
        while (n > 0);
    }
}