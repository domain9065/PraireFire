package com.praire.fire.car.bean;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lyp on 2018/1/15.
 */

public class ProductInfoBean implements Parcelable {

    /**
     * code : 1
     * info : {"id":"19","shop_id":"5","name":"汽车配件","class":"80",
     * "picurl":"shop/product/201801/53571422f80dfd97efb355f20c93ef8a.jpg|shop/product/201801/17d87f952e38619cf49e7705f85106ff.jpg|shop/product/201801/8f31703e50851fdefd3c3cbd08bf4819.jpg|shop/product/201801/6d140daba9c88252ea604ab1db320538.jpg",
     * "cover":"","sprice":"150.00","nprice":"100.00","desc":"汽车配件alert('xxx')","status":"0","salecount":"0","create_time":"1513736990","update_time":"0","is_delete":"0","class_name":"茶叶","star":"3.25","tel":"15007061760",
     * "piclist":["shop/product/201801/53571422f80dfd97efb355f20c93ef8a.jpg","shop/product/201801/17d87f952e38619cf49e7705f85106ff.jpg","shop/product/201801/8f31703e50851fdefd3c3cbd08bf4819.jpg","shop/product/201801/6d140daba9c88252ea604ab1db320538.jpg"],
     * "osspiclist":["http://lysh-upload.oss-cn-shanghai.aliyuncs.com/shop/product/201801/53571422f80dfd97efb355f20c93ef8a.jpg?OSSAccessKeyId=LTAIjyidULA5tuIB&Expires=1516000135&Signature=57vEziOChSZ60xfgFBeGfJrptP0%3D","http://lysh-upload.oss-cn-shanghai.aliyuncs.com/shop/product/201801/17d87f952e38619cf49e7705f85106ff.jpg?OSSAccessKeyId=LTAIjyidULA5tuIB&Expires=1516000135&Signature=uXUtBq%2FZ%2FGKZxinD8xUd76f%2FSok%3D","http://lysh-upload.oss-cn-shanghai.aliyuncs.com/shop/product/201801/8f31703e50851fdefd3c3cbd08bf4819.jpg?OSSAccessKeyId=LTAIjyidULA5tuIB&Expires=1516000135&Signature=l5J%2Bn1fcE9c%2FWMrATsPb70sWcAs%3D","http://lysh-upload.oss-cn-shanghai.aliyuncs.com/shop/product/201801/6d140daba9c88252ea604ab1db320538.jpg?OSSAccessKeyId=LTAIjyidULA5tuIB&Expires=1516000135&Signature=svPKO4Xgj48NYISx%2BOUy5MIXliU%3D"]}
     * comment : {"productcomment":[{"id":"10","order_id":"14","user_id":"1467","shop_id":"5","type":"1","ps_id":"19","star":"3","comment":"洗得很干净，很好","picurl":"","reply":"谢谢你的支持","reply_time":"1515139505","status":"1","create_time":"1514951578","update_time":"0","nickname":"xxx","head":"http://lysh-upload.oss-cn-shanghai.aliyuncs.com/user/head/201712/a25f9fbd52461b8e273f6fa5c5bc221f.jpg?OSSAccessKeyId=LTAIjyidULA5tuIB&Expires=1516000135&Signature=iRQfkJc7%2BAWQCBL3yRhBvR3aoNY%3D"}],"commentcount":"1"}
     */

    private int code;
    private InfoBean info;
    private CommentBean comment;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public InfoBean getInfo() {
        return info;
    }

    public void setInfo(InfoBean info) {
        this.info = info;
    }

    public CommentBean getComment() {
        return comment;
    }

    public void setComment(CommentBean comment) {
        this.comment = comment;
    }

