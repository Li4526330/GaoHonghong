package jiyun.lwj.com.mvp2.presenter;

import jiyun.lwj.com.mvp2.base.BasePresenter;
import jiyun.lwj.com.mvp2.model.LoginModel;
import jiyun.lwj.com.mvp2.view.LoginMvpView;

/**
 * Created by 她说 on 2019/3/5.
 */

public class LoginPresenter extends BasePresenter<LoginMvpView> {

    private LoginModel mLoginModel;

    @Override
    protected void initModel() {
        mLoginModel = new LoginModel();
    }

    public void login() {
        mLoginModel.login();
    }
}
