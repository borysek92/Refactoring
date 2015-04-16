public class Euler2 {

    public static void main(String[] args) {

        int NumberOne = 0;               //pierwsza liczba ciągu fibonacciego
        int NumberTwo = 1;               //kolejna liczba ciągu fibonacciego
        int Sum = 0;                     //suma powyższych dwóch wartości ciągu fibonacciego

        do
        {
            Sum = NumberOne + NumberTwo;
            NumberOne = NumberTwo;
            NumberTwo = Sum;

            if (NumberTwo % 2 == 0) 
                Sum = Sum + NumberTwo;
        }
        while (NumberTwo < 4000000);    //pętla kończąca program, gdy kolejna liczba ciągu fibonacciego osiągnie wartość większą niż 4000000

        System.out.println(Sum);
    }
}