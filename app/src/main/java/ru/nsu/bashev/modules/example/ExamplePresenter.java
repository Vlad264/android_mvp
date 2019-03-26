package ru.nsu.bashev.modules.example;

public class ExamplePresenter implements IExamplePresenter {

    private IExampleView view;

    public ExamplePresenter(IExampleView view) {
        this.view = view;
    }

    @Override
    public void start() {
        //Nothing on start
    }
}
