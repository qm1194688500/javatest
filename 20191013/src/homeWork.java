public class homeWork {
    public static void main(String[] args){
       /* int i,j=0,sum=0;
        for(i=1;i<=99;i++){
            int ge =i%10;
            int shi = i/10%10;
            if(ge==9){
                j+=1;
            }
            if(shi ==9){
                sum += 1;
            }
        }
        System.out.println(sum+j);*/
        for(int i = 100;i <= 999;i++){
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i/100;
            if (ge*ge*ge + shi*shi*shi + bai*bai*bai == i){
                System.out.println(i);
            }
        }
    }
}
