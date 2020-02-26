package com.bw.entity;

public class Goods {
	private Integer id;
	
	private String name;
	
	private String lei;
	
	private Integer chi;
	
	private Integer shu;
	
	private Integer dan;
	
	private Integer p1;
	
	private Integer p2;
	
	private Integer PageNum;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLei() {
		return lei;
	}

	public void setLei(String lei) {
		this.lei = lei;
	}

	public Integer getChi() {
		return chi;
	}

	public void setChi(Integer chi) {
		this.chi = chi;
	}

	public Integer getShu() {
		return shu;
	}

	public void setShu(Integer shu) {
		this.shu = shu;
	}

	public Integer getDan() {
		return dan;
	}

	public void setDan(Integer dan) {
		this.dan = dan;
	}

	public Integer getP1() {
		return p1;
	}

	public void setP1(Integer p1) {
		this.p1 = p1;
	}

	public Integer getP2() {
		return p2;
	}

	public void setP2(Integer p2) {
		this.p2 = p2;
	}

	public Integer getPageNum() {
		return PageNum;
	}

	public void setPageNum(Integer pageNum) {
		PageNum = pageNum;
	}

	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", lei=" + lei + ", chi=" + chi + ", shu=" + shu + ", dan=" + dan
				+ ", p1=" + p1 + ", p2=" + p2 + ", PageNum=" + PageNum + "]";
	}

	public Goods(Integer id, String name, String lei, Integer chi, Integer shu, Integer dan, Integer p1, Integer p2,
			Integer pageNum) {
		super();
		this.id = id;
		this.name = name;
		this.lei = lei;
		this.chi = chi;
		this.shu = shu;
		this.dan = dan;
		this.p1 = p1;
		this.p2 = p2;
		PageNum = pageNum;
	}

	public Goods() {
		super();
	}
	

	
	
}
