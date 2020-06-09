package com.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.framework.redis.RedisCache;
import org.springframework.boot.autoconfigure.cache.CacheProperties;
import sun.nio.ch.ThreadPool;

import java.util.*;
import java.util.concurrent.ThreadPoolExecutor;

public class test {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        Iterator<String> iter = list.iterator();
        while (iter.hasNext()){
            String str = iter.next();
            System.out.println(str);
        }
        //list.toArray();
        System.out.println("list===== "+list);


       JSONObject jsonObjet = new JSONObject();
       jsonObjet.put("abb",1);


        String a = "a,a,a,a";
        a.charAt(0);
        System.out.println(a.charAt(0));
        a.split(",");

        System.out.println(StringUtils.isEmpty("")); //true
        String tr = "      ";
        System.out.println(StringUtils.isEmpty(tr)); //false
        System.out.println(StringUtils.isBlank(""));    //true
        System.out.println(StringUtils.isBlank(" "));   //true
        System.out.println(StringUtils.isBlank(null));  //true


        Student stu = new Student();
        stu.setAge(10);
        stu.setName("赵京京");
        System.out.println(stu);

       List listA = new ArrayList();
       listA.add("a");
       listA.add("b");
       listA.add("c");
       listA.add("d");
       listA.add("e");

       Iterator iterator = listA.iterator();
//       for(int i = 0;i<listA.size();i++){
//           System.out.println(iterator.next());
//       }

        while (iterator.hasNext()){
            if("a".equals(iterator.next())){
                iterator.remove();
            }
        }
        System.out.println(listA);

        for(Object obj:listA){
            System.out.println(obj);
        }




    }

}