package org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class TriangleBlurShader_Resources_default_InlineClientBundleGenerator implements org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.TriangleBlurShader.Resources {
  private static TriangleBlurShader_Resources_default_InlineClientBundleGenerator _instance0 = new TriangleBlurShader_Resources_default_InlineClientBundleGenerator();
  private void getFragmentShaderInitializer() {
    getFragmentShader = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax-renderer-plugins/2.0-SNAPSHOT/parallax-renderer-plugins-2.0-SNAPSHOT-sources.jar!/org/parallax3d/parallax/graphics/renderers/plugins/postprocessing/shaders/source/triangleBlur.fs.glsl
      public String getText() {
        return "#define ITERATIONS 10.0\n\nuniform sampler2D texture;                           \nuniform vec2 delta;\n\nvarying vec2 vUv;\n\nfloat random( vec3 scale, float seed ) {\n\n	// use the fragment position for a different seed per-pixel\n\n	return fract( sin( dot( gl_FragCoord.xyz + seed, scale ) ) * 43758.5453 + seed );\n\n}\n\nvoid main() {\n\n	vec4 color = vec4( 0.0 );\n\n	float total = 0.0;\n\n	// randomize the lookup values to hide the fixed number of samples\n\n	float offset = random( vec3( 12.9898, 78.233, 151.7182 ), 0.0 );\n\n	for ( float t = -ITERATIONS; t <= ITERATIONS; t ++ ) {\n\n		float percent = ( t + offset - 0.5 ) / ITERATIONS;\n		float weight = 1.0 - abs( percent );\n\n		color += texture2D( texture, vUv + delta * percent ) * weight;\n		total += weight;\n\n	}\n\n	gl_FragColor = color / total;\n\n}\n";
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
      case 'getFragmentShader': return this.@org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.TriangleBlurShader.Resources::getFragmentShader()();
      case 'getVertexShader': return this.@org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.TriangleBlurShader.Resources::getVertexShader()();
    }
    return null;
  }-*/;
}
