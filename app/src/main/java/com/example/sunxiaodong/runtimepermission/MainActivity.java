package com.example.sunxiaodong.runtimepermission;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.sunxiaodong.runtimepermission.multipermission.MultiNormalActivity;
import com.example.sunxiaodong.runtimepermission.multipermission.MultiPermissionDispatcherActivity;
import com.example.sunxiaodong.runtimepermission.singlepermission.SingleNormalActivity;
import com.example.sunxiaodong.runtimepermission.singlepermission.SinglePermissionDispatcherActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mGoSingleNormal;
    private Button mGoSinglePD;
    private Button mGoMultiNormal;
    private Button mGoMultiPD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mGoSingleNormal = (Button) findViewById(R.id.go_single_normal);
        mGoSingleNormal.setOnClickListener(this);
        mGoSinglePD = (Button) findViewById(R.id.go_single_pd);
        mGoSinglePD.setOnClickListener(this);
        mGoMultiNormal = (Button) findViewById(R.id.go_multi_normal);
        mGoMultiNormal.setOnClickListener(this);
        mGoMultiPD = (Button) findViewById(R.id.go_multi_pd);
        mGoMultiPD.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.go_single_normal:
                goSingleNormal();
                break;
            case R.id.go_single_pd:
                goSinglePD();
                break;
            case R.id.go_multi_normal:
                goMultiNormal();
                break;
            case R.id.go_multi_pd:
                goMultiPD();
                break;
        }
    }

    private void goSingleNormal() {
        Intent intent = new Intent(this, SingleNormalActivity.class);
        startActivity(intent);
    }

    private void goSinglePD() {
        Intent intent = new Intent(this, SinglePermissionDispatcherActivity.class);
        startActivity(intent);
    }

    private void goMultiNormal() {
        Intent intent = new Intent(this, MultiNormalActivity.class);
        startActivity(intent);
    }

    private void goMultiPD() {
        Intent intent = new Intent(this, MultiPermissionDispatcherActivity.class);
        startActivity(intent);
    }

}
