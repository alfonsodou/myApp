package org.parallax3d.parallax.system.jsonbind;

import org.parallax3d.parallax.system.jsonbind.JsonBindFactory;
import org.parallax3d.parallax.system.jsonbind.AutoBeanFactory;
import com.google.gwt.core.client.GWT;
import org.parallax3d.parallax.system.FastMap;

public class JsonBindFactoryImpl implements org.parallax3d.parallax.system.jsonbind.JsonBindFactory {
  private static final FastMap<AutoBeanFactory> MAP = new FastMap<AutoBeanFactory>(){{
  put("org.parallax3d.parallax.loaders.json.JsoObjectFactory", new org.parallax3d.parallax.loaders.json.JsoObjectFactoryImpl() );
  put("org.parallax3d.parallax.loaders.typefacejs.JsoFontFactory", new org.parallax3d.parallax.loaders.typefacejs.JsoFontFactoryImpl() );
  }};
  public <T> T get(Class<? extends AutoBeanFactory> classLiteral) {
  if (MAP.containsKey(classLiteral.getCanonicalName())) {
  return (T) MAP.get(classLiteral.getCanonicalName());
  }
  return null;
  }
}
