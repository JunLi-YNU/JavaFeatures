# Demo Java features
> this repository is demo some java features.
#### Optional Java 8 handle NullPointerException.
>
>** optional(T value)、empty()、of(T value)、ofNullable(T value) **
>* optional(T value) 私有构造函数，当内部调用该构造函数时，会对value进行空值判断。
>当value为null时，抛出NullPointerException；
>当value不等于null时，返回该对象。
>* empty() 反回一个空值对象。
>* of(T value) 调用optional(T value)函数，当我们需要抛出NullPointerException的使用使用。
>* ofNullable(T value) 
>当value为空的时候掉用empty()函数返回一个空对象；
>当vale不为空的时候，调用of(T value)函数，不会反回空对象。
>

>** orElse(T other)、orElseGet(Supplier<? extends T> other)、orElseThrow(Supplier<? extends X> exceptionSupplier) **
>* orElse(T other) 当optional(T value)构造函数不为null，依然会执行orElse逻辑。
>* orElseGet(Supplier<? extends T> other) 当optional(T value)构造函数不为null，不会执行函数内部逻辑。
>* orElseThrow(Supplier<? extends X> exceptionSupplier) 当optional(T value)的value为空时，抛出一个异常。

>** map(Function<? super T,? extends U> mapper)、flatMap（Function<? super T,Optional <U>> mapper>
>* map和flatMap的区别是入参不同
#### Lambda Java 8 functional programming.
#### java 8 annotation.
#### java 8 Consumer.
#### java 8 Supplier.
#### java 8 Predicate.
#### java 8 Function. 
#### java Generic. 