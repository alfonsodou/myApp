package org.parallax3d.parallax.loaders.typefacejs;

public class JsoFontAutoBean extends org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean<org.parallax3d.parallax.loaders.typefacejs.JsoFont> {
  private final org.parallax3d.parallax.loaders.typefacejs.JsoFont shim = new org.parallax3d.parallax.loaders.typefacejs.JsoFont() {
    public double getResolution()  {
      double toReturn = JsoFontAutoBean.this.getWrapped().getResolution();
      return toReturn;
    }
    public int getAscender()  {
      int toReturn = JsoFontAutoBean.this.getWrapped().getAscender();
      return toReturn;
    }
    public int getDescender()  {
      int toReturn = JsoFontAutoBean.this.getWrapped().getDescender();
      return toReturn;
    }
    public int getLineHeight()  {
      int toReturn = JsoFontAutoBean.this.getWrapped().getLineHeight();
      return toReturn;
    }
    public int getUnderlinePosition()  {
      int toReturn = JsoFontAutoBean.this.getWrapped().getUnderlinePosition();
      return toReturn;
    }
    public int getUnderlineThickness()  {
      int toReturn = JsoFontAutoBean.this.getWrapped().getUnderlineThickness();
      return toReturn;
    }
    public java.lang.String getCssFontStyle()  {
      java.lang.String toReturn = JsoFontAutoBean.this.getWrapped().getCssFontStyle();
      return toReturn;
    }
    public java.lang.String getCssFontWeight()  {
      java.lang.String toReturn = JsoFontAutoBean.this.getWrapped().getCssFontWeight();
      return toReturn;
    }
    public java.lang.String getFamilyName()  {
      java.lang.String toReturn = JsoFontAutoBean.this.getWrapped().getFamilyName();
      return toReturn;
    }
    public java.util.Map getGlyphs()  {
      java.util.Map toReturn = JsoFontAutoBean.this.getWrapped().getGlyphs();
      if (toReturn != null) {
        if (JsoFontAutoBean.this.isWrapped(toReturn)) {
          toReturn = JsoFontAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.MapAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public org.parallax3d.parallax.loaders.typefacejs.JsoBoundingBox getBoundingBox()  {
      org.parallax3d.parallax.loaders.typefacejs.JsoBoundingBox toReturn = JsoFontAutoBean.this.getWrapped().getBoundingBox();
      if (toReturn != null) {
        if (JsoFontAutoBean.this.isWrapped(toReturn)) {
          toReturn = JsoFontAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new org.parallax3d.parallax.loaders.typefacejs.JsoBoundingBoxAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public org.parallax3d.parallax.loaders.typefacejs.JsoOriginalFontInformation getOriginalFontInformation()  {
      org.parallax3d.parallax.loaders.typefacejs.JsoOriginalFontInformation toReturn = JsoFontAutoBean.this.getWrapped().getOriginalFontInformation();
      if (toReturn != null) {
        if (JsoFontAutoBean.this.isWrapped(toReturn)) {
          toReturn = JsoFontAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new org.parallax3d.parallax.loaders.typefacejs.JsoOriginalFontInformationAutoBean(getFactory(), toReturn).as();
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
  public JsoFontAutoBean(org.parallax3d.parallax.system.jsonbind.AutoBeanFactory factory) {super(factory);}
  public JsoFontAutoBean(org.parallax3d.parallax.system.jsonbind.AutoBeanFactory factory, org.parallax3d.parallax.loaders.typefacejs.JsoFont wrapped) {
    super(wrapped, factory);
  }
  public org.parallax3d.parallax.loaders.typefacejs.JsoFont as() {return shim;}
  public Class<org.parallax3d.parallax.loaders.typefacejs.JsoFont> getType() {return org.parallax3d.parallax.loaders.typefacejs.JsoFont.class;}
  @Override protected org.parallax3d.parallax.loaders.typefacejs.JsoFont createSimplePeer() {
    return new org.parallax3d.parallax.loaders.typefacejs.JsoFont() {
      private final org.parallax3d.parallax.system.jsonbind.Splittable data = org.parallax3d.parallax.loaders.typefacejs.JsoFontAutoBean.this.data;
      public double getResolution()  {
        java.lang.Double toReturn = JsoFontAutoBean.this.getOrReify("resolution");
        return toReturn == null ? 0d : toReturn;
      }
      public int getAscender()  {
        java.lang.Integer toReturn = JsoFontAutoBean.this.getOrReify("ascender");
        return toReturn == null ? 0 : toReturn;
      }
      public int getDescender()  {
        java.lang.Integer toReturn = JsoFontAutoBean.this.getOrReify("descender");
        return toReturn == null ? 0 : toReturn;
      }
      public int getLineHeight()  {
        java.lang.Integer toReturn = JsoFontAutoBean.this.getOrReify("lineHeight");
        return toReturn == null ? 0 : toReturn;
      }
      public int getUnderlinePosition()  {
        java.lang.Integer toReturn = JsoFontAutoBean.this.getOrReify("underlinePosition");
        return toReturn == null ? 0 : toReturn;
      }
      public int getUnderlineThickness()  {
        java.lang.Integer toReturn = JsoFontAutoBean.this.getOrReify("underlineThickness");
        return toReturn == null ? 0 : toReturn;
      }
      public java.lang.String getCssFontStyle()  {
        return (java.lang.String) JsoFontAutoBean.this.getOrReify("cssFontStyle");
      }
      public java.lang.String getCssFontWeight()  {
        return (java.lang.String) JsoFontAutoBean.this.getOrReify("cssFontWeight");
      }
      public java.lang.String getFamilyName()  {
        return (java.lang.String) JsoFontAutoBean.this.getOrReify("familyName");
      }
      public java.util.Map getGlyphs()  {
        return (java.util.Map) JsoFontAutoBean.this.getOrReify("glyphs");
      }
      public org.parallax3d.parallax.loaders.typefacejs.JsoBoundingBox getBoundingBox()  {
        return (org.parallax3d.parallax.loaders.typefacejs.JsoBoundingBox) JsoFontAutoBean.this.getOrReify("boundingBox");
      }
      public org.parallax3d.parallax.loaders.typefacejs.JsoOriginalFontInformation getOriginalFontInformation()  {
        return (org.parallax3d.parallax.loaders.typefacejs.JsoOriginalFontInformation) JsoFontAutoBean.this.getOrReify("original_font_information");
      }
    };
  }
  @Override protected void traverseProperties(org.parallax3d.parallax.system.jsonbind.AutoBeanVisitor visitor, org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean.OneShotContext ctx) {
    org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean bean;
    Object value;
    org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext propertyContext;
    org.parallax3d.parallax.loaders.typefacejs.JsoFont as = as();
    value = as.getResolution();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoFontAutoBean.this, "resolution"),
      double.class
    );
    if (visitor.visitValueProperty("resolution", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("resolution", value, propertyContext);
    value = as.getAscender();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoFontAutoBean.this, "ascender"),
      int.class
    );
    if (visitor.visitValueProperty("ascender", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("ascender", value, propertyContext);
    value = as.getDescender();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoFontAutoBean.this, "descender"),
      int.class
    );
    if (visitor.visitValueProperty("descender", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("descender", value, propertyContext);
    value = as.getLineHeight();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoFontAutoBean.this, "lineHeight"),
      int.class
    );
    if (visitor.visitValueProperty("lineHeight", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("lineHeight", value, propertyContext);
    value = as.getUnderlinePosition();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoFontAutoBean.this, "underlinePosition"),
      int.class
    );
    if (visitor.visitValueProperty("underlinePosition", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("underlinePosition", value, propertyContext);
    value = as.getUnderlineThickness();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoFontAutoBean.this, "underlineThickness"),
      int.class
    );
    if (visitor.visitValueProperty("underlineThickness", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("underlineThickness", value, propertyContext);
    value = as.getCssFontStyle();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoFontAutoBean.this, "cssFontStyle"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("cssFontStyle", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("cssFontStyle", value, propertyContext);
    value = as.getCssFontWeight();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoFontAutoBean.this, "cssFontWeight"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("cssFontWeight", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("cssFontWeight", value, propertyContext);
    value = as.getFamilyName();
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoFontAutoBean.this, "familyName"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("familyName", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("familyName", value, propertyContext);
    bean = (org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean) org.parallax3d.parallax.system.jsonbind.AutoBeanUtils.getAutoBean(as.getGlyphs());
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoFontAutoBean.this, "glyphs"),
      new Class<?>[] {java.util.Map.class, java.lang.String.class, org.parallax3d.parallax.loaders.typefacejs.JsoGlyph.class},
      new int[] {2, 0, 0}
    );
    if (visitor.visitMapProperty("glyphs", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitMapProperty("glyphs", bean, propertyContext);
    bean = (org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean) org.parallax3d.parallax.system.jsonbind.AutoBeanUtils.getAutoBean(as.getBoundingBox());
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoFontAutoBean.this, "boundingBox"),
      org.parallax3d.parallax.loaders.typefacejs.JsoBoundingBox.class
    );
    if (visitor.visitReferenceProperty("boundingBox", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitReferenceProperty("boundingBox", bean, propertyContext);
    bean = (org.parallax3d.parallax.system.jsonbind.impl.AbstractAutoBean) org.parallax3d.parallax.system.jsonbind.AutoBeanUtils.getAutoBean(as.getOriginalFontInformation());
    propertyContext = new org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext(
      as,
      org.parallax3d.parallax.platforms.gwt.system.jsonbind.ClientPropertyContext.Setter.beanSetter(JsoFontAutoBean.this, "original_font_information"),
      org.parallax3d.parallax.loaders.typefacejs.JsoOriginalFontInformation.class
    );
    if (visitor.visitReferenceProperty("original_font_information", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitReferenceProperty("original_font_information", bean, propertyContext);
  }
}
