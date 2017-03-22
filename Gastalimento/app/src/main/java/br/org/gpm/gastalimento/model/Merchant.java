package br.org.gpm.gastalimento.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
public class Merchant extends RealmObject {
    @PrimaryKey
    private String name;

    public Merchant() {
    }

    public Merchant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
