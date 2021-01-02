package observer.generic;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class Observable<S extends Observable<S, O, A>, O extends Observer<S, O, A>, A> {
    protected final List<O> observers;

    public Observable() {
        // 이건 뭐야... https://jihyehwang09.github.io/2020/04/14/java-copyonwritearraylist/
        // 변경을 못하는 불변한 어레이리스트, 덕분에 순회할 때 속도가 빠르단다.
        // 아니 그럼 불변이면 다 빠른가? 그럼 뭐 unmodifiedList 이런것도 다 빠른건가.. 모르겠다 찾아도 안 나오네
        this.observers = new CopyOnWriteArrayList<>();
    }

    public void addObserver(O observer) {
        this.observers.add(observer);
    }

    public void removeObserver(O observer) {
        this.observers.remove(observer);
    }

    @SuppressWarnings("unchecked")
    public void notifyObservers(A argument) {
        for (O observer: observers) { // 예제에서는 자꾸 var 쓰네 이거 왜쓰지 자꾸?
            observer.update((S) this, argument);
        }
    }
}
