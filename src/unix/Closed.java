package unix;
import static com.omer.optional.Store.degisken;
import static com.omer.optional.Store.getClothes;
public class Closed {
    public void borrow() {
        System.out.println("Borrowing clothes: " + getClothes());
        System.out.print("Değişken değeri: " + degisken);
    }
}
