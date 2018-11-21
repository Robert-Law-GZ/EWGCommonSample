package com.ewgvip.ewgcommonsample;

import android.os.Bundle;
import android.widget.Button;

import com.ewgvip.common.EWGHttpRequest;
import com.ewgvip.common.base.EWGBaseActivity;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends EWGBaseActivity {

    @Bind(R.id.btnLogin)
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    private void request() {
        String host = "http://member-api-dev.ewgvip.com";
        String api = "/sso/login.html";

        EWGHttpRequest request = buildRequest(host, api, null);
        request.addParam("username", "13434250498");
        request.addParam("password", "123456");

        request.executePost();
    }

    @OnClick(R.id.btnLogin)
    public void onViewClicked() {
        request();
    }
}
