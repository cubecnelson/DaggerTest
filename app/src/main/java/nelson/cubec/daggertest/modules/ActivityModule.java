package nelson.cubec.daggertest.modules;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by nelson.c.cheung on 13/3/2018.
 */
@Module
public class ActivityModule {

    Object obj;

    public ActivityModule(Object obj) {
        this.obj = obj;
    }

    @Provides
    @Singleton
    public Object providesObject() {
        return obj;
    }
}
