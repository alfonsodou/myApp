package org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class BleachBypassShader_Resources_default_InlineClientBundleGenerator implements org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.BleachBypassShader.Resources {
  private static BleachBypassShader_Resources_default_InlineClientBundleGenerator _instance0 = new BleachBypassShader_Resources_default_InlineClientBundleGenerator();
  private void getFragmentShaderInitializer() {
    getFragmentShader = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax-renderer-plugins/2.0-SNAPSHOT/parallax-renderer-plugins-2.0-SNAPSHOT-sources.jar!/org/parallax3d/parallax/graphics/renderers/plugins/postprocessing/shaders/source/bleachbypass.fs.glsl
      public String getText() {
        return "uniform float opacity;\n\nuniform sampler2D tDiffuse;\n\nvarying vec2 vUv;\n\nvoid main() {\n\n	vec4 base = texture2D( tDiffuse, vUv );\n\n	vec3 lumCoeff = vec3( 0.25, 0.65, 0.1 );\n	float lum = dot( lumCoeff, base.rgb );\n	vec3 blend = vec3( lum );\n\n	float L = min( 1.0, max( 0.0, 10.0 * ( lum - 0.45 ) ) );\n\n	vec3 result1 = 2.0 * base.rgb * blend;\n	vec3 result2 = 1.0 - 2.0 * ( 1.0 - blend ) * ( 1.0 - base.rgb );\n\n	vec3 newColor = mix( result1, result2, L );\n\n	float A2 = opacity * base.a;\n	vec3 mixRGB = A2 * newColor.rgb;\n	mixRGB += ( ( 1.0 - A2 ) * base.rgb );\n\n	gl_FragColor = vec4( mixRGB, base.a );\n\n}\n";
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
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax-renderer-plugins/2.0-SNAPSHOT/parallax-renderer-plugins-2.0-SNAPSHOT-sources.jar!/org/parallax3d/parallax/graphics/renderers/plugins/postprocessing/shaders/source/defaultUv.vs.glsl
      public String getText() {
        return "varying vec2 vUv;\n\nvoid main() {\n\n	vUv = uv;\n	gl_Position = projectionMatrix * modelViewMatrix * vec4( position, 1.0 );\n\n}\n";
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
      case 'getFragmentShader': return this.@org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.BleachBypassShader.Resources::getFragmentShader()();
      case 'getVertexShader': return this.@org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.BleachBypassShader.Resources::getVertexShader()();
    }
    return null;
  }-*/;
}
