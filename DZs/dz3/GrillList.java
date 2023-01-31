package DZs.dz3;

import java.util.Iterator;

public class GrillList<G> implements Iterable<G> {
    private Node<G> node = null;
    private int counter = 0;

    public GrillList() {
        node = new Node<>();

    }

    public int size() {
        return counter;
    }

    public void add(G element) {
        if (counter == 0) {
            node.set(element);
        } else {
            node.add(element);
        }
        counter++;

    }

    @Override
    public Iterator<G> iterator() {
        return new GrillIterator(node);
    }

    private class Node<E> {

        private G element;
        private Node<G> next = null;

        Node() {
        }

        Node(G element) {
            set(element);
        }

        void set(G element) {
            this.element = element;
        }

        void add(G element) {
            if (isNext()) {
                next.add(element);
            } else {
                next = new Node<>(element);
            }
        }

        G get() {
            return element;
        }

        boolean isNext() {
            return next != null;
        }
    }

    private class GrillIterator implements Iterator<G> {
        private Node<G> current;
        private boolean isFirst = true;

        GrillIterator(Node<G> node) {
            current = node;
        }

        @Override
        public boolean hasNext() {
            if (counter == 1 && isFirst)
                return true;
            return current.isNext();

        }

        @Override
        public G next() {
            if (isFirst)
                isFirst = false;
            else
                current = current.next;
            return current.get();
        }
    }
}
