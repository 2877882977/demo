package demo.dto;

import java.io.Serializable;

public class PageRequest implements Serializable {
	private static final long serialVersionUID = 1L; // 添加 serialVersionUID

	private int page = 1; // 当前页码
	private int rowNum = 10; // 每页记录数

	// 默认构造函数
	public PageRequest() {
	}

	// 带参数的构造函数
	public PageRequest(int page, int rowNum) {
		this.page = page > 0 ? page : 1; // 确保页码大于0
		this.rowNum = rowNum > 0 ? rowNum : 10; // 确保每页记录数大于0
	}

	public int getPage() {
		return page;
	}

	public void setPage(int pageNum) {
		this.page = pageNum > 0 ? pageNum : 1; // 确保页码大于0
	}

	public int getRowNum() {
		return rowNum;
	}

	public void setRowNum(int pageSize) {
		this.rowNum = pageSize > 0 ? pageSize : 10; // 确保每页记录数大于0
	}

	// 这个方法可以去掉，避免混淆
	// public int getRows() {
	//     return rows;
	// }

	// public void setRows(int rows) {
	//     this.rows = rows;
	//     this.rowNum = rows;
	// }
}
