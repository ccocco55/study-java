package list.task.product;

import java.util.ArrayList;
import java.util.List;

import list.task.DBConnecter;

public class ProductService {
//   추가
	public void insert(Product product) {
		DBConnecter.products.add(new Product(product));
	}

//   수정
	public void update(Product product) {
//      아래와 같이 indexOf를 사용하면 DB에 있는 주소와 전달받은 객체의 주소가 다르기 때문에 못찾는다.
//      그런데 eqauls와 hashCode를 재정의했기 때문에 id가 같으면, 같은 객체로 인식한다.
//      따라서 indexOf를 사용해도 된다.
		DBConnecter.products.set(DBConnecter.products.indexOf(product), product);
	}

//   삭제
	public void delete(Product product) {
		DBConnecter.products.remove(product);
	}

// 조회
	public Product findById(long id) {
		Product foundProduct = null;
		for (Product product : DBConnecter.products) {
			if (product.getId() == id) {
				foundProduct = product;
			}
		}
		return new Product(foundProduct);
	}

//   전체조회
	public List<Product> findAll() {
		List<Product> products = new ArrayList<Product>();
		for (Product product : DBConnecter.products) {
			products.add(new Product(product));
		}
		return products;
	}
}
