package cdl.wh.warehousecommon.dto;

public class ProductDTO {

	private Long id;
	private Long customerId;
	private String code;
	private String name;
	private Integer uom;
	private Boolean fifo;
	private Boolean fefo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getUom() {
		return uom;
	}

	public void setUom(Integer uom) {
		this.uom = uom;
	}

	public Boolean getFifo() {
		return fifo;
	}

	public void setFifo(Boolean fifo) {
		this.fifo = fifo;
	}

	public Boolean getFefo() {
		return fefo;
	}

	public void setFefo(Boolean fefo) {
		this.fefo = fefo;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", customerId=" + customerId + ", code=" + code + ", name=" + name + ", uom=" + uom
				+ ", fifo=" + fifo + ", fefo=" + fefo + "]";
	}
	

}
