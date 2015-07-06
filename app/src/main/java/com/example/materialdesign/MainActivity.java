package com.example.materialdesign;

import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.materialdesign.Tabs.ViewPagerAdapter;
import com.example.materialdesign.slidingtab.SlidingTabLayout;


public class MainActivity extends AppCompatActivity {
    Toolbar mToolbar;
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;
    SlidingTabLayout tab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar=(Toolbar)findViewById(R.id.tool_bar);
        setSupportActionBar(mToolbar);

        viewPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager());

        viewPager=(ViewPager)findViewById(R.id.pager);
        viewPager.setAdapter(viewPagerAdapter);

        tab=(SlidingTabLayout)findViewById(R.id.tabs);
        tab.setDistributeEvenly(true);

        tab.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
            @Override
            public int getIndicatorColor(int position) {
                return getResources().getColor(R.color.tabsScrollColor);
            }
        });

        tab.setViewPager(viewPager);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
