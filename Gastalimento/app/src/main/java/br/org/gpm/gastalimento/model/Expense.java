package br.org.gpm.gastalimento.model;

import java.util.Date;
import java.util.UUID;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Expense extends RealmObject {
    @PrimaryKey
    private String id;
    private Merchant merchant;
    private Float amount;
    private Date date;

    public Expense() {
    }

    public Expense(Merchant merchant, Float amount, Date date) {
        this.merchant = merchant;
        this.amount = amount;
        this.date = date;
        this.id = UUID.randomUUID().toString();
    }

    public Merchant getMerchant() {
        return merchant;
    }

    public Float getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }
}
