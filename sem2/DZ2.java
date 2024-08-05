package sem2;
public class DZ2 {
    public static void main(String[] args) {
        Integer[] arr = {2, 2, 0, 0};
        System.out.println(countEvens(arr) + " количество чётных элементов в массиве");
        System.out.println(MinMaxDifference(arr) + " разница между мин и макс значениями массива");
        System.out.println(TrueOrFalse(arr));
    }

    //метод возвращающий количество чётных элементов массива
    public static Integer countEvens(Integer[] array){
        Integer answer = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] >= 0 & array[i]%2==0){
                answer++;
            }
        }
        return answer;
    }

    //функция возвращающая разницу между самым большим и самым маленьким элементами переданного не пустого массива. 
    public static Integer MinMaxDifference(Integer[] array){
        Integer min = array[0];
        Integer max = array[0];
        Integer answer = 0;

        for (int i = 0; i < array.length-1; i++) {
            if(max < array[i+1]){
                max = array[i+1];
            }
            if(min > array[i+1]){
                min = array[i+1];
            }
        }
        answer = max - min;

        return answer;
    }

    //фукцуия возвращающая истину, если в переданном массиве есть два соседних элемента, с нулевым значением.
    public static boolean TrueOrFalse(Integer[] array){
        Integer isZero = 0;
        for (Integer integer : array) {
            if(integer == 0){
                isZero++;
                if(isZero == 2){
                    return true;
                }
            }
            else{
                isZero = 0;
            }
        }
        return false;
    }
}