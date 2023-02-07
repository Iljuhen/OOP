// Создать список по аналогии LinkedList (список связанных элементов), 
// реализовать в нем iterable интерфейс. Список должен содержать элементы со ссылкой на следующий 
// элемент (если показалось мало, то реализовать ссылку и на предыдущий элемент)

package DZs.dz3;

public class Dz3main {
    
    public static void main(String[] args) {
       
        GrillList<String> grillList = new GrillList<>();
        
        
        grillList.add("Шашлык из свинной шейки");
        grillList.add("Свинные ребрышки");
        grillList.add("Шашлык из баранины");
        grillList.add("Люля - кебаб");
        grillList.add("Шашлык из семги");
        


        

        for (String dishes : grillList) {
            System.out.println(dishes);
        }
    }
}