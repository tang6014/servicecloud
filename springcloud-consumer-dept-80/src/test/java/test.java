import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class test {
    public static void main(String[] args){
        int[] arr =new int[]{0, 50, 65, 91, 42, 4896, 496, 87, 99,12,22};
        //quickSort(arr,0,arr.length-1);
        //insertSort(arr);

        radixSort(arr);


        System.out.println(Arrays.toString(arr));
    }


    public static void quickSort(int[] arr,int start,int end){
        if (start<end){

            //把数组中的第0个数字作为标准数
            int i = arr[start];
            //记录排序下标
            int low=start;
            int high=end;
            while (high>low){
                //右边数字比标准数大
                while (low<high&&i<=arr[high]){
                    high--;
                }
                //如果不满足上面的while条件，就替换
                arr[low]=arr[high];
                //如果左边的比标准数小
                while (low<high && i>=arr[low]){
                    low++;
                }
                arr[high]=arr[low];


            }
            arr[low]=i;
            quickSort(arr,start,low);
            quickSort(arr,low+1,end);
        }

    }



    public static void insertSort(int[] arr){

            for (int i = 1; i <arr.length ; i++) {
              if(arr[i]<arr[i-1]){
                  int temp = arr[i];
                  int j;
                  for (j = i-1; j >=0&&temp<arr[j];j--) {
                    arr[j+1]=arr[j];
                  }
                  arr[j+1]=temp;
            }

        }
    }

    public static void selectSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
           int minindex=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[minindex]<arr[j]);
                minindex=j;
            }
            if(i!=minindex){
                int temp=arr[i];
                arr[i]=arr[minindex];
                arr[minindex]=temp;
            }

        }
    }


    public static void mergeSort(int[] arr,int low,int heigh){

        int middle=(heigh+low)/2;
        if(low<heigh){
            mergeSort(arr,low,middle);
            mergeSort(arr,middle+1,heigh);
            merge(arr,low,middle,heigh);
        }

    }

    public static  void  merge(int[] arr ,int low,int middle,int heigh){
        //新建数组存储归并后的临时数组
        int[] temp = new int[heigh - low + 1];
        //记录第一个数组中的下标
        int i = low;
        //记录第二个数组中的下标
        int j=middle+1;
        //记录临时数组的下标
        int index=0;
        //遍历两个数组，取出小的数字，放入临时数组中
        while (i<=middle&&j<=heigh){
            if(arr[i]<=arr[j]){
                temp[index]=arr[i];
                i++;
            }else {
                temp[index]=arr[j];
                j++;
            }
            index++;
        }
       // System.out.println(Arrays.toString(temp));
      //  System.out.println(i+" "+j);
        while (i<=middle){
            temp[index]=arr[i];
            i++;
            index++;
        }
       // System.out.println(Arrays.toString(temp));
        while (j<=heigh){
            temp[index]=arr[j];
            j++;
            index++;
        }
      //  System.out.println(Arrays.toString(temp));
        for (int k = 0; k <heigh - low + 1; k++) {
            arr[low+k]=temp[k];
        }

    }

    public static void radixSort(int[] arr){
        int max=Integer.MIN_VALUE;
        //取出最大值
        for (int i: arr) {
            if (i>max){
                max=i;
            }
        }
        System.out.println(max);
        //计算最大值的位数
        int length = String.valueOf(max).length();
        //临时存放数据
        int[][] temp = new int[10][arr.length];

        //记录每个数组中的数量
        int[] counts=new int[arr.length];
        int ys=0;
        int[] newcount=new int[arr.length];
        for (int j = 0,n=1; j < length; j++,n*=10) {
            //把数字按每个位数上的数字分组
            //比如291在第一次放在int[1][counts[1]]中
            //下标counts[1]自增；
            for (int i = 0; i < arr.length; i++) {
                ys=arr[i]/n%10;
                temp[ys][counts[ys]]=arr[i];
                counts[ys]++;
            }
            //把数字取出来
            int index=0;
            //先进先出！！！！
            for (int k = 0; k < counts.length; k++) {

                //记录数量的数组中当前余数的数量不为0；
                if(counts[k]!=0){
                    for (int i = 0; i < counts[k]; i++) {
                        //取出元素
                        arr[index]=temp[k][i];
                        index++;
                    }
                    //把数量置为0；
                    counts[k]=0;
                }
            }
            System.out.println(j+"-----"+n);
            for (int[] a:temp) {
                System.out.println(Arrays.toString(a));
            }
            System.out.println("-----------------"+"\n"+Arrays.toString(arr));

            }




    }
}