    public static class InfoBean implements Parcelable{
        /**
         * id : 19
         * shop_id : 5
         * name : 汽车配件
         * class : 80
         * picurl : shop/product/201801/53571422f80dfd97efb355f20c93ef8a.jpg|shop/product/201801/17d87f952e38619cf49e7705f85106ff.jpg|shop/product/201801/8f31703e50851fdefd3c3cbd08bf4819.jpg|shop/product/201801/6d140daba9c88252ea604ab1db320538.jpg
         * cover :
         * sprice : 150.00
         * nprice : 100.00
         * desc : 汽车配件alert('xxx')
         * status : 0
         * salecount : 0
         * create_time : 1513736990
         * update_time : 0
         * is_delete : 0
         * class_name : 茶叶
         * star : 3.25
         * tel : 15007061760
         * piclist : ["shop/product/201801/53571422f80dfd97efb355f20c93ef8a.jpg","shop/product/201801/17d87f952e38619cf49e7705f85106ff.jpg","shop/product/201801/8f31703e50851fdefd3c3cbd08bf4819.jpg","shop/product/201801/6d140daba9c88252ea604ab1db320538.jpg"]
         * osspiclist : ["http://lysh-upload.oss-cn-shanghai.aliyuncs.com/shop/product/201801/53571422f80dfd97efb355f20c93ef8a.jpg?OSSAccessKeyId=LTAIjyidULA5tuIB&Expires=1516000135&Signature=57vEziOChSZ60xfgFBeGfJrptP0%3D","http://lysh-upload.oss-cn-shanghai.aliyuncs.com/shop/product/201801/17d87f952e38619cf49e7705f85106ff.jpg?OSSAccessKeyId=LTAIjyidULA5tuIB&Expires=1516000135&Signature=uXUtBq%2FZ%2FGKZxinD8xUd76f%2FSok%3D","http://lysh-upload.oss-cn-shanghai.aliyuncs.com/shop/product/201801/8f31703e50851fdefd3c3cbd08bf4819.jpg?OSSAccessKeyId=LTAIjyidULA5tuIB&Expires=1516000135&Signature=l5J%2Bn1fcE9c%2FWMrATsPb70sWcAs%3D","http://lysh-upload.oss-cn-shanghai.aliyuncs.com/shop/product/201801/6d140daba9c88252ea604ab1db320538.jpg?OSSAccessKeyId=LTAIjyidULA5tuIB&Expires=1516000135&Signature=svPKO4Xgj48NYISx%2BOUy5MIXliU%3D"]
         */

        private String id;
        private String shop_id;
        private String name;
        @SerializedName("class")
        private String classX;
        private String picurl;
        private String cover;
        private String sprice;
        private String nprice;
        private String desc;
        private String status;
        private String salecount;
        private String create_time;
        private String update_time;
        private String is_delete;
        private String class_name;
        private String star;
        private String tel;
        private List<String> piclist;
        private List<String> osspiclist;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getShop_id() {
            return shop_id;
        }

        public void setShop_id(String shop_id) {
            this.shop_id = shop_id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getClassX() {
            return classX;
        }

        public void setClassX(String classX) {
            this.classX = classX;
        }

        public String getPicurl() {
            return picurl;
        }

        public void setPicurl(String picurl) {
            this.picurl = picurl;
        }

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }

        public String getSprice() {
            return sprice;
        }

        public void setSprice(String sprice) {
            this.sprice = sprice;
        }

        public String getNprice() {
            return nprice;
        }

        public void setNprice(String nprice) {
            this.nprice = nprice;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getSalecount() {
            return salecount;
        }

        public void setSalecount(String salecount) {
            this.salecount = salecount;
        }

        public String getCreate_time() {
            return create_time;
        }

        public void setCreate_time(String create_time) {
            this.create_time = create_time;
        }

        public String getUpdate_time() {
            return update_time;
        }

        public void setUpdate_time(String update_time) {
            this.update_time = update_time;
        }

        public String getIs_delete() {
            return is_delete;
        }

        public void setIs_delete(String is_delete) {
            this.is_delete = is_delete;
        }

        public String getClass_name() {
            return class_name;
        }

        public void setClass_name(String class_name) {
            this.class_name = class_name;
        }

        public String getStar() {
            return star;
        }

        public void setStar(String star) {
            this.star = star;
        }

        public String getTel() {
            return tel;
        }

        public void setTel(String tel) {
            this.tel = tel;
        }

        public List<String> getPiclist() {
            return piclist;
        }

        public void setPiclist(List<String> piclist) {
            this.piclist = piclist;
        }

        public List<String> getOsspiclist() {
            return osspiclist;
        }

        public void setOsspiclist(List<String> osspiclist) {
            this.osspiclist = osspiclist;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.id);
            dest.writeString(this.shop_id);
            dest.writeString(this.name);
            dest.writeString(this.classX);
            dest.writeString(this.picurl);
            dest.writeString(this.cover);
            dest.writeString(this.sprice);
            dest.writeString(this.nprice);
            dest.writeString(this.desc);
            dest.writeString(this.status);
            dest.writeString(this.salecount);
            dest.writeString(this.create_time);
            dest.writeString(this.update_time);
            dest.writeString(this.is_delete);
            dest.writeString(this.class_name);
            dest.writeString(this.star);
            dest.writeString(this.tel);
            dest.writeStringList(this.piclist);
            dest.writeStringList(this.osspiclist);
        }

