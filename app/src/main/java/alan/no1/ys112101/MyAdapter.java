package alan.no1.ys112101;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by user on 2016/11/21.
 */

public class MyAdapter {
    Context context;
    String[] data;
    public MyAdapter(Context context, String[] d)
    {
        this.context = context;
        this.data = d;
    }
    @Override
    public int getCount() {
        return data.length;
    }
    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.myitem, null);
        TextView tv = (TextView) v.findViewById(R.id.textView);
        tv.setText(data[position]);
        return v;
    }
}
