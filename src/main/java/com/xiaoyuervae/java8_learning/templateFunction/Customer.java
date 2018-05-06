package com.xiaoyuervae.java8_learning.templateFunction;

/**
 * User: guanchun.yu
 * Date: 2018/5/6
 * Time: 下午4:30
 */
public class Customer {

    private Long id;

    private String name;

    private String department;

    public Customer() {
    }


    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Customer)) return false;
        final Customer other = (Customer) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$department = this.getDepartment();
        final Object other$department = other.getDepartment();
        if (this$department == null ? other$department != null : !this$department.equals(other$department))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $department = this.getDepartment();
        result = result * PRIME + ($department == null ? 43 : $department.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof Customer;
    }

    public String toString() {
        return "Customer(id=" + this.getId() + ", name=" + this.getName() + ", department=" + this.getDepartment() + ")";
    }
}
