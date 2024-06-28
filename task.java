//1.The system generates a random number from a given range,say 1 to 100.


import java.util.Random;

 class Ra
{
public static void main(String args[])
{
Random r=new Random();

int num=r.nextInt(100)+1;
System.out.println("Random number is"+ num);
}
}

