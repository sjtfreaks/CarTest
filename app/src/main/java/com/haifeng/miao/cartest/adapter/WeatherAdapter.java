package com.haifeng.miao.cartest.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.haifeng.miao.cartest.Bean.WeatherData;
import com.haifeng.miao.cartest.R;

import java.util.List;

/**
 * Created by jet on 2018-10-08.
 */

public class WeatherAdapter extends BaseAdapter{
    private Context mContext;
    private List<WeatherData> mList;
    private WeatherData data;
    private LayoutInflater inflater;


    public WeatherAdapter(Context mContext, List<WeatherData> mList){
        this.mContext = mContext;
        this.mList = mList;
        inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }
    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
    ViewHolder viewHolder = null;
        if (convertView == null){
            viewHolder = new ViewHolder();
            convertView = inflater.inflate(R.layout.item_weathers,null);
            viewHolder.tv_week = (TextView)convertView.findViewById(R.id.tv_week);
            viewHolder.tv_wea = (TextView)convertView.findViewById(R.id.tv_weather);
            viewHolder.tem1 = (TextView)convertView.findViewById(R.id.temp_day_c);
            viewHolder.tem2 = (TextView)convertView.findViewById(R.id.temp_night_c);
            viewHolder.date = (TextView)convertView.findViewById(R.id.date);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        data = mList.get(position);
        viewHolder.tv_week.setText(data.getWeek());
        viewHolder.tv_wea.setText(data.getWea());
        viewHolder.tem1.setText(data.getTem1());
        viewHolder.tem2.setText(data.getTem2());
        viewHolder.date.setText(data.getDate());
        return convertView;
    }

    class ViewHolder{
        private TextView tv_week;//星期
        private TextView tv_wea;//天气
        private TextView tem1;//day温度
        private TextView tem2;//night温度
        private TextView date;//时间
    }
}
