package jiyun.lwj.com.mvp2.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by 她说 on 2019/3/5.
 */

public abstract class BaseActivity<V extends BaseMvpView,T extends BasePresenter> extends AppCompatActivity{
    protected T mBasePresenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ButterKnife.bind(this);
        mBasePresenter = initPresenter();
        if(mBasePresenter != null){
            mBasePresenter.attachView((V)this);
        }
        initView();
        initListener();
        initData();
    }

    protected abstract T initPresenter();

    protected void initData() {
    }

    protected void initListener() {
    }

    protected void initView() {
    }

    protected abstract int getLayoutId();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(mBasePresenter != null){
            mBasePresenter.onDestroy();
        }
    }
}
