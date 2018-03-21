package nelson.cubec.daggertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import dagger.internal.DaggerCollections;
import nelson.cubec.daggertest.components.ActivityComponent;
import nelson.cubec.daggertest.components.DaggerActivityComponent;
import nelson.cubec.daggertest.modules.ActivityModule;
import nelson.cubec.daggertest.modules.ActivityModule_ProvidesObjectFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerActivityComponent.builder()
                .activityModule(new ActivityModule(new Object())).build();
    }
}
