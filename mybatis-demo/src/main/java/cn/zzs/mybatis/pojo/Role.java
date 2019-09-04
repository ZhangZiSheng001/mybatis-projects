package cn.zzs.mybatis.pojo;

import java.util.Date;
import java.util.List;

public class Role {
    private Long id;

    private Date create;

    private Date modified;

    private String name;
    
    /**
     * 拥有该角色的用户集合
     */
    private List<User> users;
    
    /**
     * 拥有该角色的菜单集合
     */
    private List<Menu> menus;
    
	public Role(Long id, Date create, Date modified, String name) {
        this.id = id;
        this.create = create;
        this.modified = modified;
        this.name = name;
    }
    
    
    public Role(Date create, Date modified, String name) {
		super();
		this.create = create;
		this.modified = modified;
		this.name = name;
	}

    public List<Menu> getMenus() {
		return menus;
	}


	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}
	
	public List<User> getUsers() {
		return users;
	}


	public void setUsers(List<User> users) {
		this.users = users;
	}


	public Role() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

	@Override
	public String toString() {
		return "Role [id=" + id + ",  name=" + name + "]";
	}
    
}