package collection.iterable;

import java.util.Iterator;

public class MyArrayIterator implements Iterator<Integer> {
    private int currentIndex = -1; // 현재 위치(인덱스는 0부터 시작하기 때문에 -1가진다) -1 에서 next를 해야 0
    private int[] targetArr; // 다음 위치

    public MyArrayIterator(int[] targetArr) {
        this.targetArr = targetArr;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < targetArr.length - 1; // 현재 인덱스가 끝보다 작니?
    }

    @Override
    public Integer next() {
        return targetArr[++currentIndex];
    }
}