package by.epamtc.task03.model;

import java.util.Arrays;
import java.util.List;

public class IntegerArray {
    private int [] mas;

    public IntegerArray() {
    }

    public IntegerArray(int[] mas) {
        this.mas = mas;
    }

    public IntegerArray(List<Integer> numbers){
        this.mas = createMasFromList(numbers);
    }

    public int[] getMas() {
        return mas;
    }

    public void setMas(int[] mas) {
        this.mas = mas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntegerArray array = (IntegerArray) o;
        return Arrays.equals(mas, array.mas);
    }

    @Override
    public int hashCode() {
        if (mas == null)
            return 0;
        int result = 1;
        for (int element : mas)
            result = 31 * result + element;
        return result;
    }

    @Override
    public String toString(){
        return getClass().getSimpleName() +
                "mas =" + Arrays.toString(mas);
    }

    private int[] createMasFromList(List<Integer> numbers){
        int [] mas = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++){
            mas[i] = numbers.get(i);
        }
        return mas;
    }
}
