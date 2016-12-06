package org.parallax3d.parallax.loaders.json;

public class JsoMaterialAutoBean extends org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean<org.parallax3d.parallax.loaders.json.JsoMaterial> {
  private final org.parallax3d.parallax.loaders.json.JsoMaterial shim = new org.parallax3d.parallax.loaders.json.JsoMaterial() {
    public boolean getDepthTest()  {
      boolean toReturn = JsoMaterialAutoBean.this.getWrapped().getDepthTest();
      return toReturn;
    }
    public boolean getDepthWrite()  {
      boolean toReturn = JsoMaterialAutoBean.this.getWrapped().getDepthWrite();
      return toReturn;
    }
    public boolean getTransparent()  {
      boolean toReturn = JsoMaterialAutoBean.this.getWrapped().getTransparent();
      return toReturn;
    }
    public boolean getVertexColors()  {
      boolean toReturn = JsoMaterialAutoBean.this.getWrapped().getVertexColors();
      return toReturn;
    }
    public double getIllumination()  {
      double toReturn = JsoMaterialAutoBean.this.getWrapped().getIllumination();
      return toReturn;
    }
    public double getMapBumpScale()  {
      double toReturn = JsoMaterialAutoBean.this.getWrapped().getMapBumpScale();
      return toReturn;
    }
    public double getMapNormalFactor()  {
      double toReturn = JsoMaterialAutoBean.this.getWrapped().getMapNormalFactor();
      return toReturn;
    }
    public double getOpticalDensity()  {
      double toReturn = JsoMaterialAutoBean.this.getWrapped().getOpticalDensity();
      return toReturn;
    }
    public double getSpecularCoef()  {
      double toReturn = JsoMaterialAutoBean.this.getWrapped().getSpecularCoef();
      return toReturn;
    }
    public double getTransparency()  {
      double toReturn = JsoMaterialAutoBean.this.getWrapped().getTransparency();
      return toReturn;
    }
    public int getDbgColor()  {
      int toReturn = JsoMaterialAutoBean.this.getWrapped().getDbgColor();
      return toReturn;
    }
    public int getDbgIndex()  {
      int toReturn = JsoMaterialAutoBean.this.getWrapped().getDbgIndex();
      return toReturn;
    }
    public int getMapAlphaAnisotropy()  {
      int toReturn = JsoMaterialAutoBean.this.getWrapped().getMapAlphaAnisotropy();
      return toReturn;
    }
    public int getMapBumpAnisotropy()  {
      int toReturn = JsoMaterialAutoBean.this.getWrapped().getMapBumpAnisotropy();
      return toReturn;
    }
    public int getMapDiffuseAnisotropy()  {
      int toReturn = JsoMaterialAutoBean.this.getWrapped().getMapDiffuseAnisotropy();
      return toReturn;
    }
    public int getMapLightAnisotropy()  {
      int toReturn = JsoMaterialAutoBean.this.getWrapped().getMapLightAnisotropy();
      return toReturn;
    }
    public int getMapNormalAnisotropy()  {
      int toReturn = JsoMaterialAutoBean.this.getWrapped().getMapNormalAnisotropy();
      return toReturn;
    }
    public int getMapSpecularAnisotropy()  {
      int toReturn = JsoMaterialAutoBean.this.getWrapped().getMapSpecularAnisotropy();
      return toReturn;
    }
    public java.lang.String getDbgName()  {
      java.lang.String toReturn = JsoMaterialAutoBean.this.getWrapped().getDbgName();
      return toReturn;
    }
    public java.lang.String getMapAlpha()  {
      java.lang.String toReturn = JsoMaterialAutoBean.this.getWrapped().getMapAlpha();
      return toReturn;
    }
    public java.lang.String getMapBump()  {
      java.lang.String toReturn = JsoMaterialAutoBean.this.getWrapped().getMapBump();
      return toReturn;
    }
    public java.lang.String getMapDiffuse()  {
      java.lang.String toReturn = JsoMaterialAutoBean.this.getWrapped().getMapDiffuse();
      return toReturn;
    }
    public java.lang.String getMapLight()  {
      java.lang.String toReturn = JsoMaterialAutoBean.this.getWrapped().getMapLight();
      return toReturn;
    }
    public java.lang.String getMapNormal()  {
      java.lang.String toReturn = JsoMaterialAutoBean.this.getWrapped().getMapNormal();
      return toReturn;
    }
    public java.lang.String getMapSpecular()  {
      java.lang.String toReturn = JsoMaterialAutoBean.this.getWrapped().getMapSpecular();
      return toReturn;
    }
    public java.lang.String getShading()  {
      java.lang.String toReturn = JsoMaterialAutoBean.this.getWrapped().getShading();
      return toReturn;
    }
    public java.util.List getColorAmbient()  {
      java.util.List toReturn = JsoMaterialAutoBean.this.getWrapped().getColorAmbient();
      if (toReturn != null) {
        if (JsoMaterialAutoBean.this.isWrapped(toReturn)) {
          toReturn = JsoMaterialAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.ListAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public java.util.List getColorDiffuse()  {
      java.util.List toReturn = JsoMaterialAutoBean.this.getWrapped().getColorDiffuse();
      if (toReturn != null) {
        if (JsoMaterialAutoBean.this.isWrapped(toReturn)) {
          toReturn = JsoMaterialAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.ListAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public java.util.List getColorEmissive()  {
      java.util.List toReturn = JsoMaterialAutoBean.this.getWrapped().getColorEmissive();
      if (toReturn != null) {
        if (JsoMaterialAutoBean.this.isWrapped(toReturn)) {
          toReturn = JsoMaterialAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.ListAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public java.util.List getColorSpecular()  {
      java.util.List toReturn = JsoMaterialAutoBean.this.getWrapped().getColorSpecular();
      if (toReturn != null) {
        if (JsoMaterialAutoBean.this.isWrapped(toReturn)) {
          toReturn = JsoMaterialAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.ListAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public java.util.List getMapAlphaOffset()  {
      java.util.List toReturn = JsoMaterialAutoBean.this.getWrapped().getMapAlphaOffset();
      if (toReturn != null) {
        if (JsoMaterialAutoBean.this.isWrapped(toReturn)) {
          toReturn = JsoMaterialAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.ListAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public java.util.List getMapBumpOffset()  {
      java.util.List toReturn = JsoMaterialAutoBean.this.getWrapped().getMapBumpOffset();
      if (toReturn != null) {
        if (JsoMaterialAutoBean.this.isWrapped(toReturn)) {
          toReturn = JsoMaterialAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.ListAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public java.util.List getMapDiffuseOffset()  {
      java.util.List toReturn = JsoMaterialAutoBean.this.getWrapped().getMapDiffuseOffset();
      if (toReturn != null) {
        if (JsoMaterialAutoBean.this.isWrapped(toReturn)) {
          toReturn = JsoMaterialAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.ListAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public java.util.List getMapLightOffset()  {
      java.util.List toReturn = JsoMaterialAutoBean.this.getWrapped().getMapLightOffset();
      if (toReturn != null) {
        if (JsoMaterialAutoBean.this.isWrapped(toReturn)) {
          toReturn = JsoMaterialAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.ListAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public java.util.List getMapNormalOffset()  {
      java.util.List toReturn = JsoMaterialAutoBean.this.getWrapped().getMapNormalOffset();
      if (toReturn != null) {
        if (JsoMaterialAutoBean.this.isWrapped(toReturn)) {
          toReturn = JsoMaterialAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.ListAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public java.util.List getMapSpecularOffset()  {
      java.util.List toReturn = JsoMaterialAutoBean.this.getWrapped().getMapSpecularOffset();
      if (toReturn != null) {
        if (JsoMaterialAutoBean.this.isWrapped(toReturn)) {
          toReturn = JsoMaterialAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.ListAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public java.util.List getMapAlphaRepeat()  {
      java.util.List toReturn = JsoMaterialAutoBean.this.getWrapped().getMapAlphaRepeat();
      if (toReturn != null) {
        if (JsoMaterialAutoBean.this.isWrapped(toReturn)) {
          toReturn = JsoMaterialAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.ListAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public java.util.List getMapBumpRepeat()  {
      java.util.List toReturn = JsoMaterialAutoBean.this.getWrapped().getMapBumpRepeat();
      if (toReturn != null) {
        if (JsoMaterialAutoBean.this.isWrapped(toReturn)) {
          toReturn = JsoMaterialAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.ListAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public java.util.List getMapDiffuseRepeat()  {
      java.util.List toReturn = JsoMaterialAutoBean.this.getWrapped().getMapDiffuseRepeat();
      if (toReturn != null) {
        if (JsoMaterialAutoBean.this.isWrapped(toReturn)) {
          toReturn = JsoMaterialAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.ListAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public java.util.List getMapLightRepeat()  {
      java.util.List toReturn = JsoMaterialAutoBean.this.getWrapped().getMapLightRepeat();
      if (toReturn != null) {
        if (JsoMaterialAutoBean.this.isWrapped(toReturn)) {
          toReturn = JsoMaterialAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.ListAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public java.util.List getMapNormalRepeat()  {
      java.util.List toReturn = JsoMaterialAutoBean.this.getWrapped().getMapNormalRepeat();
      if (toReturn != null) {
        if (JsoMaterialAutoBean.this.isWrapped(toReturn)) {
          toReturn = JsoMaterialAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.ListAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public java.util.List getMapSpecularRepeat()  {
      java.util.List toReturn = JsoMaterialAutoBean.this.getWrapped().getMapSpecularRepeat();
      if (toReturn != null) {
        if (JsoMaterialAutoBean.this.isWrapped(toReturn)) {
          toReturn = JsoMaterialAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.ListAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public java.util.List getMapAlphaWrap()  {
      java.util.List toReturn = JsoMaterialAutoBean.this.getWrapped().getMapAlphaWrap();
      if (toReturn != null) {
        if (JsoMaterialAutoBean.this.isWrapped(toReturn)) {
          toReturn = JsoMaterialAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.ListAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public java.util.List getMapBumpWrap()  {
      java.util.List toReturn = JsoMaterialAutoBean.this.getWrapped().getMapBumpWrap();
      if (toReturn != null) {
        if (JsoMaterialAutoBean.this.isWrapped(toReturn)) {
          toReturn = JsoMaterialAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.ListAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public java.util.List getMapDiffuseWrap()  {
      java.util.List toReturn = JsoMaterialAutoBean.this.getWrapped().getMapDiffuseWrap();
      if (toReturn != null) {
        if (JsoMaterialAutoBean.this.isWrapped(toReturn)) {
          toReturn = JsoMaterialAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.ListAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public java.util.List getMapLightWrap()  {
      java.util.List toReturn = JsoMaterialAutoBean.this.getWrapped().getMapLightWrap();
      if (toReturn != null) {
        if (JsoMaterialAutoBean.this.isWrapped(toReturn)) {
          toReturn = JsoMaterialAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.ListAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public java.util.List getMapNormalWrap()  {
      java.util.List toReturn = JsoMaterialAutoBean.this.getWrapped().getMapNormalWrap();
      if (toReturn != null) {
        if (JsoMaterialAutoBean.this.isWrapped(toReturn)) {
          toReturn = JsoMaterialAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.ListAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public java.util.List getMapSpecularWrap()  {
      java.util.List toReturn = JsoMaterialAutoBean.this.getWrapped().getMapSpecularWrap();
      if (toReturn != null) {
        if (JsoMaterialAutoBean.this.isWrapped(toReturn)) {
          toReturn = JsoMaterialAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.ListAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public org.parallax3d.parallax.loaders.json.JsoBlending getBlending()  {
      org.parallax3d.parallax.loaders.json.JsoBlending toReturn = JsoMaterialAutoBean.this.getWrapped().getBlending();
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
  public JsoMaterialAutoBean(org.parallax3d.parallax.system.jsonbind.AutoBeanFactory factory) {super(factory);}
  public JsoMaterialAutoBean(org.parallax3d.parallax.system.jsonbind.AutoBeanFactory factory, org.parallax3d.parallax.loaders.json.JsoMaterial wrapped) {
    super(wrapped, factory);
  }
  public org.parallax3d.parallax.loaders.json.JsoMaterial as() {return shim;}
  public Class<org.parallax3d.parallax.loaders.json.JsoMaterial> getType() {return org.parallax3d.parallax.loaders.json.JsoMaterial.class;}
  @Override protected org.parallax3d.parallax.loaders.json.JsoMaterial createSimplePeer() {
    return new org.parallax3d.parallax.loaders.json.JsoMaterial() {
      private final org.parallax3d.parallax.system.jsonbind.Splittable data = org.parallax3d.parallax.loaders.json.JsoMaterialAutoBean.this.data;
      public boolean getDepthTest()  {
        java.lang.Boolean toReturn = JsoMaterialAutoBean.this.getOrReify("depthTest");
        return toReturn == null ? false : toReturn;
      }
      public boolean getDepthWrite()  {
        java.lang.Boolean toReturn = JsoMaterialAutoBean.this.getOrReify("depthWrite");
        return toReturn == null ? false : toReturn;
      }
      public boolean getTransparent()  {
        java.lang.Boolean toReturn = JsoMaterialAutoBean.this.getOrReify("transparent");
        return toReturn == null ? false : toReturn;
      }
      public boolean getVertexColors()  {
        java.lang.Boolean toReturn = JsoMaterialAutoBean.this.getOrReify("vertexColors");
        return toReturn == null ? false : toReturn;
      }
      public double getIllumination()  {
        java.lang.Double toReturn = JsoMaterialAutoBean.this.getOrReify("illumination");
        return toReturn == null ? 0d : toReturn;
      }
      public double getMapBumpScale()  {
        java.lang.Double toReturn = JsoMaterialAutoBean.this.getOrReify("mapBumpScale");
        return toReturn == null ? 0d : toReturn;
      }
      public double getMapNormalFactor()  {
        java.lang.Double toReturn = JsoMaterialAutoBean.this.getOrReify("mapNormalFactor");
        return toReturn == null ? 0d : toReturn;
      }
      public double getOpticalDensity()  {
        java.lang.Double toReturn = JsoMaterialAutoBean.this.getOrReify("opticalDensity");
        return toReturn == null ? 0d : toReturn;
      }
      public double getSpecularCoef()  {
        java.lang.Double toReturn = JsoMaterialAutoBean.this.getOrReify("specularCoef");
        return toReturn == null ? 0d : toReturn;
      }
      public double getTransparency()  {
        java.lang.Double toReturn = JsoMaterialAutoBean.this.getOrReify("transparency");
        return toReturn == null ? 0d : toReturn;
      }
      public int getDbgColor()  {
        java.lang.Integer toReturn = JsoMaterialAutoBean.this.getOrReify("DbgColor");
        return toReturn == null ? 0 : toReturn;
      }
      public int getDbgIndex()  {
        java.lang.Integer toReturn = JsoMaterialAutoBean.this.getOrReify("DbgIndex");
        return toReturn == null ? 0 : toReturn;
      }
      public int getMapAlphaAnisotropy()  {
        java.lang.Integer toReturn = JsoMaterialAutoBean.this.getOrReify("mapAlphaAnisotropy");
        return toReturn == null ? 0 : toReturn;
      }
      public int getMapBumpAnisotropy()  {
        java.lang.Integer toReturn = JsoMaterialAutoBean.this.getOrReify("mapBumpAnisotropy");
        return toReturn == null ? 0 : toReturn;
      }
      public int getMapDiffuseAnisotropy()  {
        java.lang.Integer toReturn = JsoMaterialAutoBean.this.getOrReify("mapDiffuseAnisotropy");
        return toReturn == null ? 0 : toReturn;
      }
      public int getMapLightAnisotropy()  {
        java.lang.Integer toReturn = JsoMaterialAutoBean.this.getOrReify("mapLightAnisotropy");
        return toReturn == null ? 0 : toReturn;
      }
      public int getMapNormalAnisotropy()  {
        java.lang.Integer toReturn = JsoMaterialAutoBean.this.getOrReify("mapNormalAnisotropy");
        return toReturn == null ? 0 : toReturn;
      }
      public int getMapSpecularAnisotropy()  {
        java.lang.Integer toReturn = JsoMaterialAutoBean.this.getOrReify("mapSpecularAnisotropy");
        return toReturn == null ? 0 : toReturn;
      }
      public java.lang.String getDbgName()  {
        return (java.lang.String) JsoMaterialAutoBean.this.getOrReify("DbgName");
      }
      public java.lang.String getMapAlpha()  {
        return (java.lang.String) JsoMaterialAutoBean.this.getOrReify("mapAlpha");
      }
      public java.lang.String getMapBump()  {
        return (java.lang.String) JsoMaterialAutoBean.this.getOrReify("mapBump");
      }
      public java.lang.String getMapDiffuse()  {
        return (java.lang.String) JsoMaterialAutoBean.this.getOrReify("mapDiffuse");
      }
      public java.lang.String getMapLight()  {
        return (java.lang.String) JsoMaterialAutoBean.this.getOrReify("mapLight");
      }
      public java.lang.String getMapNormal()  {
        return (java.lang.String) JsoMaterialAutoBean.this.getOrReify("mapNormal");
      }
      public java.lang.String getMapSpecular()  {
        return (java.lang.String) JsoMaterialAutoBean.this.getOrReify("mapSpecular");
      }
      public java.lang.String getShading()  {
        return (java.lang.String) JsoMaterialAutoBean.this.getOrReify("shading");
      }
      public java.util.List getColorAmbient()  {
        return (java.util.List) JsoMaterialAutoBean.this.getOrReify("colorAmbient");
      }
      public java.util.List getColorDiffuse()  {
        return (java.util.List) JsoMaterialAutoBean.this.getOrReify("colorDiffuse");
      }
      public java.util.List getColorEmissive()  {
        return (java.util.List) JsoMaterialAutoBean.this.getOrReify("colorEmissive");
      }
      public java.util.List getColorSpecular()  {
        return (java.util.List) JsoMaterialAutoBean.this.getOrReify("colorSpecular");
      }
      public java.util.List getMapAlphaOffset()  {
        return (java.util.List) JsoMaterialAutoBean.this.getOrReify("mapAlphaOffset");
      }
      public java.util.List getMapBumpOffset()  {
        return (java.util.List) JsoMaterialAutoBean.this.getOrReify("mapBumpOffset");
      }
      public java.util.List getMapDiffuseOffset()  {
        return (java.util.List) JsoMaterialAutoBean.this.getOrReify("mapDiffuseOffset");
      }
      public java.util.List getMapLightOffset()  {
        return (java.util.List) JsoMaterialAutoBean.this.getOrReify("mapLightOffset");
      }
      public java.util.List getMapNormalOffset()  {
        return (java.util.List) JsoMaterialAutoBean.this.getOrReify("mapNormalOffset");
      }
      public java.util.List getMapSpecularOffset()  {
        return (java.util.List) JsoMaterialAutoBean.this.getOrReify("mapSpecularOffset");
      }
      public java.util.List getMapAlphaRepeat()  {
        return (java.util.List) JsoMaterialAutoBean.this.getOrReify("mapAlphaRepeat");
      }
      public java.util.List getMapBumpRepeat()  {
        return (java.util.List) JsoMaterialAutoBean.this.getOrReify("mapBumpRepeat");
      }
      public java.util.List getMapDiffuseRepeat()  {
        return (java.util.List) JsoMaterialAutoBean.this.getOrReify("mapDiffuseRepeat");
      }
      public java.util.List getMapLightRepeat()  {
        return (java.util.List) JsoMaterialAutoBean.this.getOrReify("mapLightRepeat");
      }
      public java.util.List getMapNormalRepeat()  {
        return (java.util.List) JsoMaterialAutoBean.this.getOrReify("mapNormalRepeat");
      }
      public java.util.List getMapSpecularRepeat()  {
        return (java.util.List) JsoMaterialAutoBean.this.getOrReify("mapSpecularRepeat");
      }
      public java.util.List getMapAlphaWrap()  {
        return (java.util.List) JsoMaterialAutoBean.this.getOrReify("mapAlphaWrap");
      }
      public java.util.List getMapBumpWrap()  {
        return (java.util.List) JsoMaterialAutoBean.this.getOrReify("mapBumpWrap");
      }
      public java.util.List getMapDiffuseWrap()  {
        return (java.util.List) JsoMaterialAutoBean.this.getOrReify("mapDiffuseWrap");
      }
      public java.util.List getMapLightWrap()  {
        return (java.util.List) JsoMaterialAutoBean.this.getOrReify("mapLightWrap");
      }
      public java.util.List getMapNormalWrap()  {
        return (java.util.List) JsoMaterialAutoBean.this.getOrReify("mapNormalWrap");
      }
      public java.util.List getMapSpecularWrap()  {
        return (java.util.List) JsoMaterialAutoBean.this.getOrReify("mapSpecularWrap");
      }
      public org.parallax3d.parallax.loaders.json.JsoBlending getBlending()  {
        return (org.parallax3d.parallax.loaders.json.JsoBlending) JsoMaterialAutoBean.this.getOrReify("blending");
      }
    };
  }
  @Override protected void traverseProperties(org.parallax3d.parallax.system.jsonbind.AutoBeanVisitor visitor, org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean.OneShotContext ctx) {
    org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean bean;
    Object value;
    org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext propertyContext;
    org.parallax3d.parallax.loaders.json.JsoMaterial as = as();
    value = as.getDepthTest();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMaterialAutoBean.this, "depthTest"),
      boolean.class
    );
    if (visitor.visitValueProperty("depthTest", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("depthTest", value, propertyContext);
    value = as.getDepthWrite();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMaterialAutoBean.this, "depthWrite"),
      boolean.class
    );
    if (visitor.visitValueProperty("depthWrite", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("depthWrite", value, propertyContext);
    value = as.getTransparent();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMaterialAutoBean.this, "transparent"),
      boolean.class
    );
    if (visitor.visitValueProperty("transparent", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("transparent", value, propertyContext);
    value = as.getVertexColors();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMaterialAutoBean.this, "vertexColors"),
      boolean.class
    );
    if (visitor.visitValueProperty("vertexColors", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("vertexColors", value, propertyContext);
    value = as.getIllumination();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMaterialAutoBean.this, "illumination"),
      double.class
    );
    if (visitor.visitValueProperty("illumination", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("illumination", value, propertyContext);
    value = as.getMapBumpScale();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMaterialAutoBean.this, "mapBumpScale"),
      double.class
    );
    if (visitor.visitValueProperty("mapBumpScale", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("mapBumpScale", value, propertyContext);
    value = as.getMapNormalFactor();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMaterialAutoBean.this, "mapNormalFactor"),
      double.class
    );
    if (visitor.visitValueProperty("mapNormalFactor", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("mapNormalFactor", value, propertyContext);
    value = as.getOpticalDensity();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMaterialAutoBean.this, "opticalDensity"),
      double.class
    );
    if (visitor.visitValueProperty("opticalDensity", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("opticalDensity", value, propertyContext);
    value = as.getSpecularCoef();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMaterialAutoBean.this, "specularCoef"),
      double.class
    );
    if (visitor.visitValueProperty("specularCoef", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("specularCoef", value, propertyContext);
    value = as.getTransparency();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMaterialAutoBean.this, "transparency"),
      double.class
    );
    if (visitor.visitValueProperty("transparency", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("transparency", value, propertyContext);
    value = as.getDbgColor();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMaterialAutoBean.this, "DbgColor"),
      int.class
    );
    if (visitor.visitValueProperty("DbgColor", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("DbgColor", value, propertyContext);
    value = as.getDbgIndex();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMaterialAutoBean.this, "DbgIndex"),
      int.class
    );
    if (visitor.visitValueProperty("DbgIndex", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("DbgIndex", value, propertyContext);
    value = as.getMapAlphaAnisotropy();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMaterialAutoBean.this, "mapAlphaAnisotropy"),
      int.class
    );
    if (visitor.visitValueProperty("mapAlphaAnisotropy", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("mapAlphaAnisotropy", value, propertyContext);
    value = as.getMapBumpAnisotropy();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMaterialAutoBean.this, "mapBumpAnisotropy"),
      int.class
    );
    if (visitor.visitValueProperty("mapBumpAnisotropy", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("mapBumpAnisotropy", value, propertyContext);
    value = as.getMapDiffuseAnisotropy();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMaterialAutoBean.this, "mapDiffuseAnisotropy"),
      int.class
    );
    if (visitor.visitValueProperty("mapDiffuseAnisotropy", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("mapDiffuseAnisotropy", value, propertyContext);
    value = as.getMapLightAnisotropy();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMaterialAutoBean.this, "mapLightAnisotropy"),
      int.class
    );
    if (visitor.visitValueProperty("mapLightAnisotropy", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("mapLightAnisotropy", value, propertyContext);
    value = as.getMapNormalAnisotropy();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMaterialAutoBean.this, "mapNormalAnisotropy"),
      int.class
    );
    if (visitor.visitValueProperty("mapNormalAnisotropy", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("mapNormalAnisotropy", value, propertyContext);
    value = as.getMapSpecularAnisotropy();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMaterialAutoBean.this, "mapSpecularAnisotropy"),
      int.class
    );
    if (visitor.visitValueProperty("mapSpecularAnisotropy", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("mapSpecularAnisotropy", value, propertyContext);
    value = as.getDbgName();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMaterialAutoBean.this, "DbgName"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("DbgName", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("DbgName", value, propertyContext);
    value = as.getMapAlpha();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMaterialAutoBean.this, "mapAlpha"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("mapAlpha", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("mapAlpha", value, propertyContext);
    value = as.getMapBump();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMaterialAutoBean.this, "mapBump"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("mapBump", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("mapBump", value, propertyContext);
    value = as.getMapDiffuse();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMaterialAutoBean.this, "mapDiffuse"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("mapDiffuse", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("mapDiffuse", value, propertyContext);
    value = as.getMapLight();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMaterialAutoBean.this, "mapLight"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("mapLight", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("mapLight", value, propertyContext);
    value = as.getMapNormal();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMaterialAutoBean.this, "mapNormal"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("mapNormal", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("mapNormal", value, propertyContext);
    value = as.getMapSpecular();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMaterialAutoBean.this, "mapSpecular"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("mapSpecular", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("mapSpecular", value, propertyContext);
    value = as.getShading();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMaterialAutoBean.this, "shading"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("shading", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("shading", value, propertyContext);
    bean = (org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean) org.parallax3d.parallax.system.jsonbind.AutoBeanUtils.getAutoBean(as.getColorAmbient());
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMaterialAutoBean.this, "colorAmbient"),
      new Class<?>[] {java.util.List.class, java.lang.Double.class},
      new int[] {1, 0}
    );
    if (visitor.visitCollectionProperty("colorAmbient", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitCollectionProperty("colorAmbient", bean, propertyContext);
    bean = (org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean) org.parallax3d.parallax.system.jsonbind.AutoBeanUtils.getAutoBean(as.getColorDiffuse());
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMaterialAutoBean.this, "colorDiffuse"),
      new Class<?>[] {java.util.List.class, java.lang.Double.class},
      new int[] {1, 0}
    );
    if (visitor.visitCollectionProperty("colorDiffuse", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitCollectionProperty("colorDiffuse", bean, propertyContext);
    bean = (org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean) org.parallax3d.parallax.system.jsonbind.AutoBeanUtils.getAutoBean(as.getColorEmissive());
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMaterialAutoBean.this, "colorEmissive"),
      new Class<?>[] {java.util.List.class, java.lang.Double.class},
      new int[] {1, 0}
    );
    if (visitor.visitCollectionProperty("colorEmissive", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitCollectionProperty("colorEmissive", bean, propertyContext);
    bean = (org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean) org.parallax3d.parallax.system.jsonbind.AutoBeanUtils.getAutoBean(as.getColorSpecular());
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMaterialAutoBean.this, "colorSpecular"),
      new Class<?>[] {java.util.List.class, java.lang.Double.class},
      new int[] {1, 0}
    );
    if (visitor.visitCollectionProperty("colorSpecular", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitCollectionProperty("colorSpecular", bean, propertyContext);
    bean = (org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean) org.parallax3d.parallax.system.jsonbind.AutoBeanUtils.getAutoBean(as.getMapAlphaOffset());
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMaterialAutoBean.this, "mapAlphaOffset"),
      new Class<?>[] {java.util.List.class, java.lang.Double.class},
      new int[] {1, 0}
    );
    if (visitor.visitCollectionProperty("mapAlphaOffset", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitCollectionProperty("mapAlphaOffset", bean, propertyContext);
    bean = (org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean) org.parallax3d.parallax.system.jsonbind.AutoBeanUtils.getAutoBean(as.getMapBumpOffset());
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMaterialAutoBean.this, "mapBumpOffset"),
      new Class<?>[] {java.util.List.class, java.lang.Double.class},
      new int[] {1, 0}
    );
    if (visitor.visitCollectionProperty("mapBumpOffset", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitCollectionProperty("mapBumpOffset", bean, propertyContext);
    bean = (org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean) org.parallax3d.parallax.system.jsonbind.AutoBeanUtils.getAutoBean(as.getMapDiffuseOffset());
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMaterialAutoBean.this, "mapDiffuseOffset"),
      new Class<?>[] {java.util.List.class, java.lang.Double.class},
      new int[] {1, 0}
    );
    if (visitor.visitCollectionProperty("mapDiffuseOffset", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitCollectionProperty("mapDiffuseOffset", bean, propertyContext);
    bean = (org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean) org.parallax3d.parallax.system.jsonbind.AutoBeanUtils.getAutoBean(as.getMapLightOffset());
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMaterialAutoBean.this, "mapLightOffset"),
      new Class<?>[] {java.util.List.class, java.lang.Double.class},
      new int[] {1, 0}
    );
    if (visitor.visitCollectionProperty("mapLightOffset", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitCollectionProperty("mapLightOffset", bean, propertyContext);
    bean = (org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean) org.parallax3d.parallax.system.jsonbind.AutoBeanUtils.getAutoBean(as.getMapNormalOffset());
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMaterialAutoBean.this, "mapNormalOffset"),
      new Class<?>[] {java.util.List.class, java.lang.Double.class},
      new int[] {1, 0}
    );
    if (visitor.visitCollectionProperty("mapNormalOffset", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitCollectionProperty("mapNormalOffset", bean, propertyContext);
    bean = (org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean) org.parallax3d.parallax.system.jsonbind.AutoBeanUtils.getAutoBean(as.getMapSpecularOffset());
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMaterialAutoBean.this, "mapSpecularOffset"),
      new Class<?>[] {java.util.List.class, java.lang.Double.class},
      new int[] {1, 0}
    );
    if (visitor.visitCollectionProperty("mapSpecularOffset", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitCollectionProperty("mapSpecularOffset", bean, propertyContext);
    bean = (org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean) org.parallax3d.parallax.system.jsonbind.AutoBeanUtils.getAutoBean(as.getMapAlphaRepeat());
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMaterialAutoBean.this, "mapAlphaRepeat"),
      new Class<?>[] {java.util.List.class, java.lang.Integer.class},
      new int[] {1, 0}
    );
    if (visitor.visitCollectionProperty("mapAlphaRepeat", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitCollectionProperty("mapAlphaRepeat", bean, propertyContext);
    bean = (org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean) org.parallax3d.parallax.system.jsonbind.AutoBeanUtils.getAutoBean(as.getMapBumpRepeat());
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMaterialAutoBean.this, "mapBumpRepeat"),
      new Class<?>[] {java.util.List.class, java.lang.Integer.class},
      new int[] {1, 0}
    );
    if (visitor.visitCollectionProperty("mapBumpRepeat", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitCollectionProperty("mapBumpRepeat", bean, propertyContext);
    bean = (org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean) org.parallax3d.parallax.system.jsonbind.AutoBeanUtils.getAutoBean(as.getMapDiffuseRepeat());
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMaterialAutoBean.this, "mapDiffuseRepeat"),
      new Class<?>[] {java.util.List.class, java.lang.Integer.class},
      new int[] {1, 0}
    );
    if (visitor.visitCollectionProperty("mapDiffuseRepeat", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitCollectionProperty("mapDiffuseRepeat", bean, propertyContext);
    bean = (org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean) org.parallax3d.parallax.system.jsonbind.AutoBeanUtils.getAutoBean(as.getMapLightRepeat());
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMaterialAutoBean.this, "mapLightRepeat"),
      new Class<?>[] {java.util.List.class, java.lang.Integer.class},
      new int[] {1, 0}
    );
    if (visitor.visitCollectionProperty("mapLightRepeat", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitCollectionProperty("mapLightRepeat", bean, propertyContext);
    bean = (org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean) org.parallax3d.parallax.system.jsonbind.AutoBeanUtils.getAutoBean(as.getMapNormalRepeat());
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMaterialAutoBean.this, "mapNormalRepeat"),
      new Class<?>[] {java.util.List.class, java.lang.Integer.class},
      new int[] {1, 0}
    );
    if (visitor.visitCollectionProperty("mapNormalRepeat", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitCollectionProperty("mapNormalRepeat", bean, propertyContext);
    bean = (org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean) org.parallax3d.parallax.system.jsonbind.AutoBeanUtils.getAutoBean(as.getMapSpecularRepeat());
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMaterialAutoBean.this, "mapSpecularRepeat"),
      new Class<?>[] {java.util.List.class, java.lang.Integer.class},
      new int[] {1, 0}
    );
    if (visitor.visitCollectionProperty("mapSpecularRepeat", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitCollectionProperty("mapSpecularRepeat", bean, propertyContext);
    bean = (org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean) org.parallax3d.parallax.system.jsonbind.AutoBeanUtils.getAutoBean(as.getMapAlphaWrap());
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMaterialAutoBean.this, "mapAlphaWrap"),
      new Class<?>[] {java.util.List.class, org.parallax3d.parallax.loaders.json.JsoTextureWrapMode.class},
      new int[] {1, 0}
    );
    if (visitor.visitCollectionProperty("mapAlphaWrap", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitCollectionProperty("mapAlphaWrap", bean, propertyContext);
    bean = (org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean) org.parallax3d.parallax.system.jsonbind.AutoBeanUtils.getAutoBean(as.getMapBumpWrap());
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMaterialAutoBean.this, "mapBumpWrap"),
      new Class<?>[] {java.util.List.class, org.parallax3d.parallax.loaders.json.JsoTextureWrapMode.class},
      new int[] {1, 0}
    );
    if (visitor.visitCollectionProperty("mapBumpWrap", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitCollectionProperty("mapBumpWrap", bean, propertyContext);
    bean = (org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean) org.parallax3d.parallax.system.jsonbind.AutoBeanUtils.getAutoBean(as.getMapDiffuseWrap());
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMaterialAutoBean.this, "mapDiffuseWrap"),
      new Class<?>[] {java.util.List.class, org.parallax3d.parallax.loaders.json.JsoTextureWrapMode.class},
      new int[] {1, 0}
    );
    if (visitor.visitCollectionProperty("mapDiffuseWrap", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitCollectionProperty("mapDiffuseWrap", bean, propertyContext);
    bean = (org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean) org.parallax3d.parallax.system.jsonbind.AutoBeanUtils.getAutoBean(as.getMapLightWrap());
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMaterialAutoBean.this, "mapLightWrap"),
      new Class<?>[] {java.util.List.class, org.parallax3d.parallax.loaders.json.JsoTextureWrapMode.class},
      new int[] {1, 0}
    );
    if (visitor.visitCollectionProperty("mapLightWrap", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitCollectionProperty("mapLightWrap", bean, propertyContext);
    bean = (org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean) org.parallax3d.parallax.system.jsonbind.AutoBeanUtils.getAutoBean(as.getMapNormalWrap());
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMaterialAutoBean.this, "mapNormalWrap"),
      new Class<?>[] {java.util.List.class, org.parallax3d.parallax.loaders.json.JsoTextureWrapMode.class},
      new int[] {1, 0}
    );
    if (visitor.visitCollectionProperty("mapNormalWrap", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitCollectionProperty("mapNormalWrap", bean, propertyContext);
    bean = (org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean) org.parallax3d.parallax.system.jsonbind.AutoBeanUtils.getAutoBean(as.getMapSpecularWrap());
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMaterialAutoBean.this, "mapSpecularWrap"),
      new Class<?>[] {java.util.List.class, org.parallax3d.parallax.loaders.json.JsoTextureWrapMode.class},
      new int[] {1, 0}
    );
    if (visitor.visitCollectionProperty("mapSpecularWrap", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitCollectionProperty("mapSpecularWrap", bean, propertyContext);
    value = as.getBlending();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoMaterialAutoBean.this, "blending"),
      org.parallax3d.parallax.loaders.json.JsoBlending.class
    );
    if (visitor.visitValueProperty("blending", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("blending", value, propertyContext);
  }
}
