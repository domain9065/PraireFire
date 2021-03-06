package com.praire.fire.my;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.drawee.view.SimpleDraweeView;
import com.praire.fire.R;
import com.praire.fire.base.BaseActivity;
import com.praire.fire.common.ConstanUrl;
import com.praire.fire.common.Constants;
import com.praire.fire.my.setActivitys.BankCardActivity;
import com.praire.fire.okhttp.GsonUtils.J2O;
import com.praire.fire.okhttp.JavaBean.APIResultBean;
import com.praire.fire.okhttp.JavaBean.BindBankCardInfoBean;
import com.praire.fire.okhttp.JavaBean.UserHeadBean;
import com.praire.fire.okhttp.JavaBean.UserInfoBean;
import com.praire.fire.okhttp.JavaBean.WalletCapitalBean;
import com.praire.fire.okhttp.JavaBean.WithdrawBankCardInfo;
import com.praire.fire.okhttp.OkhttpRequestUtil;
import com.praire.fire.okhttp.UseAPIs;
import com.praire.fire.utils.SharePreferenceMgr;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.FormBody;
import okhttp3.RequestBody;

import static com.praire.fire.common.Constants.LOGIN_COOKIE;

/**
 * 钱包 提现
 * Created by lyp on 2017/12/29.
 */

public class WithdrawActivity extends BaseActivity {


    @BindView(R.id.tv_back)
    TextView tvBack;
    @BindView(R.id.tv_explain)
    TextView tvExplain;
    @BindView(R.id.iv_bank)
    SimpleDraweeView ivBank;
    @BindView(R.id.tv_bank_card_number)
    TextView tvBankCardNumber;
    @BindView(R.id.tv_bind_bank_card)
    TextView tvBindBankCard;
    @BindView(R.id.iv_withdraw)
    ImageView ivWithdraw;
    @BindView(R.id.et_withdraw_count)
    EditText etWithdrawCount;
    @BindView(R.id.tv_balance)
    TextView tvBalance;
    @BindView(R.id.iv_password)
    ImageView ivPassword;
    @BindView(R.id.et_pay_password)
    EditText etPayPassword;
    @BindView(R.id.submit)
    Button submit;


    String cookie = "";
    UseAPIs u = new UseAPIs();
    J2O j = new J2O();




    public static void startActivity(Context context, boolean forResult) {
        Intent intent = new Intent(context, WithdrawActivity.class);


        if (!forResult) {
            context.startActivity(intent);
        } else if (context instanceof BaseActivity) {
            ((BaseActivity) context).startActivityForResult(intent, Constants.REQUEST_CODE_COMMONT);
        }
    }

    @Override
    protected int getFragmentLayout() {
        return R.layout.activity_wallet_withdraw;
    }

    @Override
    protected void initViews() {
        ButterKnife.bind(this);
        cookie = (String) SharePreferenceMgr.get(this, LOGIN_COOKIE, "");
        String explain = getResources().getString(R.string.withdraw_explain);

//        explain= "1、提现到的账号必须是本人实名认证身份证所办理的银行账号<br> 2、工作日16:00前申请提现，当天到账；16:00之后申请提现，下个工作日到账；周末或国家节假日申请的提现，统一在上班后 第一个工作日处理</br>
//                3、提现收取 2元/笔 手续费</br>4、如有任何疑问，请联系客服电话0797-8330000</br>";
//
//        tvExplain.setText(Html.fromHtml(explain));
        tvExplain.setText( Html.fromHtml(explain));


//        try {
//            String str1=u.getWalletCapital(cookie);
//            WalletCapitalBean w =j.getWalletCapitalBean(str1);
//            tvBalance.setText("可提现余额"+w.getCapital()+"元");
//            String str = u.getBindBankCardInfo(cookie);
//            BindBankCardInfoBean o = j.getBindBankCardInfo(str);
//            if (1 == (o.getCode())) {
//                ivBank.setImageURI(o.getCardinfo().getOssbankpic());
//                tvBankCardNumber.setText("(" + o.getCardinfo().getCardno() + ")");
//            } else {
//                Toast.makeText(this, "请先绑定银行卡", Toast.LENGTH_SHORT).show();
//            }
//            Log.d("initData", "initData: " + str);
//        } catch (Exception e) {
//            Log.e("initData", "initData: " + e.toString());
//        }


        OkhttpRequestUtil.get(ConstanUrl.GET_WITHDRAW_BANK_INFO, 1, true, uiHandler);
        OkhttpRequestUtil.get(ConstanUrl.GET_WALLET_CAPITAL, 2, true, uiHandler);
        OkhttpRequestUtil.get(ConstanUrl.GET_BANK_INFO, 3, true, uiHandler);

//        getBankInfo();
    }

