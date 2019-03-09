package jiyun.lwj.com.mvp2.base;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by 她说 on 2019/3/5.
 */

public abstract class BaseModel  {
    protected CompositeDisposable mCompositeDisposable = new CompositeDisposable();
    public void onDestory() {
        mCompositeDisposable.clear();
    }
}
