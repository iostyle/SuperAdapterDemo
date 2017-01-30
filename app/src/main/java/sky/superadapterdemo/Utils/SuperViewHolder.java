package sky.superadapterdemo.Utils;

import android.content.Context;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by SKYMAC on 17/1/31.
 */
public class SuperViewHolder {
    private SparseArray<View> mViews;
    private int mPosition;
    private View mConvertView;

    public static SuperViewHolder get(Context context, View convertView, ViewGroup parent, int layoutId, int position) {
        if (convertView == null) {
            return new SuperViewHolder(context, parent, layoutId, position);
        } else {
            SuperViewHolder viewHolder = (SuperViewHolder) convertView.getTag();
            viewHolder.mPosition = position;
            return viewHolder;
        }
    }

    public SuperViewHolder(Context context, ViewGroup parent, int layoutId, int position) {
        this.mViews = new SparseArray<>();
        Log.i("tag", "mViews初始化");
        this.mPosition = position;
        mConvertView = LayoutInflater.from(context).inflate(layoutId, parent, false);
        mConvertView.setTag(this);
    }

    public View getConvertView() {
        return mConvertView;
    }

    public <T extends View> T getView(int viewId) {
        View view = mViews.get(viewId);
        if (view == null) {
            Log.i("tag", "view==null");
            view = mConvertView.findViewById(viewId);
            mViews.put(viewId, view);
        }
        return (T) view;
    }

    public int getPosition() {
        return this.mPosition;
    }

    /**
     * --------------------------------------------------------
     *                  自此向下为自定义可拓展方法
     * --------------------------------------------------------
     */

    /**
     * 这是一个TextView.setText()的方法,作为模版提供。
     * @param viewId 控件ID
     * @param text   内容
     * @return 返回值依然是个SuperViewHodler，所以可以递归调用。
     */
    public SuperViewHolder setText(int viewId, String text) {
        ((TextView) this.getView(viewId)).setText(text);
        return this;
    }

    public SuperViewHolder setOnClickListener(int viewId,View.OnClickListener listener){
        this.getView(viewId).setOnClickListener(listener);
        return this;
    }
}
