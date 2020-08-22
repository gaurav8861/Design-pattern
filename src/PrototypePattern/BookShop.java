package PrototypePattern;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
	
	private String shopName;
	private List<Book> books = new ArrayList<Book>();
	
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	public void loadData() {
		for (int i = 0; i < 10; i++) {
			Book b = new Book();
			b.setBid("" + i);
			b.setBname("book" + i);
			getBooks().add(b);
		}
	}
	
	@Override
	protected BookShop clone() throws CloneNotSupportedException {
		BookShop shop = new BookShop();
		for(Book b : this.getBooks()) {
			shop.getBooks().add(b);
		}
		return shop;
	}
	@Override
	public String toString() {
		return "BookShop [shopName=" + shopName + ", books=" + books + "]";
	}	

}
