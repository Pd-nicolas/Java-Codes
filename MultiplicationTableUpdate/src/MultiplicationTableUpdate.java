import java.util.Scanner;
public class MultiplicationTableUpdate{
    public static void main(String[] args) {
        Scanner loop = new Scanner(System.in);
        int numb,repetitionAmount,calculation;
        int increment = 0;

        System.out.println("type a number to build the multiplication table");
        numb = loop.nextInt();
        System.out.println("now, type how many multiplications you want");
        repetitionAmount = loop.nextInt();
        System.out.println("the multiplication table of " + numb + " is:");

        while(increment < repetitionAmount){
            increment++;
            calculation = increment * numb;
            System.out.println(increment + " x " + numb + " = " + calculation);
        }
    }
}