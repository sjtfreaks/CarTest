package com.haifeng.miao.cartest.view;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.haifeng.miao.cartest.Bean.WeatherData;
import com.haifeng.miao.cartest.R;
import com.haifeng.miao.cartest.adapter.WeatherAdapter;
import com.kymjs.rxvolley.RxVolley;
import com.kymjs.rxvolley.client.HttpCallback;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jet on 2018-10-08.
 */

public class TimeActivity extends BaseActivity {
    private ListView mListView;
    private List<WeatherData> mList = new ArrayList<>();
    @Override
    public void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_time);
        init();
        super.onCreate(savedInstanceState);
    }

    private void init() {
        mListView = (ListView)findViewById(R.id.mListView);
        //清理列表进行刷新
        //mList.clear();
        //获取天气数据 宁波代码：101210401
        String url = "https://www.tianqiapi.com/api/?version=v1&city=%E5%AE%81%E6%B3%A2&ip=27.193.13.255";
        RxVolley.get(url, new HttpCallback() {
            @Override
            public void onSuccess(String t) {
                //解析json
                parsingJson(t);
                //Toast.makeText(TimeActivity.this,t, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void parsingJson(String t) {
        //解析json
        try {
            JSONObject jsonObject = new JSONObject(t);
            //JSONObject jsonValue = jsonObject.getJSONObject("value");
            JSONArray jsonList = jsonObject.getJSONArray("data");

            for (int i = 0; i<jsonList.length();i++){
                JSONObject json = (JSONObject) jsonList.get(i);
                    WeatherData data = new WeatherData();

                    data.setWeek(json.getString("week"));
                    data.setWea(json.getString("wea"));
                    data.setTem1(json.getString("tem1"));
                    data.setTem2(json.getString("tem2"));
                    data.setDate(json.getString("date"));

                    mList.add(data);

            }
            WeatherAdapter adapter = new WeatherAdapter(TimeActivity.this,mList);
            mListView.setAdapter(adapter);
        }catch (JSONException e){
            e.printStackTrace();
        }
    }
}
