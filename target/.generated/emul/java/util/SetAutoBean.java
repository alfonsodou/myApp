package emul.java.util;

public class SetAutoBean extends org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean<java.util.Set> {
  private final java.util.Set shim = new java.util.Set() {
    public boolean isEmpty()  {
      boolean toReturn = SetAutoBean.this.getWrapped().isEmpty();
      return toReturn;
    }
    public java.lang.Object[] toArray(java.lang.Object[] a)  {
      java.lang.Object[] toReturn = SetAutoBean.this.getWrapped().toArray(a);
      SetAutoBean.this.call("toArray", toReturn, a);
      return toReturn;
    }
    public boolean add(java.lang.Object o)  {
      boolean toReturn = SetAutoBean.this.getWrapped().add(o);
      SetAutoBean.this.call("add", toReturn, o);
      return toReturn;
    }
    public boolean addAll(java.util.Collection c)  {
      boolean toReturn = SetAutoBean.this.getWrapped().addAll(c);
      SetAutoBean.this.call("addAll", toReturn, c);
      return toReturn;
    }
    public boolean contains(java.lang.Object o)  {
      boolean toReturn = SetAutoBean.this.getWrapped().contains(o);
      SetAutoBean.this.call("contains", toReturn, o);
      return toReturn;
    }
    public boolean containsAll(java.util.Collection c)  {
      boolean toReturn = SetAutoBean.this.getWrapped().containsAll(c);
      SetAutoBean.this.call("containsAll", toReturn, c);
      return toReturn;
    }
    public boolean remove(java.lang.Object o)  {
      boolean toReturn = SetAutoBean.this.getWrapped().remove(o);
      SetAutoBean.this.call("remove", toReturn, o);
      return toReturn;
    }
    public boolean removeAll(java.util.Collection c)  {
      boolean toReturn = SetAutoBean.this.getWrapped().removeAll(c);
      SetAutoBean.this.call("removeAll", toReturn, c);
      return toReturn;
    }
    public boolean retainAll(java.util.Collection c)  {
      boolean toReturn = SetAutoBean.this.getWrapped().retainAll(c);
      SetAutoBean.this.call("retainAll", toReturn, c);
      return toReturn;
    }
    public int size()  {
      int toReturn = SetAutoBean.this.getWrapped().size();
      SetAutoBean.this.call("size", toReturn );
      return toReturn;
    }
    public java.lang.Object[] toArray()  {
      java.lang.Object[] toReturn = SetAutoBean.this.getWrapped().toArray();
      SetAutoBean.this.call("toArray", toReturn );
      return toReturn;
    }
    public java.util.Iterator iterator()  {
      java.util.Iterator toReturn = SetAutoBean.this.getWrapped().iterator();
      if (toReturn != null) {
        if (SetAutoBean.this.isWrapped(toReturn)) {
          toReturn = SetAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.IteratorAutoBean(getFactory(), toReturn).as();
        }
      }
      SetAutoBean.this.call("iterator", toReturn );
      return toReturn;
    }
    public void clear()  {
      SetAutoBean.this.getWrapped().clear();
      SetAutoBean.this.call("clear", null );
    }
    @Override public boolean equals(Object o) {
      return this == o || getWrapped().equals(o);
    }
    @Override public int hashCode() {
      return getWrapped().hashCode();
    }
    @Override public String toString() {
      return getWrapped().toString();
    }
  };
  { com.google.gwt.core.client.impl.WeakMapping.set(shim, org.parallax3d.parallax.system.jsonbind.AutoBean.class.getName(), this); }
  public SetAutoBean(org.parallax3d.parallax.system.jsonbind.AutoBeanFactory factory, java.util.Set wrapped) {
    super(wrapped, factory);
  }
  public java.util.Set as() {return shim;}
  public Class<java.util.Set> getType() {return java.util.Set.class;}
  @Override protected void traverseProperties(org.parallax3d.parallax.system.jsonbind.AutoBeanVisitor visitor, org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean.OneShotContext ctx) {
    org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean bean;
    Object value;
    org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext propertyContext;
    java.util.Set as = as();
    value = as.isEmpty();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(SetAutoBean.this, "empty"),
      boolean.class
    );
    if (visitor.visitValueProperty("empty", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("empty", value, propertyContext);
  }
}
