package com.cg.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "wishlist")
public class WishList {
	@Id
	@Column(name = "wishlist_id")
	private String wishlistId;
	@ManyToMany
	@JoinTable(name = "wishlist_product", joinColumns = @JoinColumn(name = "prod_id"), inverseJoinColumns = @JoinColumn(name = "wishlist_id"))
	private List<Product> wishlistProd = new ArrayList<>();

	public WishList() {
		super();
	}

	public WishList(String wishlistId, List<Product> wishlistProd) {
		super();
		this.wishlistId = wishlistId;
		this.wishlistProd = wishlistProd;
	}

	public String getWishlistId() {
		return wishlistId;
	}

	public void setWishlistId(String wishlistId) {
		this.wishlistId = wishlistId;
	}

	public List<Product> getWishlistProd() {
		return wishlistProd;
	}

	public void setWishlistProd(List<Product> wishlistProd) {
		this.wishlistProd = wishlistProd;
	}

	@Override
	public String toString() {
		return "WishList [wishlistId=" + wishlistId + ", wishlistProd=" + wishlistProd + "]";
	}

}
