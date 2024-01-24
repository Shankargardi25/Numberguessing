import java.util.Scanner;

public class onlinereservation {
    public static boolean[] seats= new boolean[10];
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
while (true){
    System.out.println("\nselect any option from above :");
    System.out.println("1.view seat number ");
    System.out.println("2.reserve seat ");
    System.out.println("3.cancel reservation ");
    System.out.println("4. exit ");
    int op=sc.nextInt();
    switch (op)
    {
        case 1:
            viewseat();
            break;

        case 2:
            reserve();
            break;
        case 3:
            cancelreservation();
            break;

        case 4:
            System.exit(0);
            break;

        default:
            System.out.println("wrong choice");
            break;


    }
}
    }
    public static void viewseat(){
        for (int i=0;i< seats.length;i++){
            if (seats[i]){
                System.out.print(" X ");
            }else {
                System.out.print(i+1+" ");
            }
        }
        System.out.println();
    }
    public static void reserve(){
        System.out.println("hii,Enter seat number you wanwt to resrve between 1-10:");
        Scanner sc=new Scanner(System.in);
        int seatnumber=sc.nextInt();
        if (seatnumber<1|| seatnumber>10){
            System.out.println("wrong choice seat from above ");

        } else if (seats[seatnumber-1]) {
            System.out.println("seat already reserverd");
        }
        else {
            seats[seatnumber - 1] = true;
            System.out.println("seat reserved");
        }
    }
    public static void cancelreservation(){

        System.out.println("enter no of seats you want to cancel:");


Scanner sc=new Scanner(System.in);
int seatnumber=sc.nextInt();
if(seatnumber<1||seatnumber>10){
    System.out.println("wrong choice");
} else if (!seats[seatnumber-1]) {
    System.out.println("seat not reserved");
}
else {
    seats[seatnumber-1]=false;
    System.out.println("reservation canceled");
}

    }

    }

