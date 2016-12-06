package org.parallax3d.parallax.loaders.json;

public class JsoMorphTargetsAutoBean extends org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean<org.parallax3d.parallax.loaders.json.JsoMorphTargets> {
  private final org.parallax3d.parallax.loaders.json.JsoMorphTargets shim = new org.parallax3d.parallax.loaders.json.JsoMorphTargets() {
    public java.lang.String getName()  {
      java.lang.String toReturn = JsoMorphTargetsAutoBean.this.getWrapped().getName();
      return toReturn;
    }
    public java.util.List getVertices()  {
      java.util.List toReturn = JsoMorphTargetsAutoBean.this.getWrapped().getVertices();
      if (toReturn != null) {
        if (JsoMorphTargetsAutoBean.this.isWrapped(toReturn)) {
          toReturn = JsoMorphTargetsAutoBean.this.getFromWrapper(toReturn);
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
  public JsoMorphTargetsAutoBean(org.parallax3d.parallax.system.jsonbind.AutoBeanFactory factory) {super(factory);}
  public JsoMorphTargetsAutoBean(org.parallax3d.parallax.system.jsonbind.AutoBeanFactory factory, org.parallax3d.parallax.loaders.json.JsoMorphTargets wrapped) {
    super(wrapped, factory);
  }
  public org.parallax3d.parallax.loaders.json.JsoMorphTargets as() {return shim;}
  public Class<org.parallax3d.parallax.loaders.json.JsoMorphTargets> getType() {return org.parallax3d.parallax.loaders.json.JsoMorphTargets.class;}
  @Override protected org.parallax3d.parallax.loaders.json.JsoMorphTargets createSimplePeer() {
    return new org.parallax3d.parallax.loaders.json.JsoMorphTargets() {
      private final org.parallax3d.parallax.system.jsonbind.Splittable data = org.parallax3d.parallax.loaders.json.JsoMorphTargetsAutoBean.this.data;
      public java.lang.String getName()  {
        return (java.lang.String) JsoMorphTargetsAutoBean.this.getOrReify("name");
      }
      public java.util.List getVertices()  {
        return (java.util.List) JsoMorphTargetsAutoBean.this.getOrReify("vertices");
      }
    };
  }
  @Override protected void traverseProperties(org.parallax3d.parallax.system.jsonbind.AutoBeanVisitor visitor, org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean.OneShotContext ctx) {
    org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean bean;
    Object value;
    org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext propertyContext;
    org.parallax3d.parallax.loaders.json.JsoMorphTargets as = as();
    value = as.getName();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMorphTargetsAutoBean.this, "name"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("name", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("name", value, propertyContext);
    bean = (org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean) org.parallax3d.parallax.system.jsonbind.AutoBeanUtils.getAutoBean(as.getVertices());
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMorphTargetsAutoBean.this, "vertices"),
      new Class<?>[] {java.util.List.class, java.lang.Double.class},
      new int[] {1, 0}
    );
    if (visitor.visitCollectionProperty("vertices", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitCollectionProperty("vertices", bean, propertyContext);
  }
}
