import Dao.CartDao;
import model.CartItem;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CartDao dao = new CartDao();

        // 1️⃣ 添加商品
        CartItem item = new CartItem();
        item.setUserId(1);
        item.setProductId(1001);
        item.setProductName("测试商品");
        item.setPrice(99.9);
        item.setQuantity(2);
        dao.addToCart(item);

        // 2️⃣ 查询购物车
        List<CartItem> list = dao.getCartByUser(1);
        for (CartItem i : list) {
            System.out.println(i.getProductName() + " x" + i.getQuantity());
        }
    }
}
