package com.haifeng.miao.cartest.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.haifeng.miao.cartest.Bean.ArticleData;
import com.haifeng.miao.cartest.R;

import java.util.List;

/**
 * Created by jet on 2018-10-09.
 */

public class ArticleAdapter extends BaseAdapter {
    private Context mContext;
    private List<ArticleData> mList;
    private ArticleData data;
    private LayoutInflater inflater;


    public ArticleAdapter(Context mContext, List<ArticleData> mList){
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
            convertView = inflater.inflate(R.layout.item,null);
            viewHolder.tv_title = (TextView)convertView.findViewById(R.id.tv_title);
            viewHolder.tv_author = (TextView)convertView.findViewById(R.id.tv_author);
            viewHolder.tv_content = (TextView)convertView.findViewById(R.id.tv_content);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        data =mList.get(position);
        viewHolder.tv_title.setText(data.getTitle());
        viewHolder.tv_author.setText(data.getAuthor());
        viewHolder.tv_content.setText(data.getContent());

        return convertView;
    }

    class ViewHolder{
        private TextView tv_title;//标题
        private TextView tv_author;//作者
        private TextView tv_content;//全文

    }
}