    @Override
    protected void networkResponse(Message msg) {
        super.networkResponse(msg);


        switch (msg.what) {
            case 1:

                String str = msg.obj + "";
                if (!str.isEmpty()) {
                    WithdrawBankCardInfo o = j.getWithdrawBankCardInfo(str);


                    if (1 == (o.getCode())) {

                        ivBank.setImageURI(o.getCard().getCardtypepic());
                        tvBankCardNumber.setText("尾号("+o.getCard().getCardno()+")");

                    } else {
                        Toast.makeText(this, "请先绑定银行卡", Toast.LENGTH_SHORT).show();
                    }

                }


                break;
            case 2:
                String str1 = msg.obj + "";
                if (!str1.isEmpty()) {
                    WalletCapitalBean w =j.getWalletCapitalBean(str1);
                    tvBalance.setText("可提现余额"+w.getCapital()+"元");
                }


                break;

            case 3:
                String str3 = msg.obj + "";

                BindBankCardInfoBean o = j.getBindBankCardInfo(str3);


                if (1 == (o.getCode())) {

                    ivBank.setImageURI(o.getCardinfo().getOssbankpic());
                    tvBankCardNumber.setText("(" + o.getCardinfo().getCardno() + ")");

                } else {
                    Toast.makeText(this, "请先绑定银行卡", Toast.LENGTH_SHORT).show();
                }

                break;

            case 4:
                String str4 = msg.obj + "";
                APIResultBean a = j.getAPIResult(str4);
                Toast.makeText(this, a.getMsg()+"", Toast.LENGTH_SHORT).show();
                if (1==a.getCode()) {
                    finish();
                }
                break;
            default:
                break;
        }


    }


//    public void getBankInfo() {
//        try {
//
//            String str = u.getWithdrawBankCardInfo(cookie);
//            WithdrawBankCardInfo o = j.getWithdrawBankCardInfo(str);
//
//
//            if (1 == (o.getCode())) {
//
//                ivBank.setImageURI(o.getCard().getCardtypepic());
//                tvBankCardNumber.setText("尾号("+o.getCard().getCardno()+")");
//
//            } else {
//                Toast.makeText(this, "请先绑定银行卡", Toast.LENGTH_SHORT).show();
//            }
//
//            Log.d("initData", "initData: " + str);
//
//
//        } catch (Exception e) {
//
//            Log.e("initData", "initData: " + e.toString());
//
//        }
//    }

    @Override
    protected void initListeners() {

    }

    @Override
    protected void initAdapters() {

    }

    @Override
    protected void initData() {

    }


    @OnClick({R.id.tv_back, R.id.tv_bind_bank_card, R.id.submit})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_back:
                finish();
                break;
            case R.id.tv_bind_bank_card:
                BankCardActivity.startActivity(this,false);
                break;
            case R.id.submit:
                String price="";
                String password="";

                price=etWithdrawCount.getText().toString();
                password=etPayPassword.getText().toString();

                if (price.length()!=0 & password.length()!=0) {


                    RequestBody requestBody = new FormBody.Builder()
                            .add("money", price)
                            .add("pwd", password)
                            .build();

                    OkhttpRequestUtil.post(ConstanUrl.USER_WITHDRAW,requestBody, 4, uiHandler,true );


//                    try {
//                        String str=u.userWithdraw(price,password,cookie);
//
//                        APIResultBean o = j.getAPIResult(str);
//                        Toast.makeText(this, o.getMsg()+"", Toast.LENGTH_SHORT).show();
//                        if (1==o.getCode()) {
//                            finish();
//                        }
//                    } catch (Exception e) {
//                        Log.e("onViewClicked", "onViewClicked: "+e.toString());
//                    }
                }


                break;
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        OkhttpRequestUtil.get(ConstanUrl.GET_WITHDRAW_BANK_INFO, 1, true, uiHandler);
    }
}
