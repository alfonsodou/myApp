package org.parallax3d.parallax.loaders.json;

public class JsoMetadataAutoBean extends org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean<org.parallax3d.parallax.loaders.json.JsoMetadata> {
  private final org.parallax3d.parallax.loaders.json.JsoMetadata shim = new org.parallax3d.parallax.loaders.json.JsoMetadata() {
    public java.lang.String getDescription()  {
      java.lang.String toReturn = JsoMetadataAutoBean.this.getWrapped().getDescription();
      return toReturn;
    }
    public java.lang.String getFormatVersion()  {
      java.lang.String toReturn = JsoMetadataAutoBean.this.getWrapped().getFormatVersion();
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
  public JsoMetadataAutoBean(org.parallax3d.parallax.system.jsonbind.AutoBeanFactory factory) {super(factory);}
  public JsoMetadataAutoBean(org.parallax3d.parallax.system.jsonbind.AutoBeanFactory factory, org.parallax3d.parallax.loaders.json.JsoMetadata wrapped) {
    super(wrapped, factory);
  }
  public org.parallax3d.parallax.loaders.json.JsoMetadata as() {return shim;}
  public Class<org.parallax3d.parallax.loaders.json.JsoMetadata> getType() {return org.parallax3d.parallax.loaders.json.JsoMetadata.class;}
  @Override protected org.parallax3d.parallax.loaders.json.JsoMetadata createSimplePeer() {
    return new org.parallax3d.parallax.loaders.json.JsoMetadata() {
      private final org.parallax3d.parallax.system.jsonbind.Splittable data = org.parallax3d.parallax.loaders.json.JsoMetadataAutoBean.this.data;
      public java.lang.String getDescription()  {
        return (java.lang.String) JsoMetadataAutoBean.this.getOrReify("description");
      }
      public java.lang.String getFormatVersion()  {
        return (java.lang.String) JsoMetadataAutoBean.this.getOrReify("formatVersion");
      }
    };
  }
  @Override protected void traverseProperties(org.parallax3d.parallax.system.jsonbind.AutoBeanVisitor visitor, org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean.OneShotContext ctx) {
    org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean bean;
    Object value;
    org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext propertyContext;
    org.parallax3d.parallax.loaders.json.JsoMetadata as = as();
    value = as.getDescription();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMetadataAutoBean.this, "description"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("description", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("description", value, propertyContext);
    value = as.getFormatVersion();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMetadataAutoBean.this, "formatVersion"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("formatVersion", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("formatVersion", value, propertyContext);
  }
}
