package org.parallax3d.parallax.loaders.typefacejs;

public class JsoFontFactoryImpl extends org.parallax3d.parallax.platforms.gwt.system.jsonbind.AbstractAutoBeanFactory implements org.parallax3d.parallax.loaders.typefacejs.JsoFontFactory {
  @Override protected void initializeCreatorMap(org.parallax3d.parallax.platforms.gwt.system.jsonbind.JsniCreatorMap map) {
    map.add(org.parallax3d.parallax.loaders.typefacejs.JsoBoundingBox.class, getConstructors_org_parallax3d_parallax_loaders_typefacejs_JsoBoundingBox());
    map.add(org.parallax3d.parallax.loaders.typefacejs.JsoFont.class, getConstructors_org_parallax3d_parallax_loaders_typefacejs_JsoFont());
    map.add(org.parallax3d.parallax.loaders.typefacejs.JsoGlyph.class, getConstructors_org_parallax3d_parallax_loaders_typefacejs_JsoGlyph());
    map.add(org.parallax3d.parallax.loaders.typefacejs.JsoOriginalFontInformation.class, getConstructors_org_parallax3d_parallax_loaders_typefacejs_JsoOriginalFontInformation());
    map.add(java.util.Map.class, getConstructors_java_util_Map());
    map.add(java.util.Set.class, getConstructors_java_util_Set());
    map.add(java.util.Map.Entry.class, getConstructors_java_util_Map_Entry());
    map.add(java.util.Collection.class, getConstructors_java_util_Collection());
    map.add(java.util.Iterator.class, getConstructors_java_util_Iterator());
  }
  private native com.google.gwt.core.client.JsArray<com.google.gwt.core.client.JavaScriptObject> getConstructors_org_parallax3d_parallax_loaders_typefacejs_JsoBoundingBox() /*-{
    return [
      @org.parallax3d.parallax.loaders.typefacejs.JsoBoundingBoxAutoBean::new(Lorg/parallax3d/parallax/system/jsonbind/AutoBeanFactory;),
      @org.parallax3d.parallax.loaders.typefacejs.JsoBoundingBoxAutoBean::new(Lorg/parallax3d/parallax/system/jsonbind/AutoBeanFactory;Lorg/parallax3d/parallax/loaders/typefacejs/JsoBoundingBox;)
    ];
  }-*/;
  private native com.google.gwt.core.client.JsArray<com.google.gwt.core.client.JavaScriptObject> getConstructors_org_parallax3d_parallax_loaders_typefacejs_JsoFont() /*-{
    return [
      @org.parallax3d.parallax.loaders.typefacejs.JsoFontAutoBean::new(Lorg/parallax3d/parallax/system/jsonbind/AutoBeanFactory;),
      @org.parallax3d.parallax.loaders.typefacejs.JsoFontAutoBean::new(Lorg/parallax3d/parallax/system/jsonbind/AutoBeanFactory;Lorg/parallax3d/parallax/loaders/typefacejs/JsoFont;)
    ];
  }-*/;
  private native com.google.gwt.core.client.JsArray<com.google.gwt.core.client.JavaScriptObject> getConstructors_org_parallax3d_parallax_loaders_typefacejs_JsoGlyph() /*-{
    return [
      @org.parallax3d.parallax.loaders.typefacejs.JsoGlyphAutoBean::new(Lorg/parallax3d/parallax/system/jsonbind/AutoBeanFactory;),
      @org.parallax3d.parallax.loaders.typefacejs.JsoGlyphAutoBean::new(Lorg/parallax3d/parallax/system/jsonbind/AutoBeanFactory;Lorg/parallax3d/parallax/loaders/typefacejs/JsoGlyph;)
    ];
  }-*/;
  private native com.google.gwt.core.client.JsArray<com.google.gwt.core.client.JavaScriptObject> getConstructors_org_parallax3d_parallax_loaders_typefacejs_JsoOriginalFontInformation() /*-{
    return [
      @org.parallax3d.parallax.loaders.typefacejs.JsoOriginalFontInformationAutoBean::new(Lorg/parallax3d/parallax/system/jsonbind/AutoBeanFactory;),
      @org.parallax3d.parallax.loaders.typefacejs.JsoOriginalFontInformationAutoBean::new(Lorg/parallax3d/parallax/system/jsonbind/AutoBeanFactory;Lorg/parallax3d/parallax/loaders/typefacejs/JsoOriginalFontInformation;)
    ];
  }-*/;
  private native com.google.gwt.core.client.JsArray<com.google.gwt.core.client.JavaScriptObject> getConstructors_java_util_Map() /*-{
    return [
      ,
      @emul.java.util.MapAutoBean::new(Lorg/parallax3d/parallax/system/jsonbind/AutoBeanFactory;Ljava/util/Map;)
    ];
  }-*/;
  private native com.google.gwt.core.client.JsArray<com.google.gwt.core.client.JavaScriptObject> getConstructors_java_util_Set() /*-{
    return [
      ,
      @emul.java.util.SetAutoBean::new(Lorg/parallax3d/parallax/system/jsonbind/AutoBeanFactory;Ljava/util/Set;)
    ];
  }-*/;
  private native com.google.gwt.core.client.JsArray<com.google.gwt.core.client.JavaScriptObject> getConstructors_java_util_Map_Entry() /*-{
    return [
      ,
      @emul.java.util.Map_EntryAutoBean::new(Lorg/parallax3d/parallax/system/jsonbind/AutoBeanFactory;Ljava/util/Map$Entry;)
    ];
  }-*/;
  private native com.google.gwt.core.client.JsArray<com.google.gwt.core.client.JavaScriptObject> getConstructors_java_util_Collection() /*-{
    return [
      ,
      @emul.java.util.CollectionAutoBean::new(Lorg/parallax3d/parallax/system/jsonbind/AutoBeanFactory;Ljava/util/Collection;)
    ];
  }-*/;
  private native com.google.gwt.core.client.JsArray<com.google.gwt.core.client.JavaScriptObject> getConstructors_java_util_Iterator() /*-{
    return [
      ,
      @emul.java.util.IteratorAutoBean::new(Lorg/parallax3d/parallax/system/jsonbind/AutoBeanFactory;Ljava/util/Iterator;)
    ];
  }-*/;
  @Override protected void initializeEnumMap() {
  }
  public org.parallax3d.parallax.system.jsonbind.AutoBean boundingBox() {
    return new org.parallax3d.parallax.loaders.typefacejs.JsoBoundingBoxAutoBean(JsoFontFactoryImpl.this);
  }
  public org.parallax3d.parallax.system.jsonbind.AutoBean font() {
    return new org.parallax3d.parallax.loaders.typefacejs.JsoFontAutoBean(JsoFontFactoryImpl.this);
  }
  public org.parallax3d.parallax.system.jsonbind.AutoBean glyph() {
    return new org.parallax3d.parallax.loaders.typefacejs.JsoGlyphAutoBean(JsoFontFactoryImpl.this);
  }
  public org.parallax3d.parallax.system.jsonbind.AutoBean original_font_information() {
    return new org.parallax3d.parallax.loaders.typefacejs.JsoOriginalFontInformationAutoBean(JsoFontFactoryImpl.this);
  }
}
