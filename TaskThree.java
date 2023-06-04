    class IterArr<T> implements Iterator<T> {
        private T[] array;
        private int index = 0;
        public IterArr(T[] array) {
            this.array = array;
        }

        @Override
        public boolean isFollow() {
            return index < array.length;
        }

        @Override
        public T next() {
            if(!isFollow())
                throw new NoSuchElementException();
            return array[index++];
        }
    }