import java.util.Arrays;
import java.util.Scanner;

public class HomeWork5 {

public static int[] array;

    public static void main(String[] args) {

        arrayInput();
        System.out.print(Arrays.toString(sortInHigherOrder(array)));
        }

    public static void arrayInput(){
        System.out.println("Vyvedete kolko na broi chisla shte vyvejdate:");
        Scanner scanner = new Scanner(System.in);
         int arraySize=scanner.nextInt();


       System.out.println("Vyvedete chislata: ");
        for(int i=0;i<arraySize;i++) {
            int arrayNumbers=scanner.nextInt();
        }
    }


   /* public static void optionsMenu(){
        System.out.println("Menu s opcii:");
        String one="1. Sortirane na vyvedenite chisla vyv vyzhodqsht red";
        String two="2. Sortirane na vyvedenite chisla v nizhodqsht red";
        String three="3. Tyrsene na poziciq na konkretno chislo";
        String four="4. Razbyrkvane na chislata";
        String five="5. Izhislqvane na sbora na vsichki chisla";
        String six="6. Namirane na nai-golqmo chislo";
        String seven="7. Namirane na nai-malko chislo";
        String eight="8. Namirane na sredno-aritmetichno na chislata";
        String nine="9. Provekra za simetrichnost na masiva ot chisla";
        String ten="10. Obryshtane na masiva ot chisla";
        String eleven="11. Vizualizirai vyvedenite chisla";
        String twelve="12. Izhod";
        System.out.println(one +"\n"+ two+"\n"+ three+"\n"+ four+ "\n"+ five+ "\n"+six+
                "\n"+seven+ "\n"+eight+ "\n"+nine+ "\n"+ten+ "\n"+eleven+"\n"+twelve );
    } */
    public static int[] sortInHigherOrder(int[] array){
        int length=array.length;
        int temp;
        for(int i=1;i<length;i++){
            for(int j=length-1;j>=1;j--){
                if(array[j-1]>array[j]){
                    temp=array[j-1];
                    array[j-1]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }
}

