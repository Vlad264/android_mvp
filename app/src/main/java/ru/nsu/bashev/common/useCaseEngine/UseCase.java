package ru.nsu.bashev.common.useCaseEngine;

public abstract class UseCase<T extends UseCase.RequestValues, R extends UseCase.ResponseValues> {

    private T requestValues;
    private IUseCaseCallback<T> useCaseCallback;

    protected abstract void executeUseCase(T requestValues);

    public T getRequestValues() {
        return requestValues;
    }

    public void setRequestValues(T requestValues) {
        this.requestValues = requestValues;
    }

    public IUseCaseCallback<T> getUseCaseCallback() {
        return useCaseCallback;
    }

    public void setUseCaseCallback(IUseCaseCallback<T> useCaseCallback) {
        this.useCaseCallback = useCaseCallback;
    }

    public interface RequestValues {}
    public interface ResponseValues {}
}
