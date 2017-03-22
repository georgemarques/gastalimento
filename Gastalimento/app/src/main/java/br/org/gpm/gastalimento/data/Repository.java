package br.org.gpm.gastalimento.data;

import java.util.List;

import br.org.gpm.gastalimento.model.Expense;
import br.org.gpm.gastalimento.model.Merchant;

public interface Repository {

    void insertExpense(Expense expense);

    List<Expense> getExpenses();

    List<Merchant> getMerchants();
}
