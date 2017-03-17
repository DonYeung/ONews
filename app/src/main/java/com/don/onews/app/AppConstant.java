package com.don.onews.app;

/**
 * Created by drcom on 2017/3/16.
 */

public class AppConstant {

    public static boolean IsTestVersion = true;	//是否测试服务器
    public static boolean IsRelease = false;	//是否对外发布版本
    public static boolean isHasNewversion = false;//是否有新版本
    /**
     * 请求成功
     */
    public final static String REQUEST_SUCCESSFULLY  = "1";

    /**
     * 请求失败
     */
    public final static String REQUEST_FAILED = "0";


    ///// ********************* ↓ 以下是请求结果定义（用于UI层） ↓ *************************  //////

    public class  ReqResult
    {

        /**
         * 请求成功
         */
        public final static int SUCCESS  = 200;

        /**
         * 无数据
         */
        public final static int NO_DATA  = 301;


        /**
         * ACCESS_TOKEN 无效失效
         */
        public final static int ACCESS_TOKEN_INVALID  = 302;


        /**
         * 网络请求超时或网络不通
         */
        public final static int NET_WORK_FAIL  = 490;
    }

}
