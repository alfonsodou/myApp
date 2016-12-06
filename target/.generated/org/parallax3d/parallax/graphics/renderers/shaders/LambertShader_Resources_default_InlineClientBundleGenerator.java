package org.parallax3d.parallax.graphics.renderers.shaders;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class LambertShader_Resources_default_InlineClientBundleGenerator implements org.parallax3d.parallax.graphics.renderers.shaders.LambertShader.Resources {
  private static LambertShader_Resources_default_InlineClientBundleGenerator _instance0 = new LambertShader_Resources_default_InlineClientBundleGenerator();
  private void getFragmentShaderInitializer() {
    getFragmentShader = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/source/lambert.fs.glsl
      public String getText() {
        return "uniform float opacity;\n\nvarying vec3 vLightFront;\n\n#ifdef DOUBLE_SIDED\n\n	varying vec3 vLightBack;\n\n#endif\n\n[*]\n\nvoid main() {\n\n	gl_FragColor = vec4( vec3 ( 1.0 ), opacity );\n			\n[*]\n			\n#ifdef DOUBLE_SIDED\n\n	//\"float isFront = float( gl_FrontFacing );\n	//\"gl_FragColor.xyz *= isFront * vLightFront + ( 1.0 - isFront ) * vLightBack;\n\n	if ( gl_FrontFacing )\n		gl_FragColor.xyz *= vLightFront;\n	else\n		gl_FragColor.xyz *= vLightBack;\n\n#else\n\n	gl_FragColor.xyz *= vLightFront;\n\n#endif\n			\n[*]\n			\n}";
      }
      public String getName() {
        return "getFragmentShader";
      }
    }
    ;
  }
  private static class getFragmentShaderInitializer {
    static {
      _instance0.getFragmentShaderInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getFragmentShader;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getFragmentShader() {
    return getFragmentShaderInitializer.get();
  }
  private void getVertexShaderInitializer() {
    getVertexShader = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax/2.0-SNAPSHOT/parallax-2.0-SNAPSHOT.jar!/org/parallax3d/parallax/graphics/renderers/shaders/source/lambert.vs.glsl
      public String getText() {
        return "#define LAMBERT\n\nvarying vec3 vLightFront;\n\n#ifdef DOUBLE_SIDED\n\n	varying vec3 vLightBack;\n\n#endif\n\n[*]\n\nvoid main() {\n	\n[*]\n						\n}\n			";
      }
      public String getName() {
        return "getVertexShader";
      }
    }
    ;
  }
  private static class getVertexShaderInitializer {
    static {
      _instance0.getVertexShaderInitializer();
    }
    static org.parallax3d.parallax.system.SourceTextResource get() {
      return getVertexShader;
    }
  }
  public org.parallax3d.parallax.system.SourceTextResource getVertexShader() {
    return getVertexShaderInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static org.parallax3d.parallax.system.SourceTextResource getFragmentShader;
  private static org.parallax3d.parallax.system.SourceTextResource getVertexShader;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      getFragmentShader(), 
      getVertexShader(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("getFragmentShader", getFragmentShader());
        resourceMap.put("getVertexShader", getVertexShader());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'getFragmentShader': return this.@org.parallax3d.parallax.graphics.renderers.shaders.LambertShader.Resources::getFragmentShader()();
      case 'getVertexShader': return this.@org.parallax3d.parallax.graphics.renderers.shaders.LambertShader.Resources::getVertexShader()();
    }
    return null;
  }-*/;
}
