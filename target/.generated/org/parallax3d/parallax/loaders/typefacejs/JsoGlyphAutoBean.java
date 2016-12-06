package org.parallax3d.parallax.loaders.typefacejs;

public class JsoGlyphAutoBean extends org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean<org.parallax3d.parallax.loaders.typefacejs.JsoGlyph> {
  private final org.parallax3d.parallax.loaders.typefacejs.JsoGlyph shim = new org.parallax3d.parallax.loaders.typefacejs.JsoGlyph() {
    public double getHa()  {
      double toReturn = JsoGlyphAutoBean.this.getWrapped().getHa();
      return toReturn;
    }
    public double getXMax()  {
      double toReturn = JsoGlyphAutoBean.this.getWrapped().getXMax();
      return toReturn;
    }
    public double getXMin()  {
      double toReturn = JsoGlyphAutoBean.this.getWrapped().getXMin();
      return toReturn;
    }
    public java.lang.String getO()  {
      java.lang.String toReturn = JsoGlyphAutoBean.this.getWrapped().getO();
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
  public JsoGlyphAutoBean(org.parallax3d.parallax.system.jsonbind.AutoBeanFactory factory) {super(factory);}
  public JsoGlyphAutoBean(org.parallax3d.parallax.system.jsonbind.AutoBeanFactory factory, org.parallax3d.parallax.loaders.typefacejs.JsoGlyph wrapped) {
    super(wrapped, factory);
  }
  public org.parallax3d.parallax.loaders.typefacejs.JsoGlyph as() {return shim;}
  public Class<org.parallax3d.parallax.loaders.typefacejs.JsoGlyph> getType() {return org.parallax3d.parallax.loaders.typefacejs.JsoGlyph.class;}
  @Override protected org.parallax3d.parallax.loaders.typefacejs.JsoGlyph createSimplePeer() {
    return new org.parallax3d.parallax.loaders.typefacejs.JsoGlyph() {
      private final org.parallax3d.parallax.system.jsonbind.Splittable data = org.parallax3d.parallax.loaders.typefacejs.JsoGlyphAutoBean.this.data;
      public double getHa()  {
        java.lang.Double toReturn = JsoGlyphAutoBean.this.getOrReify("ha");
        return toReturn == null ? 0d : toReturn;
      }
      public double getXMax()  {
        java.lang.Double toReturn = JsoGlyphAutoBean.this.getOrReify("x_max");
        return toReturn == null ? 0d : toReturn;
      }
      public double getXMin()  {
        java.lang.Double toReturn = JsoGlyphAutoBean.this.getOrReify("x_min");
        return toReturn == null ? 0d : toReturn;
      }
      public java.lang.String getO()  {
        return (java.lang.String) JsoGlyphAutoBean.this.getOrReify("o");
      }
    };
  }
  @Override protected void traverseProperties(org.parallax3d.parallax.system.jsonbind.AutoBeanVisitor visitor, org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean.OneShotContext ctx) {
    org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean bean;
    Object value;
    org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext propertyContext;
    org.parallax3d.parallax.loaders.typefacejs.JsoGlyph as = as();
    value = as.getHa();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoGlyphAutoBean.this, "ha"),
      double.class
    );
    if (visitor.visitValueProperty("ha", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("ha", value, propertyContext);
    value = as.getXMax();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoGlyphAutoBean.this, "x_max"),
      double.class
    );
    if (visitor.visitValueProperty("x_max", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("x_max", value, propertyContext);
    value = as.getXMin();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoGlyphAutoBean.this, "x_min"),
      double.class
    );
    if (visitor.visitValueProperty("x_min", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("x_min", value, propertyContext);
    value = as.getO();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoGlyphAutoBean.this, "o"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("o", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("o", value, propertyContext);
  }
}
