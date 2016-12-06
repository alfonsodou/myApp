package org.parallax3d.parallax.loaders.json;

public class JsoMorphColorsAutoBean extends org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean<org.parallax3d.parallax.loaders.json.JsoMorphColors> {
  private final org.parallax3d.parallax.loaders.json.JsoMorphColors shim = new org.parallax3d.parallax.loaders.json.JsoMorphColors() {
    public java.lang.String getName()  {
      java.lang.String toReturn = JsoMorphColorsAutoBean.this.getWrapped().getName();
      return toReturn;
    }
    public java.util.List getColors()  {
      java.util.List toReturn = JsoMorphColorsAutoBean.this.getWrapped().getColors();
      if (toReturn != null) {
        if (JsoMorphColorsAutoBean.this.isWrapped(toReturn)) {
          toReturn = JsoMorphColorsAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.ListAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
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
  public JsoMorphColorsAutoBean(org.parallax3d.parallax.system.jsonbind.AutoBeanFactory factory) {super(factory);}
  public JsoMorphColorsAutoBean(org.parallax3d.parallax.system.jsonbind.AutoBeanFactory factory, org.parallax3d.parallax.loaders.json.JsoMorphColors wrapped) {
    super(wrapped, factory);
  }
  public org.parallax3d.parallax.loaders.json.JsoMorphColors as() {return shim;}
  public Class<org.parallax3d.parallax.loaders.json.JsoMorphColors> getType() {return org.parallax3d.parallax.loaders.json.JsoMorphColors.class;}
  @Override protected org.parallax3d.parallax.loaders.json.JsoMorphColors createSimplePeer() {
    return new org.parallax3d.parallax.loaders.json.JsoMorphColors() {
      private final org.parallax3d.parallax.system.jsonbind.Splittable data = org.parallax3d.parallax.loaders.json.JsoMorphColorsAutoBean.this.data;
      public java.lang.String getName()  {
        return (java.lang.String) JsoMorphColorsAutoBean.this.getOrReify("name");
      }
      public java.util.List getColors()  {
        return (java.util.List) JsoMorphColorsAutoBean.this.getOrReify("colors");
      }
    };
  }
  @Override protected void traverseProperties(org.parallax3d.parallax.system.jsonbind.AutoBeanVisitor visitor, org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean.OneShotContext ctx) {
    org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean bean;
    Object value;
    org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext propertyContext;
    org.parallax3d.parallax.loaders.json.JsoMorphColors as = as();
    value = as.getName();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMorphColorsAutoBean.this, "name"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("name", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("name", value, propertyContext);
    bean = (org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean) org.parallax3d.parallax.system.jsonbind.AutoBeanUtils.getAutoBean(as.getColors());
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMorphColorsAutoBean.this, "colors"),
      new Class<?>[] {java.util.List.class, java.lang.Double.class},
      new int[] {1, 0}
    );
    if (visitor.visitCollectionProperty("colors", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitCollectionProperty("colors", bean, propertyContext);
  }
}
