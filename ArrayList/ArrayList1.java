import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args){
        List<Integer> al = new ArrayList<>();
        for(int i=1; i<=5; i++){
            al.add(i);
        }
        System.out.println("Printing the arraylist : "+ al);
        al.set(2, 6);
        System.out.println("Printing the arraylist after updating : "+ al);
        al.remove(1);
        System.out.println("Printing arraylist after removing an element : "+ al);
        Iterator<Integer> iterator = al.iterator();
        int i = 0;
        while (iterator.hasNext()){
            System.out.println("Printing arraylist(Iterator) al["+i+"] : "+ iterator.next());
            i++;
        }
        i = 0;
        for(int j : al){
            System.out.println("Printing arraylist in enhanced for loop al[" + i + "] : "+j);
            i++;
        }
        al.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                String aBin = Integer.toBinaryString(a);
                String bBin = Integer.toBinaryString(b);
                int aOnes = 0;
                int bOnes = 0;
                for(int i=0;i<aBin.length();i++){
                    if(aBin.charAt(i)=='1')
                        aOnes++;
                }
                for(int i=0;i<bBin.length();i++){
                    if(bBin.charAt(i)=='1')
                        bOnes++;
                }
                if(aOnes-bOnes==0){
                    return a-b;
                }
                return aOnes-bOnes;

            }
        });
        System.out.println(al);

    }
}
