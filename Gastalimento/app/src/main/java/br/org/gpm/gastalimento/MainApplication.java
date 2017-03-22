package br.org.gpm.gastalimento;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;


public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        initRealm();
    }

    private void initRealm(){
        Realm.init(getApplicationContext());
        RealmConfiguration config = new RealmConfiguration.Builder()
                .name("gastalimento.realm")
                .schemaVersion(1)
                .deleteRealmIfMigrationNeeded()
                .build();

        Realm.setDefaultConfiguration(config);
    }

}
