package org.parallax3d.parallax.graphics.renderers.plugins.effects.shaders;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class AnaglyphShader_Resources_default_InlineClientBundleGenerator implements org.parallax3d.parallax.graphics.renderers.plugins.effects.shaders.AnaglyphShader.Resources {
  private static AnaglyphShader_Resources_default_InlineClientBundleGenerator _instance0 = new AnaglyphShader_Resources_default_InlineClientBundleGenerator();
  private void getFragmentShaderInitializer() {
    getFragmentShader = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax-renderer-plugins/2.0-SNAPSHOT/parallax-renderer-plugins-2.0-SNAPSHOT-sources.jar!/org/parallax3d/parallax/graphics/renderers/plugins/effects/shaders/source/anaglyph.fs.glsl
      public String getText() {
        return "uniform sampler2D mapLeft;\nuniform sampler2D mapRight;\nvarying vec2 vUv;\n\nvoid main() {\n\n	vec4 colorL, colorR;\n	vec2 uv = vUv;\n\n	colorL = texture2D( mapLeft, uv );\n	colorR = texture2D( mapRight, uv );\n\n	// http://3dtv.at/Knowhow/AnaglyphComparison_en.aspx\n\n	gl_FragColor = vec4( colorL.g * 0.7 + colorL.b * 0.3, colorR.g, colorR.b, colorL.a + colorR.a ) * 1.1;\n\n}\n";
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
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax-renderer-plugins/2.0-SNAPSHOT/parallax-renderer-plugins-2.0-SNAPSHOT-sources.jar!/org/parallax3d/parallax/graphics/renderers/plugins/effects/shaders/source/anaglyph.vs.glsl
      public String getText() {
        return "varying vec2 vUv;\n\nvoid main() {\n\n	vUv = vec2( uv.x, uv.y );\n	gl_Position = projectionMatrix * modelViewMatrix * vec4( position, 1.0 );\n\n}\n";
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
      case 'getFragmentShader': return this.@org.parallax3d.parallax.graphics.renderers.plugins.effects.shaders.AnaglyphShader.Resources::getFragmentShader()();
      case 'getVertexShader': return this.@org.parallax3d.parallax.graphics.renderers.plugins.effects.shaders.AnaglyphShader.Resources::getVertexShader()();
    }
    return null;
  }-*/;
}
