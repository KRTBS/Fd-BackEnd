package com.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Calendar;
import java.util.Map;

public class JwtUtils {
    private static String SECRET = "token@!Raven!@";

    /*
    * 生成TOKEN
    * @param map 传入payload
    * @return 返回TOKEN
    * */
    //public static String getTOKEN(Map<String,String> map){
    //    JWTCreator.Builder builder = JWT.create();
    //    map.forEach((k,v) -> {
    //        builder.withClaim(k,v);
    //    });
    //    Calendar instance = Calendar.getInstance();
    //    instance.add(Calendar.DATE,7);
    //    builder.withExpiresAt(instance.getTime());
    //    //return builder.sign(Algorithm.HMAC256(TOKEN).toString());
    //    return builder.sign(Algorithm.HMAC256(TOKEN));
    //}

    public static String getToken(String userName,String userRole){
        JWTCreator.Builder builder = JWT.create();
        builder.withClaim("username", userName);
        builder.withClaim("role",userRole);
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.DATE,7);
        builder.withExpiresAt(instance.getTime());
        return builder.sign(Algorithm.HMAC256(SECRET));
    }

    //验证TOKEN
    public static boolean verifyToken(String token){
        try{
            JWT.require(Algorithm.HMAC256(SECRET)).build().verify(token);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    //获取TOKEN中的payload
    public static DecodedJWT getTokenInfo(String token){
        return JWT.require(Algorithm.HMAC256(SECRET)).build().verify(token);
    }

    //获取TOKEN中的username;
    public static String getUsername(String token){
        try{
            return JWT.decode(token).getClaim("username").asString();
        }catch (Exception e){
            return null;
        }
    }

    //获取TOKEN中的userRole
    public static String getRole(String token){
        try{
            return JWT.decode(token).getClaim("role").asString();
        }catch (Exception e){
            return null;
        }
    }

    //判断是否过期
    public static boolean isExprire(String token){
        return JWT.decode(token).getExpiresAt().getTime() < System.currentTimeMillis();
    }

}
