package com.praire.fire.common;


/**
 * Created by Administrator on 2017/12/29.
 */

public class Constants {
    public static final  String BUSSINESS_ID  = "BUSSINESS_ID";
    public static final  String PRODUCT_ID  = "PRODUCT_ID";
    public static final int REQUEST_CODE_COMMONT = 10;
    public static final int REQUEST_CODE_UPLOAD_SHOP_PHOTO = 2;
    public static final int REQUEST_CODE_UPLOAD_BUSINESS_LICENSE = 3;

    public static final int REQUEST_CODE_UPLOAD_ID_CARD= 4;
    public static final int REQUEST_CODE_CHOOSE_MAP_ADDRESS = 1;
    public static final int REQUEST_CODE_CHOOSE_SHOP_TYPE = 5;
    public static final int REQUEST_CODE_CHOOSE_REGION = 6;
    public static final String LOGIN_COOKIE = "loginCookie";
    public static final int REQUEST_CODE_SEARCH =  11;
    public static final String FRAGMENTFLAG = "fragmentflag";




    /*
    * 上传产品图片*/
    public static final int REQUEST_CODE_UPLOAD_PRODUCT1 = 12;
    public static final int REQUEST_CODE_UPLOAD_PRODUCT2= 13;
    public static final int REQUEST_CODE_UPLOAD_PRODUCT3 = 14;
    public static final int REQUEST_CODE_UPLOAD_PRODUCT4 = 15;

        /*用户修改头像*/
    public static final int REQUEST_CHANGE_USER_HEAD =  16;

    /*实名认证身份证照片*/
    public static final int REQUEST_REAL_VERIFY_PHTOTO =  17;

    public static final int REQUEST_BANK = 18;
    /**
     * 刷新后头部固定时间,毫秒
     */
    public static final int REFRESH_PINNED_TIME = 0;
    public static final String UI_TYPE = "UI_TYPE";
    public static final String INTENT_DATA = "INTENT_DATA";
    /**
     * 用户登录名
     */
    public static final String USER_ID = "userId";
    public static final String PRODUCT_WEIXIN_APP_ID = "wx329efa110cf1d2ac";
    public static final String CITY = "city";
    public static final String TOTLE_PRICE = "TOTLE_PRICE";
    public static final String THANKS_MSG = "THANKS_MSG";
    public static final String TITLE = "title";
    public static final String COUNT = "count";
    public static final String PASSWORD = "PASSWORD";
    public static final String ADDRESS = "address";
    public static final String ACTION_WEIXIN_CALLBACK = "ACTION_WEIXIN_CALLBACK";
    public static final String EXTRA_WEIXIN_RESULT = "EXTRA_WEIXIN_RESULT";

    public static String photoCookie="";
    /**
     * 区
     */
    public static String AREAS = "AREAS";
    /**
     * 经纬度
     */
    public static String LATLNG = "endLATLNG";
    /** 经纬度
     */
    public static String STARTLATLNG = "startLATLNG";
    /**
     * 经度
     */
    public static String Longitude = "Longitude";
    /**
     * 获取经度
     */
    public static String Latitude  = "Latitude";

    /**
     * 搜索关键字
     */
    public static String SEARCH_KEY = "LATLNG";

    public static final String DRIVE_RESULT = "drive_result";
    public static final String DRIVE_PATH = "drive_path";
    public static int payResult = -1;
}
