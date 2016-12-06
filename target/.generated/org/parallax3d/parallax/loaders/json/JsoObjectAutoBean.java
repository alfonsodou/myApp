package org.parallax3d.parallax.loaders.json;

public class JsoObjectAutoBean extends org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean<org.parallax3d.parallax.loaders.json.JsoObject> {
  private final org.parallax3d.parallax.loaders.json.JsoObject shim = new org.parallax3d.parallax.loaders.json.JsoObject() {
    public double getScale()  {
      double toReturn = JsoObjectAutoBean.this.getWrapped().getScale();
      return toReturn;
    }
    public int getInfluencesPerVertex()  {
      int toReturn = JsoObjectAutoBean.this.getWrapped().getInfluencesPerVertex();
      return toReturn;
    }
    public java.util.List getNormals()  {
      java.util.List toReturn = JsoObjectAutoBean.this.getWrapped().getNormals();
      if (toReturn != null) {
        if (JsoObjectAutoBean.this.isWrapped(toReturn)) {
          toReturn = JsoObjectAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.ListAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public java.util.List getSkinWeights()  {
      java.util.List toReturn = JsoObjectAutoBean.this.getWrapped().getSkinWeights();
      if (toReturn != null) {
        if (JsoObjectAutoBean.this.isWrapped(toReturn)) {
          toReturn = JsoObjectAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.ListAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public java.util.List getVertices()  {
      java.util.List toReturn = JsoObjectAutoBean.this.getWrapped().getVertices();
      if (toReturn != null) {
        if (JsoObjectAutoBean.this.isWrapped(toReturn)) {
          toReturn = JsoObjectAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.ListAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public java.util.List getColors()  {
      java.util.List toReturn = JsoObjectAutoBean.this.getWrapped().getColors();
      if (toReturn != null) {
        if (JsoObjectAutoBean.this.isWrapped(toReturn)) {
          toReturn = JsoObjectAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.ListAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public java.util.List getFaces()  {
      java.util.List toReturn = JsoObjectAutoBean.this.getWrapped().getFaces();
      if (toReturn != null) {
        if (JsoObjectAutoBean.this.isWrapped(toReturn)) {
          toReturn = JsoObjectAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.ListAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public java.util.List getSkinIndices()  {
      java.util.List toReturn = JsoObjectAutoBean.this.getWrapped().getSkinIndices();
      if (toReturn != null) {
        if (JsoObjectAutoBean.this.isWrapped(toReturn)) {
          toReturn = JsoObjectAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.ListAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public java.util.List getUvs()  {
      java.util.List toReturn = JsoObjectAutoBean.this.getWrapped().getUvs();
      if (toReturn != null) {
        if (JsoObjectAutoBean.this.isWrapped(toReturn)) {
          toReturn = JsoObjectAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.ListAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public java.util.List getMaterials()  {
      java.util.List toReturn = JsoObjectAutoBean.this.getWrapped().getMaterials();
      if (toReturn != null) {
        if (JsoObjectAutoBean.this.isWrapped(toReturn)) {
          toReturn = JsoObjectAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.ListAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public java.util.List getMorphColors()  {
      java.util.List toReturn = JsoObjectAutoBean.this.getWrapped().getMorphColors();
      if (toReturn != null) {
        if (JsoObjectAutoBean.this.isWrapped(toReturn)) {
          toReturn = JsoObjectAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.ListAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public java.util.List getMorphTargets()  {
      java.util.List toReturn = JsoObjectAutoBean.this.getWrapped().getMorphTargets();
      if (toReturn != null) {
        if (JsoObjectAutoBean.this.isWrapped(toReturn)) {
          toReturn = JsoObjectAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.ListAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public org.parallax3d.parallax.loaders.json.JsoMetadata getMetadata()  {
      org.parallax3d.parallax.loaders.json.JsoMetadata toReturn = JsoObjectAutoBean.this.getWrapped().getMetadata();
      if (toReturn != null) {
        if (JsoObjectAutoBean.this.isWrapped(toReturn)) {
          toReturn = JsoObjectAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new org.parallax3d.parallax.loaders.json.JsoMetadataAutoBean(getFactory(), toReturn).as();
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
  public JsoObjectAutoBean(org.parallax3d.parallax.system.jsonbind.AutoBeanFactory factory) {super(factory);}
  public JsoObjectAutoBean(org.parallax3d.parallax.system.jsonbind.AutoBeanFactory factory, org.parallax3d.parallax.loaders.json.JsoObject wrapped) {
    super(wrapped, factory);
  }
  public org.parallax3d.parallax.loaders.json.JsoObject as() {return shim;}
  public Class<org.parallax3d.parallax.loaders.json.JsoObject> getType() {return org.parallax3d.parallax.loaders.json.JsoObject.class;}
  @Override protected org.parallax3d.parallax.loaders.json.JsoObject createSimplePeer() {
    return new org.parallax3d.parallax.loaders.json.JsoObject() {
      private final org.parallax3d.parallax.system.jsonbind.Splittable data = org.parallax3d.parallax.loaders.json.JsoObjectAutoBean.this.data;
      public double getScale()  {
        java.lang.Double toReturn = JsoObjectAutoBean.this.getOrReify("scale");
        return toReturn == null ? 0d : toReturn;
      }
      public int getInfluencesPerVertex()  {
        java.lang.Integer toReturn = JsoObjectAutoBean.this.getOrReify("influencesPerVertex");
        return toReturn == null ? 0 : toReturn;
      }
      public java.util.List getNormals()  {
        return (java.util.List) JsoObjectAutoBean.this.getOrReify("normals");
      }
      public java.util.List getSkinWeights()  {
        return (java.util.List) JsoObjectAutoBean.this.getOrReify("skinWeights");
      }
      public java.util.List getVertices()  {
        return (java.util.List) JsoObjectAutoBean.this.getOrReify("vertices");
      }
      public java.util.List getColors()  {
        return (java.util.List) JsoObjectAutoBean.this.getOrReify("colors");
      }
      public java.util.List getFaces()  {
        return (java.util.List) JsoObjectAutoBean.this.getOrReify("faces");
      }
      public java.util.List getSkinIndices()  {
        return (java.util.List) JsoObjectAutoBean.this.getOrReify("skinIndices");
      }
      public java.util.List getUvs()  {
        return (java.util.List) JsoObjectAutoBean.this.getOrReify("uvs");
      }
      public java.util.List getMaterials()  {
        return (java.util.List) JsoObjectAutoBean.this.getOrReify("materials");
      }
      public java.util.List getMorphColors()  {
        return (java.util.List) JsoObjectAutoBean.this.getOrReify("morphColors");
      }
      public java.util.List getMorphTargets()  {
        return (java.util.List) JsoObjectAutoBean.this.getOrReify("morphTargets");
      }
      public org.parallax3d.parallax.loaders.json.JsoMetadata getMetadata()  {
        return (org.parallax3d.parallax.loaders.json.JsoMetadata) JsoObjectAutoBean.this.getOrReify("metadata");
      }
    };
  }
  @Override protected void traverseProperties(org.parallax3d.parallax.system.jsonbind.AutoBeanVisitor visitor, org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean.OneShotContext ctx) {
    org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean bean;
    Object value;
    org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext propertyContext;
    org.parallax3d.parallax.loaders.json.JsoObject as = as();
    value = as.getScale();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoObjectAutoBean.this, "scale"),
      double.class
    );
    if (visitor.visitValueProperty("scale", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("scale", value, propertyContext);
    value = as.getInfluencesPerVertex();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoObjectAutoBean.this, "influencesPerVertex"),
      int.class
    );
    if (visitor.visitValueProperty("influencesPerVertex", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("influencesPerVertex", value, propertyContext);
    bean = (org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean) org.parallax3d.parallax.system.jsonbind.AutoBeanUtils.getAutoBean(as.getNormals());
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoObjectAutoBean.this, "normals"),
      new Class<?>[] {java.util.List.class, java.lang.Double.class},
      new int[] {1, 0}
    );
    if (visitor.visitCollectionProperty("normals", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitCollectionProperty("normals", bean, propertyContext);
    bean = (org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean) org.parallax3d.parallax.system.jsonbind.AutoBeanUtils.getAutoBean(as.getSkinWeights());
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoObjectAutoBean.this, "skinWeights"),
      new Class<?>[] {java.util.List.class, java.lang.Double.class},
      new int[] {1, 0}
    );
    if (visitor.visitCollectionProperty("skinWeights", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitCollectionProperty("skinWeights", bean, propertyContext);
    bean = (org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean) org.parallax3d.parallax.system.jsonbind.AutoBeanUtils.getAutoBean(as.getVertices());
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoObjectAutoBean.this, "vertices"),
      new Class<?>[] {java.util.List.class, java.lang.Double.class},
      new int[] {1, 0}
    );
    if (visitor.visitCollectionProperty("vertices", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitCollectionProperty("vertices", bean, propertyContext);
    bean = (org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean) org.parallax3d.parallax.system.jsonbind.AutoBeanUtils.getAutoBean(as.getColors());
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoObjectAutoBean.this, "colors"),
      new Class<?>[] {java.util.List.class, java.lang.Integer.class},
      new int[] {1, 0}
    );
    if (visitor.visitCollectionProperty("colors", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitCollectionProperty("colors", bean, propertyContext);
    bean = (org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean) org.parallax3d.parallax.system.jsonbind.AutoBeanUtils.getAutoBean(as.getFaces());
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoObjectAutoBean.this, "faces"),
      new Class<?>[] {java.util.List.class, java.lang.Integer.class},
      new int[] {1, 0}
    );
    if (visitor.visitCollectionProperty("faces", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitCollectionProperty("faces", bean, propertyContext);
    bean = (org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean) org.parallax3d.parallax.system.jsonbind.AutoBeanUtils.getAutoBean(as.getSkinIndices());
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoObjectAutoBean.this, "skinIndices"),
      new Class<?>[] {java.util.List.class, java.lang.Integer.class},
      new int[] {1, 0}
    );
    if (visitor.visitCollectionProperty("skinIndices", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitCollectionProperty("skinIndices", bean, propertyContext);
    bean = (org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean) org.parallax3d.parallax.system.jsonbind.AutoBeanUtils.getAutoBean(as.getUvs());
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoObjectAutoBean.this, "uvs"),
      new Class<?>[] {java.util.List.class, java.util.List.class, java.lang.Double.class},
      new int[] {1, 1, 0}
    );
    if (visitor.visitCollectionProperty("uvs", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitCollectionProperty("uvs", bean, propertyContext);
    bean = (org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean) org.parallax3d.parallax.system.jsonbind.AutoBeanUtils.getAutoBean(as.getMaterials());
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoObjectAutoBean.this, "materials"),
      new Class<?>[] {java.util.List.class, org.parallax3d.parallax.loaders.json.JsoMaterial.class},
      new int[] {1, 0}
    );
    if (visitor.visitCollectionProperty("materials", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitCollectionProperty("materials", bean, propertyContext);
    bean = (org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean) org.parallax3d.parallax.system.jsonbind.AutoBeanUtils.getAutoBean(as.getMorphColors());
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoObjectAutoBean.this, "morphColors"),
      new Class<?>[] {java.util.List.class, org.parallax3d.parallax.loaders.json.JsoMorphColors.class},
      new int[] {1, 0}
    );
    if (visitor.visitCollectionProperty("morphColors", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitCollectionProperty("morphColors", bean, propertyContext);
    bean = (org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean) org.parallax3d.parallax.system.jsonbind.AutoBeanUtils.getAutoBean(as.getMorphTargets());
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoObjectAutoBean.this, "morphTargets"),
      new Class<?>[] {java.util.List.class, org.parallax3d.parallax.loaders.json.JsoMorphTargets.class},
      new int[] {1, 0}
    );
    if (visitor.visitCollectionProperty("morphTargets", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitCollectionProperty("morphTargets", bean, propertyContext);
    bean = (org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean) org.parallax3d.parallax.system.jsonbind.AutoBeanUtils.getAutoBean(as.getMetadata());
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoObjectAutoBean.this, "metadata"),
      org.parallax3d.parallax.loaders.json.JsoMetadata.class
    );
    if (visitor.visitReferenceProperty("metadata", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitReferenceProperty("metadata", bean, propertyContext);
  }
}
