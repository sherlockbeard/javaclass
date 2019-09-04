package quest_10;

public class quest_10 {
    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(2);
        myInteger.isEven(myInteger);
        MyInteger myInteger1 = new MyInteger(41);
        System.out.println(myInteger.isPrime(myInteger1));

    }
}
 class  MyInteger{
    int value;

    public int getValue() {
        return value;
    }

    MyInteger(int value){
        this.value = value;
    }
    public boolean isEven(){
        return value%2==0;
    }
    public boolean isOdd(){
        return value%2!=0;
    }
    public boolean isPrime(){
        for(int i=2;i<value;i++){
            if(value%i!=0){
                return false;
            }
        }
        return true;
    }
    public static boolean isEven(int value){
        return value%2==0;
    }
    public static boolean isOdd(int value){
        return value%2!=0;
    }
    public static boolean isPrime(int value){
        for(int i=2;i<value;i++){
            if(value%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean isEven(MyInteger myInteger){
        return myInteger.value%2==0;
    }
    public static boolean isOdd(MyInteger myInteger){
        return myInteger.value%2!=0;
    }
    public static boolean isPrime(MyInteger myInteger){
        for(int i=2;i<myInteger.value;i++){
            if(myInteger.value%i==0){
                return false;
            }
        }
        return true;
    }
    public boolean equals(int testint){
        return testint==this.value;
    }
    public boolean equals(MyInteger myInteger){
        return  myInteger.value == this.value;
    }
    public static int parseInt(char[] c){
        int sum=0;
        for(char i : c){
            sum += Character.getNumericValue(i);
        }
        return sum;
    }
    public static int parseInt(String b){
        return  (int) Integer.parseInt(b);
    }
}
