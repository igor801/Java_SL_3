package Lesson3;

public class Swapper<T> {
    //видео 15:06, 68 строка в классе HomeWork3
    public void swap(T[] array, int first, int second) {
        T buffer = array[first];
        array[first] = array[second];
        array[second] = buffer;
    }
}
