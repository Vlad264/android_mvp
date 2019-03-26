package ru.nsu.bashev.common.useCaseEngine;

interface IUseCaseCallback<T> {
    void onSuccess(T response);
    void onError();
}