        public InfoBean() {
        }

        protected InfoBean(Parcel in) {
            this.id = in.readString();
            this.shop_id = in.readString();
            this.name = in.readString();
            this.classX = in.readString();
            this.picurl = in.readString();
            this.cover = in.readString();
            this.sprice = in.readString();
            this.nprice = in.readString();
            this.desc = in.readString();
            this.status = in.readString();
            this.salecount = in.readString();
            this.create_time = in.readString();
            this.update_time = in.readString();
            this.is_delete = in.readString();
            this.class_name = in.readString();
            this.star = in.readString();
            this.tel = in.readString();
            this.piclist = in.createStringArrayList();
            this.osspiclist = in.createStringArrayList();
        }

        public static final Creator<InfoBean> CREATOR = new Creator<InfoBean>() {
            @Override
            public InfoBean createFromParcel(Parcel source) {
                return new InfoBean(source);
            }

            @Override
            public InfoBean[] newArray(int size) {
                return new InfoBean[size];
            }
        };
    }

    public static class CommentBean implements Parcelable{
        /**
         * productcomment : [{"id":"10","order_id":"14","user_id":"1467","shop_id":"5","type":"1","ps_id":"19","star":"3","comment":"洗得很干净，很好","picurl":"","reply":"谢谢你的支持","reply_time":"1515139505","status":"1","create_time":"1514951578","update_time":"0","nickname":"xxx","head":"http://lysh-upload.oss-cn-shanghai.aliyuncs.com/user/head/201712/a25f9fbd52461b8e273f6fa5c5bc221f.jpg?OSSAccessKeyId=LTAIjyidULA5tuIB&Expires=1516000135&Signature=iRQfkJc7%2BAWQCBL3yRhBvR3aoNY%3D"}]
         * commentcount : 1
         */

        private String commentcount;
        private List<CommentlistBean> productcomment;

        public String getCommentcount() {
            return commentcount;
        }

        public void setCommentcount(String commentcount) {
            this.commentcount = commentcount;
        }

        public List<CommentlistBean> getProductcomment() {
            return productcomment;
        }

        public void setProductcomment(List<CommentlistBean> productcomment) {
            this.productcomment = productcomment;
        }



        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.commentcount);
            dest.writeList(this.productcomment);
        }

        public CommentBean() {
        }

        protected CommentBean(Parcel in) {
            this.commentcount = in.readString();
            this.productcomment = new ArrayList<CommentlistBean>();
            in.readList(this.productcomment, CommentlistBean.class.getClassLoader());
        }

        public static final Creator<CommentBean> CREATOR = new Creator<CommentBean>() {
            @Override
            public CommentBean createFromParcel(Parcel source) {
                return new CommentBean(source);
            }

            @Override
            public CommentBean[] newArray(int size) {
                return new CommentBean[size];
            }
        };
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.code);
        dest.writeParcelable(this.info, flags);
        dest.writeParcelable(this.comment, flags);
    }

    public ProductInfoBean() {
    }

    protected ProductInfoBean(Parcel in) {
        this.code = in.readInt();
        this.info = in.readParcelable(InfoBean.class.getClassLoader());
        this.comment = in.readParcelable(CommentBean.class.getClassLoader());
    }

    public static final Creator<ProductInfoBean> CREATOR = new Creator<ProductInfoBean>() {
        @Override
        public ProductInfoBean createFromParcel(Parcel source) {
            return new ProductInfoBean(source);
        }

        @Override
        public ProductInfoBean[] newArray(int size) {
            return new ProductInfoBean[size];
        }
    };
}
