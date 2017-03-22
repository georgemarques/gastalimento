package br.org.gpm.gastalimento.data;

import java.util.List;

import br.org.gpm.gastalimento.model.Expense;
import br.org.gpm.gastalimento.model.Merchant;
import io.realm.Realm;

public class GastaRepository implements Repository {
    private Realm realm;

    public GastaRepository(Realm realm){
        this.realm = realm;
    }

    @Override
    public void insertExpense(Expense expense) {
        realm.insert(expense);
    }

    @Override
    public List<Expense> getExpenses() {
        return realm.where(Expense.class).findAll();
    }

    @Override
    public List<Merchant> getMerchants(){
        return realm.where(Merchant.class).findAll();
    }
}
