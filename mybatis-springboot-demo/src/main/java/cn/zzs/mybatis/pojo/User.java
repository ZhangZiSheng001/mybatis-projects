package cn.zzs.mybatis.pojo;

import java.util.Date;

public class User {
    private Long id;

    private Integer age;

    private Date create;

    private Date modified;

    private String name;

    private Long roleId;
    
    /**
     * 角色
     */
    private Role role;

    public User(Integer age, Date create, Date modified, String name) {
        this.age = age;
        this.create = create;
        this.modified = modified;
        this.name = name;
    }
    
    
    public User(Long id, Integer age, Date create, Date modified, String name, Long roleId) {
		super();
		this.id = id;
		this.age = age;
		this.create = create;
		this.modified = modified;
		this.name = name;
		this.roleId = roleId;
	}

    
	public Role getRole() {
		return role;
	}


	public void setRole(Role role) {
		this.role = role;
	}


	public User() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
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

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }


	@Override
	public String toString() {
		return "User [id=" + id + ", age=" + age + ",  name=" + name
				+ "]";
	}
    
}