package com.haifeng.miao.cartest.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.haifeng.miao.cartest.R;
import com.ms.square.android.expandabletextview.ExpandableTextView;

/**
 * Created by jet on 2018-10-01.
 */

public class FourFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_four,null);
        initView(view);
        return view;
    }

    private void initView(View view) {

        ((TextView) view.findViewById(R.id.sample1).findViewById(R.id.title)).setText("1、科目四考试技巧");
        ((TextView) view.findViewById(R.id.sample2).findViewById(R.id.title)).setText("2、车轮侧滑问题");
        ((TextView) view.findViewById(R.id.sample3).findViewById(R.id.title)).setText("3、ABS防抱死系统");
        ((TextView) view.findViewById(R.id.sample4).findViewById(R.id.title)).setText("4、满分通过科目四技巧");
        ((TextView) view.findViewById(R.id.sample5).findViewById(R.id.title)).setText("5、安全距离答题技巧");
        ((TextView) view.findViewById(R.id.sample6).findViewById(R.id.title)).setText("6、科目一考试口诀");
        ((TextView) view.findViewById(R.id.sample7).findViewById(R.id.title)).setText("7、科目一考试顺口溜");

        ExpandableTextView expTv1 = (ExpandableTextView) view.findViewById(R.id.sample1)
                .findViewById(R.id.expand_text_view);
        ExpandableTextView expTv2 = (ExpandableTextView) view.findViewById(R.id.sample2)
                .findViewById(R.id.expand_text_view);
        ExpandableTextView expTv3 = (ExpandableTextView) view.findViewById(R.id.sample3)
                .findViewById(R.id.expand_text_view);
        ExpandableTextView expTv4 = (ExpandableTextView) view.findViewById(R.id.sample4)
                .findViewById(R.id.expand_text_view);
        ExpandableTextView expTv5 = (ExpandableTextView) view.findViewById(R.id.sample5)
                .findViewById(R.id.expand_text_view);
        ExpandableTextView expTv6 = (ExpandableTextView) view.findViewById(R.id.sample6)
                .findViewById(R.id.expand_text_view);
        ExpandableTextView expTv7 = (ExpandableTextView) view.findViewById(R.id.sample7)
                .findViewById(R.id.expand_text_view);

        expTv1.setOnExpandStateChangeListener(new ExpandableTextView.OnExpandStateChangeListener() {
            @Override
            public void onExpandStateChanged(TextView textView, boolean isExpanded) {
                Toast.makeText(getActivity(), isExpanded ? "Expanded" : "连接成功", Toast.LENGTH_SHORT).show();
            }
        });

        expTv1.setText(getString(R.string.text));
        expTv2.setText(getString(R.string.text2));
        expTv3.setText(getString(R.string.text3));
        expTv4.setText(getString(R.string.text4));
        expTv5.setText(getString(R.string.text5));
        expTv6.setText(getString(R.string.text6));
        expTv7.setText(getString(R.string.text7));
    }
}

