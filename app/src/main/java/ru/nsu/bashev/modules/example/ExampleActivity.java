package ru.nsu.bashev.modules.example;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import ru.nsu.bashev.R;
import ru.nsu.bashev.modules.base.IBaseView;
import ru.nsu.bashev.modules.base.SingleFragmentActivity;

public class ExampleActivity extends SingleFragmentActivity {

    private IExamplePresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);

        IExampleView view = (IExampleView) fragment;
        presenter = new ExamplePresenter(view);
        view.setPresenter(presenter);

    }

    @Override
    protected Fragment createFragment() {
        return new ExampleFragment();
    }
}
