package com.praire.fire.my;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;

import com.praire.fire.R;
import com.praire.fire.base.BaseActivity;
import com.praire.fire.common.Constants;
import com.praire.fire.utils.statusbarcolor.Eyes;

/**
 *钱包明细
 * 账单明细
 * Created by lyp on 2017/12/29.
 */

public class BillActivity extends BaseActivity {


    public static void startActivity(Context context, boolean forResult) {
        Intent intent = new Intent(context, BillActivity.class);

        if (!forResult) {
            context.startActivity(intent);
        } else if (context instanceof BaseActivity) {
            ((BaseActivity) context).startActivityForResult(intent, Constants.REQUEST_CODE_COMMONT);
        }
    }
    @Override
    protected int getFragmentLayout() {
        return R.layout.activity_car;
    }

    @Override
    protected void initViews() {
        Eyes.setStatusBarColor(this, ContextCompat.getColor(this, R.color.status_bar));
    }

    @Override
    protected void initListeners() {

    }

    @Override
    protected void initAdapters() {

    }

    @Override
    protected void initData() {

    }
}
