package org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class HorizontalTiltShiftShader_Resources_default_InlineClientBundleGenerator implements org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.HorizontalTiltShiftShader.Resources {
  private static HorizontalTiltShiftShader_Resources_default_InlineClientBundleGenerator _instance0 = new HorizontalTiltShiftShader_Resources_default_InlineClientBundleGenerator();
  private void getFragmentShaderInitializer() {
    getFragmentShader = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax-renderer-plugins/2.0-SNAPSHOT/parallax-renderer-plugins-2.0-SNAPSHOT-sources.jar!/org/parallax3d/parallax/graphics/renderers/plugins/postprocessing/shaders/source/horizontalTiltShift.fs.glsl
      public String getText() {
        return "uniform sampler2D tDiffuse;\nuniform float h;\nuniform float r;\n\nvarying vec2 vUv;\n\nvoid main() {\n\n	vec4 sum = vec4( 0.0 );\n\n	float hh = h * abs( r - vUv.y );\n\n	sum += texture2D( tDiffuse, vec2( vUv.x - 4.0 * hh, vUv.y ) ) * 0.051;\n	sum += texture2D( tDiffuse, vec2( vUv.x - 3.0 * hh, vUv.y ) ) * 0.0918;\n	sum += texture2D( tDiffuse, vec2( vUv.x - 2.0 * hh, vUv.y ) ) * 0.12245;\n	sum += texture2D( tDiffuse, vec2( vUv.x - 1.0 * hh, vUv.y ) ) * 0.1531;\n	sum += texture2D( tDiffuse, vec2( vUv.x, 		  	 vUv.y ) ) * 0.1633;\n	sum += texture2D( tDiffuse, vec2( vUv.x + 1.0 * hh, vUv.y ) ) * 0.1531;\n	sum += texture2D( tDiffuse, vec2( vUv.x + 2.0 * hh, vUv.y ) ) * 0.12245;\n	sum += texture2D( tDiffuse, vec2( vUv.x + 3.0 * hh, vUv.y ) ) * 0.0918;\n	sum += texture2D( tDiffuse, vec2( vUv.x + 4.0 * hh, vUv.y ) ) * 0.051;\n\n	gl_FragColor = sum;\n\n}\n";
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
      case 'getFragmentShader': return this.@org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.HorizontalTiltShiftShader.Resources::getFragmentShader()();
      case 'getVertexShader': return this.@org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.HorizontalTiltShiftShader.Resources::getVertexShader()();
    }
    return null;
  }-*/;
}
