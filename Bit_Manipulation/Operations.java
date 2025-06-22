package Bit_Manipulation;

public class Operations {
    public static int GetIthBit(int n, int i) {
        int bitMask = 1<<i;
        if((n & bitMask) != 0) return 1;
        else return 0;
    }
    public static int SetIthBit(int n, int i){
        int bitMask = 1 << i;
        return n | bitMask;
    }
    public static int ClearIthBit(int n, int i){
        int bitMask = 1 << i;
        return n & (~bitMask);
    }
    public static int UpdateIthBit(int n, int i, int newBit){
        // if(newBit == 0){
        //     return ClearIthBit(n, i);
        // }else {
        //     return SetIthBit(n, i);
        // }

        n = ClearIthBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;
    }
    public static int ClearLastIthBits(int n, int i){
        int bitMask = (-1) << i;
        return n & bitMask;
    }
    public static int ClearRangeOfBits(int n, int i, int j){
        int a = ((~0) << (j+1));
        int b = (1<<i) - 1;
        int bitMask = a | b ;
        return n & bitMask;
    }
    public static void main(String[] args) {
       System.out.println( GetIthBit(10, 2));
       System.out.println(SetIthBit(10, 2));
       System.out.println(ClearIthBit(10, 1));
       System.out.println(UpdateIthBit(10, 2, 1));
       System.out.println(ClearLastIthBits(15, 2));
       System.out.println(ClearRangeOfBits(10, 2, 4 ));
    }
}
