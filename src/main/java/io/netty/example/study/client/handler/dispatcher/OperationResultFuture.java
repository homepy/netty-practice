package io.netty.example.study.client.handler.dispatcher;

import io.netty.example.study.common.OperationResult;
import io.netty.util.concurrent.DefaultPromise;

public class OperationResultFuture<T extends OperationResult> extends DefaultPromise<T> {
}
