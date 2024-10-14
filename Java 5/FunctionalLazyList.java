import java.util.function.Function;

class FunctionalLazyList<T> implements ILazyList<T> {
  private final Function<T, T> f;
  private T element;
  private boolean first = true;

  FunctionalLazyList(Function<T, T> f, T t){
    this.f = f;
    this.element = t;
  }

  @Override
  public T next(){
    T element2 = f.apply(element);
    if(first){
      first = false;
      return element;
    }
    element = (T) element2;
    return element2;
    }
}