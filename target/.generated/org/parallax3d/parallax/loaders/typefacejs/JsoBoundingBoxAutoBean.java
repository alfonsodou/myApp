package org.parallax3d.parallax.loaders.typefacejs;

public class JsoBoundingBoxAutoBean extends org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean<org.parallax3d.parallax.loaders.typefacejs.JsoBoundingBox> {
  private final org.parallax3d.parallax.loaders.typefacejs.JsoBoundingBox shim = new org.parallax3d.parallax.loaders.typefacejs.JsoBoundingBox() {
    public int getXMax()  {
      int toReturn = JsoBoundingBoxAutoBean.this.getWrapped().getXMax();
      return toReturn;
    }
    public int getXMin()  {
      int toReturn = JsoBoundingBoxAutoBean.this.getWrapped().getXMin();
      return toReturn;
    }
    public int getYMax()  {
      int toReturn = JsoBoundingBoxAutoBean.this.getWrapped().getYMax();
      return toReturn;
    }
    public int getYMin()  {
      int toReturn = JsoBoundingBoxAutoBean.this.getWrapped().getYMin();
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
  public JsoBoundingBoxAutoBean(org.parallax3d.parallax.system.jsonbind.AutoBeanFactory factory) {super(factory);}
  public JsoBoundingBoxAutoBean(org.parallax3d.parallax.system.jsonbind.AutoBeanFactory factory, org.parallax3d.parallax.loaders.typefacejs.JsoBoundingBox wrapped) {
    super(wrapped, factory);
  }
  public org.parallax3d.parallax.loaders.typefacejs.JsoBoundingBox as() {return shim;}
  public Class<org.parallax3d.parallax.loaders.typefacejs.JsoBoundingBox> getType() {return org.parallax3d.parallax.loaders.typefacejs.JsoBoundingBox.class;}
  @Override protected org.parallax3d.parallax.loaders.typefacejs.JsoBoundingBox createSimplePeer() {
    return new org.parallax3d.parallax.loaders.typefacejs.JsoBoundingBox() {
      private final org.parallax3d.parallax.system.jsonbind.Splittable data = org.parallax3d.parallax.loaders.typefacejs.JsoBoundingBoxAutoBean.this.data;
      public int getXMax()  {
        java.lang.Integer toReturn = JsoBoundingBoxAutoBean.this.getOrReify("XMax");
        return toReturn == null ? 0 : toReturn;
      }
      public int getXMin()  {
        java.lang.Integer toReturn = JsoBoundingBoxAutoBean.this.getOrReify("XMin");
        return toReturn == null ? 0 : toReturn;
      }
      public int getYMax()  {
        java.lang.Integer toReturn = JsoBoundingBoxAutoBean.this.getOrReify("YMax");
        return toReturn == null ? 0 : toReturn;
      }
      public int getYMin()  {
        java.lang.Integer toReturn = JsoBoundingBoxAutoBean.this.getOrReify("YMin");
        return toReturn == null ? 0 : toReturn;
      }
    };
  }
  @Override protected void traverseProperties(org.parallax3d.parallax.system.jsonbind.AutoBeanVisitor visitor, org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean.OneShotContext ctx) {
    org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean bean;
    Object value;
    org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext propertyContext;
    org.parallax3d.parallax.loaders.typefacejs.JsoBoundingBox as = as();
    value = as.getXMax();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoBoundingBoxAutoBean.this, "XMax"),
      int.class
    );
    if (visitor.visitValueProperty("XMax", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("XMax", value, propertyContext);
    value = as.getXMin();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoBoundingBoxAutoBean.this, "XMin"),
      int.class
    );
    if (visitor.visitValueProperty("XMin", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("XMin", value, propertyContext);
    value = as.getYMax();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoBoundingBoxAutoBean.this, "YMax"),
      int.class
    );
    if (visitor.visitValueProperty("YMax", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("YMax", value, propertyContext);
    value = as.getYMin();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoBoundingBoxAutoBean.this, "YMin"),
      int.class
    );
    if (visitor.visitValueProperty("YMin", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("YMin", value, propertyContext);
  }
}
