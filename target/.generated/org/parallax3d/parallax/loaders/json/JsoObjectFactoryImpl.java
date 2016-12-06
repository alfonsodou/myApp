package org.parallax3d.parallax.loaders.json;

public class JsoObjectFactoryImpl extends org.parallax3d.parallax.platforms.gwt.system.jsonbind.AbstractAutoBeanFactory implements org.parallax3d.parallax.loaders.json.JsoObjectFactory {
  @Override protected void initializeCreatorMap(org.parallax3d.parallax.platforms.gwt.system.jsonbind.JsniCreatorMap map) {
    map.add(org.parallax3d.parallax.loaders.json.JsoObject.class, getConstructors_org_parallax3d_parallax_loaders_json_JsoObject());
    map.add(org.parallax3d.parallax.loaders.json.JsoMaterial.class, getConstructors_org_parallax3d_parallax_loaders_json_JsoMaterial());
    map.add(org.parallax3d.parallax.loaders.json.JsoMetadata.class, getConstructors_org_parallax3d_parallax_loaders_json_JsoMetadata());
    map.add(org.parallax3d.parallax.loaders.json.JsoMorphColors.class, getConstructors_org_parallax3d_parallax_loaders_json_JsoMorphColors());
    map.add(org.parallax3d.parallax.loaders.json.JsoMorphTargets.class, getConstructors_org_parallax3d_parallax_loaders_json_JsoMorphTargets());
    map.add(java.util.List.class, getConstructors_java_util_List());
    map.add(java.util.Iterator.class, getConstructors_java_util_Iterator());
    map.add(java.util.ListIterator.class, getConstructors_java_util_ListIterator());
  }
  private native com.google.gwt.core.client.JsArray<com.google.gwt.core.client.JavaScriptObject> getConstructors_org_parallax3d_parallax_loaders_json_JsoObject() /*-{
    return [
      @org.parallax3d.parallax.loaders.json.JsoObjectAutoBean::new(Lorg/parallax3d/parallax/system/jsonbind/AutoBeanFactory;),
      @org.parallax3d.parallax.loaders.json.JsoObjectAutoBean::new(Lorg/parallax3d/parallax/system/jsonbind/AutoBeanFactory;Lorg/parallax3d/parallax/loaders/json/JsoObject;)
    ];
  }-*/;
  private native com.google.gwt.core.client.JsArray<com.google.gwt.core.client.JavaScriptObject> getConstructors_org_parallax3d_parallax_loaders_json_JsoMaterial() /*-{
    return [
      @org.parallax3d.parallax.loaders.json.JsoMaterialAutoBean::new(Lorg/parallax3d/parallax/system/jsonbind/AutoBeanFactory;),
      @org.parallax3d.parallax.loaders.json.JsoMaterialAutoBean::new(Lorg/parallax3d/parallax/system/jsonbind/AutoBeanFactory;Lorg/parallax3d/parallax/loaders/json/JsoMaterial;)
    ];
  }-*/;
  private native com.google.gwt.core.client.JsArray<com.google.gwt.core.client.JavaScriptObject> getConstructors_org_parallax3d_parallax_loaders_json_JsoMetadata() /*-{
    return [
      @org.parallax3d.parallax.loaders.json.JsoMetadataAutoBean::new(Lorg/parallax3d/parallax/system/jsonbind/AutoBeanFactory;),
      @org.parallax3d.parallax.loaders.json.JsoMetadataAutoBean::new(Lorg/parallax3d/parallax/system/jsonbind/AutoBeanFactory;Lorg/parallax3d/parallax/loaders/json/JsoMetadata;)
    ];
  }-*/;
  private native com.google.gwt.core.client.JsArray<com.google.gwt.core.client.JavaScriptObject> getConstructors_org_parallax3d_parallax_loaders_json_JsoMorphColors() /*-{
    return [
      @org.parallax3d.parallax.loaders.json.JsoMorphColorsAutoBean::new(Lorg/parallax3d/parallax/system/jsonbind/AutoBeanFactory;),
      @org.parallax3d.parallax.loaders.json.JsoMorphColorsAutoBean::new(Lorg/parallax3d/parallax/system/jsonbind/AutoBeanFactory;Lorg/parallax3d/parallax/loaders/json/JsoMorphColors;)
    ];
  }-*/;
  private native com.google.gwt.core.client.JsArray<com.google.gwt.core.client.JavaScriptObject> getConstructors_org_parallax3d_parallax_loaders_json_JsoMorphTargets() /*-{
    return [
      @org.parallax3d.parallax.loaders.json.JsoMorphTargetsAutoBean::new(Lorg/parallax3d/parallax/system/jsonbind/AutoBeanFactory;),
      @org.parallax3d.parallax.loaders.json.JsoMorphTargetsAutoBean::new(Lorg/parallax3d/parallax/system/jsonbind/AutoBeanFactory;Lorg/parallax3d/parallax/loaders/json/JsoMorphTargets;)
    ];
  }-*/;
  private native com.google.gwt.core.client.JsArray<com.google.gwt.core.client.JavaScriptObject> getConstructors_java_util_List() /*-{
    return [
      ,
      @emul.java.util.ListAutoBean::new(Lorg/parallax3d/parallax/system/jsonbind/AutoBeanFactory;Ljava/util/List;)
    ];
  }-*/;
  private native com.google.gwt.core.client.JsArray<com.google.gwt.core.client.JavaScriptObject> getConstructors_java_util_Iterator() /*-{
    return [
      ,
      @emul.java.util.IteratorAutoBean::new(Lorg/parallax3d/parallax/system/jsonbind/AutoBeanFactory;Ljava/util/Iterator;)
    ];
  }-*/;
  private native com.google.gwt.core.client.JsArray<com.google.gwt.core.client.JavaScriptObject> getConstructors_java_util_ListIterator() /*-{
    return [
      ,
      @emul.java.util.ListIteratorAutoBean::new(Lorg/parallax3d/parallax/system/jsonbind/AutoBeanFactory;Ljava/util/ListIterator;)
    ];
  }-*/;
  @Override protected void initializeEnumMap() {
    enumToStringMap.put(org.parallax3d.parallax.loaders.json.JsoBlending.NormalBlending, "NormalBlending");
    enumToStringMap.put(org.parallax3d.parallax.loaders.json.JsoBlending.AdditiveBlending, "AdditiveBlending");
    enumToStringMap.put(org.parallax3d.parallax.loaders.json.JsoBlending.SubtractiveBlending, "SubtractiveBlending");
    enumToStringMap.put(org.parallax3d.parallax.loaders.json.JsoBlending.MultiplyBlending, "MultiplyBlending");
    enumToStringMap.put(org.parallax3d.parallax.loaders.json.JsoBlending.AdditiveAlphaBlending, "AdditiveAlphaBlending");
    enumToStringMap.put(org.parallax3d.parallax.loaders.json.JsoBlending.CustomBlending, "CustomBlending");
    enumToStringMap.put(org.parallax3d.parallax.loaders.json.JsoTextureWrapMode.repeat, "repeat");
    enumToStringMap.put(org.parallax3d.parallax.loaders.json.JsoTextureWrapMode.mirror, "mirror");
    stringsToEnumsMap.put("mirror", java.util.Collections.<java.lang.Enum<?>> singletonList(org.parallax3d.parallax.loaders.json.JsoTextureWrapMode.mirror));
    stringsToEnumsMap.put("AdditiveBlending", java.util.Collections.<java.lang.Enum<?>> singletonList(org.parallax3d.parallax.loaders.json.JsoBlending.AdditiveBlending));
    stringsToEnumsMap.put("repeat", java.util.Collections.<java.lang.Enum<?>> singletonList(org.parallax3d.parallax.loaders.json.JsoTextureWrapMode.repeat));
    stringsToEnumsMap.put("SubtractiveBlending", java.util.Collections.<java.lang.Enum<?>> singletonList(org.parallax3d.parallax.loaders.json.JsoBlending.SubtractiveBlending));
    stringsToEnumsMap.put("AdditiveAlphaBlending", java.util.Collections.<java.lang.Enum<?>> singletonList(org.parallax3d.parallax.loaders.json.JsoBlending.AdditiveAlphaBlending));
    stringsToEnumsMap.put("NormalBlending", java.util.Collections.<java.lang.Enum<?>> singletonList(org.parallax3d.parallax.loaders.json.JsoBlending.NormalBlending));
    stringsToEnumsMap.put("MultiplyBlending", java.util.Collections.<java.lang.Enum<?>> singletonList(org.parallax3d.parallax.loaders.json.JsoBlending.MultiplyBlending));
    stringsToEnumsMap.put("CustomBlending", java.util.Collections.<java.lang.Enum<?>> singletonList(org.parallax3d.parallax.loaders.json.JsoBlending.CustomBlending));
  }
  public org.parallax3d.parallax.system.jsonbind.AutoBean file() {
    return new org.parallax3d.parallax.loaders.json.JsoObjectAutoBean(JsoObjectFactoryImpl.this);
  }
  public org.parallax3d.parallax.system.jsonbind.AutoBean material() {
    return new org.parallax3d.parallax.loaders.json.JsoMaterialAutoBean(JsoObjectFactoryImpl.this);
  }
  public org.parallax3d.parallax.system.jsonbind.AutoBean metadata() {
    return new org.parallax3d.parallax.loaders.json.JsoMetadataAutoBean(JsoObjectFactoryImpl.this);
  }
  public org.parallax3d.parallax.system.jsonbind.AutoBean morphColors() {
    return new org.parallax3d.parallax.loaders.json.JsoMorphColorsAutoBean(JsoObjectFactoryImpl.this);
  }
  public org.parallax3d.parallax.system.jsonbind.AutoBean morphTargets() {
    return new org.parallax3d.parallax.loaders.json.JsoMorphTargetsAutoBean(JsoObjectFactoryImpl.this);
  }
}
