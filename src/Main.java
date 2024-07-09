public class Main {
    public static void main(String[] args) {
        int[] list={-7,2,7,4,90,6,10,8,-23,-2,0,15};

        int max,min;
        max=list[0];
        min=list[0];

        for(int i:list){
            if(max<i){
                max=i;
            }else if(min>i){
                min=i;
            }
        }
        System.out.println("max: "+max);
        System.out.println("min: "+min);
    }
}
