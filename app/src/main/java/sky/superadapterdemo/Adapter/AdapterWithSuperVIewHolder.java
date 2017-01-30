package sky.superadapterdemo.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import sky.superadapterdemo.Bean.PhoneBean;
import sky.superadapterdemo.R;
import sky.superadapterdemo.Utils.SuperViewHolder;

/**
 * Created by SKYMAC on 17/1/31.
 */
public class AdapterWithSuperViewHolder extends BaseAdapter {

    private Context mContext;
    private LayoutInflater mInflater;
    private List<PhoneBean> mDatas;

    public AdapterWithSuperViewHolder(Context mContext, List<PhoneBean> mDatas) {
        this.mContext = mContext;
        this.mInflater = LayoutInflater.from(mContext);
        this.mDatas = mDatas;
    }

    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public Object getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        SuperViewHolder viewHolder = new SuperViewHolder(mContext, parent, R.layout.item_main, position);
        PhoneBean bean = mDatas.get(position);
        ((TextView) viewHolder.getView(R.id.item_main_nameTv)).setText(bean.getName());
        ((TextView) viewHolder.getView(R.id.item_main_phoneNumberTv)).setText(bean.getPhoneNum());
        return viewHolder.getConvertView();
    }

}
