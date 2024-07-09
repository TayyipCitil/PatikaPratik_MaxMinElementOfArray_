import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {-7, 2, 7, 4, 90, 6, 10, 8, -23, -2, 0, 15};

        int max, min;
        max = list[0];
        min = list[0];

        for (int i : list) {
            if (max < i) {
                max = i;
            } else if (min > i) {
                min = i;
            }
        }
        System.out.println("max: " + max);
        System.out.println("min: " + min);

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı: ");
        int value = input.nextInt();
        nearValue(list, value, max, min);
    }


    static void nearValue(int[] list, int value, int max, int min) {
        //dizinin girdiğimiz değerden küçük veya büyük olan en yakın değerlerini bul
        int nearBig, nearSmall;
        nearBig = max;
        nearSmall = min;
        for (int i : list) {
            if (i < value && i > nearSmall) {
                nearSmall = i;
            } else if (i > value && i < nearBig) {
                nearBig = i;
            }
        }
        if(value<min){
            System.out.println("En yakın büyük: "+nearBig);
        }else if(value>max){
            System.out.println("En yakın küçük: "+nearSmall);
        }else {
            System.out.println("En yakın büyük: "+nearBig);
            System.out.println("En yakın küçük: "+nearSmall);
        }
    }
}
