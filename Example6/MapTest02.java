package Example6;

import com.sun.deploy.panel.ITreeNode;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest02 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"hello1");
        map.put(2,"hello2");
       // Set<Integer> keys = map.keySet();
        //迭代器
       /* Iterator<Integer> i = keys.iterator();
        while (i.hasNext()){
            Integer key = i.next();
            String value = map.get(key);
            System.out.println(key+"="+value);
        }*/
       //foreach
       /* for (Integer i: keys
             ) {
            System.out.println(keys+"="+map.get(keys));
        }*/
       Set<Map.Entry<Integer,String>> set = map.entrySet();
//迭代器
       Iterator<Map.Entry<Integer,String>> s = set.iterator();
       while (s.hasNext()){
           Map.Entry<Integer,String> s1 = s.next();
           String s2 = s1.getValue();
           Integer i2 = s1.getKey();
           System.out.println(i2+"="+s2);
       }

        for (Map.Entry<Integer,String> node: set
             ) {
            System.out.println(node.getKey()+"="+node.getValue());
        }
    }
}
