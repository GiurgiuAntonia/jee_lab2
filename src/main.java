import java.util.*;

public class main {
    public static void main(String[] args) {
        List<Integer> x = new ArrayList();
        List<Integer> y = new ArrayList();
        List<Integer> xPlusY = new ArrayList();
        Set<Integer> zSet = new TreeSet();
        List<Integer> xMinusY = new ArrayList();
        int p = 4;
        List<Integer> xPlusYLimitedByP = new ArrayList();


        adauga(x, y);
        reuniune( x,y,xPlusY);
        comune(x,y,zSet);


    }

    public static void adauga(List <Integer> x, List <Integer> y){
        for (int i=5;i!=0;i--){
            x.add(i);
        }
        Collections.sort(x);
        y.add(7);
        y.add(10);
        y.add(4);
        y.add(2);
        y.add(9);
        y.add(1);
        y.add(8);
        y.sort(Comparator.naturalOrder());
    }

    public static void reuniune(List <Integer> x, List <Integer> y, List <Integer> xPlusY){
        xPlusY.addAll(x);
        xPlusY.addAll(y);
        }

        public static void comune(List <Integer> x,List <Integer> y, Set<Integer> zSet){
            zSet.addAll(x);
            zSet.retainAll(y);
        }

}

