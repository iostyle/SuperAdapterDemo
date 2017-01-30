package sky.superadapterdemo.Acticity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import sky.superadapterdemo.Bean.PhoneBean;
import sky.superadapterdemo.R;
import sky.superadapterdemo.Adapter.AdapterWithSuperVIewHolder;

public class MainActivity extends AppCompatActivity {

    private ListView lv;

    private List<PhoneBean> phoneBeens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initView();
    }

    private void initData() {
        phoneBeens = new ArrayList<>();
        phoneBeens.add(new PhoneBean("张三", "13333333333"));
        phoneBeens.add(new PhoneBean("李四", "14444444444"));
        phoneBeens.add(new PhoneBean("王五", "15555555555"));
        phoneBeens.add(new PhoneBean("xx", "13333333331"));
        phoneBeens.add(new PhoneBean("aa", "13333333332"));
        phoneBeens.add(new PhoneBean("vv", "13333333333"));
        phoneBeens.add(new PhoneBean("张三", "13333333333"));
        phoneBeens.add(new PhoneBean("李四", "14444444444"));
        phoneBeens.add(new PhoneBean("王五", "15555555555"));
        phoneBeens.add(new PhoneBean("xx", "13333333331"));
        phoneBeens.add(new PhoneBean("aa", "13333333332"));
        phoneBeens.add(new PhoneBean("vv", "13333333333"));
        phoneBeens.add(new PhoneBean("张三", "13333333333"));
        phoneBeens.add(new PhoneBean("李四", "14444444444"));
        phoneBeens.add(new PhoneBean("王五", "15555555555"));
        phoneBeens.add(new PhoneBean("xx", "13333333331"));
        phoneBeens.add(new PhoneBean("aa", "13333333332"));
        phoneBeens.add(new PhoneBean("vv", "13333333333"));
        phoneBeens.add(new PhoneBean("张三", "13333333333"));
        phoneBeens.add(new PhoneBean("李四", "14444444444"));
        phoneBeens.add(new PhoneBean("王五", "15555555555"));
        phoneBeens.add(new PhoneBean("xx", "13333333331"));
        phoneBeens.add(new PhoneBean("aa", "13333333332"));
        phoneBeens.add(new PhoneBean("vv", "13333333333"));
        phoneBeens.add(new PhoneBean("张三", "13333333333"));
        phoneBeens.add(new PhoneBean("李四", "14444444444"));
        phoneBeens.add(new PhoneBean("王五", "15555555555"));
        phoneBeens.add(new PhoneBean("xx", "13333333331"));
        phoneBeens.add(new PhoneBean("aa", "13333333332"));
        phoneBeens.add(new PhoneBean("vv", "13333333333"));

    }

    private void initView() {
        lv = (ListView) findViewById(R.id.main_lv);
        lv.setAdapter(new AdapterWithSuperVIewHolder(this,phoneBeens));
    }
}
