package emul.java.util;

public class CollectionAutoBean extends org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean<java.util.Collection> {
  private final java.util.Collection shim = new java.util.Collection() {
    public boolean isEmpty()  {
      boolean toReturn = CollectionAutoBean.this.getWrapped().isEmpty();
      return toReturn;
    }
    public java.lang.Object[] toArray(java.lang.Object[] a)  {
      java.lang.Object[] toReturn = CollectionAutoBean.this.getWrapped().toArray(a);
      CollectionAutoBean.this.call("toArray", toReturn, a);
      return toReturn;
    }
    public boolean add(java.lang.Object o)  {
      boolean toReturn = CollectionAutoBean.this.getWrapped().add(o);
      CollectionAutoBean.this.call("add", toReturn, o);
      return toReturn;
    }
    public boolean addAll(java.util.Collection c)  {
      boolean toReturn = CollectionAutoBean.this.getWrapped().addAll(c);
      CollectionAutoBean.this.call("addAll", toReturn, c);
      return toReturn;
    }
    public boolean contains(java.lang.Object o)  {
      boolean toReturn = CollectionAutoBean.this.getWrapped().contains(o);
      CollectionAutoBean.this.call("contains", toReturn, o);
      return toReturn;
    }
    public boolean containsAll(java.util.Collection c)  {
      boolean toReturn = CollectionAutoBean.this.getWrapped().containsAll(c);
      CollectionAutoBean.this.call("containsAll", toReturn, c);
      return toReturn;
    }
    public boolean remove(java.lang.Object o)  {
      boolean toReturn = CollectionAutoBean.this.getWrapped().remove(o);
      CollectionAutoBean.this.call("remove", toReturn, o);
      return toReturn;
    }
    public boolean removeAll(java.util.Collection c)  {
      boolean toReturn = CollectionAutoBean.this.getWrapped().removeAll(c);
      CollectionAutoBean.this.call("removeAll", toReturn, c);
      return toReturn;
    }
    public boolean retainAll(java.util.Collection c)  {
      boolean toReturn = CollectionAutoBean.this.getWrapped().retainAll(c);
      CollectionAutoBean.this.call("retainAll", toReturn, c);
      return toReturn;
    }
    public int size()  {
      int toReturn = CollectionAutoBean.this.getWrapped().size();
      CollectionAutoBean.this.call("size", toReturn );
      return toReturn;
    }
    public java.lang.Object[] toArray()  {
      java.lang.Object[] toReturn = CollectionAutoBean.this.getWrapped().toArray();
      CollectionAutoBean.this.call("toArray", toReturn );
      return toReturn;
    }
    public java.util.Iterator iterator()  {
      java.util.Iterator toReturn = CollectionAutoBean.this.getWrapped().iterator();
      if (toReturn != null) {
        if (CollectionAutoBean.this.isWrapped(toReturn)) {
          toReturn = CollectionAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.IteratorAutoBean(getFactory(), toReturn).as();
        }
      }
      CollectionAutoBean.this.call("iterator", toReturn );
      return toReturn;
    }
    public void clear()  {
      CollectionAutoBean.this.getWrapped().clear();
      CollectionAutoBean.this.call("clear", null );
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
  public CollectionAutoBean(org.parallax3d.parallax.system.jsonbind.AutoBeanFactory factory, java.util.Collection wrapped) {
    super(wrapped, factory);
  }
  public java.util.Collection as() {return shim;}
  public Class<java.util.Collection> getType() {return java.util.Collection.class;}
  @Override protected void traverseProperties(org.parallax3d.parallax.system.jsonbind.AutoBeanVisitor visitor, org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean.OneShotContext ctx) {
    org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean bean;
    Object value;
    org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext propertyContext;
    java.util.Collection as = as();
    value = as.isEmpty();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(CollectionAutoBean.this, "empty"),
      boolean.class
    );
    if (visitor.visitValueProperty("empty", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("empty", value, propertyContext);
  }
}
