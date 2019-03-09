package jiyun.lwj.com.mvp2.base;

import java.util.ArrayList;

/**
 * Created by 她说 on 2019/3/5.
 */

public abstract class BasePresenter<V extends BaseMvpView> {
    private V mView;
    ArrayList<BaseModel> mModels = new ArrayList<>();

    public BasePresenter() {
        initModel();
    }

    protected abstract void initModel();

    public void attachView(V view) {

        mView = view;
    }


    public void onDestroy() {
        if(mView != null){
            mView = null;
        }
        if(mModels.size() > 0){
            for (BaseModel model: mModels) {
                model.onDestory();
            }
        }

    }
}
