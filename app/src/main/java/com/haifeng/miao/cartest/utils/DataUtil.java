package com.haifeng.miao.cartest.utils;

import com.haifeng.miao.cartest.Bean.Video;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jet on 2018-10-05.
 */

public class DataUtil {

    public static List<Video> getVideoListData() {
        List<Video> videoList = new ArrayList<>();
        videoList.add(new Video("科目二——倒车入库",
                9800,
                "http://toutiao.image.mucang.cn/toutiao-image/2018/09/06/11/c93ffd63195d46ed984945e983fb6405.jpeg",
                "http://maiche.hynews.net/2017-12-25/97f4f93d287d4e5a9675b34a916abcde.high.mp4"));
        videoList.add(new Video("科目二——侧方停车",
                98000,
                "http://toutiao.image.mucang.cn/toutiao-image/2018/09/06/11/09f3ac56ab5a4fd0bc91857a2212a03a.jpeg",
                "http://maiche.hynews.net/2017-12-25/7394f926fe514a5080c39f8b3ddafaa1.high.mp4"));
        videoList.add(new Video("科目二——直角转弯",
                98000,
                "http://toutiao.image.mucang.cn/toutiao-image/2018/09/06/11/35064a313c5645b89d7ce779023b0588.jpeg",
                "http://maiche.hynews.net/2018-01-12/853b4f2f7b2241abbff59f9c21dc2943.high.mp4"));
        videoList.add(new Video("科目二——曲线行驶",
                98000,
                "http://toutiao.image.mucang.cn/toutiao-image/2018/09/06/11/ef4ad81d12ce4832b507ba1d3221db0f.jpeg",
                "http://maiche.hynews.net/2017-12-25/42697fc6a43948d8a88b56ebcf0e5980.high.mp4"));
        videoList.add(new Video("科目二——坡道定点停车起步",
                98000,
                "http://toutiao.image.mucang.cn/toutiao-image/2018/09/06/11/f8b4240aaa1e453bb0dc109670383e72.jpeg",
                "http://maiche.hynews.net/2017-12-25/733169b487184428b936963ec66721a9.high.mp4"));

        return videoList;
    }

    public static List<Video> getVideoListData2() {
        List<Video> videoList = new ArrayList<>();
        videoList.add(new Video("上车准备",
                9800,
                "http://toutiao.image.mucang.cn/toutiao-image/2018/09/06/11/aa70f57e250f40a99ef3a17144d5a050.png",
                "http://maiche.hynews.net/2017-12-25/3cd73e0719c84a7e8c322c6e776a1971.high.mp4"));
        videoList.add(new Video("上车起步",
                198000,
                "http://toutiao.image.mucang.cn/toutiao-image/2018/09/06/11/89f4fc63c608482eb7c62b1fc3afd5f0.png",
                "http://maiche.hynews.net/2017-12-25/c10fd289b0c4493c8d64ae7c882b64ea.high.mp4"));
        videoList.add(new Video("会车",
                98000,
                "http://toutiao.image.mucang.cn/toutiao-image/2018/09/06/11/a7e3336250cc4e5ba3d9049c6c3b692e.png",
                "http://maiche.hynews.net/2016-12-06/f5ca9bb7d91b40be94d95bade46c08c2.high.mp4"));
        videoList.add(new Video("直线行驶",
                98000,
                "http://toutiao.image.mucang.cn/toutiao-image/2018/09/06/11/2b3cf946b70c48169fdc3ada42cbfe08.png",
                "http://maiche.hynews.net/2017-12-25/46f6feb7b4e244a6bb5c10df479bd665.high.mp4"));
        videoList.add(new Video("模拟夜间场景灯光使用",
                98000,
                "http://toutiao.image.mucang.cn/toutiao-image/2018/09/06/11/313a2d08aaa1412bb3f575b874ec37bb.png",
                "http://maiche.hynews.net/2017-12-25/e4a462983511407990a87045cc96b38b.high.mp4"));

        return videoList;
    }
}
