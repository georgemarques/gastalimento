package br.org.gpm.gastalimento.feature.addexpense;


import org.junit.Before;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import br.org.gpm.gastalimento.data.Repository;

public class AddCostPresenterTest {
    @Mock
    private Repository repository;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }


}
