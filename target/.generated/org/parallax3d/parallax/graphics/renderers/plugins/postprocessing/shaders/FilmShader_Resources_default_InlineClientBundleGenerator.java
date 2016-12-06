package org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class FilmShader_Resources_default_InlineClientBundleGenerator implements org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.FilmShader.Resources {
  private static FilmShader_Resources_default_InlineClientBundleGenerator _instance0 = new FilmShader_Resources_default_InlineClientBundleGenerator();
  private void getFragmentShaderInitializer() {
    getFragmentShader = new org.parallax3d.parallax.system.SourceTextResource() {
      // jar:file:/Users/alfonso/.m2/repository/org/parallax3d/parallax/parallax-renderer-plugins/2.0-SNAPSHOT/parallax-renderer-plugins-2.0-SNAPSHOT-sources.jar!/org/parallax3d/parallax/graphics/renderers/plugins/postprocessing/shaders/source/film.fs.glsl
      public String getText() {
        return "// control parameter\nuniform float time;\n\nuniform bool grayscale;\n\n// noise effect intensity value (0 = no effect, 1 = full effect)\nuniform float nIntensity;\n\n// scanlines effect intensity value (0 = no effect, 1 = full effect)\nuniform float sIntensity;\n\n// scanlines effect count value (0 = no effect, 4096 = full effect)\nuniform float sCount;\n\nuniform sampler2D tDiffuse;\n\nvarying vec2 vUv;\n\nvoid main() {\n\n	// sample the source\n	vec4 cTextureScreen = texture2D( tDiffuse, vUv );\n\n	// make some noise\n	float x = vUv.x * vUv.y * time *  1000.0;\n	x = mod( x, 13.0 ) * mod( x, 123.0 );\n	float dx = mod( x, 0.01 );\n\n	// add noise\n	vec3 cResult = cTextureScreen.rgb + cTextureScreen.rgb * clamp( 0.1 + dx * 100.0, 0.0, 1.0 );\n\n	// get us a sine and cosine\n	vec2 sc = vec2( sin( vUv.y * sCount ), cos( vUv.y * sCount ) );\n\n	// add scanlines\n	cResult += cTextureScreen.rgb * vec3( sc.x, sc.y, sc.x ) * sIntensity;\n\n	// interpolate between source and result by intensity\n	cResult = cTextureScreen.rgb + clamp( nIntensity, 0.0,1.0 ) * ( cResult - cTextureScreen.rgb );\n\n	// convert to grayscale if desired\n	if( grayscale ) {\n\n		cResult = vec3( cResult.r * 0.3 + cResult.g * 0.59 + cResult.b * 0.11 );\n\n	}\n\n	gl_FragColor =  vec4( cResult, cTextureScreen.a );\n\n}\n";
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
      case 'getFragmentShader': return this.@org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.FilmShader.Resources::getFragmentShader()();
      case 'getVertexShader': return this.@org.parallax3d.parallax.graphics.renderers.plugins.postprocessing.shaders.FilmShader.Resources::getVertexShader()();
    }
    return null;
  }-*/;
}
