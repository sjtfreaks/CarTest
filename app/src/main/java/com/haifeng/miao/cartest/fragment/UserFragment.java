package com.haifeng.miao.cartest.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.haifeng.miao.cartest.Bean.ArticleData;
import com.haifeng.miao.cartest.R;
import com.haifeng.miao.cartest.adapter.ArticleAdapter;
import com.haifeng.miao.cartest.view.SchoolActivity;
import com.haifeng.miao.cartest.view.TimeActivity;
import com.haifeng.miao.cartest.view.VideoActivity;
import com.kymjs.rxvolley.RxVolley;
import com.kymjs.rxvolley.client.HttpCallback;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;



/**
 * Created by jet on 2018-10-01.
 */

public class UserFragment extends Fragment implements View.OnClickListener {
    private ListView mListView;
    private List<ArticleData> mList = new ArrayList<>();
    private Button bt_video;
    private Button bt_time;
    private Button bt_school;
    Banner banner;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user,null);
        findView(view);
        return view;
    }

    private void findView(View view) {
        bt_video = (Button)view.findViewById(R.id.bt_video);
        bt_video.setOnClickListener(this);
        bt_time = (Button)view.findViewById(R.id.bt_time);
        bt_time.setOnClickListener(this);
        bt_school =(Button) view.findViewById(R.id.bt_school);
        bt_school.setOnClickListener(this);
        mListView = (ListView)view.findViewById(R.id.mListView);

        //清理列表进行刷新
        //mList.clear();
        //获取文章 dev == 1 1篇
        String url = "https://interface.meiriyiwen.com/article/random?dev=1";
        RxVolley.get(url, new HttpCallback() {
            @Override
            public void onSuccess(String t) {
                //解析json
                parsingJson(t);
                //Toast.makeText(getActivity(),t, Toast.LENGTH_SHORT).show();
            }
        });
        //轮播图
        banner = (Banner) view.findViewById(R.id.banner1);
        //本地图片数据（资源文件）
        List<Integer> list=new ArrayList<>();
        list.add(R.mipmap.b1);
        list.add(R.mipmap.b2);
        list.add(R.mipmap.b3);
        banner.setImages(list)
                .setImageLoader(new GlideImageLoader())
                .start();

    }
    //解析json
    private void parsingJson(String t) {
        //解析json
        try {
            JSONObject jsonObject = new JSONObject(t);

                ArticleData data = new ArticleData();

                data.setTitle(jsonObject.getJSONObject("data").getString("title"));
                data.setAuthor(jsonObject.getJSONObject("data").getString("author"));
                data.setContent(jsonObject.getJSONObject("data").getString("content"));

                mList.add(data);

            ArticleAdapter adapter = new ArticleAdapter(getActivity(),mList);
            mListView.setAdapter(adapter);
        }catch (JSONException e){
            e.printStackTrace();
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_video:
                startActivity(new Intent(getActivity(), VideoActivity.class));
                break;
            case R.id.bt_time:
                startActivity(new Intent(getActivity(), TimeActivity.class));
                break;
            case R.id.bt_school:
                startActivity(new Intent(getActivity(), SchoolActivity.class));
                break;

        }
    }
    //加载本地图片
    public class GlideImageLoader extends ImageLoader {
        @Override
        public void displayImage(Context context, Object path, ImageView imageView) {
            Glide.with(context.getApplicationContext())
                    .load(path)
                    .into(imageView);
        }

    }
}
