
package com.s9andRakuwako.hikaritech.item.misc;

import com.s9andRakuwako.hikaritech.item.ItemBase;


public class ItemBasicGua extends ItemBase {

	public int getGua() {
		return gua;
	}

	public ItemBasicGua setGua(int gua) {
		this.gua = gua;
		return this;
	}

	int gua = 0;

	public ItemBasicGua(String name) {
		super(name);
	}



}
