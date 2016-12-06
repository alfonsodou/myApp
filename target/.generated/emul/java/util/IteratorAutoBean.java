package emul.java.util;

public class IteratorAutoBean extends org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean<java.util.Iterator> {
  private final java.util.Iterator shim = new java.util.Iterator() {
    public boolean hasNext()  {
      boolean toReturn = IteratorAutoBean.this.getWrapped().hasNext();
      return toReturn;
    }
    public java.lang.Object next()  {
      java.lang.Object toReturn = IteratorAutoBean.this.getWrapped().next();
      if (toReturn != null) {
        if (IteratorAutoBean.this.isWrapped(toReturn)) {
          toReturn = IteratorAutoBean.this.getFromWrapper(toReturn);
        } else {
        }
      }
      IteratorAutoBean.this.call("next", toReturn );
      return toReturn;
    }
    public void remove()  {
      IteratorAutoBean.this.getWrapped().remove();
      IteratorAutoBean.this.call("remove", null );
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
  public IteratorAutoBean(org.parallax3d.parallax.system.jsonbind.AutoBeanFactory factory, java.util.Iterator wrapped) {
    super(wrapped, factory);
  }
  public java.util.Iterator as() {return shim;}
  public Class<java.util.Iterator> getType() {return java.util.Iterator.class;}
  @Override protected void traverseProperties(org.parallax3d.parallax.system.jsonbind.AutoBeanVisitor visitor, org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean.OneShotContext ctx) {
    org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean bean;
    Object value;
    org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext propertyContext;
    java.util.Iterator as = as();
    value = as.hasNext();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(IteratorAutoBean.this, "next"),
      boolean.class
    );
    if (visitor.visitValueProperty("next", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("next", value, propertyContext);
  }
}
