package jiyun.lwj.com.mvp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import jiyun.lwj.com.mvp2.base.BaseActivity;
import jiyun.lwj.com.mvp2.presenter.LoginPresenter;
import jiyun.lwj.com.mvp2.view.LoginMvpView;

public class MainActivity extends BaseActivity<LoginMvpView,LoginPresenter> implements LoginMvpView{

    @Override
    protected LoginPresenter initPresenter() {
        return new LoginPresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initData() {
        mBasePresenter.login();
    }
}
