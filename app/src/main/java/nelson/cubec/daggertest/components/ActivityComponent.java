package nelson.cubec.daggertest.components;

import android.app.Activity;

import javax.inject.Singleton;

import dagger.Component;
import nelson.cubec.daggertest.modules.ActivityModule;

/**
 * Created by nelson.c.cheung on 13/3/2018.
 */
@Singleton
@Component(modules = {ActivityModule.class})
public interface ActivityComponent {

    Object getObject();

}
