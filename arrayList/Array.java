import java.util.*;

public class Array {
    public static void main(String []args){
        String [] things= {"eggs", "lasers", "hats", "pie"};
        List <String> list1 = new ArrayList <String>();

        //add array items to list1
        for(String x: things)
            list1.add(x);

        String [] moreThings = {"lasers", "hats"};
        List<String> list2 = new ArrayList <String>();

        //add array items to list2
        for(String y: moreThings)
            list2.add(y);

        for(int i = 0; i < list1.size() ; i++)
        {
            System.out.printf("%s ", list1.get(i));
        }

        editlist(list1,list2);
        System.out.println();

        for(int i = 0; i < list2.size() ; i++)
        {
            System.out.printf("%s ", list1.get(i));
        }
    }

    //methode permettant de retirer des éléments de la liste 1 si ces éléments sont aussi dans la liste 2.
    public static void editlist(List<String> a, List<String> b) {
        Iterator<String> it = a.iterator();
        while(it.hasNext()) {
            if(b.contains(it.next()))
                it.remove();
        }
    }
}