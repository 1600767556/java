package Example6;

import java.util.Hashtable;
import java.util.Map;
/*
Hashtable 的key 和value 都不能为null
HashMap 集合的key和value都可以为null的
 */
public class HashTale {
    public static void main(String[] args) {
        Map map= new Hashtable();
        map.put(null,"qeq");
    }
}
