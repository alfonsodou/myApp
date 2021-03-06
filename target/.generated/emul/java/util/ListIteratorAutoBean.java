package emul.java.util;

public class ListIteratorAutoBean extends org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean<java.util.ListIterator> {
  private final java.util.ListIterator shim = new java.util.ListIterator() {
    public boolean hasNext()  {
      boolean toReturn = ListIteratorAutoBean.this.getWrapped().hasNext();
      return toReturn;
    }
    public boolean hasPrevious()  {
      boolean toReturn = ListIteratorAutoBean.this.getWrapped().hasPrevious();
      return toReturn;
    }
    public java.lang.Object next()  {
      java.lang.Object toReturn = ListIteratorAutoBean.this.getWrapped().next();
      if (toReturn != null) {
        if (ListIteratorAutoBean.this.isWrapped(toReturn)) {
          toReturn = ListIteratorAutoBean.this.getFromWrapper(toReturn);
        } else {
        }
      }
      ListIteratorAutoBean.this.call("next", toReturn );
      return toReturn;
    }
    public java.lang.Object previous()  {
      java.lang.Object toReturn = ListIteratorAutoBean.this.getWrapped().previous();
      if (toReturn != null) {
        if (ListIteratorAutoBean.this.isWrapped(toReturn)) {
          toReturn = ListIteratorAutoBean.this.getFromWrapper(toReturn);
        } else {
        }
      }
      ListIteratorAutoBean.this.call("previous", toReturn );
      return toReturn;
    }
    public int nextIndex()  {
      int toReturn = ListIteratorAutoBean.this.getWrapped().nextIndex();
      ListIteratorAutoBean.this.call("nextIndex", toReturn );
      return toReturn;
    }
    public int previousIndex()  {
      int toReturn = ListIteratorAutoBean.this.getWrapped().previousIndex();
      ListIteratorAutoBean.this.call("previousIndex", toReturn );
      return toReturn;
    }
    public void add(java.lang.Object o)  {
      ListIteratorAutoBean.this.getWrapped().add(o);
      ListIteratorAutoBean.this.call("add", null, o);
    }
    public void remove()  {
      ListIteratorAutoBean.this.getWrapped().remove();
      ListIteratorAutoBean.this.call("remove", null );
    }
    public void set(java.lang.Object o)  {
      ListIteratorAutoBean.this.getWrapped().set(o);
      ListIteratorAutoBean.this.call("set", null, o);
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
  public ListIteratorAutoBean(org.parallax3d.parallax.system.jsonbind.AutoBeanFactory factory, java.util.ListIterator wrapped) {
    super(wrapped, factory);
  }
  public java.util.ListIterator as() {return shim;}
  public Class<java.util.ListIterator> getType() {return java.util.ListIterator.class;}
  @Override protected void traverseProperties(org.parallax3d.parallax.system.jsonbind.AutoBeanVisitor visitor, org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean.OneShotContext ctx) {
    org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean bean;
    Object value;
    org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext propertyContext;
    java.util.ListIterator as = as();
    value = as.hasNext();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(ListIteratorAutoBean.this, "next"),
      boolean.class
    );
    if (visitor.visitValueProperty("next", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("next", value, propertyContext);
    value = as.hasPrevious();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(ListIteratorAutoBean.this, "previous"),
      boolean.class
    );
    if (visitor.visitValueProperty("previous", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("previous", value, propertyContext);
  }
}
