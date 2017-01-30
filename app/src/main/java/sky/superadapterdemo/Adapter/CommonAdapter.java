package sky.superadapterdemo.Adapter;

import android.content.Context;

import java.util.List;

import sky.superadapterdemo.Bean.PhoneBean;
import sky.superadapterdemo.R;
import sky.superadapterdemo.Utils.SuperAdapter;
import sky.superadapterdemo.Utils.SuperViewHolder;

/**
 * Created by SKYMAC on 17/1/31.
 */
public class CommonAdapter extends SuperAdapter {

    public CommonAdapter(Context mContext, List mDatas) {
        super(mContext, mDatas);
    }


    @Override
    public void convert(SuperViewHolder holder, Object o) {
        PhoneBean bean = (PhoneBean) o;
//        ((TextView) holder.getView(R.id.item_main_nameTv)).setText(bean.getName());
//        ((TextView) holder.getView(R.id.item_main_phoneNumberTv)).setText(bean.getPhoneNum());
        holder.setText(R.id.item_main_nameTv, bean.getName()).setText(R.id.item_main_phoneNumberTv, bean.getPhoneNum());
    }
}
