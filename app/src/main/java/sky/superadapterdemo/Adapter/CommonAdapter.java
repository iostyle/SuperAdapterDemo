package sky.superadapterdemo.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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
    public View getView(int position, View view, ViewGroup parent) {
        SuperViewHolder viewHolder = new SuperViewHolder(mContext, parent, R.layout.item_main, position);

        PhoneBean bean = (PhoneBean) mDatas.get(position);
        ((TextView) viewHolder.getView(R.id.item_main_nameTv)).setText(bean.getName());
        ((TextView) viewHolder.getView(R.id.item_main_phoneNumberTv)).setText(bean.getPhoneNum());

        return viewHolder.getConvertView();
    }
}
