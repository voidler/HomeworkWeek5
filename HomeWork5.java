import java.util.Arrays;
import java.util.Scanner;

public class HomeWork5 {

    public static Scanner scan = new Scanner(System.in);
    public static int[] array;
    public static final int ELEMENT_NOT_FOUND = -1;

    public static void main(String[] args) {

        arrayInput();
        optionsMenu();
        izbiraneNaOpciqOtMenuto();

    }

    public static void izbiraneNaOpciqOtMenuto() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nIzberete opciq ot menuto: ");
        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                sortInAscendingOrder(array);
                optionsAfterChoosingFromMenu();
                break;
            case 2:
                sortInDescendingOrder(array);
                optionsAfterChoosingFromMenu();
            case 3:
                findElementWithBinarySearch();
                optionsAfterChoosingFromMenu();
                break;
            case 4:
               shuffleArray(array);
                optionsAfterChoosingFromMenu();
                break;
            case 5:
                sumOfArrayNumbers(array);
                optionsAfterChoosingFromMenu();
                break;
            case 6:
                largestNumberInArray(array);
                optionsAfterChoosingFromMenu();
                break;
            case 7:
                smallestNumberInArray(array);
                optionsAfterChoosingFromMenu();
                break;
            case 8:
                averageOfArray(array);
                optionsAfterChoosingFromMenu();
                break;
            case 9:
                optionsAfterChoosingFromMenu();
                break;
            case 10:
               shuffleNumbersOfArray(array);
                optionsAfterChoosingFromMenu();
                break;
            case 11:
                visualisingArray(array);
                optionsAfterChoosingFromMenu();
                break;
            case 12:
                programExit();
            default:
                System.out.print("Nevalidna opciq. Opitaite otnovo.");
                optionsAfterChoosingFromMenu();
        }
    }

    public static void arrayInput() {
        System.out.println("Vyvedete kolko na broi chisla shte vyvejdate:");
        Scanner scan = new Scanner(System.in);
        int arraySize = scan.nextInt();

        array = new int[arraySize];

        System.out.println("Vyvedete chislata na masiva: ");
        for (int i = 0; i < arraySize; i++) {
            array[i] = scan.nextInt();
        }
    }


    public static void optionsMenu() {
        System.out.println("Menu s opcii:");
        String one = "1. Sortirane na vyvedenite chisla vyv vyzhodqsht red";
        String two = "2. Sortirane na vyvedenite chisla v nizhodqsht red";
        String three = "3. Tyrsene na poziciq na konkretno chislo";
        String four = "4. Razbyrkvane na chislata";
        String five = "5. Izhislqvane na sbora na vsichki chisla";
        String six = "6. Namirane na nai-golqmo chislo";
        String seven = "7. Namirane na nai-malko chislo";
        String eight = "8. Namirane na sredno-aritmetichno na chislata";
        String nine = "9. Provekra za simetrichnost na masiva ot chisla";
        String ten = "10. Obryshtane na masiva ot chisla";
        String eleven = "11. Vizualizirai vyvedenite chisla";
        String twelve = "12. Izhod";
        System.out.println(one + "\n" + two + "\n" + three + "\n" + four + "\n" + five + "\n" + six +
                "\n" + seven + "\n" + eight + "\n" + nine + "\n" + ten + "\n" + eleven + "\n" + twelve);
    }

    public static void sortInAscendingOrder(int[] array) {
        int length = array.length;
        int temp;
        System.out.print("Sortiran masiv vyv vyzhodqsht red: ");
        for (int i = 1; i < length; i++) {
            for (int j = length - 1; j >= i; j--) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;

                }
            }

           }
        for(int elements:array){
            System.out.print(elements + " ");
        }
    }




    public static void sortInDescendingOrder(int[] array) {
        int length = array.length;
        int temp;
        System.out.print("\nSortiran masiv v nizhodqsht red: ");
        for (int i = 1; i < length; i++) {
            for (int j = length - 1; j >= i; j--) {
                if (array[j - 1] < array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int elements : array) {
            System.out.print(elements + " ");
        }
    }

    public static int binarySearch(int element, int leftIndex, int rightIndex) {
        int left = leftIndex;
        int right = rightIndex;
        int middle = (left + right) / 2;

        while (left <= right) {
            if (element == array[middle]) {
                return middle;
            } else if (element < array[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
            middle = (left + right) / 2;
        }
        return ELEMENT_NOT_FOUND;
    }
    public static void findElementWithBinarySearch(){
        System.out.print("\n Vyvedete chislo ,chiqto poziciq iskate da namerite: ");
        int elementToFind=scan.nextInt();

        int foundElementIndex=binarySearch(elementToFind,0,array.length-1);
        if(foundElementIndex==ELEMENT_NOT_FOUND){
            System.out.print("Chisloto %d ne e nameren!\n");
        } else{
            System.out.printf("Chisloto e nameren na poziciq: %d\n",
                    (foundElementIndex+1));

        }
    }

    public static void shuffleArray(int[] array){
        for(int i=0;i<array.length;i++){
            int index=(int)(Math.random() * array.length);
            int temp=array[i];
            array[i]=array[index];
            array[index]=temp;
        }
        for(int elements:array) {
            System.out.print(elements + " ");
        }
    }

    public static void sumOfArrayNumbers(int[] array){
       int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        } System.out.print("Sumata na chislata e: " +sum);
    }

    public static void largestNumberInArray(int[] array){
            int largest=array[0];
            for(int i=0;i<array.length;i++){
                if(largest<array[i]){
                    largest=array[i];
                }
            }
            System.out.print("Nai-golqmoto chislo e: " +largest);
    }

    public static void smallestNumberInArray(int[] array){
        int smallest=array[0];
        for(int i=0;i<array.length;i++){
            if(smallest>array[i]){
                smallest=array[i];
            }
        }
        System.out.print("Nai-golqmoto chislo e: " +smallest);
    }

    public static void averageOfArray(int[] array){
        int average;
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        average=sum/array.length;
        System.out.println("Sredno aritmetichnoto na chislata e: " +average);
    }


    public static void shuffleNumbersOfArray(int[] array){
        for (int i=0;i<array.length/2;i++){
            int temp=array[i];
            array[i]=array[array.length-i-1];
            array[array.length-i-1]=temp;
        }
        for(int elements:array) {
            System.out.print(elements + " ");
        }
    }
    public static void visualisingArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print( array[i] +  "," );
        }
    }
    public static void programExit(){
        System.exit(0);
    }

    public static void optionsAfterChoosingFromMenu(){
        System.out.print("\nZa vryshtane obratno v menuto natisnete 1. " +
                         "\nZa izlizane ot programata natisnete 2. ");
        int choice=scan.nextInt();
        switch(choice){
            case 1:optionsMenu();
            izbiraneNaOpciqOtMenuto();
            break;
            case 2: System.exit(0);
        }
    }
}

