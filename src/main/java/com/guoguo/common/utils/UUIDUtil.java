package com.guoguo.common.utils;

import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.crypto.hash.SimpleHash;
import java.util.UUID;

/**
 * @Author: liuda
 * @CreateDate: 2018/6/26 16:37
 * @Description:
 */
public class UUIDUtil {

    /**
     *获取一个UUID
     */
    public static String getOneUUID(){
        //获取UUID
        String s = UUID.randomUUID().toString();
        //去掉“-”符号
        return s.substring(0,8)+s.substring(9,13)+s.substring(14,18)+s.substring(19,23)+s.substring(24);
    }
    /**
     * 获得指定数目的UUID
     * @param number int 需要获得的UUID数量
     * @return String[] UUID数组
     */
    public static String[] getUUID(int number){
        if(number < 1){
            return null;
        }
        String[] ss = new String[number];
        for(int i=0;i<number;i++){
            ss[i] = getOneUUID();
        }
        return ss;
    }

    public static void main(String[] args) {
        System.out.println(getOneUUID());

        System.out.println("4aa5d64745554481a96c72101739f78c".length());


        //所需加密的参数  即  密码
        String source = "123456";
        //[盐] 一般为用户名 或 随机数
        String salt = "Shiro";
        //加密次数
        int hashIterations = 4;

        //调用 org.apache.shiro.crypto.hash.Md5Hash.Md5Hash(Object source, Object salt, int hashIterations)构造方法实现MD5盐值加密
        Md5Hash mh = new Md5Hash(source, salt, hashIterations);
        //打印最终结果
        System.out.println(mh.toString());


        /*调用org.apache.shiro.crypto.hash.SimpleHash.SimpleHash(String algorithmName, Object source, Object salt, int hashIterations)
         * 构造方法实现盐值加密  String algorithmName 为加密算法 支持md5 base64 等*/
        SimpleHash sh = new SimpleHash("md5", source, salt, hashIterations);
        //打印最终结果
        System.out.println(sh.toString());
    }
}
