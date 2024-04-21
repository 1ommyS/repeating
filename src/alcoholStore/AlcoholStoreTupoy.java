package alcoholStore;

public class AlcoholStoreTupoy implements AlcholStore {

    // у i-ой товара i-ая цена
    private String[] items;
    private int[] prices;

    private int maxAmountOfItems;
    private int realAmountOfItems = 0;

    /*
    1) класс - описание всех полей и методов
    2) объект / экземпляр класса - конкретный набор данных и методов
     */
    public AlcoholStoreTupoy(int maxAmountOfItems) {
        this.maxAmountOfItems = maxAmountOfItems;

        items = new String[maxAmountOfItems];
        prices = new int[maxAmountOfItems];
    }

    // добавить товар
    @Override
    public void addItem(String item, int price) {
        if (realAmountOfItems < maxAmountOfItems) {
            items[realAmountOfItems] = item;
            prices[realAmountOfItems] = price;

            realAmountOfItems++;
        } else {
            System.out.println("Магазин переполнен");
        }
    }

    @Override
    public void buyItem(String item) {
       /*
       1) ищем товар в списке товаров (массиве)
       2) нашли индекс
       3) если нашли - сдвигаем все элементы начиная со след индекса влево на 1
        */
        for (int i = 0; i < realAmountOfItems; i++) {
            if (item.equals(items[i])) {
                for (int j = i + 1; j < realAmountOfItems; j++) {
                    items[j - 1] = items[j];
                    prices[j - 1] = prices[j];
                }
            }
        }
        realAmountOfItems--;
    }

    @Override
    public void printAll() {
        for (int i = 0; i < realAmountOfItems; i++) {
            System.out.println(items[i] + " стоит " + prices[i]);
        }
    }
}
