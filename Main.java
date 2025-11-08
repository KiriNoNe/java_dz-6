public class Main {
    public static void main(String[] args){
        Cache<Integer> test = new Cache<>(3);
        System.out.println("Первый элемент: " + test.getFirst());
        test.add(1);
        test.add(2);
        test.add(3);
        System.out.println("Добавили 1,2,3. n = 3");
        System.out.println("Первый элемент: " + test.getFirst());
        test.add(4);
        System.out.println("Добавили элемент превышающий кол n ");
        System.out.println("Первый элемент: " + test.getFirst());
        System.out.println("Последний элемент: " + test.getLast());
        System.out.println("Есть ли Элемент 1 в кеше: " + test.exists(1));
        System.out.println("Есть ли Элемент 2 в кеше: " + test.exists(2));
        System.out.println("Удаление элемента 2: " + test.remove(2));
        System.out.println("Есть ли Элемент 2 в кеше: " + test.exists(2));
        System.out.println("Получение элемента по индексу 0: " + test.getItemByIndex(0));
    }    
}