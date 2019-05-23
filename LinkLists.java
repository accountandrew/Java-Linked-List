package linklists;
import java.util.LinkedList;
public class LinkLists {

    public static void main(String[] args) {
        
        LinkedList<String> nameList = new LinkedList();
        
        nameList.add("Andrew");
        nameList.add("Bob");
        nameList.add("Charlie");
        
        nameList.addFirst("Firts");
        nameList.addLast("Last");
        
        int bobPos = nameList.indexOf("Bob");
        
        String bobVal = nameList.get(bobPos);
        
        nameList.add(bobPos+1, "guy After Bob");
        
        System.out.println(nameList);
        
        LinkStringList List = new LinkStringList();
        List.addFirst("Andrew");
        List.addFirst("Bob");
        List.addFirst("Charlie");
        
        List.displayList();
        

        
    }   
}

