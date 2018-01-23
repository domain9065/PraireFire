package com.praire.fire.okhttp.GsonUtils;


import com.google.gson.Gson;
import com.praire.fire.merchant.bean.RegionListBean;
import com.praire.fire.merchant.bean.ShopTypeBeanList;
import com.praire.fire.okhttp.JavaBean.APIResultBean;
import com.praire.fire.okhttp.JavaBean.AddProductResultBean;
import com.praire.fire.okhttp.JavaBean.BusinessEvaluateListBean;
import com.praire.fire.okhttp.JavaBean.BusinessOrderListBean;
import com.praire.fire.okhttp.JavaBean.BusinessTodayCountBean;
import com.praire.fire.okhttp.JavaBean.ProductInfoBean;
import com.praire.fire.okhttp.JavaBean.ProductListBean;
import com.praire.fire.okhttp.JavaBean.ProductTypeBean;
import com.praire.fire.okhttp.JavaBean.ServiceListBean;
import com.praire.fire.okhttp.JavaBean.ServiceTypeBean;
import com.praire.fire.okhttp.JavaBean.ShopInfoBean;
import com.praire.fire.okhttp.JavaBean.TodayIncomeBean;

/**
 * Created by sunlo on 2017/12/29.
 */

/*json -> object*/


public class J2O {

//    public APIResultBean getAPIResult(String str_json) {
//
//
//        return o;
//    }

    public APIResultBean getAPIResult(String str_json) {
        APIResultBean o = new APIResultBean();
        Gson gson = new Gson();
        o = gson.fromJson(str_json, APIResultBean.class);
        return o;
    }

    public BusinessTodayCountBean getBusinessTodayCount(String str_json) {
        BusinessTodayCountBean o = new BusinessTodayCountBean();
        Gson gson = new Gson();
        o = gson.fromJson(str_json, BusinessTodayCountBean.class);
        return o;
    }

    public TodayIncomeBean geTodayIncome(String str_json) {
        TodayIncomeBean o = new TodayIncomeBean();
        Gson gson = new Gson();
        o = gson.fromJson(str_json, TodayIncomeBean.class);
        return o;
    }

    public ShopTypeBeanList getShopType(String str_json) {
        ShopTypeBeanList o = new ShopTypeBeanList();
        Gson gson = new Gson();
        o = gson.fromJson(str_json, ShopTypeBeanList.class);
        return o;
    }

    public RegionListBean getRegion(String str) {
        RegionListBean o = new RegionListBean();
        Gson gson = new Gson();
        o = gson.fromJson(str, RegionListBean.class);
        return o;
    }


    public ServiceListBean getServiceList(String str) {
        ServiceListBean o = new ServiceListBean();
        Gson gson = new Gson();
        o = gson.fromJson(str, ServiceListBean.class);
        return o;
    }

    public ShopInfoBean getShopInfo(String str) {
        ShopInfoBean o = new ShopInfoBean();
        Gson gson = new Gson();
        o = gson.fromJson(str, ShopInfoBean.class);
        return o;
    }
    public ServiceTypeBean getServiceType(String str) {
        ServiceTypeBean o = new ServiceTypeBean();
        Gson gson = new Gson();
        o = gson.fromJson(str, ServiceTypeBean.class);
        return o;
    }

    public ProductTypeBean getProductType(String str) {
        ProductTypeBean o = new ProductTypeBean();
        Gson gson = new Gson();
        o = gson.fromJson(str, ProductTypeBean.class);
        return o;
    }

    public AddProductResultBean addProductResult(String str) {
        AddProductResultBean o = new AddProductResultBean();
        Gson gson = new Gson();
        o = gson.fromJson(str, AddProductResultBean.class);
        return o;
    }

    public ProductListBean getProductList(String str) {
        ProductListBean o = new ProductListBean();
        Gson gson = new Gson();
        o = gson.fromJson(str, ProductListBean.class);
        return o;
    }

    public ProductInfoBean getProductInfo(String str) {
        ProductInfoBean o = new ProductInfoBean();
        Gson gson = new Gson();
        o = gson.fromJson(str, ProductInfoBean.class);
        return o;
    }

    public BusinessOrderListBean getBusinessOrderList(String str) {
        BusinessOrderListBean o = new BusinessOrderListBean();
        Gson gson = new Gson();
        o = gson.fromJson(str, BusinessOrderListBean.class);
        return o;
    }

    public BusinessEvaluateListBean getBusinessEvaluateList(String str) {
        BusinessEvaluateListBean o = new BusinessEvaluateListBean();
        Gson gson = new Gson();
        o = gson.fromJson(str, BusinessEvaluateListBean.class);
        return o;
    }
}
