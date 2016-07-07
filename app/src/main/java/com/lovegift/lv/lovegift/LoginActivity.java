package com.lovegift.lv.lovegift;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.widget.VideoView;

import com.lovegift.lv.BaseApp.MyApplication;
import com.lovegift.lv.bean.User;
import com.lovegift.lv.utils.LogUtils;
import com.lovegift.lv.utils.ToastUtil;

import org.xutils.DbManager;
import org.xutils.ex.DbException;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity {

    @Bind(R.id.videoView)
    VideoView mVideoView;
    @Bind(R.id.et_username)
    EditText etUsername;
    @Bind(R.id.et_pwd)
    EditText etPwd;
    @Bind(R.id.iv_name_clean)
    ImageView ivNameClean;
    @Bind(R.id.iv_pwd_clean)
    ImageView ivPwdClean;
    @Bind(R.id.btn_register)
    Button btnRegister;


    private DbManager manger;
    private String path = Environment.getExternalStorageDirectory() + "/earth.mp4";
    private static final String TAG = "LoginActivity";
    private List<User> all = new ArrayList<>();
    private String username;
    private String pwd;
    private static final  int RESULT_CODES=110;
    private boolean fullscreen=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        x.view().inject(this);
        initData();
        initListener();
    }

    private void initListener() {
        etUsername.addTextChangedListener(watcher);
        etPwd.addTextChangedListener(watcher2);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
            }
        });

        ivNameClean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etUsername.setText("");
            }
        });

        ivPwdClean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etPwd.setText("");
            }
        });


    }

    private void initData() {
        //TODO 得到管理者对象
        manger = ((MyApplication) this.getApplicationContext()).getDb();
        String uri = "android.resource://" + getPackageName() + "/" + R.raw.earth;


        mVideoView.setVideoURI(Uri.parse(uri));
        if(!fullscreen) {//设置RelativeLayout的全屏模式
            RelativeLayout.LayoutParams layoutParams =
                    new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);
            layoutParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
            layoutParams.addRule(RelativeLayout.ALIGN_PARENT_TOP);
            layoutParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
            layoutParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
            mVideoView.setLayoutParams(layoutParams);

            fullscreen = true;//改变全屏/窗口的标记
            mVideoView.start();
        }
//        if (path == "") {
//            Toast.makeText(this, "资源地址不能为空", Toast.LENGTH_SHORT).show();
//        } else {
           // writeData(path);
            //TODO 设置播放路径
//            DisplayMetrics dm = getResources().getDisplayMetrics();
//            float scale = (float) dm.widthPixels / (dm.heightPixels);
//            mVideoView.setVideoLayout(VideoView.VIDEO_LAYOUT_SCALE, scale);
//            mVideoView.setVideoPath(path);
      // }

    }



    //TODO 用户名清除文字事件
    private TextWatcher watcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            if (!TextUtils.isEmpty(s)) {
                ivNameClean.setVisibility(View.VISIBLE);
            } else {
                ivNameClean.setVisibility(View.INVISIBLE);
            }
        }
    };

    //TODO 密码清除文字事件
    private TextWatcher watcher2 = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            if (!TextUtils.isEmpty(s)) {
                ivPwdClean.setVisibility(View.VISIBLE);
            } else {
                ivPwdClean.setVisibility(View.INVISIBLE);
            }
        }
    };



//    //TODO 把视频写入SDcard
//    public void writeData(String paths) {
//        BufferedInputStream bis = null;
//        BufferedOutputStream bos = null;
//        try {
//            InputStream open = getResources().getAssets().open("earth.mp4");
//            bis = new BufferedInputStream(open);
//            bos = new BufferedOutputStream(new FileOutputStream(new File(paths)));
//            int length = -1;
//            byte[] buf = new byte[1024];
//            while ((bis.read(buf) != length)) {
//                bos.write(buf, 0, buf.length);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (bos != null) {
//                try {
//                    bos.close();
//                    bos = null;
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            if (bis != null) {
//                try {
//                    bis.close();
//                    bis = null;
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }


    public void btnLogin(View view) {
         username = etUsername.getText().toString().trim();
         pwd = etPwd.getText().toString().trim();

        Log.i(TAG,"username=="+username);
        Log.i(TAG,"pwd=="+pwd);

        if (TextUtils.isEmpty(username)) {
            ToastUtil.show(this, "请输入用户名");
            return;
        }
        if (TextUtils.isEmpty(pwd)) {
            ToastUtil.show(this, "请输入密码");
            return;
        }

        if (TextUtils.isEmpty(pwd) && TextUtils.isEmpty(pwd)) {
            ToastUtil.show(this, "用户名或者密码不能为空");
            return;
        }

        initManger();
        if (all ==null) {
            ToastUtil.show(this, "用户不存在，请注册..");
            return;
        }

        if (all.size() > 0) {
            for (int i = 0; i < all.size(); i++) {
                LogUtils.i("mtag",".equals name，&& pwd::"+all.get(i).getName()+"........."+all.get(i).getPassWord());
                if (username.equals(all.get(i).getName()) && pwd.equals(all.get(i).getPassWord())) {
                    Intent intent=new Intent();
                    intent.putExtra("username",all.get(i).getName());
                     setResult(RESULT_CODES,intent);
                     finish();

                }
                if (!username.equals(all.get(i).getName()) || !pwd.equals(all.get(i).getPassWord())) {
                    ToastUtil.show(this, "用户名或者密码不正确,请重新输入");
                    return;
                }

            }
        }

    }

    private void initManger() {
        try {
            if (manger == null) {
                Toast.makeText(this, "用户不存在，请注册...", Toast.LENGTH_SHORT).show();
                return;
            } else {
                all = manger.selector(User.class).where("name", "=",username).and("pwd", "=", pwd).findAll();
            }

        } catch (DbException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        mVideoView.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        //TODO 当界面失去焦点时，释放资源
        mVideoView.stopPlayback();
    }
}
