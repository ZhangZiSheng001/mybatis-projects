package cn.zzs.mybatis.pojo;

import java.util.Date;
import java.util.List;

public class Menu {
    private String id;

    private Date create;

    private Date modified;

    private String name;

    private Integer order;

    private String url;

    private String parentId;
    
    /**
     * 拥有该菜单的角色
     */
    private List<Role> roles;
    
    /**
     * 子菜单
     */
    private List<Menu> children;

    public Menu(String id, Date create, Date modified, String name, Integer order, String url, String parentId) {
        this.id = id;
        this.create = create;
        this.modified = modified;
        this.name = name;
        this.order = order;
        this.url = url;
        this.parentId = parentId;
    }
    

    public Menu(Date create, Date modified, String name, Integer order, String url, String parentId) {
		super();
		this.create = create;
		this.modified = modified;
		this.name = name;
		this.order = order;
		this.url = url;
		this.parentId = parentId;
	}

    
	public List<Role> getRoles() {
		return roles;
	}


	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}


	public Menu() {
        super();
    }
	
    public List<Menu> getChildren() {
		return children;
	}


	public void setChildren(List<Menu> children) {
		this.children = children;
	}


	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Date getCreate() {
        return create;
    }

    public void setCreate(Date create) {
        this.create = create;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }


	@Override
	public String toString() {
		return "Menu [id=" + id + ",  name=" + name + ", order="
				+ order + ", url=" + url + ", parentId=" + parentId + "]";
	}
    
}