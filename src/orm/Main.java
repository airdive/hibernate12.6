package orm;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Main entity. @author MyEclipse Persistence Tools
 */

public class Main implements java.io.Serializable {

	// Fields

	private Long id;
	private String title;
	private String content;
	private Date createtime;
	private Set<Sub> subs = new HashSet<Sub>(0);

	// Constructors

	/** default constructor */
	public Main() {
	}

	/** minimal constructor */
	public Main(String title) {
		this.title = title;
	}

	/** full constructor */
	public Main(String title, String content, Date createtime, Set<Sub> subs) {
		this.title = title;
		this.content = content;
		this.createtime = createtime;
		this.subs = subs;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Set<Sub> getSubs() {
		return this.subs;
	}

	public void setSubs(Set<Sub> subs) {
		this.subs = subs;
	}

}