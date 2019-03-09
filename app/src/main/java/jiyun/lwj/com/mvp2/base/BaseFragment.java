package jiyun.lwj.com.mvp2.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by 她说 on 2019/3/5.
 */

public abstract class BaseFragment<V extends BaseMvpView,T extends BasePresenter>
        extends Fragment {

    protected T mPresenter;
    private Unbinder mUnbinder;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(getLayoutId(), null);
        mUnbinder = ButterKnife.bind(this, inflate);
        mPresenter = initPresenter();
        if(mPresenter != null){
            mPresenter.attachView((V)this);
        }
        initView(inflate);
        initData();
        return inflate;
    }

    protected abstract T initPresenter();

    protected void initData() {

    }

    protected void initView(View inflate) {

    }

    protected abstract int getLayoutId();

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mUnbinder.unbind();
        if(mPresenter != null){
            mPresenter.onDestroy();
        }

    }
}
