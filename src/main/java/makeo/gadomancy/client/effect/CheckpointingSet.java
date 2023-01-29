package makeo.gadomancy.client.effect;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class CheckpointingSet<E> implements Iterable<E> {

    private final Set<E> main = new HashSet<>();
    private final Set<E> toAdd = Collections.synchronizedSet(new HashSet<>());
    private final Set<E> toRemove = Collections.synchronizedSet(new HashSet<>());

    public void add(E elem) {
        toAdd.add(elem);
    }

    public void remove(E elem) {
        toRemove.add(elem);
    }

    public void clear() {
        synchronized (toAdd) {
            synchronized (toRemove) {
                toAdd.clear();
                toRemove.clear();
                main.clear();
            }
        }
    }

    public void update() {
        synchronized (toAdd) {
            main.addAll(toAdd);
            toAdd.clear();
        }
        synchronized (toRemove) {
            main.removeAll(toRemove);
            toRemove.clear();
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {

            private final Iterator<E> backing = main.iterator();
            private boolean initialized = false;
            private E cur = null;

            @Override
            public boolean hasNext() {
                return backing.hasNext();
            }

            @Override
            public E next() {
                initialized = true;
                return cur = backing.next();
            }

            @Override
            public void remove() {
                if (!initialized) throw new IllegalStateException();
                toRemove.add(cur);
            }
        };
    }
}
