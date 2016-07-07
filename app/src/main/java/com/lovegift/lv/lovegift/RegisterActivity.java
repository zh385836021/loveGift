package com.lovegift.lv.lovegift;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

import com.lovegift.lv.BaseApp.MyApplication;
import com.lovegift.lv.bean.User;
import com.lovegift.lv.utils.LogUtils;
import com.lovegift.lv.utils.ToastUtil;

import org.xutils.DbManager;
import org.xutils.db.table.TableEntity;
import org.xutils.ex.DbException;
import org.xutils.x;

import butterknife.Bind;
import butterknife.ButterKnife;

public class RegisterActivity extends AppCompatActivity {

    @Bind(R.id.reg_et_username)
    EditText regEtUsername;
    @Bind(R.id.reg_et_pwd)
    EditText regEtPwd;
    @Bind(R.id.reg_rep_pwd)
    EditText regRepPwd;
    @Bind(R.id.btn_login)
    Button btnLogin;

    DbManager manager;
    private User users=new User();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
        x.view().inject(this);

       // initManger();
        //TODO 得到管理者对象
        manager = ((MyApplication) this.getApplicationContext()).getDb();

    }



    public void btnReg(View view) {
        String name = regEtUsername.getText().toString().trim();
        String pwd = regEtPwd.getText().toString().trim();
        String repPwd = regRepPwd.getText().toString().trim();

        if (TextUtils.isEmpty(name)) {
            Snackbar.make(view, "用户名不能为空", Snackbar.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(pwd)) {
            Snackbar.make(view, "密码不能为空", Snackbar.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(repPwd)) {
            Snackbar.make(view, "确认密码不能为空", Snackbar.LENGTH_SHORT).show();
            return;
        }
        if (!pwd.equals(repPwd)) {
            Snackbar.make(view, "密码输入不一致", Snackbar.LENGTH_SHORT).show();
            return;
        }

        if (!repPwd.equals(pwd)) {
            Snackbar.make(view, "密码输入不一致", Snackbar.LENGTH_SHORT).show();
            return;
        }


        //TODO 把数据存入数据库
        try {
            users=new User(name,pwd);
            manager.save(users);
            LogUtils.i("useruser","userInfo==="+new User(name, pwd).toString());

        } catch (DbException e) {
            e.printStackTrace();
        }
        ToastUtil.show(this, "恭喜您注册成功！");
        finish();

    }



    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }
}
