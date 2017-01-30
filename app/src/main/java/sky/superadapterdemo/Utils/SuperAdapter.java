package sky.superadapterdemo.Utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import sky.superadapterdemo.R;

/**
 * Created by SKYMAC on 17/1/31.
 */
public abstract class SuperAdapter<T> extends BaseAdapter {

    protected Context mContext;
    protected LayoutInflater mInflater;
    protected List<T> mDatas;

    public SuperAdapter(Context mContext, List<T> mDatas) {
        this.mContext = mContext;
        this.mInflater = LayoutInflater.from(mContext);
        this.mDatas = mDatas;
    }

    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public T getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        SuperViewHolder viewHolder = SuperViewHolder.get(mContext, convertView, parent, R.layout.item_main, position);
        convert(viewHolder, getItem(position));
        return viewHolder.getConvertView();
    }

    public abstract void convert(SuperViewHolder holder, T t);

}
