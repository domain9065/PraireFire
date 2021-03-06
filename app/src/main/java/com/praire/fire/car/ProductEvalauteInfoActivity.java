package com.praire.fire.car;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;

import com.praire.fire.R;
import com.praire.fire.base.BaseActivity;
import com.praire.fire.base.BaseTitleActivity;
import com.praire.fire.common.Constants;
import com.praire.fire.utils.statusbarcolor.Eyes;

import butterknife.ButterKnife;

/**
 * 商品评价详情
 * Created by lyp on 2018/1/4.
 */

public class ProductEvalauteInfoActivity extends BaseTitleActivity {

    private String id;

    public static void startActivity(Context context, String id, boolean forResult) {
        Intent intent = new Intent(context, ProductEvalauteInfoActivity.class);
        intent.putExtra(Constants.PRODUCT_ID, id);
        if (!forResult) {
            context.startActivity(intent);
        } else if (context instanceof BaseActivity) {
            ((BaseActivity) context).startActivityForResult(intent, Constants.REQUEST_CODE_COMMONT);
        }
    }

    @Override
    protected int getFragmentLayout() {
        return R.layout.activity_shop_product_evalaute_info;
    }

    @Override
    protected void initViews() {
        ButterKnife.bind(this);
        Eyes.setStatusBarColor(this, ContextCompat.getColor(this, R.color.status_bar));
    }

    @Override
    protected void initListeners() {
        id = getIntent().getStringExtra(Constants.PRODUCT_ID);
    }

    @Override
    protected void initAdapters() {

    }

    @Override
    protected void initData() {

    }

    @Override
    public void initiTile() {
        setDefaultBack();
        setTitleMiddle("评价详情");
    }
}
