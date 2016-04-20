package orm;

import java.util.Date;

/**
 * SubId entity. @author MyEclipse Persistence Tools
 */

public class SubId implements java.io.Serializable {

	// Fields

	private Long id;
	private String subContent;
	private Date createtime;
	private Main main;

	// Constructors

	/** default constructor */
	public SubId() {
	}

	/** minimal constructor */
	public SubId(Long id, String subContent, Main main) {
		this.id = id;
		this.subContent = subContent;
		this.main = main;
	}

	/** full constructor */
	public SubId(Long id, String subContent, Date createtime, Main main) {
		this.id = id;
		this.subContent = subContent;
		this.createtime = createtime;
		this.main = main;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSubContent() {
		return this.subContent;
	}

	public void setSubContent(String subContent) {
		this.subContent = subContent;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Main getMain() {
		return this.main;
	}

	public void setMain(Main main) {
		this.main = main;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SubId))
			return false;
		SubId castOther = (SubId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getSubContent() == castOther.getSubContent()) || (this
						.getSubContent() != null
						&& castOther.getSubContent() != null && this
						.getSubContent().equals(castOther.getSubContent())))
				&& ((this.getCreatetime() == castOther.getCreatetime()) || (this
						.getCreatetime() != null
						&& castOther.getCreatetime() != null && this
						.getCreatetime().equals(castOther.getCreatetime())))
				&& ((this.getMain() == castOther.getMain()) || (this.getMain() != null
						&& castOther.getMain() != null && this.getMain()
						.equals(castOther.getMain())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37
				* result
				+ (getSubContent() == null ? 0 : this.getSubContent()
						.hashCode());
		result = 37
				* result
				+ (getCreatetime() == null ? 0 : this.getCreatetime()
						.hashCode());
		result = 37 * result
				+ (getMain() == null ? 0 : this.getMain().hashCode());
		return result;
	}

}