package alcoholStore;

public class AlcoholStoreUmniy implements AlcholStore {
    private Alcohol[] alcohols;
    private int realAlcoholCount = 0;
    private int maxAlcoholCount;

    public AlcoholStoreUmniy(int maxAlcoholCount) {
        this.maxAlcoholCount = maxAlcoholCount;

        alcohols = new Alcohol[maxAlcoholCount];
    }

    @Override
    public void addItem(String title, int price) {
        if (realAlcoholCount == maxAlcoholCount) {
            throw new IllegalArgumentException("Слишком много алкоголя");
        }

        try {
            alcohols[realAlcoholCount] = new Alcohol(title, price);
            realAlcoholCount++;
        } catch (Exception e) {
            System.out.println("невозможно добавить алкоголь: " + e.getMessage());
        }
    }

    @Override
    public void printAll() {
        for (int i = 0; i < realAlcoholCount; i++) {
            System.out.println(alcohols[i].getTitle() + " " + alcohols[i].getPrice());
        }
    }

    @Override
    public void buyItem(String title) {
        for (int i = 0; i < realAlcoholCount; i++) {
            if (
                    alcohols[i]
                            .getTitle()
                            .equals(title)
            ) {
                for (int j = i + 1; j < realAlcoholCount; j++) {
                    alcohols[j - 1] = alcohols[j];
                }
                break;
            }
        }

        realAlcoholCount--;
    }

}
