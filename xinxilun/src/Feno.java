import java.util.Scanner;

public class Feno {
    static String[] p= {"","","","","","","","","","","",""};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Feno t = new Feno();
        System.out.println("输入信源的个数：");
        int num = sc.nextInt();
        double[] a = new double[num];
        System.out.println("输入概率：");
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextDouble();
        }
        if(!t.varification(a)){
            System.out.println("输入的概率有误！");
            return;
        }

        int count = a.length;
        for(int i=0;i<count;i++){
            for(int j=i;j<count;j++) {
                if(a[i]<a[j]){
                    double temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

        fano(0,count-1,a);
        System.out.println("概率             费诺编码");
        for(int i=0;i<count;i++) {
            System.out.printf("%.3f\t\t\t",a[i]);
            System.out.printf("%s\n",p[i]);
        }
    }

    public static void fano(int m,int n,double y[]) {
        int i,k;
        double sum=0.0,s=0.0,s1;
        if(m==n) {
            return;
        }
        for(i=m;i<=n;i++) {
            sum=sum+y[i];
        }
        k=m;
        do{
            s1=s;
            s=s+y[k++];
        }while(s<=sum-s);
        if((sum-2*s1)<=(2*s-sum)) {
            k--;
        }
        for(i=m;i<k;i++) {
            p[i]=p[i]+"0";
        }
        for(i=k;i<=n;i++) {
            p[i]=p[i]+"1";
        }
        fano(m,k-1,y);
        fano(k,n,y);
    }

    public boolean varification(double[] p){
        boolean bool = false;
        double d = 0;
        for(int i = 0; i < p.length; i++){
            d+=p[i];
        }
        if(d - 1.0 < 0.000001){
            return true;
        }
        return bool;
    }

}
